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

/**
 * SMS attributes object.
 */
public class SubscriptionUpdateAttributesCustomSMSUpdateAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private UpdateAttributesInvited invited;
    private UpdateAttributesSubscribed subscribed;
    private UpdateAttributesUnsubscribed unsubscribed;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesCustomSMSUpdateAttributes instance.
     *
     * @param subscriptionUpdateAttributesCustomSmsUpdateAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesCustomSmsUpdateAttributes) {
      this.invited = subscriptionUpdateAttributesCustomSmsUpdateAttributes.invited;
      this.subscribed = subscriptionUpdateAttributesCustomSmsUpdateAttributes.subscribed;
      this.unsubscribed = subscriptionUpdateAttributesCustomSmsUpdateAttributes.unsubscribed;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionUpdateAttributesCustomSMSUpdateAttributes.
     *
     * @return the new SubscriptionUpdateAttributesCustomSMSUpdateAttributes instance
     */
    public SubscriptionUpdateAttributesCustomSMSUpdateAttributes build() {
      return new SubscriptionUpdateAttributesCustomSMSUpdateAttributes(this);
    }

    /**
     * Set the invited.
     *
     * @param invited the invited
     * @return the SubscriptionUpdateAttributesCustomSMSUpdateAttributes builder
     */
    public Builder invited(UpdateAttributesInvited invited) {
      this.invited = invited;
      return this;
    }

    /**
     * Set the subscribed.
     *
     * @param subscribed the subscribed
     * @return the SubscriptionUpdateAttributesCustomSMSUpdateAttributes builder
     */
    public Builder subscribed(UpdateAttributesSubscribed subscribed) {
      this.subscribed = subscribed;
      return this;
    }

    /**
     * Set the unsubscribed.
     *
     * @param unsubscribed the unsubscribed
     * @return the SubscriptionUpdateAttributesCustomSMSUpdateAttributes builder
     */
    public Builder unsubscribed(UpdateAttributesUnsubscribed unsubscribed) {
      this.unsubscribed = unsubscribed;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesCustomSMSUpdateAttributes() { }

  protected SubscriptionUpdateAttributesCustomSMSUpdateAttributes(Builder builder) {
    invited = builder.invited;
    subscribed = builder.subscribed;
    unsubscribed = builder.unsubscribed;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesCustomSMSUpdateAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

