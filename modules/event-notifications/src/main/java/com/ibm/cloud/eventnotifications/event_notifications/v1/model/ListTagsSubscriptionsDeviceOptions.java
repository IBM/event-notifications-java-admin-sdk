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
 * The listTagsSubscriptionsDevice options.
 */
public class ListTagsSubscriptionsDeviceOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String deviceId;
  protected String tagName;
  protected Long limit;
  protected Long offset;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String deviceId;
    private String tagName;
    private Long limit;
    private Long offset;

    private Builder(ListTagsSubscriptionsDeviceOptions listTagsSubscriptionsDeviceOptions) {
      this.instanceId = listTagsSubscriptionsDeviceOptions.instanceId;
      this.id = listTagsSubscriptionsDeviceOptions.id;
      this.deviceId = listTagsSubscriptionsDeviceOptions.deviceId;
      this.tagName = listTagsSubscriptionsDeviceOptions.tagName;
      this.limit = listTagsSubscriptionsDeviceOptions.limit;
      this.offset = listTagsSubscriptionsDeviceOptions.offset;
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
     */
    public Builder(String instanceId, String id, String deviceId) {
      this.instanceId = instanceId;
      this.id = id;
      this.deviceId = deviceId;
    }

    /**
     * Builds a ListTagsSubscriptionsDeviceOptions.
     *
     * @return the new ListTagsSubscriptionsDeviceOptions instance
     */
    public ListTagsSubscriptionsDeviceOptions build() {
      return new ListTagsSubscriptionsDeviceOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListTagsSubscriptionsDeviceOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListTagsSubscriptionsDeviceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the deviceId.
     *
     * @param deviceId the deviceId
     * @return the ListTagsSubscriptionsDeviceOptions builder
     */
    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     * Set the tagName.
     *
     * @param tagName the tagName
     * @return the ListTagsSubscriptionsDeviceOptions builder
     */
    public Builder tagName(String tagName) {
      this.tagName = tagName;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListTagsSubscriptionsDeviceOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListTagsSubscriptionsDeviceOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }
  }

  protected ListTagsSubscriptionsDeviceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.deviceId,
      "deviceId cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    deviceId = builder.deviceId;
    tagName = builder.tagName;
    limit = builder.limit;
    offset = builder.offset;
  }

  /**
   * New builder.
   *
   * @return a ListTagsSubscriptionsDeviceOptions builder
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
   * DeviceID of the destination.
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

  /**
   * Gets the limit.
   *
   * Page limit for paginated results.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * offset for paginated results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }
}

