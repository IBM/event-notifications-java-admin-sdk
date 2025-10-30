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
 * Payload describing a SMTP User create response.
 */
public class SMTPUserResponse extends GenericModel {

  protected String id;
  protected String description;
  protected String domain;
  @SerializedName("smtp_config_id")
  protected String smtpConfigId;
  protected String username;
  protected String password;
  @SerializedName("created_at")
  protected Date createdAt;

  protected SMTPUserResponse() { }

  /**
   * Gets the id.
   *
   * SMTP Id.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
   * Gets the password.
   *
   * Password for SMTP user; Cloned SMTP user response do not include a password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Gets the createdAt.
   *
   * Created time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }
}

