/*
 * (C) Copyright IBM Corp. 2026.
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
public class SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private UpdateAttributesInvited invited;
    private Boolean addNotificationPayload;
    private String replyToMail;
    private String replyToName;
    private UpdateAttributesSubscribed subscribed;
    private UpdateAttributesUnsubscribed unsubscribed;
    private String templateIdNotification;
    private String templateIdInvitation;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes instance.
     *
     * @param subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes) {
      this.invited = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.invited;
      this.addNotificationPayload = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.addNotificationPayload;
      this.replyToMail = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.replyToMail;
      this.replyToName = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.replyToName;
      this.subscribed = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.subscribed;
      this.unsubscribed = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.unsubscribed;
      this.templateIdNotification = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.templateIdNotification;
      this.templateIdInvitation = subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.templateIdInvitation;
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
     */
    public Builder(Boolean addNotificationPayload, String replyToMail, String replyToName) {
      this.addNotificationPayload = addNotificationPayload;
      this.replyToMail = replyToMail;
      this.replyToName = replyToName;
    }

    /**
     * Builds a SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.
     *
     * @return the new SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes instance
     */
    public SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes build() {
      return new SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes(this);
    }

    /**
     * Set the invited.
     *
     * @param invited the invited
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder invited(UpdateAttributesInvited invited) {
      this.invited = invited;
      return this;
    }

    /**
     * Set the addNotificationPayload.
     *
     * @param addNotificationPayload the addNotificationPayload
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder addNotificationPayload(Boolean addNotificationPayload) {
      this.addNotificationPayload = addNotificationPayload;
      return this;
    }

    /**
     * Set the replyToMail.
     *
     * @param replyToMail the replyToMail
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder replyToMail(String replyToMail) {
      this.replyToMail = replyToMail;
      return this;
    }

    /**
     * Set the replyToName.
     *
     * @param replyToName the replyToName
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder replyToName(String replyToName) {
      this.replyToName = replyToName;
      return this;
    }

    /**
     * Set the subscribed.
     *
     * @param subscribed the subscribed
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder subscribed(UpdateAttributesSubscribed subscribed) {
      this.subscribed = subscribed;
      return this;
    }

    /**
     * Set the unsubscribed.
     *
     * @param unsubscribed the unsubscribed
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder unsubscribed(UpdateAttributesUnsubscribed unsubscribed) {
      this.unsubscribed = unsubscribed;
      return this;
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }

    /**
     * Set the templateIdInvitation.
     *
     * @param templateIdInvitation the templateIdInvitation
     * @return the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
     */
    public Builder templateIdInvitation(String templateIdInvitation) {
      this.templateIdInvitation = templateIdInvitation;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes() { }

  protected SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.addNotificationPayload,
      "addNotificationPayload cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToMail,
      "replyToMail cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replyToName,
      "replyToName cannot be null");
    invited = builder.invited;
    addNotificationPayload = builder.addNotificationPayload;
    replyToMail = builder.replyToMail;
    replyToName = builder.replyToName;
    subscribed = builder.subscribed;
    unsubscribed = builder.unsubscribed;
    templateIdNotification = builder.templateIdNotification;
    templateIdInvitation = builder.templateIdInvitation;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

