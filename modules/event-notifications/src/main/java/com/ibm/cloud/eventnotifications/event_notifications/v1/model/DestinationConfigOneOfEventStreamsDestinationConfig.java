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
 * Payload describing a Event Streams destination configuration.
 */
public class DestinationConfigOneOfEventStreamsDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String endpoint;
    private String topic;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfEventStreamsDestinationConfig instance.
     *
     * @param destinationConfigOneOfEventStreamsDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfEventStreamsDestinationConfig) {
      this.crn = destinationConfigOneOfEventStreamsDestinationConfig.crn;
      this.endpoint = destinationConfigOneOfEventStreamsDestinationConfig.endpoint;
      this.topic = destinationConfigOneOfEventStreamsDestinationConfig.topic;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param endpoint the endpoint
     * @param topic the topic
     */
    public Builder(String crn, String endpoint, String topic) {
      this.crn = crn;
      this.endpoint = endpoint;
      this.topic = topic;
    }

    /**
     * Builds a DestinationConfigOneOfEventStreamsDestinationConfig.
     *
     * @return the new DestinationConfigOneOfEventStreamsDestinationConfig instance
     */
    public DestinationConfigOneOfEventStreamsDestinationConfig build() {
      return new DestinationConfigOneOfEventStreamsDestinationConfig(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the DestinationConfigOneOfEventStreamsDestinationConfig builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the DestinationConfigOneOfEventStreamsDestinationConfig builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the topic.
     *
     * @param topic the topic
     * @return the DestinationConfigOneOfEventStreamsDestinationConfig builder
     */
    public Builder topic(String topic) {
      this.topic = topic;
      return this;
    }
  }

  protected DestinationConfigOneOfEventStreamsDestinationConfig() { }

  protected DestinationConfigOneOfEventStreamsDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpoint,
      "endpoint cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.topic,
      "topic cannot be null");
    crn = builder.crn;
    endpoint = builder.endpoint;
    topic = builder.topic;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfEventStreamsDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

