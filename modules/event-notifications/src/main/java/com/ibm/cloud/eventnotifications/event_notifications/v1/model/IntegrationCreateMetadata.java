/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.eventnotifications.event_notifications.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Integration Metadata object.
 */
public class IntegrationCreateMetadata extends GenericModel {

  protected String endpoint;
  protected String crn;
  @SerializedName("bucket_name")
  protected String bucketName;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpoint;
    private String crn;
    private String bucketName;

    /**
     * Instantiates a new Builder from an existing IntegrationCreateMetadata instance.
     *
     * @param integrationCreateMetadata the instance to initialize the Builder with
     */
    private Builder(IntegrationCreateMetadata integrationCreateMetadata) {
      this.endpoint = integrationCreateMetadata.endpoint;
      this.crn = integrationCreateMetadata.crn;
      this.bucketName = integrationCreateMetadata.bucketName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param endpoint the endpoint
     * @param crn the crn
     * @param bucketName the bucketName
     */
    public Builder(String endpoint, String crn, String bucketName) {
      this.endpoint = endpoint;
      this.crn = crn;
      this.bucketName = bucketName;
    }

    /**
     * Builds a IntegrationCreateMetadata.
     *
     * @return the new IntegrationCreateMetadata instance
     */
    public IntegrationCreateMetadata build() {
      return new IntegrationCreateMetadata(this);
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the IntegrationCreateMetadata builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the IntegrationCreateMetadata builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the IntegrationCreateMetadata builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }
  }

  protected IntegrationCreateMetadata() { }

  protected IntegrationCreateMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpoint,
      "endpoint cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    endpoint = builder.endpoint;
    crn = builder.crn;
    bucketName = builder.bucketName;
  }

  /**
   * New builder.
   *
   * @return a IntegrationCreateMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the endpoint.
   *
   * URL for Cloud Object storage.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the crn.
   *
   * CRN of the Cloud Object Storage instance.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the bucketName.
   *
   * Cloud Object Storage bucket name.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }
}

