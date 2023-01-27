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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Rule object.
 */
public class Rules extends GenericModel {

  protected Boolean enabled;
  @SerializedName("event_type_filter")
  protected String eventTypeFilter;
  @SerializedName("notification_filter")
  protected String notificationFilter;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private String eventTypeFilter;
    private String notificationFilter;

    private Builder(Rules rules) {
      this.enabled = rules.enabled;
      this.eventTypeFilter = rules.eventTypeFilter;
      this.notificationFilter = rules.notificationFilter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param eventTypeFilter the eventTypeFilter
     */
    public Builder(String eventTypeFilter) {
      this.eventTypeFilter = eventTypeFilter;
    }

    /**
     * Builds a Rules.
     *
     * @return the new Rules instance
     */
    public Rules build() {
      return new Rules(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the Rules builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the eventTypeFilter.
     *
     * @param eventTypeFilter the eventTypeFilter
     * @return the Rules builder
     */
    public Builder eventTypeFilter(String eventTypeFilter) {
      this.eventTypeFilter = eventTypeFilter;
      return this;
    }

    /**
     * Set the notificationFilter.
     *
     * @param notificationFilter the notificationFilter
     * @return the Rules builder
     */
    public Builder notificationFilter(String notificationFilter) {
      this.notificationFilter = notificationFilter;
      return this;
    }
  }

  protected Rules() { }

  protected Rules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.eventTypeFilter,
      "eventTypeFilter cannot be null");
    enabled = builder.enabled;
    eventTypeFilter = builder.eventTypeFilter;
    notificationFilter = builder.notificationFilter;
  }

  /**
   * New builder.
   *
   * @return a Rules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Whether the rule is enabled or not.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the eventTypeFilter.
   *
   * Event type filter.
   *
   * @return the eventTypeFilter
   */
  public String eventTypeFilter() {
    return eventTypeFilter;
  }

  /**
   * Gets the notificationFilter.
   *
   * Notification filter.
   *
   * @return the notificationFilter
   */
  public String notificationFilter() {
    return notificationFilter;
  }
}

