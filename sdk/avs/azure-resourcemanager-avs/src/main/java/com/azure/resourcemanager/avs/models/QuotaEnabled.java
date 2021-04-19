// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QuotaEnabled. */
public final class QuotaEnabled extends ExpandableStringEnum<QuotaEnabled> {
    /** Static value Enabled for QuotaEnabled. */
    public static final QuotaEnabled ENABLED = fromString("Enabled");

    /** Static value Disabled for QuotaEnabled. */
    public static final QuotaEnabled DISABLED = fromString("Disabled");

    /**
     * Creates or finds a QuotaEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QuotaEnabled.
     */
    @JsonCreator
    public static QuotaEnabled fromString(String name) {
        return fromString(name, QuotaEnabled.class);
    }

    /** @return known QuotaEnabled values. */
    public static Collection<QuotaEnabled> values() {
        return values(QuotaEnabled.class);
    }
}