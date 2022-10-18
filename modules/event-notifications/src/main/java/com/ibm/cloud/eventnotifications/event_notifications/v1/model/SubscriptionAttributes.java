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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * SubscriptionAttributes.
 *
 * Classes which extend this class:
 * - SubscriptionAttributesSMSAttributesResponse
 * - SubscriptionAttributesEmailAttributesResponse
 * - SubscriptionAttributesWebhookAttributesResponse
 * - SubscriptionAttributesSlackAttributesResponse
 */
public class SubscriptionAttributes extends DynamicModel<Object> {

  @SerializedName("to")
  protected List<SMAttributesItems> to;
  @SerializedName("unsubscribed")
  protected List<SMAttributesItems> unsubscribed;
  @SerializedName("invited")
  protected List<SMAttributesItems> invited;
  @SerializedName("subscribed")
  protected List<EmailAttributesResponseSubscribedUnsubscribedItems> subscribed;
  @SerializedName("add_notification_payload")
  protected Boolean addNotificationPayload;
  @SerializedName("reply_to_mail")
  protected String replyToMail;
  @SerializedName("reply_to_name")
  protected String replyToName;
  @SerializedName("from_name")
  protected String fromName;
  @SerializedName("signing_enabled")
  protected Boolean signingEnabled;
  @SerializedName("attachment_color")
  protected String attachmentColor;

  protected SubscriptionAttributes() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the to.
   *
   * The subscribed list.
   *
   * @return the to
   */
  public List<SMAttributesItems> getTo() {
    return this.to;
  }

  /**
   * Gets the unsubscribed.
   *
   * The unsubscribe list.
   *
   * @return the unsubscribed
   */
  public List<SMAttributesItems> getUnsubscribed() {
    return this.unsubscribed;
  }

  /**
   * Gets the invited.
   *
   * The email id string.
   *
   * @return the invited
   */
  public List<SMAttributesItems> getInvited() {
    return this.invited;
  }

  /**
   * Gets the subscribed.
   *
   * The unsubscribe list.
   *
   * @return the subscribed
   */
  public List<EmailAttributesResponseSubscribedUnsubscribedItems> getSubscribed() {
    return this.subscribed;
  }

  /**
   * Gets the addNotificationPayload.
   *
   * Whether to add the notification payload to the email.
   *
   * @return the addNotificationPayload
   */
  public Boolean isAddNotificationPayload() {
    return this.addNotificationPayload;
  }

  /**
   * Gets the replyToMail.
   *
   * The email address to reply to.
   *
   * @return the replyToMail
   */
  public String getReplyToMail() {
    return this.replyToMail;
  }

  /**
   * Gets the replyToName.
   *
   * The email name to reply to.
   *
   * @return the replyToName
   */
  public String getReplyToName() {
    return this.replyToName;
  }

  /**
   * Gets the fromName.
   *
   * The email name of From.
   *
   * @return the fromName
   */
  public String getFromName() {
    return this.fromName;
  }

  /**
   * Gets the signingEnabled.
   *
   * Signing webhook attributes.
   *
   * @return the signingEnabled
   */
  public Boolean isSigningEnabled() {
    return this.signingEnabled;
  }

  /**
   * Gets the attachmentColor.
   *
   * Attachment Color for Slack Notification.
   *
   * @return the attachmentColor
   */
  public String getAttachmentColor() {
    return this.attachmentColor;
  }
}
