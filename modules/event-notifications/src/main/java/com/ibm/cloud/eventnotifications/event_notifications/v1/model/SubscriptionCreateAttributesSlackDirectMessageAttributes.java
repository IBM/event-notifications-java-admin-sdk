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

import java.util.ArrayList;
import java.util.List;

/**
 * The attributes for a slack direct message.
 */
public class SubscriptionCreateAttributesSlackDirectMessageAttributes extends SubscriptionCreateAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private List<ChannelCreateAttributes> channels;
    private String templateIdNotification;

    /**
     * Instantiates a new Builder from an existing SubscriptionCreateAttributesSlackDirectMessageAttributes instance.
     *
     * @param subscriptionCreateAttributesSlackDirectMessageAttributes the instance to initialize the Builder with
     */
    public Builder(SubscriptionCreateAttributes subscriptionCreateAttributesSlackDirectMessageAttributes) {
      this.channels = subscriptionCreateAttributesSlackDirectMessageAttributes.channels;
      this.templateIdNotification = subscriptionCreateAttributesSlackDirectMessageAttributes.templateIdNotification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubscriptionCreateAttributesSlackDirectMessageAttributes.
     *
     * @return the new SubscriptionCreateAttributesSlackDirectMessageAttributes instance
     */
    public SubscriptionCreateAttributesSlackDirectMessageAttributes build() {
      return new SubscriptionCreateAttributesSlackDirectMessageAttributes(this);
    }

    /**
     * Adds an channels to channels.
     *
     * @param channels the new channels
     * @return the SubscriptionCreateAttributesSlackDirectMessageAttributes builder
     */
    public Builder addChannels(ChannelCreateAttributes channels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(channels,
        "channels cannot be null");
      if (this.channels == null) {
        this.channels = new ArrayList<ChannelCreateAttributes>();
      }
      this.channels.add(channels);
      return this;
    }

    /**
     * Set the channels.
     * Existing channels will be replaced.
     *
     * @param channels the channels
     * @return the SubscriptionCreateAttributesSlackDirectMessageAttributes builder
     */
    public Builder channels(List<ChannelCreateAttributes> channels) {
      this.channels = channels;
      return this;
    }

    /**
     * Set the templateIdNotification.
     *
     * @param templateIdNotification the templateIdNotification
     * @return the SubscriptionCreateAttributesSlackDirectMessageAttributes builder
     */
    public Builder templateIdNotification(String templateIdNotification) {
      this.templateIdNotification = templateIdNotification;
      return this;
    }
  }

  protected SubscriptionCreateAttributesSlackDirectMessageAttributes() { }

  protected SubscriptionCreateAttributesSlackDirectMessageAttributes(Builder builder) {
    channels = builder.channels;
    templateIdNotification = builder.templateIdNotification;
  }

  /**
   * New builder.
   *
   * @return a SubscriptionCreateAttributesSlackDirectMessageAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

