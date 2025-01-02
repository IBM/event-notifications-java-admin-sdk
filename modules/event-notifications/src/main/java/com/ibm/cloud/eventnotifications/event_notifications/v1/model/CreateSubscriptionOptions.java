/*
 * (C) Copyright IBM Corp. 2025.
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
 * The createSubscription options.
 */
public class CreateSubscriptionOptions extends GenericModel {

  protected String instanceId;
  protected String name;
  protected String destinationId;
  protected String topicId;
  protected String description;
  protected SubscriptionCreateAttributes attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String destinationId;
    private String topicId;
    private String description;
    private SubscriptionCreateAttributes attributes;

    /**
     * Instantiates a new Builder from an existing CreateSubscriptionOptions instance.
     *
     * @param createSubscriptionOptions the instance to initialize the Builder with
     */
    private Builder(CreateSubscriptionOptions createSubscriptionOptions) {
      this.instanceId = createSubscriptionOptions.instanceId;
      this.name = createSubscriptionOptions.name;
      this.destinationId = createSubscriptionOptions.destinationId;
      this.topicId = createSubscriptionOptions.topicId;
      this.description = createSubscriptionOptions.description;
      this.attributes = createSubscriptionOptions.attributes;
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
     * @param destinationId the destinationId
     * @param topicId the topicId
     */
    public Builder(String instanceId, String name, String destinationId, String topicId) {
      this.instanceId = instanceId;
      this.name = name;
      this.destinationId = destinationId;
      this.topicId = topicId;
    }

    /**
     * Builds a CreateSubscriptionOptions.
     *
     * @return the new CreateSubscriptionOptions instance
     */
    public CreateSubscriptionOptions build() {
      return new CreateSubscriptionOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateSubscriptionOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSubscriptionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the CreateSubscriptionOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the topicId.
     *
     * @param topicId the topicId
     * @return the CreateSubscriptionOptions builder
     */
    public Builder topicId(String topicId) {
      this.topicId = topicId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateSubscriptionOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the CreateSubscriptionOptions builder
     */
    public Builder attributes(SubscriptionCreateAttributes attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected CreateSubscriptionOptions() { }

  protected CreateSubscriptionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destinationId,
      "destinationId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.topicId,
      "topicId cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    destinationId = builder.destinationId;
    topicId = builder.topicId;
    description = builder.description;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a CreateSubscriptionOptions builder
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
   * Subscription name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the destinationId.
   *
   * Destination ID.
   *
   * @return the destinationId
   */
  public String destinationId() {
    return destinationId;
  }

  /**
   * Gets the topicId.
   *
   * Topic ID.
   *
   * @return the topicId
   */
  public String topicId() {
    return topicId;
  }

  /**
   * Gets the description.
   *
   * Subscription description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the attributes.
   *
   * @return the attributes
   */
  public SubscriptionCreateAttributes attributes() {
    return attributes;
  }
}

