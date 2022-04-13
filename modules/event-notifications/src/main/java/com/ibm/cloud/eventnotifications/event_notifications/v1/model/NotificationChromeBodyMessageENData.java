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
 * Payload describing a Chrome notifications body message.
 */
public class NotificationChromeBodyMessageENData extends NotificationChromeBody {


  public NotificationChromeBodyMessageENData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private NotificationChromeBodyMessageData enData;
    private Map<String, Object> dynamicProperties;

    public Builder(NotificationChromeBody notificationChromeBodyMessageEnData) {
      this.enData = notificationChromeBodyMessageEnData.enData;
      this.dynamicProperties = notificationChromeBodyMessageEnData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NotificationChromeBodyMessageENData.
     *
     * @return the new NotificationChromeBodyMessageENData instance
     */
    public NotificationChromeBodyMessageENData build() {
      return new NotificationChromeBodyMessageENData(this);
    }

    /**
     * Set the enData.
     *
     * @param enData the enData
     * @return the NotificationChromeBodyMessageENData builder
     */
    public Builder enData(NotificationChromeBodyMessageData enData) {
      this.enData = enData;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the NotificationChromeBodyMessageENData builder
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

  protected NotificationChromeBodyMessageENData(Builder builder) {
    enData = builder.enData;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a NotificationChromeBodyMessageENData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Sets the enData.
   *
   * @param enData the new enData
   */
  public void setEnData(final NotificationChromeBodyMessageData enData) {
    this.enData = enData;
  }
}
