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

  @SerializedName("signing_enabled")
  protected Boolean signingEnabled;
  @SerializedName("add_notification_payload")
  protected Boolean addNotificationPayload;
  @SerializedName("attachment_color")
  protected String attachmentColor;

  protected SubscriptionAttributes() {
    super(new TypeToken<Object>() { });
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
   * Gets the addNotificationPayload.
   *
   * Decision for Notification Payload to be added.
   *
   * @return the addNotificationPayload
   */
  public Boolean isAddNotificationPayload() {
    return this.addNotificationPayload;
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
