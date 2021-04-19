// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batchai.fluent.models.OperationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains the list of all operations supported by BatchAI resource provider. */
@Immutable
public final class OperationListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListResult.class);

    /*
     * The list of operations supported by the resource provider.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationInner> value;

    /*
     * The URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of operations supported by the resource provider.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}