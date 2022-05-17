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
 * The attributes for a slack notification.
 */
public class SubscriptionCreateAttributesSlackAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private String attachmentColor;

    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesSlackAttributes) {
      this.attachmentColor = subscriptionCreateAttributesSlackAttributes.attachmentColor;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attachmentColor the attachmentColor
     */
    public Builder(String attachmentColor) {
      this.attachmentColor = attachmentColor;
    }

    /**
     * Builds a SubscriptionCreateAttributesSlackAttributes.
     *
     * @return the new SubscriptionCreateAttributesSlackAttributes instance
     */
    public SubscriptionCreateAttributesSlackAttributes build() {
      return new SubscriptionCreateAttributesSlackAttributes(this);
    }

    /**
     * Set the attachmentColor.
     *
     * @param attachmentColor the attachmentColor
     * @return the SubscriptionCreateAttributesSlackAttributes builder
     */
    public Builder attachmentColor(String attachmentColor) {
      this.attachmentColor = attachmentColor;
      return this;
    }
  }

  protected SubscriptionCreateAttributesSlackAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attachmentColor,
      "attachmentColor cannot be null");
    attachmentColor = builder.attachmentColor;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesSlackAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

