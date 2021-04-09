// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databricks.fluent.models.WorkspaceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of workspaces. */
@Fluent
public final class WorkspaceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceListResult.class);

    /*
     * The array of workspaces.
     */
    @JsonProperty(value = "value")
    private List<WorkspaceInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The array of workspaces.
     *
     * @return the value value.
     */
    public List<WorkspaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of workspaces.
     *
     * @param value the value value to set.
     * @return the WorkspaceListResult object itself.
     */
    public WorkspaceListResult withValue(List<WorkspaceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the WorkspaceListResult object itself.
     */
    public WorkspaceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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