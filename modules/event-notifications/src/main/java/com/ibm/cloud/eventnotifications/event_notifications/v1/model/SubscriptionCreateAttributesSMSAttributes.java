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

import java.util.ArrayList;
import java.util.List;

/**
 * The attributes for an email notification.
 */
public class SubscriptionCreateAttributesSMSAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> to;

    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesSmsAttributes) {
      this.to = subscriptionCreateAttributesSmsAttributes.to;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param to the to
     */
    public Builder(List<String> to) {
      this.to = to;
    }

    /**
     * Builds a SubscriptionCreateAttributesSMSAttributes.
     *
     * @return the new SubscriptionCreateAttributesSMSAttributes instance
     */
    public SubscriptionCreateAttributesSMSAttributes build() {
      return new SubscriptionCreateAttributesSMSAttributes(this);
    }

    /**
     * Adds an to to to.
     *
     * @param to the new to
     * @return the SubscriptionCreateAttributesSMSAttributes builder
     */
    public Builder addTo(String to) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(to,
        "to cannot be null");
      if (this.to == null) {
        this.to = new ArrayList<String>();
      }
      this.to.add(to);
      return this;
    }

    /**
     * Set the to.
     * Existing to will be replaced.
     *
     * @param to the to
     * @return the SubscriptionCreateAttributesSMSAttributes builder
     */
    public Builder to(List<String> to) {
      this.to = to;
      return this;
    }
  }

  protected SubscriptionCreateAttributesSMSAttributes() { }

  protected SubscriptionCreateAttributesSMSAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.to,
      "to cannot be null");
    to = builder.to;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesSMSAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

