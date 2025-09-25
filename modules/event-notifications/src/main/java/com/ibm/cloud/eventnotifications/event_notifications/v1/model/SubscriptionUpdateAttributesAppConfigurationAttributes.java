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
 * The attributes for a App Configuration subscription.
 */
public class SubscriptionUpdateAttributesAppConfigurationAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean featureFlagEnabled;
    private String templateIdNotification;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesAppConfigurationAttributes instance.
     *
     * @param subscriptionUpdateAttributesAppConfigurationAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesAppConfigurationAttributes) {
      this.featureFlagEnabled = subscriptionUpdateAttributesAppConfigurationAttributes.featureFlagEnabled;
      this.templateIdNotification = subscriptionUpdateAttributesAppConfigurationAttributes.templateIdNotification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionUpdateAttributesAppConfigurationAttributes.
     *
     * @return the new SubscriptionUpdateAttributesAppConfigurationAttributes instance
     */
    public SubscriptionUpdateAttributesAppConfigurationAttributes build() {
      return new SubscriptionUpdateAttributesAppConfigurationAttributes(this);
    }

    /**
     * Set the featureFlagEnabled.
     *
     * @param featureFlagEnabled the featureFlagEnabled
     * @return the SubscriptionUpdateAttributesAppConfigurationAttributes builder
     */
    public Builder featureFlagEnabled(Boolean featureFlagEnabled) {
      this.featureFlagEnabled = featureFlagEnabled;
      return this;
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionUpdateAttributesAppConfigurationAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesAppConfigurationAttributes() { }

  protected SubscriptionUpdateAttributesAppConfigurationAttributes(Builder builder) {
    featureFlagEnabled = builder.featureFlagEnabled;
    templateIdNotification = builder.templateIdNotification;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesAppConfigurationAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

