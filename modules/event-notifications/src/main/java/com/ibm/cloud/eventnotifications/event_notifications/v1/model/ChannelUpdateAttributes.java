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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a Slack Direct Message chennel configuration.
 */
public class ChannelUpdateAttributes extends GenericModel {

  /**
   * The channel operation type.
   */
  public interface Operation {
    /** add. */
    String ADD = "add";
    /** remove. */
    String REMOVE = "remove";
  }

  protected String id;
  protected String operation;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String operation;

    /**
     * Instantiates a new Builder from an existing ChannelUpdateAttributes instance.
     *
     * @param channelUpdateAttributes the instance to initialize the Builder with
     */
    private Builder(ChannelUpdateAttributes channelUpdateAttributes) {
      this.id = channelUpdateAttributes.id;
      this.operation = channelUpdateAttributes.operation;
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
     * @param operation the operation
     */
    public Builder(String id, String operation) {
      this.id = id;
      this.operation = operation;
    }

    /**
     * Builds a ChannelUpdateAttributes.
     *
     * @return the new ChannelUpdateAttributes instance
     */
    public ChannelUpdateAttributes build() {
      return new ChannelUpdateAttributes(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ChannelUpdateAttributes builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the ChannelUpdateAttributes builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }
  }

  protected ChannelUpdateAttributes() { }

  protected ChannelUpdateAttributes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operation,
      "operation cannot be null");
    id = builder.id;
    operation = builder.operation;
  }

  /**
   * New builder.
   *
   * @return a ChannelUpdateAttributes builder
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

  /**
   * Gets the operation.
   *
   * The channel operation type.
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }
}

