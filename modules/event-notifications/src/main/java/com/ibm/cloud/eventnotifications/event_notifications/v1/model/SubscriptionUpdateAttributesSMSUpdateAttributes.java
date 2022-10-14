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

/**
 * SMS attributes object.
 */
public class SubscriptionUpdateAttributesSMSUpdateAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private SMSupdateAttributesTo to;
    private UpdateAttributesUnsubscribed unsubscribed;

    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesSmsUpdateAttributes) {
      this.to = subscriptionUpdateAttributesSmsUpdateAttributes.to;
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
     * Set the to.
     *
     * @param to the to
     * @return the SubscriptionUpdateAttributesSMSUpdateAttributes builder
     */
    public Builder to(SMSupdateAttributesTo to) {
      this.to = to;
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
    to = builder.to;
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

