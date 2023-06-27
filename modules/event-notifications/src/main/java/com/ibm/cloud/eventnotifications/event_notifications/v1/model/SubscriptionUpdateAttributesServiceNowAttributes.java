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
 * The attributes for a ServiceNow notification.
 */
public class SubscriptionUpdateAttributesServiceNowAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private String assignedTo;
    private String assignmentGroup;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesServiceNowAttributes instance.
     *
     * @param subscriptionUpdateAttributesServiceNowAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesServiceNowAttributes) {
      this.assignedTo = subscriptionUpdateAttributesServiceNowAttributes.assignedTo;
      this.assignmentGroup = subscriptionUpdateAttributesServiceNowAttributes.assignmentGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionUpdateAttributesServiceNowAttributes.
     *
     * @return the new SubscriptionUpdateAttributesServiceNowAttributes instance
     */
    public SubscriptionUpdateAttributesServiceNowAttributes build() {
      return new SubscriptionUpdateAttributesServiceNowAttributes(this);
    }

    /**
     * Set the assignedTo.
     *
     * @param assignedTo the assignedTo
     * @return the SubscriptionUpdateAttributesServiceNowAttributes builder
     */
    public Builder assignedTo(String assignedTo) {
      this.assignedTo = assignedTo;
      return this;
    }

    /**
     * Set the assignmentGroup.
     *
     * @param assignmentGroup the assignmentGroup
     * @return the SubscriptionUpdateAttributesServiceNowAttributes builder
     */
    public Builder assignmentGroup(String assignmentGroup) {
      this.assignmentGroup = assignmentGroup;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesServiceNowAttributes() { }

  protected SubscriptionUpdateAttributesServiceNowAttributes(Builder builder) {
    assignedTo = builder.assignedTo;
    assignmentGroup = builder.assignmentGroup;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesServiceNowAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

