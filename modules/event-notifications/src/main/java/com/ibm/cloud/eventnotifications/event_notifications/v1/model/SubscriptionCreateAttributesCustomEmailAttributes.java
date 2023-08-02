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

/**
 * The attributes for an email notification.
 */
public class SubscriptionCreateAttributesCustomEmailAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> invited;
    private Boolean addNotificationPayload;
    private String replyToMail;
    private String replyToName;
    private String fromName;
    private String fromEmail;

    /**
     * Instantiates a new Builder from an existing SubscriptionCreateAttributesCustomEmailAttributes instance.
     *
     * @param subscriptionCreateAttributesCustomEmailAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesCustomEmailAttributes) {
      this.invited = subscriptionCreateAttributesCustomEmailAttributes.invited;
      this.addNotificationPayload = subscriptionCreateAttributesCustomEmailAttributes.addNotificationPayload;
      this.replyToMail = subscriptionCreateAttributesCustomEmailAttributes.replyToMail;
      this.replyToName = subscriptionCreateAttributesCustomEmailAttributes.replyToName;
      this.fromName = subscriptionCreateAttributesCustomEmailAttributes.fromName;
      this.fromEmail = subscriptionCreateAttributesCustomEmailAttributes.fromEmail;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param invited the invited
     * @param addNotificationPayload the addNotificationPayload
     * @param replyToMail the replyToMail
     * @param replyToName the replyToName
     * @param fromName the fromName
     * @param fromEmail the fromEmail
     */
    public Builder(List<String> invited, Boolean addNotificationPayload, String replyToMail, String replyToName, String fromName, String fromEmail) {
      this.invited = invited;
      this.addNotificationPayload = addNotificationPayload;
      this.replyToMail = replyToMail;
      this.replyToName = replyToName;
      this.fromName = fromName;
      this.fromEmail = fromEmail;
    }

    /**
     * Builds a SubscriptionCreateAttributesCustomEmailAttributes.
     *
     * @return the new SubscriptionCreateAttributesCustomEmailAttributes instance
     */
    public SubscriptionCreateAttributesCustomEmailAttributes build() {
      return new SubscriptionCreateAttributesCustomEmailAttributes(this);
    }

    /**
     * Adds an invited to invited.
     *
     * @param invited the new invited
     * @return the SubscriptionCreateAttributesCustomEmailAttributes builder
     */
    public Builder addInvited(String invited) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(invited,
        "invited cannot be null");
      if (this.invited == null) {
        this.invited = new ArrayList<String>();
      }
      this.invited.add(invited);
      return this;
    }

    /**
     * Set the invited.
     * Existing invited will be replaced.
     *
     * @param invited the invited
     * @return the SubscriptionCreateAttributesCustomEmailAttributes builder
     */
    public Builder invited(List<String> invited) {
      this.invited = invited;
      return this;
    }

    /**
     * Set the addNotificationPayload.
     *
     * @param addNotificationPayload the addNotificationPayload
     * @return the SubscriptionCreateAttributesCustomEmailAttributes builder
     */
    public Builder addNotificationPayload(Boolean addNotificationPayload) {
      this.addNotificationPayload = addNotificationPayload;
      return this;
    }

    /**
     * Set the replyToMail.
     *
     * @param replyToMail the replyToMail
     * @return the SubscriptionCreateAttributesCustomEmailAttributes builder
     */
    public Builder replyToMail(String replyToMail) {
      this.replyToMail = replyToMail;
      return this;
    }

    /**
     * Set the replyToName.
     *
     * @param replyToName the replyToName
     * @return the SubscriptionCreateAttributesCustomEmailAttributes builder
     */
    public Builder replyToName(String replyToName) {
      this.replyToName = replyToName;
      return this;
    }

    /**
     * Set the fromName.
     *
     * @param fromName the fromName
     * @return the SubscriptionCreateAttributesCustomEmailAttributes builder
     */
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }

    /**
     * Set the fromEmail.
     *
     * @param fromEmail the fromEmail
     * @return the SubscriptionCreateAttributesCustomEmailAttributes builder
     */
    public Builder fromEmail(String fromEmail) {
      this.fromEmail = fromEmail;
      return this;
    }
  }

  protected SubscriptionCreateAttributesCustomEmailAttributes() { }

  protected SubscriptionCreateAttributesCustomEmailAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.invited,
      "invited cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.addNotificationPayload,
      "addNotificationPayload cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToMail,
      "replyToMail cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToName,
      "replyToName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fromName,
      "fromName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fromEmail,
      "fromEmail cannot be null");
    invited = builder.invited;
    addNotificationPayload = builder.addNotificationPayload;
    replyToMail = builder.replyToMail;
    replyToName = builder.replyToName;
    fromName = builder.fromName;
    fromEmail = builder.fromEmail;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesCustomEmailAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

