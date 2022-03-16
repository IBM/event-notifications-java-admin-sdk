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
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a apns notifications body message Data.
 */
public class NotificationAPNSBodyMessageData extends GenericModel {

  public interface Type {
    /** DEFAULT. */
    String X_DEFAULT = "DEFAULT";
    /** MIXED. */
    String MIXED = "MIXED";
    /** SILENT. */
    String SILENT = "SILENT";
  }

  protected String alert;
  protected Long badge;
  protected String interactiveCategory;
  protected String iosActionKey;
  protected Map<String, Object> payload;
  protected String sound;
  protected String titleLocKey;
  protected String locKey;
  protected String launchImage;
  protected List<String> titleLocArgs;
  protected List<String> locArgs;
  protected String title;
  protected String subtitle;
  protected String attachmentUrl;
  protected String type;
  protected String apnsCollapseId;
  protected String apnsThreadId;
  protected String apnsGroupSummaryArg;
  protected Long apnsGroupSummaryArgCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String alert;
    private Long badge;
    private String interactiveCategory;
    private String iosActionKey;
    private Map<String, Object> payload;
    private String sound;
    private String titleLocKey;
    private String locKey;
    private String launchImage;
    private List<String> titleLocArgs;
    private List<String> locArgs;
    private String title;
    private String subtitle;
    private String attachmentUrl;
    private String type;
    private String apnsCollapseId;
    private String apnsThreadId;
    private String apnsGroupSummaryArg;
    private Long apnsGroupSummaryArgCount;

