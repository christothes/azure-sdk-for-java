// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Labs. */
public interface Labs {
    /**
     * List labs in a given lab account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Lab> list(String resourceGroupName, String labAccountName);

    /**
     * List labs in a given lab account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param expand Specify the $expand query. Example: 'properties($select=maxUsersInLab)'.
     * @param filter The filter to apply to the operation.
     * @param top The maximum number of resources to return from the operation.
     * @param orderby The ordering expression for the results, using OData notation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Lab> list(
        String resourceGroupName,
        String labAccountName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    Lab get(String resourceGroupName, String labAccountName, String labName);

    /**
     * Get lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=maxUsersInLab)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    Response<Lab> getWithResponse(
        String resourceGroupName, String labAccountName, String labName, String expand, Context context);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labAccountName, String labName);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labAccountName, String labName, Context context);

    /**
     * Add users to a lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param addUsersPayload Payload for Add Users operation on a Lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addUsers(String resourceGroupName, String labAccountName, String labName, AddUsersPayload addUsersPayload);

    /**
     * Add users to a lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param addUsersPayload Payload for Add Users operation on a Lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> addUsersWithResponse(
        String resourceGroupName,
        String labAccountName,
        String labName,
        AddUsersPayload addUsersPayload,
        Context context);

    /**
     * Register to managed lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void register(String resourceGroupName, String labAccountName, String labName);

    /**
     * Register to managed lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> registerWithResponse(
        String resourceGroupName, String labAccountName, String labName, Context context);

    /**
     * Get lab.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    Lab getById(String id);

    /**
     * Get lab.
     *
     * @param id the resource ID.
     * @param expand Specify the $expand query. Example: 'properties($select=maxUsersInLab)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    Response<Lab> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Lab resource.
     *
     * @param name resource name.
     * @return the first stage of the new Lab definition.
     */
    Lab.DefinitionStages.Blank define(String name);
}