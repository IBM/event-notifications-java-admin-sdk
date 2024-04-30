/*
 * (C) Copyright IBM Corp. 2024.
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
 * Payload describing a SMTP User.
 */
public class SMTPUser extends GenericModel {

  protected String id;
  @SerializedName("smtp_config_id")
  protected String smtpConfigId;
  protected String description;
  protected String domain;
  protected String username;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected SMTPUser() { }

  /**
   * Gets the id.
   *
   * Id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the smtpConfigId.
   *
   * SMTP confg Id.
   *
   * @return the smtpConfigId
   */
  public String getSmtpConfigId() {
    return smtpConfigId;
  }

  /**
   * Gets the description.
   *
   * SMTP User description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the domain.
   *
   * Domain Name.
   *
   * @return the domain
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Gets the username.
   *
   * SMTP user name.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Gets the createdAt.
   *
   * Updated time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Updated time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

