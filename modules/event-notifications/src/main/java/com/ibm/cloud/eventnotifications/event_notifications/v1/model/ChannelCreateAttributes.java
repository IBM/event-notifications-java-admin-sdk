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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a Slack Direct Message chennel configuration.
 */
public class ChannelCreateAttributes extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing ChannelCreateAttributes instance.
     *
     * @param channelCreateAttributes the instance to initialize the Builder with
     */
    private Builder(ChannelCreateAttributes channelCreateAttributes) {
      this.id = channelCreateAttributes.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a ChannelCreateAttributes.
     *
     * @return the new ChannelCreateAttributes instance
     */
    public ChannelCreateAttributes build() {
      return new ChannelCreateAttributes(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ChannelCreateAttributes builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ChannelCreateAttributes() { }

  protected ChannelCreateAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ChannelCreateAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * channel id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