    private Builder(NotificationAPNSBodyMessageData notificationApnsBodyMessageData) {
      this.alert = notificationApnsBodyMessageData.alert;
      this.badge = notificationApnsBodyMessageData.badge;
      this.interactiveCategory = notificationApnsBodyMessageData.interactiveCategory;
      this.iosActionKey = notificationApnsBodyMessageData.iosActionKey;
      this.payload = notificationApnsBodyMessageData.payload;
      this.sound = notificationApnsBodyMessageData.sound;
      this.titleLocKey = notificationApnsBodyMessageData.titleLocKey;
      this.locKey = notificationApnsBodyMessageData.locKey;
      this.launchImage = notificationApnsBodyMessageData.launchImage;
      this.titleLocArgs = notificationApnsBodyMessageData.titleLocArgs;
      this.locArgs = notificationApnsBodyMessageData.locArgs;
      this.title = notificationApnsBodyMessageData.title;
      this.subtitle = notificationApnsBodyMessageData.subtitle;
      this.attachmentUrl = notificationApnsBodyMessageData.attachmentUrl;
      this.type = notificationApnsBodyMessageData.type;
      this.apnsCollapseId = notificationApnsBodyMessageData.apnsCollapseId;
      this.apnsThreadId = notificationApnsBodyMessageData.apnsThreadId;
      this.apnsGroupSummaryArg = notificationApnsBodyMessageData.apnsGroupSummaryArg;
      this.apnsGroupSummaryArgCount = notificationApnsBodyMessageData.apnsGroupSummaryArgCount;
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
     * Builds a NotificationAPNSBodyMessageData.
     *
     * @return the new NotificationAPNSBodyMessageData instance
     */
    public NotificationAPNSBodyMessageData build() {
      return new NotificationAPNSBodyMessageData(this);
    }

    /**
     * Adds an titleLocArgs to titleLocArgs.
     *
     * @param titleLocArgs the new titleLocArgs
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder addTitleLocArgs(String titleLocArgs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(titleLocArgs,
        "titleLocArgs cannot be null");
      if (this.titleLocArgs == null) {
        this.titleLocArgs = new ArrayList<String>();
      }
      this.titleLocArgs.add(titleLocArgs);
      return this;
    }

    /**
     * Adds an locArgs to locArgs.
     *
     * @param locArgs the new locArgs
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder addLocArgs(String locArgs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locArgs,
        "locArgs cannot be null");
      if (this.locArgs == null) {
        this.locArgs = new ArrayList<String>();
      }
      this.locArgs.add(locArgs);
      return this;
    }

    /**
     * Set the alert.
     *
     * @param alert the alert
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder alert(String alert) {
      this.alert = alert;
      return this;
    }

    /**
     * Set the badge.
     *
     * @param badge the badge
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder badge(long badge) {
      this.badge = badge;
      return this;
    }

    /**
     * Set the interactiveCategory.
     *
     * @param interactiveCategory the interactiveCategory
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder interactiveCategory(String interactiveCategory) {
      this.interactiveCategory = interactiveCategory;
      return this;
    }

    /**
     * Set the iosActionKey.
     *
     * @param iosActionKey the iosActionKey
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder iosActionKey(String iosActionKey) {
      this.iosActionKey = iosActionKey;
      return this;
    }

    /**
     * Set the payload.
     *
     * @param payload the payload
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder payload(Map<String, Object> payload) {
      this.payload = payload;
      return this;
    }

    /**
     * Set the sound.
     *
     * @param sound the sound
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder sound(String sound) {
      this.sound = sound;
      return this;
    }

    /**
     * Set the titleLocKey.
     *
     * @param titleLocKey the titleLocKey
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder titleLocKey(String titleLocKey) {
      this.titleLocKey = titleLocKey;
      return this;
    }

    /**
     * Set the locKey.
     *
     * @param locKey the locKey
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder locKey(String locKey) {
      this.locKey = locKey;
      return this;
    }

    /**
     * Set the launchImage.
     *
     * @param launchImage the launchImage
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder launchImage(String launchImage) {
      this.launchImage = launchImage;
      return this;
    }

    /**
     * Set the titleLocArgs.
     * Existing titleLocArgs will be replaced.
     *
     * @param titleLocArgs the titleLocArgs
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder titleLocArgs(List<String> titleLocArgs) {
      this.titleLocArgs = titleLocArgs;
      return this;
    }

    /**
     * Set the locArgs.
     * Existing locArgs will be replaced.
     *
     * @param locArgs the locArgs
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder locArgs(List<String> locArgs) {
      this.locArgs = locArgs;
      return this;
    }

    /**
     * Set the title.
     *
     * @param title the title
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Set the subtitle.
     *
     * @param subtitle the subtitle
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder subtitle(String subtitle) {
      this.subtitle = subtitle;
      return this;
    }

    /**
     * Set the attachmentUrl.
     *
     * @param attachmentUrl the attachmentUrl
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder attachmentUrl(String attachmentUrl) {
      this.attachmentUrl = attachmentUrl;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the apnsCollapseId.
     *
     * @param apnsCollapseId the apnsCollapseId
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder apnsCollapseId(String apnsCollapseId) {
      this.apnsCollapseId = apnsCollapseId;
      return this;
    }

    /**
     * Set the apnsThreadId.
     *
     * @param apnsThreadId the apnsThreadId
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder apnsThreadId(String apnsThreadId) {
      this.apnsThreadId = apnsThreadId;
      return this;
    }

    /**
     * Set the apnsGroupSummaryArg.
     *
     * @param apnsGroupSummaryArg the apnsGroupSummaryArg
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder apnsGroupSummaryArg(String apnsGroupSummaryArg) {
      this.apnsGroupSummaryArg = apnsGroupSummaryArg;
      return this;
    }

    /**
     * Set the apnsGroupSummaryArgCount.
     *
     * @param apnsGroupSummaryArgCount the apnsGroupSummaryArgCount
     * @return the NotificationAPNSBodyMessageData builder
     */
    public Builder apnsGroupSummaryArgCount(long apnsGroupSummaryArgCount) {
      this.apnsGroupSummaryArgCount = apnsGroupSummaryArgCount;
      return this;
    }
  }

