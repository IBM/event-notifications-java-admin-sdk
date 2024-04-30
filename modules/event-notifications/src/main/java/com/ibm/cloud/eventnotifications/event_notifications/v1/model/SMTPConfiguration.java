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
 * Payload describing a SMTP List response.
 */
public class SMTPConfiguration extends GenericModel {

  protected String id;
  protected String name;
  protected String description;
  protected String domain;
  protected SMTPConfig config;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected SMTPConfiguration() { }

  /**
   * Gets the id.
   *
   * SMTP ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * SMTP name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * SMTP description.
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
   * Gets the config.
   *
   * Payload describing a SMTP configuration.
   *
   * @return the config
   */
  public SMTPConfig getConfig() {
    return config;
  }

  /**
   * Gets the updatedAt.
   *
   * Created time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

