// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestBase;
import com.azure.core.test.annotation.DoNotRecord;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.mediaservices.models.Asset;
import com.azure.resourcemanager.mediaservices.models.BuiltInStandardEncoderPreset;
import com.azure.resourcemanager.mediaservices.models.EncoderNamedPreset;
import com.azure.resourcemanager.mediaservices.models.Job;
import com.azure.resourcemanager.mediaservices.models.JobInputHttp;
import com.azure.resourcemanager.mediaservices.models.JobOutputAsset;
import com.azure.resourcemanager.mediaservices.models.JobState;
import com.azure.resourcemanager.mediaservices.models.MediaService;
import com.azure.resourcemanager.mediaservices.models.StorageAccountType;
import com.azure.resourcemanager.mediaservices.models.Transform;
import com.azure.resourcemanager.mediaservices.models.TransformOutput;
import com.azure.resourcemanager.storage.StorageManager;
import com.azure.resourcemanager.storage.models.StorageAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Random;

public class MediaServicesTests extends TestBase {

    private static final Random RANDOM = new Random();

    private static final Region REGION = Region.US_WEST3;
    private static final String RESOURCE_GROUP = "rg" + randomPadding();
    private static final String STORAGE_ACCOUNT = "sa" + randomPadding();
    private static final String ACCOUNT = "media" + randomPadding();

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void mediaServicesTest() {
        StorageManager storageManager = StorageManager
            .configure().withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE));

        MediaServicesManager manager = MediaServicesManager
            .configure().withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE));

        storageManager.resourceManager().resourceGroups().define(RESOURCE_GROUP)
            .withRegion(REGION)
            .create();

        try {
            // @embedmeStart
            // storage account
            StorageAccount storageAccount = storageManager.storageAccounts().define(STORAGE_ACCOUNT)
                .withRegion(REGION)
                .withExistingResourceGroup(RESOURCE_GROUP)
                .create();

            // media service account
            MediaService account = manager.mediaservices().define(ACCOUNT)
                .withRegion(Region.US_WEST3)
                .withExistingResourceGroup(RESOURCE_GROUP)
                .withStorageAccounts(Collections.singletonList(
                    new com.azure.resourcemanager.mediaservices.models.StorageAccount()
                        .withId(storageAccount.id())
                        .withType(StorageAccountType.PRIMARY)))
                .create();

            // transform
            Transform transform = manager.transforms()
                .define("transform1")
                .withExistingMediaService(RESOURCE_GROUP, ACCOUNT)
                .withOutputs(Collections.singletonList(new TransformOutput()
                    .withPreset(new BuiltInStandardEncoderPreset()
                        .withPresetName(EncoderNamedPreset.CONTENT_AWARE_ENCODING))))
                .create();

            // output asset
            Asset asset = manager.assets()
                .define("output1")
                .withExistingMediaService(RESOURCE_GROUP, ACCOUNT)
                .create();

            // input uri
            String jobHttpBaseUri = "https://nimbuscdn-nimbuspm.streaming.mediaservices.windows.net/2b533311-b215-4409-80af-529c3e853622/";
            String jobFile = "Ignite-short.mp4";

            // job
            Job job = manager.jobs().define("job1")
                .withExistingTransform(RESOURCE_GROUP, ACCOUNT, "transform1")
                .withInput(new JobInputHttp()
                    .withFiles(Collections.singletonList(jobFile))
                    .withBaseUri(jobHttpBaseUri)
                    .withLabel("input1"))
                .withOutputs(Collections.singletonList(new JobOutputAsset().withAssetName("output1")))
                .create();

            // wait for job completion
            JobState jobState = job.state();
            while (!(jobState == JobState.CANCELED || jobState == JobState.ERROR || jobState == JobState.FINISHED)) {
                sleepIfRunningAgainstService(10 * 1000);    // wait 10 seconds
                jobState = job.refresh().state();
            }

            // refresh output asset after job finished
            asset.refresh();
            // @embedmeEnd

            Assertions.assertEquals(JobState.FINISHED, jobState);
            Assertions.assertEquals(storageAccount.name(), asset.storageAccountName());
            Assertions.assertNotNull(asset.container());
        } finally {
            storageManager.resourceManager().resourceGroups().beginDeleteByName(RESOURCE_GROUP);
        }
    }

    private static String randomPadding() {
        return String.format("%05d", Math.abs(RANDOM.nextInt() % 100000));
    }
}
