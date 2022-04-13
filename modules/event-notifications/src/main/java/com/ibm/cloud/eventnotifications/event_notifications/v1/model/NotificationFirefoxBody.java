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
 * NotificationFirefoxBody.
 *
 * Classes which extend this class:
 * - NotificationFirefoxBodyMessageENData
 * - NotificationFirefoxBodyNotificationPayload
 */
public class NotificationFirefoxBody extends DynamicModel<Object> {

  @SerializedName("en_data")
  protected NotificationFirefoxBodyMessageData enData;

  protected NotificationFirefoxBody() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the enData.
   *
   * Payload describing a firefox notifications body message Data.
   *
   * @return the enData
   */
  public NotificationFirefoxBodyMessageData getEnData() {
    return this.enData;
  }
}
