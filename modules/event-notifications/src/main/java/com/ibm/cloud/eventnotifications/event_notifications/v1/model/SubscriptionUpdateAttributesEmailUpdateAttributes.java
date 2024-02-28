/*
 * (C) Copyright IBM Corp. 2024.
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
public class SubscriptionUpdateAttributesEmailUpdateAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private UpdateAttributesInvited invited;
    private Boolean addNotificationPayload;
    private String replyToMail;
    private String replyToName;
    private String fromName;
    private UpdateAttributesSubscribed subscribed;
    private UpdateAttributesUnsubscribed unsubscribed;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesEmailUpdateAttributes instance.
     *
     * @param subscriptionUpdateAttributesEmailUpdateAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesEmailUpdateAttributes) {
      this.invited = subscriptionUpdateAttributesEmailUpdateAttributes.invited;
      this.addNotificationPayload = subscriptionUpdateAttributesEmailUpdateAttributes.addNotificationPayload;
      this.replyToMail = subscriptionUpdateAttributesEmailUpdateAttributes.replyToMail;
      this.replyToName = subscriptionUpdateAttributesEmailUpdateAttributes.replyToName;
      this.fromName = subscriptionUpdateAttributesEmailUpdateAttributes.fromName;
      this.subscribed = subscriptionUpdateAttributesEmailUpdateAttributes.subscribed;
      this.unsubscribed = subscriptionUpdateAttributesEmailUpdateAttributes.unsubscribed;
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
     */
    public Builder(Boolean addNotificationPayload, String replyToMail, String replyToName, String fromName) {
      this.addNotificationPayload = addNotificationPayload;
      this.replyToMail = replyToMail;
      this.replyToName = replyToName;
      this.fromName = fromName;
    }

    /**
     * Builds a SubscriptionUpdateAttributesEmailUpdateAttributes.
     *
     * @return the new SubscriptionUpdateAttributesEmailUpdateAttributes instance
     */
    public SubscriptionUpdateAttributesEmailUpdateAttributes build() {
      return new SubscriptionUpdateAttributesEmailUpdateAttributes(this);
    }

    /**
     * Set the invited.
     *
     * @param invited the invited
     * @return the SubscriptionUpdateAttributesEmailUpdateAttributes builder
     */
    public Builder invited(UpdateAttributesInvited invited) {
      this.invited = invited;
      return this;
    }

    /**
     * Set the addNotificationPayload.
     *
     * @param addNotificationPayload the addNotificationPayload
     * @return the SubscriptionUpdateAttributesEmailUpdateAttributes builder
     */
    public Builder addNotificationPayload(Boolean addNotificationPayload) {
      this.addNotificationPayload = addNotificationPayload;
      return this;
    }

    /**
     * Set the replyToMail.
     *
     * @param replyToMail the replyToMail
     * @return the SubscriptionUpdateAttributesEmailUpdateAttributes builder
     */
    public Builder replyToMail(String replyToMail) {
      this.replyToMail = replyToMail;
      return this;
    }

    /**
     * Set the replyToName.
     *
     * @param replyToName the replyToName
     * @return the SubscriptionUpdateAttributesEmailUpdateAttributes builder
     */
    public Builder replyToName(String replyToName) {
      this.replyToName = replyToName;
      return this;
    }

    /**
     * Set the fromName.
     *
     * @param fromName the fromName
     * @return the SubscriptionUpdateAttributesEmailUpdateAttributes builder
     */
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }

    /**
     * Set the subscribed.
     *
     * @param subscribed the subscribed
     * @return the SubscriptionUpdateAttributesEmailUpdateAttributes builder
     */
    public Builder subscribed(UpdateAttributesSubscribed subscribed) {
      this.subscribed = subscribed;
      return this;
    }

    /**
     * Set the unsubscribed.
     *
     * @param unsubscribed the unsubscribed
     * @return the SubscriptionUpdateAttributesEmailUpdateAttributes builder
     */
    public Builder unsubscribed(UpdateAttributesUnsubscribed unsubscribed) {
      this.unsubscribed = unsubscribed;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesEmailUpdateAttributes() { }

  protected SubscriptionUpdateAttributesEmailUpdateAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.addNotificationPayload,
      "addNotificationPayload cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToMail,
      "replyToMail cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToName,
      "replyToName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fromName,
      "fromName cannot be null");
    invited = builder.invited;
    addNotificationPayload = builder.addNotificationPayload;
    replyToMail = builder.replyToMail;
    replyToName = builder.replyToName;
    fromName = builder.fromName;
    subscribed = builder.subscribed;
    unsubscribed = builder.unsubscribed;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesEmailUpdateAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