  protected NotificationAPNSBodyMessageData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.alert,
      "alert cannot be null");
    alert = builder.alert;
    badge = builder.badge;
    interactiveCategory = builder.interactiveCategory;
    iosActionKey = builder.iosActionKey;
    payload = builder.payload;
    sound = builder.sound;
    titleLocKey = builder.titleLocKey;
    locKey = builder.locKey;
    launchImage = builder.launchImage;
    titleLocArgs = builder.titleLocArgs;
    locArgs = builder.locArgs;
    title = builder.title;
    subtitle = builder.subtitle;
    attachmentUrl = builder.attachmentUrl;
    type = builder.type;
    apnsCollapseId = builder.apnsCollapseId;
    apnsThreadId = builder.apnsThreadId;
    apnsGroupSummaryArg = builder.apnsGroupSummaryArg;
    apnsGroupSummaryArgCount = builder.apnsGroupSummaryArgCount;
  }

  /**
   * New builder.
   *
   * @return a NotificationAPNSBodyMessageData builder
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
   * Gets the badge.
   *
   * The number to display as the badge of the application icon.
   *
   * @return the badge
   */
  public Long badge() {
    return badge;
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
   * Gets the iosActionKey.
   *
   * The title for the Action key.
   *
   * @return the iosActionKey
   */
  public String iosActionKey() {
    return iosActionKey;
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
   * Gets the sound.
   *
   * The name of the sound file in the application bundle. The sound of this file is played as an alert.
   *
   * @return the sound
   */
  public String sound() {
    return sound;
  }

  /**
   * Gets the titleLocKey.
   *
   * The key to a title string in the Localizable.strings file for the current localization. The key string can be
   * formatted with %@ and %n$@ specifiers to take the variables specified in the titleLocArgs array.
   *
   * @return the titleLocKey
   */
  public String titleLocKey() {
    return titleLocKey;
  }

  /**
   * Gets the locKey.
   *
   * A key to an alert-message string in a Localizabl.strings file for the current localization (which is set by the
   * userÃ¢â‚¬â„¢s language preference).
   *   The key string can be formatted with %@ and %n$@ specifiers to take the variables specified in the locArgs array.
   *
   * @return the locKey
   */
  public String locKey() {
    return locKey;
  }

  /**
   * Gets the launchImage.
   *
   * The filename of an image file in the app bundle, with or without the filename extension. The image is used as the
   * launch image when users tap the action button or move the action slider.
   *
   * @return the launchImage
   */
  public String launchImage() {
    return launchImage;
  }

  /**
   * Gets the titleLocArgs.
   *
   * Variable string values to appear in place of the format specifiers in title-loc-key.
   *
   * @return the titleLocArgs
   */
  public List<String> titleLocArgs() {
    return titleLocArgs;
  }

  /**
   * Gets the locArgs.
   *
   * Variable string values to appear in place of the format specifiers in locKey.
   *
   * @return the locArgs
   */
  public List<String> locArgs() {
    return locArgs;
  }

  /**
   * Gets the title.
   *
   * The title of Rich Push notifications (Supported only on iOS 10 and above).
   *
   * @return the title
   */
  public String title() {
    return title;
  }

  /**
   * Gets the subtitle.
   *
   * The subtitle of the Rich Notifications.(Supported only on iOS 10 and above).
   *
   * @return the subtitle
   */
  public String subtitle() {
    return subtitle;
  }

  /**
   * Gets the attachmentUrl.
   *
   * The link to the iOS notifications media (video, audio, GIF, images - Supported only on iOS 10 and above).
   *
   * @return the attachmentUrl
   */
  public String attachmentUrl() {
    return attachmentUrl;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the apnsCollapseId.
   *
   * Multiple notifications with the same collapse identifier are displayed to the user as a single notification.
   *
   * @return the apnsCollapseId
   */
  public String apnsCollapseId() {
    return apnsCollapseId;
  }

  /**
   * Gets the apnsThreadId.
   *
   * An app-specific identifier for grouping related notifications. This value corresponds to the threadIdentifier
   * property in the UNNotificationContent object.
   *
   * @return the apnsThreadId
   */
  public String apnsThreadId() {
    return apnsThreadId;
  }

  /**
   * Gets the apnsGroupSummaryArg.
   *
   * The string the notification adds to the category's summary format string.
   *
   * @return the apnsGroupSummaryArg
   */
  public String apnsGroupSummaryArg() {
    return apnsGroupSummaryArg;
  }

  /**
   * Gets the apnsGroupSummaryArgCount.
   *
   * The number of items the notification adds to the category's summary format string.
   *
   * @return the apnsGroupSummaryArgCount
   */
  public Long apnsGroupSummaryArgCount() {
    return apnsGroupSummaryArgCount;
  }
}

