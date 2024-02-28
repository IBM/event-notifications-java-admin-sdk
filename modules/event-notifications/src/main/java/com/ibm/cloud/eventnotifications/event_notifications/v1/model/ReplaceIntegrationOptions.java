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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceIntegration options.
 */
public class ReplaceIntegrationOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String type;
  protected IntegrationMetadata metadata;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String type;
    private IntegrationMetadata metadata;

    /**
     * Instantiates a new Builder from an existing ReplaceIntegrationOptions instance.
     *
     * @param replaceIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceIntegrationOptions replaceIntegrationOptions) {
      this.instanceId = replaceIntegrationOptions.instanceId;
      this.id = replaceIntegrationOptions.id;
      this.type = replaceIntegrationOptions.type;
      this.metadata = replaceIntegrationOptions.metadata;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param id the id
     * @param type the type
     * @param metadata the metadata
     */
    public Builder(String instanceId, String id, String type, IntegrationMetadata metadata) {
      this.instanceId = instanceId;
      this.id = id;
      this.type = type;
      this.metadata = metadata;
    }

    /**
     * Builds a ReplaceIntegrationOptions.
     *
     * @return the new ReplaceIntegrationOptions instance
     */
    public ReplaceIntegrationOptions build() {
      return new ReplaceIntegrationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ReplaceIntegrationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceIntegrationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ReplaceIntegrationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the ReplaceIntegrationOptions builder
     */
    public Builder metadata(IntegrationMetadata metadata) {
      this.metadata = metadata;
      return this;
    }
  }

  protected ReplaceIntegrationOptions() { }

  protected ReplaceIntegrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadata,
      "metadata cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    type = builder.type;
    metadata = builder.metadata;
  }

  /**
   * New builder.
   *
   * @return a ReplaceIntegrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * Unique identifier for IBM Cloud Event Notifications instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * Unique identifier for integration.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * Integration type. Allowed values are kms and hs-crypto.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the metadata.
   *
   * Integration Metadata object.
   *
   * @return the metadata
   */
  public IntegrationMetadata metadata() {
    return metadata;
  }
}

