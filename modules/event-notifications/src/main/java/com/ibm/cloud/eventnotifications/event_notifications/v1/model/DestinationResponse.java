/*
 * (C) Copyright IBM Corp. 2021.
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
 * Payload describing a destination get request.
 */
public class DestinationResponse extends GenericModel {

  /**
   * Destination type Email/SMS/Webhook.
   */
  public interface Type {
    /** webhook. */
    String WEBHOOK = "webhook";
  }

  protected String id;
  protected String name;
  protected String description;
  protected String type;
  protected DestinationConfig config;
  @SerializedName("created_at")
  protected Date createdAt;

  /**
   * Gets the id.
   *
   * Destination ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Destination name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Destination description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * Destination type Email/SMS/Webhook.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the config.
   *
   * Payload describing a destination configuration.
   *
   * @return the config
   */
  public DestinationConfig getConfig() {
    return config;
  }

  /**
   * Gets the createdAt.
   *
   * Last updated time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }
}

