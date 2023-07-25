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

/**
 * The attributes for an email notification.
 */
public class SubscriptionUpdateAttributesCustomEmailUpdateAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private UpdateAttributesInvited invited;
    private Boolean addNotificationPayload;
    private String replyToMail;
    private String replyToName;
    private String fromName;
    private String fromEmail;
    private UpdateAttributesSubscribed subscribed;
    private UpdateAttributesUnsubscribed unsubscribed;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesCustomEmailUpdateAttributes instance.
     *
     * @param subscriptionUpdateAttributesCustomEmailUpdateAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesCustomEmailUpdateAttributes) {
      this.invited = subscriptionUpdateAttributesCustomEmailUpdateAttributes.invited;
      this.addNotificationPayload = subscriptionUpdateAttributesCustomEmailUpdateAttributes.addNotificationPayload;
      this.replyToMail = subscriptionUpdateAttributesCustomEmailUpdateAttributes.replyToMail;
      this.replyToName = subscriptionUpdateAttributesCustomEmailUpdateAttributes.replyToName;
      this.fromName = subscriptionUpdateAttributesCustomEmailUpdateAttributes.fromName;
      this.fromEmail = subscriptionUpdateAttributesCustomEmailUpdateAttributes.fromEmail;
      this.subscribed = subscriptionUpdateAttributesCustomEmailUpdateAttributes.subscribed;
      this.unsubscribed = subscriptionUpdateAttributesCustomEmailUpdateAttributes.unsubscribed;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param addNotificationPayload the addNotificationPayload
     * @param replyToMail the replyToMail
     * @param replyToName the replyToName
     * @param fromName the fromName
     * @param fromEmail the fromEmail
     */
    public Builder(Boolean addNotificationPayload, String replyToMail, String replyToName, String fromName, String fromEmail) {
      this.addNotificationPayload = addNotificationPayload;
      this.replyToMail = replyToMail;
      this.replyToName = replyToName;
      this.fromName = fromName;
      this.fromEmail = fromEmail;
    }

    /**
     * Builds a SubscriptionUpdateAttributesCustomEmailUpdateAttributes.
     *
     * @return the new SubscriptionUpdateAttributesCustomEmailUpdateAttributes instance
     */
    public SubscriptionUpdateAttributesCustomEmailUpdateAttributes build() {
      return new SubscriptionUpdateAttributesCustomEmailUpdateAttributes(this);
    }

    /**
     * Set the invited.
     *
     * @param invited the invited
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder invited(UpdateAttributesInvited invited) {
      this.invited = invited;
      return this;
    }

    /**
     * Set the addNotificationPayload.
     *
     * @param addNotificationPayload the addNotificationPayload
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder addNotificationPayload(Boolean addNotificationPayload) {
      this.addNotificationPayload = addNotificationPayload;
      return this;
    }

    /**
     * Set the replyToMail.
     *
     * @param replyToMail the replyToMail
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder replyToMail(String replyToMail) {
      this.replyToMail = replyToMail;
      return this;
    }

    /**
     * Set the replyToName.
     *
     * @param replyToName the replyToName
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder replyToName(String replyToName) {
      this.replyToName = replyToName;
      return this;
    }

    /**
     * Set the fromName.
     *
     * @param fromName the fromName
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }

    /**
     * Set the fromEmail.
     *
     * @param fromEmail the fromEmail
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder fromEmail(String fromEmail) {
      this.fromEmail = fromEmail;
      return this;
    }

    /**
     * Set the subscribed.
     *
     * @param subscribed the subscribed
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder subscribed(UpdateAttributesSubscribed subscribed) {
      this.subscribed = subscribed;
      return this;
    }

    /**
     * Set the unsubscribed.
     *
     * @param unsubscribed the unsubscribed
     * @return the SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
     */
    public Builder unsubscribed(UpdateAttributesUnsubscribed unsubscribed) {
      this.unsubscribed = unsubscribed;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesCustomEmailUpdateAttributes() { }

  protected SubscriptionUpdateAttributesCustomEmailUpdateAttributes(Builder builder) {
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
    subscribed = builder.subscribed;
    unsubscribed = builder.unsubscribed;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesCustomEmailUpdateAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

