// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.resourcemanager.customerinsights.fluent.models.PredictionModelStatusInner;
import com.azure.resourcemanager.customerinsights.models.PredictionModelLifeCycle;
import com.azure.resourcemanager.customerinsights.models.PredictionModelStatus;
import java.math.BigDecimal;

public final class PredictionModelStatusImpl implements PredictionModelStatus {
    private PredictionModelStatusInner innerObject;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    PredictionModelStatusImpl(
        PredictionModelStatusInner innerObject,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public String predictionName() {
        return this.innerModel().predictionName();
    }

    public String predictionGuidId() {
        return this.innerModel().predictionGuidId();
    }

    public PredictionModelLifeCycle status() {
        return this.innerModel().status();
    }

    public String message() {
        return this.innerModel().message();
    }

    public Integer trainingSetCount() {
        return this.innerModel().trainingSetCount();
    }

    public Integer testSetCount() {
        return this.innerModel().testSetCount();
    }

    public Integer validationSetCount() {
        return this.innerModel().validationSetCount();
    }

    public BigDecimal trainingAccuracy() {
        return this.innerModel().trainingAccuracy();
    }

    public Integer signalsUsed() {
        return this.innerModel().signalsUsed();
    }

    public String modelVersion() {
        return this.innerModel().modelVersion();
    }

    public PredictionModelStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }
}