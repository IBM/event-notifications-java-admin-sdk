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
 * Payload describing a notifications response.
 */
public class NotificationResponse extends DynamicModel<Object> {

  @SerializedName("notification_id")
  protected String notificationId;

  public NotificationResponse() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the notificationId.
   *
   * Notification ID.
   *
   * @return the notificationId
   */
  public String getNotificationId() {
    return this.notificationId;
  }
}
