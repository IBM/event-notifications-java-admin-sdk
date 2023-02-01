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
 * Payload describing a PagerDuty destination configuration.
 */
public class DestinationConfigOneOfPagerDutyDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String routingKey;

    public Builder(DestinationConfigOneOf destinationConfigOneOfPagerDutyDestinationConfig) {
      this.apiKey = destinationConfigOneOfPagerDutyDestinationConfig.apiKey;
      this.routingKey = destinationConfigOneOfPagerDutyDestinationConfig.routingKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param apiKey the apiKey
     * @param routingKey the routingKey
     */
    public Builder(String apiKey, String routingKey) {
      this.apiKey = apiKey;
      this.routingKey = routingKey;
    }

    /**
     * Builds a DestinationConfigOneOfPagerDutyDestinationConfig.
     *
     * @return the new DestinationConfigOneOfPagerDutyDestinationConfig instance
     */
    public DestinationConfigOneOfPagerDutyDestinationConfig build() {
      return new DestinationConfigOneOfPagerDutyDestinationConfig(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the DestinationConfigOneOfPagerDutyDestinationConfig builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the routingKey.
     *
     * @param routingKey the routingKey
     * @return the DestinationConfigOneOfPagerDutyDestinationConfig builder
     */
    public Builder routingKey(String routingKey) {
      this.routingKey = routingKey;
      return this;
    }
  }

  protected DestinationConfigOneOfPagerDutyDestinationConfig() { }

  protected DestinationConfigOneOfPagerDutyDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiKey,
      "apiKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.routingKey,
      "routingKey cannot be null");
    apiKey = builder.apiKey;
    routingKey = builder.routingKey;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfPagerDutyDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

