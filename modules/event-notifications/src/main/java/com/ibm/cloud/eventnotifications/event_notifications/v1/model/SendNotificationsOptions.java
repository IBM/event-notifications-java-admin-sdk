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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The sendNotifications options.
 */
public class SendNotificationsOptions extends GenericModel {

  protected String instanceId;
  protected NotificationCreate body;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private NotificationCreate body;

    /**
     * Instantiates a new Builder from an existing SendNotificationsOptions instance.
     *
     * @param sendNotificationsOptions the instance to initialize the Builder with
     */
    private Builder(SendNotificationsOptions sendNotificationsOptions) {
      this.instanceId = sendNotificationsOptions.instanceId;
      this.body = sendNotificationsOptions.body;
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
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a SendNotificationsOptions.
     *
     * @return the new SendNotificationsOptions instance
     */
    public SendNotificationsOptions build() {
      return new SendNotificationsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the SendNotificationsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the SendNotificationsOptions builder
     */
    public Builder body(NotificationCreate body) {
      this.body = body;
      return this;
    }
  }

  protected SendNotificationsOptions() { }

  protected SendNotificationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    body = builder.body;
  }

  /**
   * New builder.
   *
   * @return a SendNotificationsOptions builder
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
   * Gets the body.
   *
   * Payload describing a notification create request.
   *
   * @return the body
   */
  public NotificationCreate body() {
    return body;
  }
}

