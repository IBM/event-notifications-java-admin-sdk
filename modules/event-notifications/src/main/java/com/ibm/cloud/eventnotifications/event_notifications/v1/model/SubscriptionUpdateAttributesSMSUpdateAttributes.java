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
 * SMS attributes object.
 */
public class SubscriptionUpdateAttributesSMSUpdateAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private UpdateAttributesInvited invited;
    private UpdateAttributesSubscribed subscribed;
    private UpdateAttributesUnsubscribed unsubscribed;

    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesSmsUpdateAttributes) {
      this.invited = subscriptionUpdateAttributesSmsUpdateAttributes.invited;
      this.subscribed = subscriptionUpdateAttributesSmsUpdateAttributes.subscribed;
      this.unsubscribed = subscriptionUpdateAttributesSmsUpdateAttributes.unsubscribed;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionUpdateAttributesSMSUpdateAttributes.
     *
     * @return the new SubscriptionUpdateAttributesSMSUpdateAttributes instance
     */
    public SubscriptionUpdateAttributesSMSUpdateAttributes build() {
      return new SubscriptionUpdateAttributesSMSUpdateAttributes(this);
    }

    /**
     * Set the invited.
     *
     * @param invited the invited
     * @return the SubscriptionUpdateAttributesSMSUpdateAttributes builder
     */
    public Builder invited(UpdateAttributesInvited invited) {
      this.invited = invited;
      return this;
    }

    /**
     * Set the subscribed.
     *
     * @param subscribed the subscribed
     * @return the SubscriptionUpdateAttributesSMSUpdateAttributes builder
     */
    public Builder subscribed(UpdateAttributesSubscribed subscribed) {
      this.subscribed = subscribed;
      return this;
    }

    /**
     * Set the unsubscribed.
     *
     * @param unsubscribed the unsubscribed
     * @return the SubscriptionUpdateAttributesSMSUpdateAttributes builder
     */
    public Builder unsubscribed(UpdateAttributesUnsubscribed unsubscribed) {
      this.unsubscribed = unsubscribed;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesSMSUpdateAttributes() { }

  protected SubscriptionUpdateAttributesSMSUpdateAttributes(Builder builder) {
    invited = builder.invited;
    subscribed = builder.subscribed;
    unsubscribed = builder.unsubscribed;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesSMSUpdateAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

