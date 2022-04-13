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
 * Payload describing a fcm notifications body message Data.
 */
public class NotificationFCMBodyMessageData extends GenericModel {

  /**
   * Notification type.
   */
  public interface Type {
    /** DEFAULT. */
    String X_DEFAULT = "DEFAULT";
    /** SILENT. */
    String SILENT = "SILENT";
  }

  protected String alert;
  @SerializedName("collapse_key")
  protected String collapseKey;
  @SerializedName("interactive_category")
  protected String interactiveCategory;
  protected String icon;
  @SerializedName("delay_while_idle")
  protected Boolean delayWhileIdle;
  protected Boolean sync;
  protected String visibility;
  protected String redact;
  protected Map<String, Object> payload;
  protected String priority;
  protected String sound;
  @SerializedName("time_to_live")
  protected Long timeToLive;
  protected Lights lights;
  @SerializedName("android_title")
  protected String androidTitle;
  @SerializedName("group_id")
  protected String groupId;
  protected Style style;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String alert;
    private String collapseKey;
    private String interactiveCategory;
    private String icon;
    private Boolean delayWhileIdle;
    private Boolean sync;
    private String visibility;
    private String redact;
    private Map<String, Object> payload;
    private String priority;
    private String sound;
    private Long timeToLive;
    private Lights lights;
    private String androidTitle;
    private String groupId;
    private Style style;
    private String type;

