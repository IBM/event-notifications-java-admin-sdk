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
 * Payload describing a Slack webhook destination configuration.
 */
public class DestinationConfigOneOfSlackDestinationConfig extends DestinationConfigOneOf {

  /**
   * The Slack Destination type.
   */
  public interface Type {
    /** incoming_webhook. */
    String INCOMING_WEBHOOK = "incoming_webhook";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String url;
    private String type;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfSlackDestinationConfig instance.
     *
     * @param destinationConfigOneOfSlackDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfSlackDestinationConfig) {
      this.url = destinationConfigOneOfSlackDestinationConfig.url;
      this.type = destinationConfigOneOfSlackDestinationConfig.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param url the url
     * @param type the type
     */
    public Builder(String url, String type) {
      this.url = url;
      this.type = type;
    }

    /**
     * Builds a DestinationConfigOneOfSlackDestinationConfig.
     *
     * @return the new DestinationConfigOneOfSlackDestinationConfig instance
     */
    public DestinationConfigOneOfSlackDestinationConfig build() {
      return new DestinationConfigOneOfSlackDestinationConfig(this);
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the DestinationConfigOneOfSlackDestinationConfig builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DestinationConfigOneOfSlackDestinationConfig builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected DestinationConfigOneOfSlackDestinationConfig() { }

  protected DestinationConfigOneOfSlackDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    url = builder.url;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfSlackDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

