// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceListInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypeResource;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypeResourceList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ApplicationTypeResourceListImpl implements ApplicationTypeResourceList {
    private ApplicationTypeResourceListInner innerObject;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    ApplicationTypeResourceListImpl(
        ApplicationTypeResourceListInner innerObject,
        com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ApplicationTypeResource> value() {
        List<ApplicationTypeResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationTypeResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ApplicationTypeResourceListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }
}