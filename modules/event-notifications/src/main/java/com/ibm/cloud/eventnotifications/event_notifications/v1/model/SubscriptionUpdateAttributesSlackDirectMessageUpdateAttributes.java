/*
 * (C) Copyright IBM Corp. 2024.
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
 * The attributes for a slack direct message.
 */
public class SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes extends SubscriptionUpdateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<ChannelUpdateAttributes> channels;
    private String templateIdNotification;

    /**
     * Instantiates a new Builder from an existing SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes instance.
     *
     * @param subscriptionUpdateAttributesSlackDirectMessageUpdateAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionUpdateAttributes subscriptionUpdateAttributesSlackDirectMessageUpdateAttributes) {
      this.channels = subscriptionUpdateAttributesSlackDirectMessageUpdateAttributes.channels;
      this.templateIdNotification = subscriptionUpdateAttributesSlackDirectMessageUpdateAttributes.templateIdNotification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes.
     *
     * @return the new SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes instance
     */
    public SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes build() {
      return new SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes(this);
    }

    /**
     * Adds an channels to channels.
     *
     * @param channels the new channels
     * @return the SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes builder
     */
    public Builder addChannels(ChannelUpdateAttributes channels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(channels,
        "channels cannot be null");
      if (this.channels == null) {
        this.channels = new ArrayList<ChannelUpdateAttributes>();
      }
      this.channels.add(channels);
      return this;
    }

    /**
     * Set the channels.
     * Existing channels will be replaced.
     *
     * @param channels the channels
     * @return the SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes builder
     */
    public Builder channels(List<ChannelUpdateAttributes> channels) {
      this.channels = channels;
      return this;
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }
  }

  protected SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes() { }

  protected SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes(Builder builder) {
    channels = builder.channels;
    templateIdNotification = builder.templateIdNotification;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

