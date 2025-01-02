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
 * The createTagsSubscription options.
 */
public class CreateTagsSubscriptionOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String deviceId;
  protected String tagName;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String deviceId;
    private String tagName;

    /**
     * Instantiates a new Builder from an existing CreateTagsSubscriptionOptions instance.
     *
     * @param createTagsSubscriptionOptions the instance to initialize the Builder with
     */
    private Builder(CreateTagsSubscriptionOptions createTagsSubscriptionOptions) {
      this.instanceId = createTagsSubscriptionOptions.instanceId;
      this.id = createTagsSubscriptionOptions.id;
      this.deviceId = createTagsSubscriptionOptions.deviceId;
      this.tagName = createTagsSubscriptionOptions.tagName;
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
     * @param deviceId the deviceId
     * @param tagName the tagName
     */
    public Builder(String instanceId, String id, String deviceId, String tagName) {
      this.instanceId = instanceId;
      this.id = id;
      this.deviceId = deviceId;
      this.tagName = tagName;
    }

    /**
     * Builds a CreateTagsSubscriptionOptions.
     *
     * @return the new CreateTagsSubscriptionOptions instance
     */
    public CreateTagsSubscriptionOptions build() {
      return new CreateTagsSubscriptionOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateTagsSubscriptionOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateTagsSubscriptionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the deviceId.
     *
     * @param deviceId the deviceId
     * @return the CreateTagsSubscriptionOptions builder
     */
    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     * Set the tagName.
     *
     * @param tagName the tagName
     * @return the CreateTagsSubscriptionOptions builder
     */
    public Builder tagName(String tagName) {
      this.tagName = tagName;
      return this;
    }
  }

  protected CreateTagsSubscriptionOptions() { }

  protected CreateTagsSubscriptionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.deviceId,
      "deviceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tagName,
      "tagName cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    deviceId = builder.deviceId;
    tagName = builder.tagName;
  }

  /**
   * New builder.
   *
   * @return a CreateTagsSubscriptionOptions builder
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
   * Unique identifier for Destination.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the deviceId.
   *
   * Unique identifier of the device.
   *
   * @return the deviceId
   */
  public String deviceId() {
    return deviceId;
  }

  /**
   * Gets the tagName.
   *
   * The name of the tag its subscribed.
   *
   * @return the tagName
   */
  public String tagName() {
    return tagName;
  }
}

