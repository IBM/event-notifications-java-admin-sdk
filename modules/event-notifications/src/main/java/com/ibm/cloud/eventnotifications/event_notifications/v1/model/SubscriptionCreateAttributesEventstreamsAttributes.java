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
 * The attributes for a Event Streams subscription.
 */
public class SubscriptionCreateAttributesEventstreamsAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private String templateIdNotification;

    /**
     * Instantiates a new Builder from an existing SubscriptionCreateAttributesEventstreamsAttributes instance.
     *
     * @param subscriptionCreateAttributesEventstreamsAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesEventstreamsAttributes) {
      this.templateIdNotification = subscriptionCreateAttributesEventstreamsAttributes.templateIdNotification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionCreateAttributesEventstreamsAttributes.
     *
     * @return the new SubscriptionCreateAttributesEventstreamsAttributes instance
     */
    public SubscriptionCreateAttributesEventstreamsAttributes build() {
      return new SubscriptionCreateAttributesEventstreamsAttributes(this);
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionCreateAttributesEventstreamsAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }
  }

  protected SubscriptionCreateAttributesEventstreamsAttributes() { }

  protected SubscriptionCreateAttributesEventstreamsAttributes(Builder builder) {
    templateIdNotification = builder.templateIdNotification;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesEventstreamsAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

