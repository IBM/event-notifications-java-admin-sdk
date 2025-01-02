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
 * Payload describing a Chrome destination configuration.
 */
public class DestinationConfigOneOfChromeDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String websiteUrl;
    private String publicKey;
    private Boolean preProd;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfChromeDestinationConfig instance.
     *
     * @param destinationConfigOneOfChromeDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfChromeDestinationConfig) {
      this.apiKey = destinationConfigOneOfChromeDestinationConfig.apiKey;
      this.websiteUrl = destinationConfigOneOfChromeDestinationConfig.websiteUrl;
      this.publicKey = destinationConfigOneOfChromeDestinationConfig.publicKey;
      this.preProd = destinationConfigOneOfChromeDestinationConfig.preProd;
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
     * @param websiteUrl the websiteUrl
     */
    public Builder(String apiKey, String websiteUrl) {
      this.apiKey = apiKey;
      this.websiteUrl = websiteUrl;
    }

    /**
     * Builds a DestinationConfigOneOfChromeDestinationConfig.
     *
     * @return the new DestinationConfigOneOfChromeDestinationConfig instance
     */
    public DestinationConfigOneOfChromeDestinationConfig build() {
      return new DestinationConfigOneOfChromeDestinationConfig(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the DestinationConfigOneOfChromeDestinationConfig builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the websiteUrl.
     *
     * @param websiteUrl the websiteUrl
     * @return the DestinationConfigOneOfChromeDestinationConfig builder
     */
    public Builder websiteUrl(String websiteUrl) {
      this.websiteUrl = websiteUrl;
      return this;
    }

    /**
     * Set the publicKey.
     *
     * @param publicKey the publicKey
     * @return the DestinationConfigOneOfChromeDestinationConfig builder
     */
    public Builder publicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigOneOfChromeDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }
  }

  protected DestinationConfigOneOfChromeDestinationConfig() { }

  protected DestinationConfigOneOfChromeDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiKey,
      "apiKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.websiteUrl,
      "websiteUrl cannot be null");
    apiKey = builder.apiKey;
    websiteUrl = builder.websiteUrl;
    publicKey = builder.publicKey;
    preProd = builder.preProd;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfChromeDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

