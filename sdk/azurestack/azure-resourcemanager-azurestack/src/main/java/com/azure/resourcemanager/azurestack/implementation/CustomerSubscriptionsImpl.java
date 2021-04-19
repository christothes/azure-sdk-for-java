// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.fluent.CustomerSubscriptionsClient;
import com.azure.resourcemanager.azurestack.fluent.models.CustomerSubscriptionInner;
import com.azure.resourcemanager.azurestack.models.CustomerSubscription;
import com.azure.resourcemanager.azurestack.models.CustomerSubscriptions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CustomerSubscriptionsImpl implements CustomerSubscriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomerSubscriptionsImpl.class);

    private final CustomerSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.azurestack.AzureStackManager serviceManager;

    public CustomerSubscriptionsImpl(
        CustomerSubscriptionsClient innerClient,
        com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CustomerSubscription> list(String resourceGroup, String registrationName) {
        PagedIterable<CustomerSubscriptionInner> inner = this.serviceClient().list(resourceGroup, registrationName);
        return Utils.mapPage(inner, inner1 -> new CustomerSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomerSubscription> list(String resourceGroup, String registrationName, Context context) {
        PagedIterable<CustomerSubscriptionInner> inner =
            this.serviceClient().list(resourceGroup, registrationName, context);
        return Utils.mapPage(inner, inner1 -> new CustomerSubscriptionImpl(inner1, this.manager()));
    }

    public CustomerSubscription get(String resourceGroup, String registrationName, String customerSubscriptionName) {
        CustomerSubscriptionInner inner =
            this.serviceClient().get(resourceGroup, registrationName, customerSubscriptionName);
        if (inner != null) {
            return new CustomerSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CustomerSubscription> getWithResponse(
        String resourceGroup, String registrationName, String customerSubscriptionName, Context context) {
        Response<CustomerSubscriptionInner> inner =
            this.serviceClient().getWithResponse(resourceGroup, registrationName, customerSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CustomerSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroup, String registrationName, String customerSubscriptionName) {
        this.serviceClient().delete(resourceGroup, registrationName, customerSubscriptionName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroup, String registrationName, String customerSubscriptionName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroup, registrationName, customerSubscriptionName, context);
    }

    public CustomerSubscription getById(String id) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        String customerSubscriptionName = Utils.getValueFromIdByName(id, "customerSubscriptions");
        if (customerSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customerSubscriptions'.",
                                id)));
        }
        return this.getWithResponse(resourceGroup, registrationName, customerSubscriptionName, Context.NONE).getValue();
    }

    public Response<CustomerSubscription> getByIdWithResponse(String id, Context context) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        String customerSubscriptionName = Utils.getValueFromIdByName(id, "customerSubscriptions");
        if (customerSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customerSubscriptions'.",
                                id)));
        }
        return this.getWithResponse(resourceGroup, registrationName, customerSubscriptionName, context);
    }

    public void deleteById(String id) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        String customerSubscriptionName = Utils.getValueFromIdByName(id, "customerSubscriptions");
        if (customerSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customerSubscriptions'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroup, registrationName, customerSubscriptionName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        String customerSubscriptionName = Utils.getValueFromIdByName(id, "customerSubscriptions");
        if (customerSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customerSubscriptions'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroup, registrationName, customerSubscriptionName, context);
    }

    private CustomerSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestack.AzureStackManager manager() {
        return this.serviceManager;
    }

    public CustomerSubscriptionImpl define(String name) {
        return new CustomerSubscriptionImpl(name, this.manager());
    }
}