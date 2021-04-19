// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TokenType. */
public final class TokenType extends ExpandableStringEnum<TokenType> {
    /** Static value PersonalAccessToken for TokenType. */
    public static final TokenType PERSONAL_ACCESS_TOKEN = fromString("PersonalAccessToken");

    /** Static value Oauth for TokenType. */
    public static final TokenType OAUTH = fromString("Oauth");

    /**
     * Creates or finds a TokenType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TokenType.
     */
    @JsonCreator
    public static TokenType fromString(String name) {
        return fromString(name, TokenType.class);
    }

    /** @return known TokenType values. */
    public static Collection<TokenType> values() {
        return values(TokenType.class);
    }
}