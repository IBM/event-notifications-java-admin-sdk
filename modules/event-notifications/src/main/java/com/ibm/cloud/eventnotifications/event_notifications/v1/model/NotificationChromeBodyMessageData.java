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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a chrome notifications body message Data.
 */
public class NotificationChromeBodyMessageData extends GenericModel {

  protected String alert;
  protected String title;
  protected String iconUrl;
  @SerializedName("time_to_live")
  protected Long timeToLive;
  protected Map<String, Object> payload;

  /**
   * Builder.
   */
  public static class Builder {
    private String alert;
    private String title;
    private String iconUrl;
    private Long timeToLive;
    private Map<String, Object> payload;

    private Builder(NotificationChromeBodyMessageData notificationChromeBodyMessageData) {
      this.alert = notificationChromeBodyMessageData.alert;
      this.title = notificationChromeBodyMessageData.title;
      this.iconUrl = notificationChromeBodyMessageData.iconUrl;
      this.timeToLive = notificationChromeBodyMessageData.timeToLive;
      this.payload = notificationChromeBodyMessageData.payload;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param alert the alert
     */
    public Builder(String alert) {
      this.alert = alert;
    }

    /**
     * Builds a NotificationChromeBodyMessageData.
     *
     * @return the new NotificationChromeBodyMessageData instance
     */
    public NotificationChromeBodyMessageData build() {
      return new NotificationChromeBodyMessageData(this);
    }

    /**
     * Set the alert.
     *
     * @param alert the alert
     * @return the NotificationChromeBodyMessageData builder
     */
    public Builder alert(String alert) {
      this.alert = alert;
      return this;
    }

    /**
     * Set the title.
     *
     * @param title the title
     * @return the NotificationChromeBodyMessageData builder
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Set the iconUrl.
     *
     * @param iconUrl the iconUrl
     * @return the NotificationChromeBodyMessageData builder
     */
    public Builder iconUrl(String iconUrl) {
      this.iconUrl = iconUrl;
      return this;
    }

    /**
     * Set the timeToLive.
     *
     * @param timeToLive the timeToLive
     * @return the NotificationChromeBodyMessageData builder
     */
    public Builder timeToLive(long timeToLive) {
      this.timeToLive = timeToLive;
      return this;
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the NotificationChromeBodyMessageData builder
     */
    public Builder payload(Map<String, Object> payload) {
      this.payload = payload;
      return this;
    }
  }

  protected NotificationChromeBodyMessageData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.alert,
      "alert cannot be null");
    alert = builder.alert;
    title = builder.title;
    iconUrl = builder.iconUrl;
    timeToLive = builder.timeToLive;
    payload = builder.payload;
  }

  /**
   * New builder.
   *
   * @return a NotificationChromeBodyMessageData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the alert.
   *
   * The notification message to be shown to the user.
   *
   * @return the alert
   */
  public String alert() {
    return alert;
  }

  /**
   * Gets the title.
   *
   * The title of Push notifications.
   *
   * @return the title
   */
  public String title() {
    return title;
  }

  /**
   * Gets the iconUrl.
   *
   * The URL of the icon to be set for the WebPush Notification.
   *
   * @return the iconUrl
   */
  public String iconUrl() {
    return iconUrl;
  }

  /**
   * Gets the timeToLive.
   *
   * This parameter specifies how long (in seconds) the message
   *   should be kept in FCM storage if the device is offline.
   *
   * @return the timeToLive
   */
  public Long timeToLive() {
    return timeToLive;
  }

  /**
   * Gets the payload.
   *
   * Custom JSON payload that will be sent as part of the notification message.
   *
   * @return the payload
   */
  public Map<String, Object> payload() {
    return payload;
  }
}

