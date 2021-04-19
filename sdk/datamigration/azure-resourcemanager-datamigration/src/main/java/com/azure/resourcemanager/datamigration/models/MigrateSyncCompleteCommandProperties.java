// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties for the command that completes sync migration for a database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "commandType")
@JsonTypeName("Migrate.Sync.Complete.Database")
@Fluent
public final class MigrateSyncCompleteCommandProperties extends CommandProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateSyncCompleteCommandProperties.class);

    /*
     * Command input
     */
    @JsonProperty(value = "input")
    private MigrateSyncCompleteCommandInput input;

    /*
     * Command output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private MigrateSyncCompleteCommandOutput output;

    /**
     * Get the input property: Command input.
     *
     * @return the input value.
     */
    public MigrateSyncCompleteCommandInput input() {
        return this.input;
    }

    /**
     * Set the input property: Command input.
     *
     * @param input the input value to set.
     * @return the MigrateSyncCompleteCommandProperties object itself.
     */
    public MigrateSyncCompleteCommandProperties withInput(MigrateSyncCompleteCommandInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Command output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public MigrateSyncCompleteCommandOutput output() {
        return this.output;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().validate();
        }
    }
}