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
 * The attributes for a webhook notification.
 */
public class SubscriptionUpdateAttributesWebhookAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean signingEnabled;
    private String templateIdNotification;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesWebhookAttributes instance.
     *
     * @param subscriptionUpdateAttributesWebhookAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesWebhookAttributes) {
      this.signingEnabled = subscriptionUpdateAttributesWebhookAttributes.signingEnabled;
      this.templateIdNotification = subscriptionUpdateAttributesWebhookAttributes.templateIdNotification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionUpdateAttributesWebhookAttributes.
     *
     * @return the new SubscriptionUpdateAttributesWebhookAttributes instance
     */
    public SubscriptionUpdateAttributesWebhookAttributes build() {
      return new SubscriptionUpdateAttributesWebhookAttributes(this);
    }

    /**
     * Set the signingEnabled.
     *
     * @param signingEnabled the signingEnabled
     * @return the SubscriptionUpdateAttributesWebhookAttributes builder
     */
    public Builder signingEnabled(Boolean signingEnabled) {
      this.signingEnabled = signingEnabled;
      return this;
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionUpdateAttributesWebhookAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesWebhookAttributes() { }

  protected SubscriptionUpdateAttributesWebhookAttributes(Builder builder) {
    signingEnabled = builder.signingEnabled;
    templateIdNotification = builder.templateIdNotification;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesWebhookAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

