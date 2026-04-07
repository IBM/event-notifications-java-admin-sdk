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

import java.util.ArrayList;
import java.util.List;

/**
 * The attributes for an email notification.
 */
public class SubscriptionCreateAttributesCustomEmailSandboxAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> invited;
    private Boolean addNotificationPayload;
    private String replyToMail;
    private String replyToName;
    private String templateIdNotification;
    private String templateIdInvitation;

    /**
     * Instantiates a new Builder from an existing SubscriptionCreateAttributesCustomEmailSandboxAttributes instance.
     *
     * @param subscriptionCreateAttributesCustomEmailSandboxAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesCustomEmailSandboxAttributes) {
      this.invited = subscriptionCreateAttributesCustomEmailSandboxAttributes.invited;
      this.addNotificationPayload = subscriptionCreateAttributesCustomEmailSandboxAttributes.addNotificationPayload;
      this.replyToMail = subscriptionCreateAttributesCustomEmailSandboxAttributes.replyToMail;
      this.replyToName = subscriptionCreateAttributesCustomEmailSandboxAttributes.replyToName;
      this.templateIdNotification = subscriptionCreateAttributesCustomEmailSandboxAttributes.templateIdNotification;
      this.templateIdInvitation = subscriptionCreateAttributesCustomEmailSandboxAttributes.templateIdInvitation;
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
     */
    public Builder(List<String> invited, Boolean addNotificationPayload, String replyToMail, String replyToName) {
      this.invited = invited;
      this.addNotificationPayload = addNotificationPayload;
      this.replyToMail = replyToMail;
      this.replyToName = replyToName;
    }

    /**
     * Builds a SubscriptionCreateAttributesCustomEmailSandboxAttributes.
     *
     * @return the new SubscriptionCreateAttributesCustomEmailSandboxAttributes instance
     */
    public SubscriptionCreateAttributesCustomEmailSandboxAttributes build() {
      return new SubscriptionCreateAttributesCustomEmailSandboxAttributes(this);
    }

    /**
     * Adds an invited to invited.
     *
     * @param invited the new invited
     * @return the SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
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
     * @return the SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
     */
    public Builder invited(List<String> invited) {
      this.invited = invited;
      return this;
    }

    /**
     * Set the addNotificationPayload.
     *
     * @param addNotificationPayload the addNotificationPayload
     * @return the SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
     */
    public Builder addNotificationPayload(Boolean addNotificationPayload) {
      this.addNotificationPayload = addNotificationPayload;
      return this;
    }

    /**
     * Set the replyToMail.
     *
     * @param replyToMail the replyToMail
     * @return the SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
     */
    public Builder replyToMail(String replyToMail) {
      this.replyToMail = replyToMail;
      return this;
    }

    /**
     * Set the replyToName.
     *
     * @param replyToName the replyToName
     * @return the SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
     */
    public Builder replyToName(String replyToName) {
      this.replyToName = replyToName;
      return this;
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }

    /**
     * Set the templateIdInvitation.
     *
     * @param templateIdInvitation the templateIdInvitation
     * @return the SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
     */
    public Builder templateIdInvitation(String templateIdInvitation) {
      this.templateIdInvitation = templateIdInvitation;
      return this;
    }
  }

  protected SubscriptionCreateAttributesCustomEmailSandboxAttributes() { }

  protected SubscriptionCreateAttributesCustomEmailSandboxAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.invited,
      "invited cannot be null");
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
    templateIdNotification = builder.templateIdNotification;
    templateIdInvitation = builder.templateIdInvitation;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesCustomEmailSandboxAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

