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
public class SubscriptionCreateAttributesAppConfigurationAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean featureFlagEnabled;
    private String templateIdNotification;

    /**
     * Instantiates a new Builder from an existing SubscriptionCreateAttributesAppConfigurationAttributes instance.
     *
     * @param subscriptionCreateAttributesAppConfigurationAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesAppConfigurationAttributes) {
      this.featureFlagEnabled = subscriptionCreateAttributesAppConfigurationAttributes.featureFlagEnabled;
      this.templateIdNotification = subscriptionCreateAttributesAppConfigurationAttributes.templateIdNotification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionCreateAttributesAppConfigurationAttributes.
     *
     * @return the new SubscriptionCreateAttributesAppConfigurationAttributes instance
     */
    public SubscriptionCreateAttributesAppConfigurationAttributes build() {
      return new SubscriptionCreateAttributesAppConfigurationAttributes(this);
    }

    /**
     * Set the featureFlagEnabled.
     *
     * @param featureFlagEnabled the featureFlagEnabled
     * @return the SubscriptionCreateAttributesAppConfigurationAttributes builder
     */
    public Builder featureFlagEnabled(Boolean featureFlagEnabled) {
      this.featureFlagEnabled = featureFlagEnabled;
      return this;
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionCreateAttributesAppConfigurationAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }
  }

  protected SubscriptionCreateAttributesAppConfigurationAttributes() { }

  protected SubscriptionCreateAttributesAppConfigurationAttributes(Builder builder) {
    featureFlagEnabled = builder.featureFlagEnabled;
    templateIdNotification = builder.templateIdNotification;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesAppConfigurationAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

