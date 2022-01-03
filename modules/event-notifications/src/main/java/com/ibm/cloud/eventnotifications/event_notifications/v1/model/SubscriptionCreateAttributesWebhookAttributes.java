/*
 * (C) Copyright IBM Corp. 2021.
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
 * The attributes for a webhook notification.
 */
public class SubscriptionCreateAttributesWebhookAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean signingEnabled;

    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesWebhookAttributes) {
      this.signingEnabled = subscriptionCreateAttributesWebhookAttributes.signingEnabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param signingEnabled the signingEnabled
     */
    public Builder(Boolean signingEnabled) {
      this.signingEnabled = signingEnabled;
    }

    /**
     * Builds a SubscriptionCreateAttributesWebhookAttributes.
     *
     * @return the new SubscriptionCreateAttributesWebhookAttributes instance
     */
    public SubscriptionCreateAttributesWebhookAttributes build() {
      return new SubscriptionCreateAttributesWebhookAttributes(this);
    }

    /**
     * Set the signingEnabled.
     *
     * @param signingEnabled the signingEnabled
     * @return the SubscriptionCreateAttributesWebhookAttributes builder
     */
    public Builder signingEnabled(Boolean signingEnabled) {
      this.signingEnabled = signingEnabled;
      return this;
    }
  }

  protected SubscriptionCreateAttributesWebhookAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.signingEnabled,
      "signingEnabled cannot be null");
    signingEnabled = builder.signingEnabled;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesWebhookAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

