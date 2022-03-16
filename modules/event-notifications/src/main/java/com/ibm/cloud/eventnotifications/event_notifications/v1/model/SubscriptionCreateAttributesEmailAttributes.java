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

import java.util.ArrayList;
import java.util.List;

/**
 * The attributes for an email notification.
 */
public class SubscriptionCreateAttributesEmailAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> to;
    private Boolean addNotificationPayload;
    private String replyToMail;
    private String replyToName;
    private String fromName;

    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesEmailAttributes) {
      this.to = subscriptionCreateAttributesEmailAttributes.to;
      this.addNotificationPayload = subscriptionCreateAttributesEmailAttributes.addNotificationPayload;
      this.replyToMail = subscriptionCreateAttributesEmailAttributes.replyToMail;
      this.replyToName = subscriptionCreateAttributesEmailAttributes.replyToName;
      this.fromName = subscriptionCreateAttributesEmailAttributes.fromName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param to the to
     * @param addNotificationPayload the addNotificationPayload
     * @param replyToMail the replyToMail
     * @param replyToName the replyToName
     * @param fromName the fromName
     */
    public Builder(List<String> to, Boolean addNotificationPayload, String replyToMail, String replyToName, String fromName) {
      this.to = to;
      this.addNotificationPayload = addNotificationPayload;
      this.replyToMail = replyToMail;
      this.replyToName = replyToName;
      this.fromName = fromName;
    }

    /**
     * Builds a SubscriptionCreateAttributesEmailAttributes.
     *
     * @return the new SubscriptionCreateAttributesEmailAttributes instance
     */
    public SubscriptionCreateAttributesEmailAttributes build() {
      return new SubscriptionCreateAttributesEmailAttributes(this);
    }

    /**
     * Adds an to to to.
     *
     * @param to the new to
     * @return the SubscriptionCreateAttributesEmailAttributes builder
     */
    public Builder addTo(String to) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(to,
        "to cannot be null");
      if (this.to == null) {
        this.to = new ArrayList<String>();
      }
      this.to.add(to);
      return this;
    }

    /**
     * Set the to.
     * Existing to will be replaced.
     *
     * @param to the to
     * @return the SubscriptionCreateAttributesEmailAttributes builder
     */
    public Builder to(List<String> to) {
      this.to = to;
      return this;
    }

    /**
     * Set the addNotificationPayload.
     *
     * @param addNotificationPayload the addNotificationPayload
     * @return the SubscriptionCreateAttributesEmailAttributes builder
     */
    public Builder addNotificationPayload(Boolean addNotificationPayload) {
      this.addNotificationPayload = addNotificationPayload;
      return this;
    }

    /**
     * Set the replyToMail.
     *
     * @param replyToMail the replyToMail
     * @return the SubscriptionCreateAttributesEmailAttributes builder
     */
    public Builder replyToMail(String replyToMail) {
      this.replyToMail = replyToMail;
      return this;
    }

    /**
     * Set the replyToName.
     *
     * @param replyToName the replyToName
     * @return the SubscriptionCreateAttributesEmailAttributes builder
     */
    public Builder replyToName(String replyToName) {
      this.replyToName = replyToName;
      return this;
    }

    /**
     * Set the fromName.
     *
     * @param fromName the fromName
     * @return the SubscriptionCreateAttributesEmailAttributes builder
     */
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }
  }

  protected SubscriptionCreateAttributesEmailAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.to,
      "to cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.addNotificationPayload,
      "addNotificationPayload cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToMail,
      "replyToMail cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToName,
      "replyToName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fromName,
      "fromName cannot be null");
    to = builder.to;
    addNotificationPayload = builder.addNotificationPayload;
    replyToMail = builder.replyToMail;
    replyToName = builder.replyToName;
    fromName = builder.fromName;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesEmailAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

