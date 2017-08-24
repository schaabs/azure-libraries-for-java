/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.devices.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Use to provide parameters when requesting an import of all devices in the
 * hub.
 */
public class ImportDevicesRequestInner {
    /**
     * The input blob container URI.
     */
    @JsonProperty(value = "InputBlobContainerUri", required = true)
    private String inputBlobContainerUri;

    /**
     * The output blob container URI.
     */
    @JsonProperty(value = "OutputBlobContainerUri", required = true)
    private String outputBlobContainerUri;

    /**
     * Get the inputBlobContainerUri value.
     *
     * @return the inputBlobContainerUri value
     */
    public String inputBlobContainerUri() {
        return this.inputBlobContainerUri;
    }

    /**
     * Set the inputBlobContainerUri value.
     *
     * @param inputBlobContainerUri the inputBlobContainerUri value to set
     * @return the ImportDevicesRequestInner object itself.
     */
    public ImportDevicesRequestInner withInputBlobContainerUri(String inputBlobContainerUri) {
        this.inputBlobContainerUri = inputBlobContainerUri;
        return this;
    }

    /**
     * Get the outputBlobContainerUri value.
     *
     * @return the outputBlobContainerUri value
     */
    public String outputBlobContainerUri() {
        return this.outputBlobContainerUri;
    }

    /**
     * Set the outputBlobContainerUri value.
     *
     * @param outputBlobContainerUri the outputBlobContainerUri value to set
     * @return the ImportDevicesRequestInner object itself.
     */
    public ImportDevicesRequestInner withOutputBlobContainerUri(String outputBlobContainerUri) {
        this.outputBlobContainerUri = outputBlobContainerUri;
        return this;
    }

}
