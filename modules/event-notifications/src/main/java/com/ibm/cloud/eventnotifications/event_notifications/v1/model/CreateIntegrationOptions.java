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
 * The createIntegration options.
 */
public class CreateIntegrationOptions extends GenericModel {

  /**
   * The type of Integration.
   */
  public interface Type {
    /** collect_failed_events. */
    String COLLECT_FAILED_EVENTS = "collect_failed_events";
  }

  protected String instanceId;
  protected String type;
  protected IntegrationCreateMetadata metadata;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String type;
    private IntegrationCreateMetadata metadata;

    /**
     * Instantiates a new Builder from an existing CreateIntegrationOptions instance.
     *
     * @param createIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateIntegrationOptions createIntegrationOptions) {
      this.instanceId = createIntegrationOptions.instanceId;
      this.type = createIntegrationOptions.type;
      this.metadata = createIntegrationOptions.metadata;
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
     * @param type the type
     * @param metadata the metadata
     */
    public Builder(String instanceId, String type, IntegrationCreateMetadata metadata) {
      this.instanceId = instanceId;
      this.type = type;
      this.metadata = metadata;
    }

    /**
     * Builds a CreateIntegrationOptions.
     *
     * @return the new CreateIntegrationOptions instance
     */
    public CreateIntegrationOptions build() {
      return new CreateIntegrationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateIntegrationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateIntegrationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the CreateIntegrationOptions builder
     */
    public Builder metadata(IntegrationCreateMetadata metadata) {
      this.metadata = metadata;
      return this;
    }
  }

  protected CreateIntegrationOptions() { }

  protected CreateIntegrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadata,
      "metadata cannot be null");
    instanceId = builder.instanceId;
    type = builder.type;
    metadata = builder.metadata;
  }

  /**
   * New builder.
   *
   * @return a CreateIntegrationOptions builder
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
   * Gets the type.
   *
   * The type of Integration.
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
  public IntegrationCreateMetadata metadata() {
    return metadata;
  }
}

