/*
 * (C) Copyright IBM Corp. 2022.
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
public class IntegrationMetadata extends GenericModel {

  protected String endpoint;
  protected String crn;
  @SerializedName("root_key_id")
  protected String rootKeyId;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpoint;
    private String crn;
    private String rootKeyId;

    private Builder(IntegrationMetadata integrationMetadata) {
      this.endpoint = integrationMetadata.endpoint;
      this.crn = integrationMetadata.crn;
      this.rootKeyId = integrationMetadata.rootKeyId;
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
     * @param rootKeyId the rootKeyId
     */
    public Builder(String endpoint, String crn, String rootKeyId) {
      this.endpoint = endpoint;
      this.crn = crn;
      this.rootKeyId = rootKeyId;
    }

    /**
     * Builds a IntegrationMetadata.
     *
     * @return the new IntegrationMetadata instance
     */
    public IntegrationMetadata build() {
      return new IntegrationMetadata(this);
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the IntegrationMetadata builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the IntegrationMetadata builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the rootKeyId.
     *
     * @param rootKeyId the rootKeyId
     * @return the IntegrationMetadata builder
     */
    public Builder rootKeyId(String rootKeyId) {
      this.rootKeyId = rootKeyId;
      return this;
    }
  }

  protected IntegrationMetadata() { }

  protected IntegrationMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpoint,
      "endpoint cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rootKeyId,
      "rootKeyId cannot be null");
    endpoint = builder.endpoint;
    crn = builder.crn;
    rootKeyId = builder.rootKeyId;
  }

  /**
   * New builder.
   *
   * @return a IntegrationMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the endpoint.
   *
   * KMS url for key management.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the crn.
   *
   * CRN of the KMS instance.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the rootKeyId.
   *
   * Root Key id of KMS.
   *
   * @return the rootKeyId
   */
  public String rootKeyId() {
    return rootKeyId;
  }
}

