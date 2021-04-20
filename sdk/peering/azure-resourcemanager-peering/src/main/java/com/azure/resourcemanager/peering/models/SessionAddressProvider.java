// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SessionAddressProvider. */
public final class SessionAddressProvider extends ExpandableStringEnum<SessionAddressProvider> {
    /** Static value Microsoft for SessionAddressProvider. */
    public static final SessionAddressProvider MICROSOFT = fromString("Microsoft");

    /** Static value Peer for SessionAddressProvider. */
    public static final SessionAddressProvider PEER = fromString("Peer");

    /**
     * Creates or finds a SessionAddressProvider from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SessionAddressProvider.
     */
    @JsonCreator
    public static SessionAddressProvider fromString(String name) {
        return fromString(name, SessionAddressProvider.class);
    }

    /** @return known SessionAddressProvider values. */
    public static Collection<SessionAddressProvider> values() {
        return values(SessionAddressProvider.class);
    }
}