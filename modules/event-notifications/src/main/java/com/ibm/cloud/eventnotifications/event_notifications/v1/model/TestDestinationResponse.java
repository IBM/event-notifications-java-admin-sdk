/*
 * (C) Copyright IBM Corp. 2025.
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
 * TestDestinationResponse.
 *
 * Classes which extend this class:
 * - TestDestinationResponseWebhookDestinationTestResponseConfig
 * - TestDestinationResponseDestinationTestResponseConfig
 */
public class TestDestinationResponse extends GenericModel {

  /**
   * Test destination status.
   */
  public interface Status {
    /** accepted. */
    String ACCEPTED = "accepted";
  }

  /**
   * Type of destination.
   */
  public interface DestinationType {
    /** webhook. */
    String WEBHOOK = "webhook";
  }

  protected String status;
  @SerializedName("notification_id")
  protected String notificationId;
  @SerializedName("destination_type")
  protected String destinationType;

  protected TestDestinationResponse() { }

  /**
   * Gets the status.
   *
   * Test destination status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the notificationId.
   *
   * Test notification ID.
   *
   * @return the notificationId
   */
  public String getNotificationId() {
    return notificationId;
  }

  /**
   * Gets the destinationType.
   *
   * Type of destination.
   *
   * @return the destinationType
   */
  public String getDestinationType() {
    return destinationType;
  }
}

