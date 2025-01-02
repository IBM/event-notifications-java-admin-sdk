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
  @SerializedName("event_schedule_filter")
  protected EventScheduleFilterAttributes eventScheduleFilter;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private String eventTypeFilter;
    private String notificationFilter;
    private EventScheduleFilterAttributes eventScheduleFilter;

    /**
     * Instantiates a new Builder from an existing Rules instance.
     *
     * @param rules the instance to initialize the Builder with
     */
    private Builder(Rules rules) {
      this.enabled = rules.enabled;
      this.eventTypeFilter = rules.eventTypeFilter;
      this.notificationFilter = rules.notificationFilter;
      this.eventScheduleFilter = rules.eventScheduleFilter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
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

    /**
     * Set the eventScheduleFilter.
     *
     * @param eventScheduleFilter the eventScheduleFilter
     * @return the Rules builder
     */
    public Builder eventScheduleFilter(EventScheduleFilterAttributes eventScheduleFilter) {
      this.eventScheduleFilter = eventScheduleFilter;
      return this;
    }
  }

  protected Rules() { }

  protected Rules(Builder builder) {
    enabled = builder.enabled;
    eventTypeFilter = builder.eventTypeFilter;
    notificationFilter = builder.notificationFilter;
    eventScheduleFilter = builder.eventScheduleFilter;
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

  /**
   * Gets the eventScheduleFilter.
   *
   * Event schedule filter attributes.
   *
   * @return the eventScheduleFilter
   */
  public EventScheduleFilterAttributes eventScheduleFilter() {
    return eventScheduleFilter;
  }
}

