// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.powerbidedicated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.powerbidedicated;
    exports com.azure.resourcemanager.powerbidedicated.fluent;
    exports com.azure.resourcemanager.powerbidedicated.fluent.models;
    exports com.azure.resourcemanager.powerbidedicated.models;

    opens com.azure.resourcemanager.powerbidedicated.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.powerbidedicated.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}