/*
 * (C) Copyright IBM Corp. 2023.
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
 * The deleteTagsSubscription options.
 */
public class DeleteTagsSubscriptionOptions extends GenericModel {

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
     * Instantiates a new Builder from an existing DeleteTagsSubscriptionOptions instance.
     *
     * @param deleteTagsSubscriptionOptions the instance to initialize the Builder with
     */
    private Builder(DeleteTagsSubscriptionOptions deleteTagsSubscriptionOptions) {
      this.instanceId = deleteTagsSubscriptionOptions.instanceId;
      this.id = deleteTagsSubscriptionOptions.id;
      this.deviceId = deleteTagsSubscriptionOptions.deviceId;
      this.tagName = deleteTagsSubscriptionOptions.tagName;
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
     * Builds a DeleteTagsSubscriptionOptions.
     *
     * @return the new DeleteTagsSubscriptionOptions instance
     */
    public DeleteTagsSubscriptionOptions build() {
      return new DeleteTagsSubscriptionOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteTagsSubscriptionOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteTagsSubscriptionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the deviceId.
     *
     * @param deviceId the deviceId
     * @return the DeleteTagsSubscriptionOptions builder
     */
    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     * Set the tagName.
     *
     * @param tagName the tagName
     * @return the DeleteTagsSubscriptionOptions builder
     */
    public Builder tagName(String tagName) {
      this.tagName = tagName;
      return this;
    }
  }

  protected DeleteTagsSubscriptionOptions() { }

  protected DeleteTagsSubscriptionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    deviceId = builder.deviceId;
    tagName = builder.tagName;
  }

  /**
   * New builder.
   *
   * @return a DeleteTagsSubscriptionOptions builder
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
   * Device ID of the destination tagsubscription.
   *
   * @return the deviceId
   */
  public String deviceId() {
    return deviceId;
  }

  /**
   * Gets the tagName.
   *
   * TagName of the subscription.
   *
   * @return the tagName
   */
  public String tagName() {
    return tagName;
  }
}

