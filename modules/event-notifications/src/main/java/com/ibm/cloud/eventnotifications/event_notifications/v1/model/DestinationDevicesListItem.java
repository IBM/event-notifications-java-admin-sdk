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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * device object.
 */
public class DestinationDevicesListItem extends GenericModel {

  protected String id;
  @SerializedName("user_id")
  protected String userId;
  protected String platform;
  protected String token;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Gets the id.
   *
   * device ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the userId.
   *
   * user ID.
   *
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }

  /**
   * Gets the platform.
   *
   * Destination platform.
   *
   * @return the platform
   */
  public String getPlatform() {
    return platform;
  }

  /**
   * Gets the token.
   *
   * Destination device token.
   *
   * @return the token
   */
  public String getToken() {
    return token;
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

