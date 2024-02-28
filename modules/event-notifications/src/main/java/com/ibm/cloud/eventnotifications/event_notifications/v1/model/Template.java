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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Template object.
 */
public class Template extends GenericModel {

  protected String id;
  protected String name;
  protected String description;
  protected String type;
  @SerializedName("subscription_count")
  protected Long subscriptionCount;
  @SerializedName("subscription_names")
  protected List<String> subscriptionNames;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected Template() { }

  /**
   * Gets the id.
   *
   * Template ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Template name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Template description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * The type of template.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the subscriptionCount.
   *
   * Subscription count.
   *
   * @return the subscriptionCount
   */
  public Long getSubscriptionCount() {
    return subscriptionCount;
  }

  /**
   * Gets the subscriptionNames.
   *
   * Names of subscriptions.
   *
   * @return the subscriptionNames
   */
  public List<String> getSubscriptionNames() {
    return subscriptionNames;
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

