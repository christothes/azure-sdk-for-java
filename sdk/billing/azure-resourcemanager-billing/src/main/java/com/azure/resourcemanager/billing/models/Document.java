// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a document. */
@Immutable
public final class Document {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Document.class);

    /*
     * The type of the document.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private DocumentType kind;

    /*
     * Document URL.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * The source of the document. ENF for Brazil and DRS for rest of the
     * world.
     */
    @JsonProperty(value = "source", access = JsonProperty.Access.WRITE_ONLY)
    private DocumentSource source;

    /**
     * Get the kind property: The type of the document.
     *
     * @return the kind value.
     */
    public DocumentType kind() {
        return this.kind;
    }

    /**
     * Get the url property: Document URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the source property: The source of the document. ENF for Brazil and DRS for rest of the world.
     *
     * @return the source value.
     */
    public DocumentSource source() {
        return this.source;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}