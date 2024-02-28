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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Rule object.
 */
public class RulesGet extends GenericModel {

  protected Boolean enabled;
  @SerializedName("event_type_filter")
  protected String eventTypeFilter;
  @SerializedName("notification_filter")
  protected String notificationFilter;
  @SerializedName("updated_at")
  protected String updatedAt;
  protected String id;

  protected RulesGet() { }

  /**
   * Gets the enabled.
   *
   * Whether the rule is enabled or not.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the eventTypeFilter.
   *
   * Event type filter.
   *
   * @return the eventTypeFilter
   */
  public String getEventTypeFilter() {
    return eventTypeFilter;
  }

  /**
   * Gets the notificationFilter.
   *
   * Notification filter.
   *
   * @return the notificationFilter
   */
  public String getNotificationFilter() {
    return notificationFilter;
  }

  /**
   * Gets the updatedAt.
   *
   * Last time the topic was updated.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the id.
   *
   * Autogenerated rule ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

