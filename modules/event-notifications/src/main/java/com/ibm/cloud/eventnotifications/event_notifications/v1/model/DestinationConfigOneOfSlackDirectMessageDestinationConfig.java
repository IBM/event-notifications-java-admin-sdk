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
 * Payload describing a Slack direct message destination configuration.
 */
public class DestinationConfigOneOfSlackDirectMessageDestinationConfig extends DestinationConfigOneOf {

  /**
   * The Slack Destination type.
   */
  public interface Type {
    /** direct_message. */
    String DIRECT_MESSAGE = "direct_message";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String token;
    private String type;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfSlackDirectMessageDestinationConfig instance.
     *
     * @param destinationConfigOneOfSlackDirectMessageDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfSlackDirectMessageDestinationConfig) {
      this.token = destinationConfigOneOfSlackDirectMessageDestinationConfig.token;
      this.type = destinationConfigOneOfSlackDirectMessageDestinationConfig.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param token the token
     * @param type the type
     */
    public Builder(String token, String type) {
      this.token = token;
      this.type = type;
    }

    /**
     * Builds a DestinationConfigOneOfSlackDirectMessageDestinationConfig.
     *
     * @return the new DestinationConfigOneOfSlackDirectMessageDestinationConfig instance
     */
    public DestinationConfigOneOfSlackDirectMessageDestinationConfig build() {
      return new DestinationConfigOneOfSlackDirectMessageDestinationConfig(this);
    }

    /**
     * Set the token.
     *
     * @param token the token
     * @return the DestinationConfigOneOfSlackDirectMessageDestinationConfig builder
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DestinationConfigOneOfSlackDirectMessageDestinationConfig builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected DestinationConfigOneOfSlackDirectMessageDestinationConfig() { }

  protected DestinationConfigOneOfSlackDirectMessageDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.token,
      "token cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    token = builder.token;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfSlackDirectMessageDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

