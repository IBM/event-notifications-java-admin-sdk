/*
 * (C) Copyright IBM Corp. 2022.
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
public class DestinationConfigParamsChromeDestinationConfig extends DestinationConfigParams {


  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String websiteUrl;
    private String publicKey;
    private Boolean preProd;

    public Builder(DestinationConfigParams destinationConfigParamsChromeDestinationConfig) {
      this.apiKey = destinationConfigParamsChromeDestinationConfig.apiKey;
      this.websiteUrl = destinationConfigParamsChromeDestinationConfig.websiteUrl;
      this.publicKey = destinationConfigParamsChromeDestinationConfig.publicKey;
      this.preProd = destinationConfigParamsChromeDestinationConfig.preProd;
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
     * Builds a DestinationConfigParamsChromeDestinationConfig.
     *
     * @return the new DestinationConfigParamsChromeDestinationConfig instance
     */
    public DestinationConfigParamsChromeDestinationConfig build() {
      return new DestinationConfigParamsChromeDestinationConfig(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the DestinationConfigParamsChromeDestinationConfig builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the websiteUrl.
     *
     * @param websiteUrl the websiteUrl
     * @return the DestinationConfigParamsChromeDestinationConfig builder
     */
    public Builder websiteUrl(String websiteUrl) {
      this.websiteUrl = websiteUrl;
      return this;
    }

    /**
     * Set the publicKey.
     *
     * @param publicKey the publicKey
     * @return the DestinationConfigParamsChromeDestinationConfig builder
     */
    public Builder publicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigParamsChromeDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }
  }

  protected DestinationConfigParamsChromeDestinationConfig() { }

  protected DestinationConfigParamsChromeDestinationConfig(Builder builder) {
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
   * @return a DestinationConfigParamsChromeDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

