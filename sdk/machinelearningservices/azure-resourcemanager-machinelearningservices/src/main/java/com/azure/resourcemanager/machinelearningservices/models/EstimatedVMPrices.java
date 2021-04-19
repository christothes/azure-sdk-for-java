// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The estimated price info for using a VM. */
@Fluent
public final class EstimatedVMPrices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EstimatedVMPrices.class);

    /*
     * Three lettered code specifying the currency of the VM price. Example:
     * USD
     */
    @JsonProperty(value = "billingCurrency", required = true)
    private BillingCurrency billingCurrency;

    /*
     * The unit of time measurement for the specified VM price. Example:
     * OneHour
     */
    @JsonProperty(value = "unitOfMeasure", required = true)
    private UnitOfMeasure unitOfMeasure;

    /*
     * The list of estimated prices for using a VM of a particular OS type,
     * tier, etc.
     */
    @JsonProperty(value = "values", required = true)
    private List<EstimatedVMPrice> values;

    /**
     * Get the billingCurrency property: Three lettered code specifying the currency of the VM price. Example: USD.
     *
     * @return the billingCurrency value.
     */
    public BillingCurrency billingCurrency() {
        return this.billingCurrency;
    }

    /**
     * Set the billingCurrency property: Three lettered code specifying the currency of the VM price. Example: USD.
     *
     * @param billingCurrency the billingCurrency value to set.
     * @return the EstimatedVMPrices object itself.
     */
    public EstimatedVMPrices withBillingCurrency(BillingCurrency billingCurrency) {
        this.billingCurrency = billingCurrency;
        return this;
    }

    /**
     * Get the unitOfMeasure property: The unit of time measurement for the specified VM price. Example: OneHour.
     *
     * @return the unitOfMeasure value.
     */
    public UnitOfMeasure unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Set the unitOfMeasure property: The unit of time measurement for the specified VM price. Example: OneHour.
     *
     * @param unitOfMeasure the unitOfMeasure value to set.
     * @return the EstimatedVMPrices object itself.
     */
    public EstimatedVMPrices withUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * Get the values property: The list of estimated prices for using a VM of a particular OS type, tier, etc.
     *
     * @return the values value.
     */
    public List<EstimatedVMPrice> values() {
        return this.values;
    }

    /**
     * Set the values property: The list of estimated prices for using a VM of a particular OS type, tier, etc.
     *
     * @param values the values value to set.
     * @return the EstimatedVMPrices object itself.
     */
    public EstimatedVMPrices withValues(List<EstimatedVMPrice> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (billingCurrency() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property billingCurrency in model EstimatedVMPrices"));
        }
        if (unitOfMeasure() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property unitOfMeasure in model EstimatedVMPrices"));
        }
        if (values() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property values in model EstimatedVMPrices"));
        } else {
            values().forEach(e -> e.validate());
        }
    }
}