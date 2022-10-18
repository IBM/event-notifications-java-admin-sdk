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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SubscriptionUpdateAttributes.
 *
 * Classes which extend this class:
 * - SubscriptionUpdateAttributesSMSUpdateAttributes
 * - SubscriptionUpdateAttributesEmailUpdateAttributes
 * - SubscriptionUpdateAttributesWebhookAttributes
 * - SubscriptionUpdateAttributesSlackAttributes
 */
public class SubscriptionUpdateAttributes extends GenericModel {

  protected SMSupdateAttributesTo to;
  protected UpdateAttributesUnsubscribed unsubscribed;
  protected UpdateAttributesInvited invited;
  @SerializedName("add_notification_payload")
  protected Boolean addNotificationPayload;
  @SerializedName("reply_to_mail")
  protected String replyToMail;
  @SerializedName("reply_to_name")
  protected String replyToName;
  @SerializedName("from_name")
  protected String fromName;
  protected UpdateAttributesSubscribed subscribed;
  @SerializedName("signing_enabled")
  protected Boolean signingEnabled;
  @SerializedName("attachment_color")
  protected String attachmentColor;

  protected SubscriptionUpdateAttributes() {
  }

  /**
   * Gets the to.
   *
   * The phone number to send the SMS to.
   *
   * @return the to
   */
  public SMSupdateAttributesTo to() {
    return to;
  }

  /**
   * Gets the unsubscribed.
   *
   * The phone number or Email id to send the SMS/email to.
   *
   * @return the unsubscribed
   */
  public UpdateAttributesUnsubscribed unsubscribed() {
    return unsubscribed;
  }

  /**
   * Gets the invited.
   *
   * The email ids or phone numbers.
   *
   * @return the invited
   */
  public UpdateAttributesInvited invited() {
    return invited;
  }

  /**
   * Gets the addNotificationPayload.
   *
   * Whether to add the notification payload to the email.
   *
   * @return the addNotificationPayload
   */
  public Boolean addNotificationPayload() {
    return addNotificationPayload;
  }

  /**
   * Gets the replyToMail.
   *
   * The email address to reply to.
   *
   * @return the replyToMail
   */
  public String replyToMail() {
    return replyToMail;
  }

  /**
   * Gets the replyToName.
   *
   * The email name to reply to.
   *
   * @return the replyToName
   */
  public String replyToName() {
    return replyToName;
  }

  /**
   * Gets the fromName.
   *
   * The email name of From.
   *
   * @return the fromName
   */
  public String fromName() {
    return fromName;
  }

  /**
   * Gets the subscribed.
   *
   * The email ids or phone number.
   *
   * @return the subscribed
   */
  public UpdateAttributesSubscribed subscribed() {
    return subscribed;
  }

  /**
   * Gets the signingEnabled.
   *
   * Signing webhook attributes.
   *
   * @return the signingEnabled
   */
  public Boolean signingEnabled() {
    return signingEnabled;
  }

  /**
   * Gets the attachmentColor.
   *
   * Attachment Color for the slack message.
   *
   * @return the attachmentColor
   */
  public String attachmentColor() {
    return attachmentColor;
  }
}

