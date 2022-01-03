/*
 * (C) Copyright IBM Corp. 2021.
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
 * The createDestination options.
 */
public class CreateDestinationOptions extends GenericModel {

  /**
   * The type of Destination Webhook.
   */
  public interface Type {
    /** webhook. */
    String WEBHOOK = "webhook";
  }

  protected String instanceId;
  protected String name;
  protected String type;
  protected String description;
  protected DestinationConfig config;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String type;
    private String description;
    private DestinationConfig config;

    private Builder(CreateDestinationOptions createDestinationOptions) {
      this.instanceId = createDestinationOptions.instanceId;
      this.name = createDestinationOptions.name;
      this.type = createDestinationOptions.type;
      this.description = createDestinationOptions.description;
      this.config = createDestinationOptions.config;
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
     * @param name the name
     * @param type the type
     */
    public Builder(String instanceId, String name, String type) {
      this.instanceId = instanceId;
      this.name = name;
      this.type = type;
    }

    /**
     * Builds a CreateDestinationOptions.
     *
     * @return the new CreateDestinationOptions instance
     */
    public CreateDestinationOptions build() {
      return new CreateDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDestinationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDestinationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDestinationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the config.
     *
     * @param config the config
     * @return the CreateDestinationOptions builder
     */
    public Builder config(DestinationConfig config) {
      this.config = config;
      return this;
    }
  }

  protected CreateDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    type = builder.type;
    description = builder.description;
    config = builder.config;
  }

  /**
   * New builder.
   *
   * @return a CreateDestinationOptions builder
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
   * Gets the name.
   *
   * The Destintion name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of Destination Webhook.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * The Destination description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the config.
   *
   * Payload describing a destination configuration.
   *
   * @return the config
   */
  public DestinationConfig config() {
    return config;
  }
}

