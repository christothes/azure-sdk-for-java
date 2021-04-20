// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Additional set of information required for quota increase support ticket for certain quota types, e.g.: Virtual
 * machine cores. Get complete details about Quota payload support request along with examples at [Support quota
 * request](https://aka.ms/supportrpquotarequestpayload).
 */
@Fluent
public final class QuotaTicketDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuotaTicketDetails.class);

    /*
     * Required for certain quota types when there is a sub type, such as
     * Batch, for which you are requesting a quota increase.
     */
    @JsonProperty(value = "quotaChangeRequestSubType")
    private String quotaChangeRequestSubType;

    /*
     * Quota change request version.
     */
    @JsonProperty(value = "quotaChangeRequestVersion")
    private String quotaChangeRequestVersion;

    /*
     * This property is required for providing the region and new quota limits.
     */
    @JsonProperty(value = "quotaChangeRequests")
    private List<QuotaChangeRequest> quotaChangeRequests;

    /**
     * Get the quotaChangeRequestSubType property: Required for certain quota types when there is a sub type, such as
     * Batch, for which you are requesting a quota increase.
     *
     * @return the quotaChangeRequestSubType value.
     */
    public String quotaChangeRequestSubType() {
        return this.quotaChangeRequestSubType;
    }

    /**
     * Set the quotaChangeRequestSubType property: Required for certain quota types when there is a sub type, such as
     * Batch, for which you are requesting a quota increase.
     *
     * @param quotaChangeRequestSubType the quotaChangeRequestSubType value to set.
     * @return the QuotaTicketDetails object itself.
     */
    public QuotaTicketDetails withQuotaChangeRequestSubType(String quotaChangeRequestSubType) {
        this.quotaChangeRequestSubType = quotaChangeRequestSubType;
        return this;
    }

    /**
     * Get the quotaChangeRequestVersion property: Quota change request version.
     *
     * @return the quotaChangeRequestVersion value.
     */
    public String quotaChangeRequestVersion() {
        return this.quotaChangeRequestVersion;
    }

    /**
     * Set the quotaChangeRequestVersion property: Quota change request version.
     *
     * @param quotaChangeRequestVersion the quotaChangeRequestVersion value to set.
     * @return the QuotaTicketDetails object itself.
     */
    public QuotaTicketDetails withQuotaChangeRequestVersion(String quotaChangeRequestVersion) {
        this.quotaChangeRequestVersion = quotaChangeRequestVersion;
        return this;
    }

    /**
     * Get the quotaChangeRequests property: This property is required for providing the region and new quota limits.
     *
     * @return the quotaChangeRequests value.
     */
    public List<QuotaChangeRequest> quotaChangeRequests() {
        return this.quotaChangeRequests;
    }

    /**
     * Set the quotaChangeRequests property: This property is required for providing the region and new quota limits.
     *
     * @param quotaChangeRequests the quotaChangeRequests value to set.
     * @return the QuotaTicketDetails object itself.
     */
    public QuotaTicketDetails withQuotaChangeRequests(List<QuotaChangeRequest> quotaChangeRequests) {
        this.quotaChangeRequests = quotaChangeRequests;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (quotaChangeRequests() != null) {
            quotaChangeRequests().forEach(e -> e.validate());
        }
    }
}