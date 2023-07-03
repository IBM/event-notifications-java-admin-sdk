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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Tags subscription object.
 */
public class TagsSubscriptionListItem extends GenericModel {

  protected String id;
  @SerializedName("device_id")
  protected String deviceId;
  @SerializedName("tag_name")
  protected String tagName;
  @SerializedName("user_id")
  protected String userId;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected TagsSubscriptionListItem() { }

  /**
   * Gets the id.
   *
   * Subscription Tag ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the deviceId.
   *
   * Unique identifier of the device.
   *
   * @return the deviceId
   */
  public String getDeviceId() {
    return deviceId;
  }

  /**
   * Gets the tagName.
   *
   * The name of the tag its subscribed.
   *
   * @return the tagName
   */
  public String getTagName() {
    return tagName;
  }

  /**
   * Gets the userId.
   *
   * The user identifier for the device registration.
   *
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }

  /**
   * Gets the updatedAt.
   *
   * Updated at.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

