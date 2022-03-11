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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSubscription options.
 */
public class UpdateSubscriptionOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String name;
  protected String description;
  protected SubscriptionUpdateAttributes attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String name;
    private String description;
    private SubscriptionUpdateAttributes attributes;

    private Builder(UpdateSubscriptionOptions updateSubscriptionOptions) {
      this.instanceId = updateSubscriptionOptions.instanceId;
      this.id = updateSubscriptionOptions.id;
      this.name = updateSubscriptionOptions.name;
      this.description = updateSubscriptionOptions.description;
      this.attributes = updateSubscriptionOptions.attributes;
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
     */
    public Builder(String instanceId, String id) {
      this.instanceId = instanceId;
      this.id = id;
    }

    /**
     * Builds a UpdateSubscriptionOptions.
     *
     * @return the new UpdateSubscriptionOptions instance
     */
    public UpdateSubscriptionOptions build() {
      return new UpdateSubscriptionOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateSubscriptionOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSubscriptionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateSubscriptionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateSubscriptionOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the UpdateSubscriptionOptions builder
     */
    public Builder attributes(SubscriptionUpdateAttributes attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected UpdateSubscriptionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    name = builder.name;
    description = builder.description;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a UpdateSubscriptionOptions builder
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
   * Unique identifier for Subscription.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the subscription.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the subscription.
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
  public SubscriptionUpdateAttributes attributes() {
    return attributes;
  }
}

