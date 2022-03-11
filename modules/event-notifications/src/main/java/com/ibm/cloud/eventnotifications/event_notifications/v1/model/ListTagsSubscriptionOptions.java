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
 * The listTagsSubscription options.
 */
public class ListTagsSubscriptionOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String deviceId;
  protected String userId;
  protected String tagName;
  protected Long limit;
  protected Long offset;
  protected String search;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String deviceId;
    private String userId;
    private String tagName;
    private Long limit;
    private Long offset;
    private String search;

    private Builder(ListTagsSubscriptionOptions listTagsSubscriptionOptions) {
      this.instanceId = listTagsSubscriptionOptions.instanceId;
      this.id = listTagsSubscriptionOptions.id;
      this.deviceId = listTagsSubscriptionOptions.deviceId;
      this.userId = listTagsSubscriptionOptions.userId;
      this.tagName = listTagsSubscriptionOptions.tagName;
      this.limit = listTagsSubscriptionOptions.limit;
      this.offset = listTagsSubscriptionOptions.offset;
      this.search = listTagsSubscriptionOptions.search;
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
     * Builds a ListTagsSubscriptionOptions.
     *
     * @return the new ListTagsSubscriptionOptions instance
     */
    public ListTagsSubscriptionOptions build() {
      return new ListTagsSubscriptionOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the deviceId.
     *
     * @param deviceId the deviceId
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     * Set the userId.
     *
     * @param userId the userId
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set the tagName.
     *
     * @param tagName the tagName
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder tagName(String tagName) {
      this.tagName = tagName;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListTagsSubscriptionOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }
  }

  protected ListTagsSubscriptionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    deviceId = builder.deviceId;
    userId = builder.userId;
    tagName = builder.tagName;
    limit = builder.limit;
    offset = builder.offset;
    search = builder.search;
  }

  /**
   * New builder.
   *
   * @return a ListTagsSubscriptionOptions builder
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
   * DeviceID of the destination tagsubscription.
   *
   * @return the deviceId
   */
  public String deviceId() {
    return deviceId;
  }

  /**
   * Gets the userId.
   *
   * UserID of the destination.
   *
   * @return the userId
   */
  public String userId() {
    return userId;
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

  /**
   * Gets the search.
   *
   * Search string for filtering results.
   *
   * @return the search
   */
  public String search() {
    return search;
  }
}

