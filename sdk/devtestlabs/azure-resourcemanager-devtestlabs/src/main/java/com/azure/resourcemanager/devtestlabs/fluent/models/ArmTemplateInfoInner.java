// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a generated ARM template. */
@Fluent
public final class ArmTemplateInfoInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArmTemplateInfoInner.class);

    /*
     * The template's contents.
     */
    @JsonProperty(value = "template")
    private Object template;

    /*
     * The parameters of the ARM template.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * Get the template property: The template's contents.
     *
     * @return the template value.
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template property: The template's contents.
     *
     * @param template the template value to set.
     * @return the ArmTemplateInfoInner object itself.
     */
    public ArmTemplateInfoInner withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the parameters property: The parameters of the ARM template.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters of the ARM template.
     *
     * @param parameters the parameters value to set.
     * @return the ArmTemplateInfoInner object itself.
     */
    public ArmTemplateInfoInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}