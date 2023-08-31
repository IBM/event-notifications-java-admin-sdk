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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SubscriptionCreateAttributes.
 *
 * Classes which extend this class:
 * - SubscriptionCreateAttributesSMSAttributes
 * - SubscriptionCreateAttributesEmailAttributes
 * - SubscriptionCreateAttributesCustomEmailAttributes
 * - SubscriptionCreateAttributesWebhookAttributes
 * - SubscriptionCreateAttributesFCMAttributes
 * - SubscriptionCreateAttributesSlackAttributes
 * - SubscriptionCreateAttributesServiceNowAttributes
 */
public class SubscriptionCreateAttributes extends GenericModel {

  protected List<String> invited;
  @SerializedName("add_notification_payload")
  protected Boolean addNotificationPayload;
  @SerializedName("reply_to_mail")
  protected String replyToMail;
  @SerializedName("reply_to_name")
  protected String replyToName;
  @SerializedName("from_name")
  protected String fromName;
  @SerializedName("from_email")
  protected String fromEmail;
  @SerializedName("template_id_notification")
  protected String templateIdNotification;
  @SerializedName("template_id_invitation")
  protected String templateIdInvitation;
  @SerializedName("signing_enabled")
  protected Boolean signingEnabled;
  @SerializedName("attachment_color")
  protected String attachmentColor;
  @SerializedName("assigned_to")
  protected String assignedTo;
  @SerializedName("assignment_group")
  protected String assignmentGroup;

  protected SubscriptionCreateAttributes() { }

  /**
   * Gets the invited.
   *
   * The sms id string.
   *
   * @return the invited
   */
  public List<String> invited() {
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
   * Gets the fromEmail.
   *
   * The email from.
   *
   * @return the fromEmail
   */
  public String fromEmail() {
    return fromEmail;
  }

  /**
   * Gets the templateIdNotification.
   *
   * The templete id for notification.
   *
   * @return the templateIdNotification
   */
  public String templateIdNotification() {
    return templateIdNotification;
  }

  /**
   * Gets the templateIdInvitation.
   *
   * The templete id for invitation.
   *
   * @return the templateIdInvitation
   */
  public String templateIdInvitation() {
    return templateIdInvitation;
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

  /**
   * Gets the assignedTo.
   *
   * Name of user ServiceNow incident will be assigned to.
   *
   * @return the assignedTo
   */
  public String assignedTo() {
    return assignedTo;
  }

  /**
   * Gets the assignmentGroup.
   *
   * Group Name to which incident will be assigned to.
   *
   * @return the assignmentGroup
   */
  public String assignmentGroup() {
    return assignmentGroup;
  }
}

