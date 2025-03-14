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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EmailAttributesResponseInvitedItems.
 */
public class EmailAttributesResponseInvitedItems extends GenericModel {

  protected String email;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("expires_at")
  protected Date expiresAt;

  protected EmailAttributesResponseInvitedItems() { }

  /**
   * Gets the email.
   *
   * email address.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the updatedAt.
   *
   * last updated time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the expiresAt.
   *
   * time of expiration.
   *
   * @return the expiresAt
   */
  public Date getExpiresAt() {
    return expiresAt;
  }
}

