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
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SubscriptionCreateAttributes.
 *
 * Classes which extend this class:
 * - SubscriptionCreateAttributesSMSAttributes
 * - SubscriptionCreateAttributesEmailAttributes
 * - SubscriptionCreateAttributesWebhookAttributes
 * - SubscriptionCreateAttributesFCMAttributes
 */
public class SubscriptionCreateAttributes extends GenericModel {

  protected List<String> to;
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

  protected SubscriptionCreateAttributes() {
  }

  /**
   * Gets the to.
   *
   * The phone number to send the SMS to.
   *
   * @return the to
   */
  public List<String> to() {
    return to;
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
   * Gets the signingEnabled.
   *
   * Signing webhook attributes.
   *
   * @return the signingEnabled
   */
  public Boolean signingEnabled() {
    return signingEnabled;
  }
}

