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
 * Event schedule filter attributes.
 */
public class EventScheduleFilterAttributes extends GenericModel {

  @SerializedName("starts_at")
  protected Date startsAt;
  @SerializedName("ends_at")
  protected Date endsAt;
  protected String expression;

  /**
   * Builder.
   */
  public static class Builder {
    private Date startsAt;
    private Date endsAt;
    private String expression;

    /**
     * Instantiates a new Builder from an existing EventScheduleFilterAttributes instance.
     *
     * @param eventScheduleFilterAttributes the instance to initialize the Builder with
     */
    private Builder(EventScheduleFilterAttributes eventScheduleFilterAttributes) {
      this.startsAt = eventScheduleFilterAttributes.startsAt;
      this.endsAt = eventScheduleFilterAttributes.endsAt;
      this.expression = eventScheduleFilterAttributes.expression;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EventScheduleFilterAttributes.
     *
     * @return the new EventScheduleFilterAttributes instance
     */
    public EventScheduleFilterAttributes build() {
      return new EventScheduleFilterAttributes(this);
    }

    /**
     * Set the startsAt.
     *
     * @param startsAt the startsAt
     * @return the EventScheduleFilterAttributes builder
     */
    public Builder startsAt(Date startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * Set the endsAt.
     *
     * @param endsAt the endsAt
     * @return the EventScheduleFilterAttributes builder
     */
    public Builder endsAt(Date endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * Set the expression.
     *
     * @param expression the expression
     * @return the EventScheduleFilterAttributes builder
     */
    public Builder expression(String expression) {
      this.expression = expression;
      return this;
    }
  }

  protected EventScheduleFilterAttributes() { }

  protected EventScheduleFilterAttributes(Builder builder) {
    startsAt = builder.startsAt;
    endsAt = builder.endsAt;
    expression = builder.expression;
  }

  /**
   * New builder.
   *
   * @return a EventScheduleFilterAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the startsAt.
   *
   * event schedule start time.
   *
   * @return the startsAt
   */
  public Date startsAt() {
    return startsAt;
  }

  /**
   * Gets the endsAt.
   *
   * event schedule end time.
   *
   * @return the endsAt
   */
  public Date endsAt() {
    return endsAt;
  }

  /**
   * Gets the expression.
   *
   * cron schedule expression.
   *
   * @return the expression
   */
  public String expression() {
    return expression;
  }
}

