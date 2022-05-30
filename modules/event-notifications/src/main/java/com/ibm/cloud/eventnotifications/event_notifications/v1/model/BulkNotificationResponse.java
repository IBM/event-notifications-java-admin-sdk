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
 * Payload describing a notifications response.
 */
public class BulkNotificationResponse extends GenericModel {

  @SerializedName("bulk_notification_id")
  protected String bulkNotificationId;
  @SerializedName("bulk_messages")
  protected List<Object> bulkMessages;

  /**
   * Gets the bulkNotificationId.
   *
   * Bulk Notification ID.
   *
   * @return the bulkNotificationId
   */
  public String getBulkNotificationId() {
    return bulkNotificationId;
  }

  /**
   * Gets the bulkMessages.
   *
   * List of Notifications.
   *
   * @return the bulkMessages
   */
  public List<Object> getBulkMessages() {
    return bulkMessages;
  }
}