    private Builder(NotificationFCMBodyMessageData notificationFcmBodyMessageData) {
      this.alert = notificationFcmBodyMessageData.alert;
      this.collapseKey = notificationFcmBodyMessageData.collapseKey;
      this.interactiveCategory = notificationFcmBodyMessageData.interactiveCategory;
      this.icon = notificationFcmBodyMessageData.icon;
      this.delayWhileIdle = notificationFcmBodyMessageData.delayWhileIdle;
      this.sync = notificationFcmBodyMessageData.sync;
      this.visibility = notificationFcmBodyMessageData.visibility;
      this.redact = notificationFcmBodyMessageData.redact;
      this.payload = notificationFcmBodyMessageData.payload;
      this.priority = notificationFcmBodyMessageData.priority;
      this.sound = notificationFcmBodyMessageData.sound;
      this.timeToLive = notificationFcmBodyMessageData.timeToLive;
      this.lights = notificationFcmBodyMessageData.lights;
      this.androidTitle = notificationFcmBodyMessageData.androidTitle;
      this.groupId = notificationFcmBodyMessageData.groupId;
      this.style = notificationFcmBodyMessageData.style;
      this.type = notificationFcmBodyMessageData.type;
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
     * Builds a NotificationFCMBodyMessageData.
     *
     * @return the new NotificationFCMBodyMessageData instance
     */
    public NotificationFCMBodyMessageData build() {
      return new NotificationFCMBodyMessageData(this);
    }

    /**
     * Set the alert.
     *
     * @param alert the alert
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder alert(String alert) {
      this.alert = alert;
      return this;
    }

    /**
     * Set the collapseKey.
     *
     * @param collapseKey the collapseKey
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder collapseKey(String collapseKey) {
      this.collapseKey = collapseKey;
      return this;
    }

    /**
     * Set the interactiveCategory.
     *
     * @param interactiveCategory the interactiveCategory
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder interactiveCategory(String interactiveCategory) {
      this.interactiveCategory = interactiveCategory;
      return this;
    }

    /**
     * Set the icon.
     *
     * @param icon the icon
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }

    /**
     * Set the delayWhileIdle.
     *
     * @param delayWhileIdle the delayWhileIdle
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder delayWhileIdle(Boolean delayWhileIdle) {
      this.delayWhileIdle = delayWhileIdle;
      return this;
    }

    /**
     * Set the sync.
     *
     * @param sync the sync
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder sync(Boolean sync) {
      this.sync = sync;
      return this;
    }

    /**
     * Set the visibility.
     *
     * @param visibility the visibility
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder visibility(String visibility) {
      this.visibility = visibility;
      return this;
    }

    /**
     * Set the redact.
     *
     * @param redact the redact
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder redact(String redact) {
      this.redact = redact;
      return this;
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder payload(Map<String, Object> payload) {
      this.payload = payload;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder priority(String priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the sound.
     *
     * @param sound the sound
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder sound(String sound) {
      this.sound = sound;
      return this;
    }

    /**
     * Set the timeToLive.
     *
     * @param timeToLive the timeToLive
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder timeToLive(long timeToLive) {
      this.timeToLive = timeToLive;
      return this;
    }

    /**
     * Set the lights.
     *
     * @param lights the lights
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder lights(Lights lights) {
      this.lights = lights;
      return this;
    }

    /**
     * Set the androidTitle.
     *
     * @param androidTitle the androidTitle
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder androidTitle(String androidTitle) {
      this.androidTitle = androidTitle;
      return this;
    }

    /**
     * Set the groupId.
     *
     * @param groupId the groupId
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    /**
     * Set the style.
     *
     * @param style the style
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder style(Style style) {
      this.style = style;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NotificationFCMBodyMessageData builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected NotificationFCMBodyMessageData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.alert,
      "alert cannot be null");
    alert = builder.alert;
    collapseKey = builder.collapseKey;
    interactiveCategory = builder.interactiveCategory;
    icon = builder.icon;
    delayWhileIdle = builder.delayWhileIdle;
    sync = builder.sync;
    visibility = builder.visibility;
    redact = builder.redact;
    payload = builder.payload;
    priority = builder.priority;
    sound = builder.sound;
    timeToLive = builder.timeToLive;
    lights = builder.lights;
    androidTitle = builder.androidTitle;
    groupId = builder.groupId;
    style = builder.style;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a NotificationFCMBodyMessageData builder
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
   * Gets the collapseKey.
   *
   * Dozed devices to display only the latest notification and discard old low priority notifications.
   *
   * @return the collapseKey
   */
  public String collapseKey() {
    return collapseKey;
  }

  /**
   * Gets the interactiveCategory.
   *
   * The category identifier to be used for the interactive push notifications.
   *
   * @return the interactiveCategory
   */
  public String interactiveCategory() {
    return interactiveCategory;
  }

  /**
   * Gets the icon.
   *
   * Specify the name of the icon to be displayed for the notification. Make sure the icon is already packaged with the
   * client application.
   *
   * @return the icon
   */
  public String icon() {
    return icon;
  }

  /**
   * Gets the delayWhileIdle.
   *
   * When this parameter is set to true, it indicates that the
   *   message should not be sent until the device becomes active.
   *
   * @return the delayWhileIdle
   */
  public Boolean delayWhileIdle() {
    return delayWhileIdle;
  }

  /**
   * Gets the sync.
   *
   * Device group messaging makes it possible for every app instance in a group to reflect the latest messaging state.
   *
   * @return the sync
   */
  public Boolean sync() {
    return sync;
  }

  /**
   * Gets the visibility.
   *
   * private/public - Visibility of this notification, which affects how and when the notifications are revealed on a
   * secure locked screen.
   *
   * @return the visibility
   */
  public String visibility() {
    return visibility;
  }

  /**
   * Gets the redact.
   *
   * Content specified will show up on a secure locked screen on the device when visibility is set to Private.
   *
   * @return the redact
   */
  public String redact() {
    return redact;
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

  /**
   * Gets the priority.
   *
   * A string value that indicates the priority of this notification. Allowed values are 'max', 'high', 'default', 'low'
   * and 'min'. High/Max priority notifications along with 'sound' field may be used for Heads up notification in
   * Android 5.0 or higher.sampleval='low'.
   *
   * @return the priority
   */
  public String priority() {
    return priority;
  }

  /**
   * Gets the sound.
   *
   * The sound file (on device) that will be attempted to play when the notification arrives on the device.
   *
   * @return the sound
   */
  public String sound() {
    return sound;
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
   * Gets the lights.
   *
   * Allows setting the notification LED color on receiving push notification .
   *
   * @return the lights
   */
  public Lights lights() {
    return lights;
  }

  /**
   * Gets the androidTitle.
   *
   * The title of Rich Push notifications.
   *
   * @return the androidTitle
   */
  public String androidTitle() {
    return androidTitle;
  }

  /**
   * Gets the groupId.
   *
   * Set this notification to be part of a group of notifications sharing the same key. Grouped notifications may
   * display in a cluster or stack on devices which support such rendering.
   *
   * @return the groupId
   */
  public String groupId() {
    return groupId;
  }

  /**
   * Gets the style.
   *
   * Options to specify for Android expandable notifications. The types of expandable notifications are
   * picture_notification, bigtext_notification, inbox_notification.
   *
   * @return the style
   */
  public Style style() {
    return style;
  }

  /**
   * Gets the type.
   *
   * Notification type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

