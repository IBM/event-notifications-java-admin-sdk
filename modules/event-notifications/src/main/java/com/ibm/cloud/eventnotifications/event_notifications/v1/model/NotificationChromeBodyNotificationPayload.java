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

import java.util.HashMap;
import java.util.Map;

/**
 * The attributes for an FCM/APNs notification.
 */
public class NotificationChromeBodyNotificationPayload extends NotificationChromeBody {


  public NotificationChromeBodyNotificationPayload() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> dynamicProperties;

    public Builder(NotificationChromeBody notificationChromeBodyNotificationPayload) {
      this.dynamicProperties = notificationChromeBodyNotificationPayload.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NotificationChromeBodyNotificationPayload.
     *
     * @return the new NotificationChromeBodyNotificationPayload instance
     */
    public NotificationChromeBodyNotificationPayload build() {
      return new NotificationChromeBodyNotificationPayload(this);
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the NotificationChromeBodyNotificationPayload builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected NotificationChromeBodyNotificationPayload(Builder builder) {
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a NotificationChromeBodyNotificationPayload builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}
