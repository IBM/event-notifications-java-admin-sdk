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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a FCM Notifications targets.
 */
public class NotificationDevices extends GenericModel {

  @SerializedName("fcm_devices")
  protected List<String> fcmDevices;
  @SerializedName("apns_devices")
  protected List<String> apnsDevices;
  @SerializedName("user_ids")
  protected List<String> userIds;
  protected List<String> tags;
  protected List<String> platforms;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> fcmDevices;
    private List<String> apnsDevices;
    private List<String> userIds;
    private List<String> tags;
    private List<String> platforms;

    private Builder(NotificationDevices notificationDevices) {
      this.fcmDevices = notificationDevices.fcmDevices;
      this.apnsDevices = notificationDevices.apnsDevices;
      this.userIds = notificationDevices.userIds;
      this.tags = notificationDevices.tags;
      this.platforms = notificationDevices.platforms;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NotificationDevices.
     *
     * @return the new NotificationDevices instance
     */
    public NotificationDevices build() {
      return new NotificationDevices(this);
    }

    /**
     * Adds an fcmDevices to fcmDevices.
     *
     * @param fcmDevices the new fcmDevices
     * @return the NotificationDevices builder
     */
    public Builder addFcmDevices(String fcmDevices) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(fcmDevices,
        "fcmDevices cannot be null");
      if (this.fcmDevices == null) {
        this.fcmDevices = new ArrayList<String>();
      }
      this.fcmDevices.add(fcmDevices);
      return this;
    }

    /**
     * Adds an apnsDevices to apnsDevices.
     *
     * @param apnsDevices the new apnsDevices
     * @return the NotificationDevices builder
     */
    public Builder addApnsDevices(String apnsDevices) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(apnsDevices,
        "apnsDevices cannot be null");
      if (this.apnsDevices == null) {
        this.apnsDevices = new ArrayList<String>();
      }
      this.apnsDevices.add(apnsDevices);
      return this;
    }

    /**
     * Adds an userIds to userIds.
     *
     * @param userIds the new userIds
     * @return the NotificationDevices builder
     */
    public Builder addUserIds(String userIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(userIds,
        "userIds cannot be null");
      if (this.userIds == null) {
        this.userIds = new ArrayList<String>();
      }
      this.userIds.add(userIds);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the NotificationDevices builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds an platforms to platforms.
     *
     * @param platforms the new platforms
     * @return the NotificationDevices builder
     */
    public Builder addPlatforms(String platforms) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(platforms,
        "platforms cannot be null");
      if (this.platforms == null) {
        this.platforms = new ArrayList<String>();
      }
      this.platforms.add(platforms);
      return this;
    }

    /**
     * Set the fcmDevices.
     * Existing fcmDevices will be replaced.
     *
     * @param fcmDevices the fcmDevices
     * @return the NotificationDevices builder
     */
    public Builder fcmDevices(List<String> fcmDevices) {
      this.fcmDevices = fcmDevices;
      return this;
    }

    /**
     * Set the apnsDevices.
     * Existing apnsDevices will be replaced.
     *
     * @param apnsDevices the apnsDevices
     * @return the NotificationDevices builder
     */
    public Builder apnsDevices(List<String> apnsDevices) {
      this.apnsDevices = apnsDevices;
      return this;
    }

    /**
     * Set the userIds.
     * Existing userIds will be replaced.
     *
     * @param userIds the userIds
     * @return the NotificationDevices builder
     */
    public Builder userIds(List<String> userIds) {
      this.userIds = userIds;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the NotificationDevices builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the platforms.
     * Existing platforms will be replaced.
     *
     * @param platforms the platforms
     * @return the NotificationDevices builder
     */
    public Builder platforms(List<String> platforms) {
      this.platforms = platforms;
      return this;
    }
  }

  protected NotificationDevices(Builder builder) {
    fcmDevices = builder.fcmDevices;
    apnsDevices = builder.apnsDevices;
    userIds = builder.userIds;
    tags = builder.tags;
    platforms = builder.platforms;
  }

  /**
   * New builder.
   *
   * @return a NotificationDevices builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the fcmDevices.
   *
   * List of FCM deviceIds.
   *
   * @return the fcmDevices
   */
  public List<String> fcmDevices() {
    return fcmDevices;
  }

  /**
   * Gets the apnsDevices.
   *
   * List of APNs deviceIds.
   *
   * @return the apnsDevices
   */
  public List<String> apnsDevices() {
    return apnsDevices;
  }

  /**
   * Gets the userIds.
   *
   * List of userIds.
   *
   * @return the userIds
   */
  public List<String> userIds() {
    return userIds;
  }

  /**
   * Gets the tags.
   *
   * List of tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the platforms.
   *
   * List of platforms.
   *
   * @return the platforms
   */
  public List<String> platforms() {
    return platforms;
  }
}

