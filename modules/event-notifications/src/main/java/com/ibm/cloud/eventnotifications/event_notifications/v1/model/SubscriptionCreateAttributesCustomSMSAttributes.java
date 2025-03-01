/*
 * (C) Copyright IBM Corp. 2025.
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
 * The attributes for an custom sms notification.
 */
public class SubscriptionCreateAttributesCustomSMSAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> invited;

    /**
     * Instantiates a new Builder from an existing SubscriptionCreateAttributesCustomSMSAttributes instance.
     *
     * @param subscriptionCreateAttributesCustomSmsAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesCustomSmsAttributes) {
      this.invited = subscriptionCreateAttributesCustomSmsAttributes.invited;
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
     */
    public Builder(List<String> invited) {
      this.invited = invited;
    }

    /**
     * Builds a SubscriptionCreateAttributesCustomSMSAttributes.
     *
     * @return the new SubscriptionCreateAttributesCustomSMSAttributes instance
     */
    public SubscriptionCreateAttributesCustomSMSAttributes build() {
      return new SubscriptionCreateAttributesCustomSMSAttributes(this);
    }

    /**
     * Adds an invited to invited.
     *
     * @param invited the new invited
     * @return the SubscriptionCreateAttributesCustomSMSAttributes builder
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
     * @return the SubscriptionCreateAttributesCustomSMSAttributes builder
     */
    public Builder invited(List<String> invited) {
      this.invited = invited;
      return this;
    }
  }

  protected SubscriptionCreateAttributesCustomSMSAttributes() { }

  protected SubscriptionCreateAttributesCustomSMSAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.invited,
      "invited cannot be null");
    invited = builder.invited;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesCustomSMSAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

