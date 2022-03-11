/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDestinationDevicesReport options.
 */
public class GetDestinationDevicesReportOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Long days;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Long days;

    private Builder(GetDestinationDevicesReportOptions getDestinationDevicesReportOptions) {
      this.instanceId = getDestinationDevicesReportOptions.instanceId;
      this.id = getDestinationDevicesReportOptions.id;
      this.days = getDestinationDevicesReportOptions.days;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param id the id
     */
    public Builder(String instanceId, String id) {
      this.instanceId = instanceId;
      this.id = id;
    }

    /**
     * Builds a GetDestinationDevicesReportOptions.
     *
     * @return the new GetDestinationDevicesReportOptions instance
     */
    public GetDestinationDevicesReportOptions build() {
      return new GetDestinationDevicesReportOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetDestinationDevicesReportOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetDestinationDevicesReportOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the days.
     *
     * @param days the days
     * @return the GetDestinationDevicesReportOptions builder
     */
    public Builder days(long days) {
      this.days = days;
      return this;
    }
  }

  protected GetDestinationDevicesReportOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    days = builder.days;
  }

  /**
   * New builder.
   *
   * @return a GetDestinationDevicesReportOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * Unique identifier for IBM Cloud Event Notifications instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * Unique identifier for Destination.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the days.
   *
   * Number of days report has to be generated from
   * * `Note :` Max value is 90
   * * Min or default value is 1.
   *
   * @return the days
   */
  public Long days() {
    return days;
  }
}

