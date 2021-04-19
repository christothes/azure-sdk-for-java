// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Defines the move collection errors. */
@Immutable
public final class MoveCollectionPropertiesErrors extends MoveResourceError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MoveCollectionPropertiesErrors.class);

    /** {@inheritDoc} */
    @Override
    public MoveCollectionPropertiesErrors withProperties(MoveResourceErrorBody properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}