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

import java.util.ArrayList;
import java.util.List;

/**
 * SMS attributes object.
 */
public class SubscriptionUpdateAttributesSMSAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> to;

    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesSmsAttributes) {
      this.to = subscriptionUpdateAttributesSmsAttributes.to;
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
     * Builds a SubscriptionUpdateAttributesSMSAttributes.
     *
     * @return the new SubscriptionUpdateAttributesSMSAttributes instance
     */
    public SubscriptionUpdateAttributesSMSAttributes build() {
      return new SubscriptionUpdateAttributesSMSAttributes(this);
    }

    /**
     * Adds an to to to.
     *
     * @param to the new to
     * @return the SubscriptionUpdateAttributesSMSAttributes builder
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
     * @return the SubscriptionUpdateAttributesSMSAttributes builder
     */
    public Builder to(List<String> to) {
      this.to = to;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesSMSAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.to,
      "to cannot be null");
    to = builder.to;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesSMSAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

