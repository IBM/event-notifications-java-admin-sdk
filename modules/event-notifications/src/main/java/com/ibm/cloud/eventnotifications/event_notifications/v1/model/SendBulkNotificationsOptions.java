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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The sendBulkNotifications options.
 */
public class SendBulkNotificationsOptions extends GenericModel {

  protected String instanceId;
  protected List<NotificationCreate> bulkMessages;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private List<NotificationCreate> bulkMessages;

    private Builder(SendBulkNotificationsOptions sendBulkNotificationsOptions) {
      this.instanceId = sendBulkNotificationsOptions.instanceId;
      this.bulkMessages = sendBulkNotificationsOptions.bulkMessages;
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
     * Builds a SendBulkNotificationsOptions.
     *
     * @return the new SendBulkNotificationsOptions instance
     */
    public SendBulkNotificationsOptions build() {
      return new SendBulkNotificationsOptions(this);
    }

    /**
     * Adds an bulkMessages to bulkMessages.
     *
     * @param bulkMessages the new bulkMessages
     * @return the SendBulkNotificationsOptions builder
     */
    public Builder addBulkMessages(NotificationCreate bulkMessages) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(bulkMessages,
        "bulkMessages cannot be null");
      if (this.bulkMessages == null) {
        this.bulkMessages = new ArrayList<NotificationCreate>();
      }
      this.bulkMessages.add(bulkMessages);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the SendBulkNotificationsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the bulkMessages.
     * Existing bulkMessages will be replaced.
     *
     * @param bulkMessages the bulkMessages
     * @return the SendBulkNotificationsOptions builder
     */
    public Builder bulkMessages(List<NotificationCreate> bulkMessages) {
      this.bulkMessages = bulkMessages;
      return this;
    }
  }

  protected SendBulkNotificationsOptions() { }

  protected SendBulkNotificationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    bulkMessages = builder.bulkMessages;
  }

  /**
   * New builder.
   *
   * @return a SendBulkNotificationsOptions builder
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
   * Gets the bulkMessages.
   *
   * List of notifications body.
   *
   * @return the bulkMessages
   */
  public List<NotificationCreate> bulkMessages() {
    return bulkMessages;
  }
}

