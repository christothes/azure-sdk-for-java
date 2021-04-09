// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.resourcemanager.resourcehealth.fluent.models.OperationListResultInner;
import java.util.List;

/** An immutable client-side representation of OperationListResult. */
public interface OperationListResult {
    /**
     * Gets the value property: List of operations available in the resourcehealth resource provider.
     *
     * @return the value value.
     */
    List<Operation> value();

    /**
     * Gets the inner com.azure.resourcemanager.resourcehealth.fluent.models.OperationListResultInner object.
     *
     * @return the inner object.
     */
    OperationListResultInner innerModel();
}