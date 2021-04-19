// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.ClusterInner;
import java.util.List;

/** An immutable client-side representation of Cluster. */
public interface Cluster {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the sku property: The cluster SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the clusterSize property: The cluster size.
     *
     * @return the clusterSize value.
     */
    Integer clusterSize();

    /**
     * Gets the provisioningState property: The state of the cluster provisioning.
     *
     * @return the provisioningState value.
     */
    ClusterProvisioningState provisioningState();

    /**
     * Gets the clusterId property: The identity.
     *
     * @return the clusterId value.
     */
    Integer clusterId();

    /**
     * Gets the hosts property: The hosts.
     *
     * @return the hosts value.
     */
    List<String> hosts();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.ClusterInner object.
     *
     * @return the inner object.
     */
    ClusterInner innerModel();

    /** The entirety of the Cluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The Cluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the Cluster definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Cluster definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, privateCloudName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param privateCloudName The name of the private cloud.
             * @return the next definition stage.
             */
            WithSku withExistingPrivateCloud(String resourceGroupName, String privateCloudName);
        }
        /** The stage of the Cluster definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The cluster SKU.
             *
             * @param sku The cluster SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the Cluster definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithClusterSize {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Cluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cluster create(Context context);
        }
        /** The stage of the Cluster definition allowing to specify clusterSize. */
        interface WithClusterSize {
            /**
             * Specifies the clusterSize property: The cluster size.
             *
             * @param clusterSize The cluster size.
             * @return the next definition stage.
             */
            WithCreate withClusterSize(Integer clusterSize);
        }
    }
    /**
     * Begins update for the Cluster resource.
     *
     * @return the stage of resource update.
     */
    Cluster.Update update();

    /** The template for Cluster update. */
    interface Update extends UpdateStages.WithClusterSize {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Cluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cluster apply(Context context);
    }
    /** The Cluster update stages. */
    interface UpdateStages {
        /** The stage of the Cluster update allowing to specify clusterSize. */
        interface WithClusterSize {
            /**
             * Specifies the clusterSize property: The cluster size.
             *
             * @param clusterSize The cluster size.
             * @return the next definition stage.
             */
            Update withClusterSize(Integer clusterSize);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Cluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cluster refresh(Context context);
}