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
 * Payload describing a Firefox destination configuration.
 */
public class DestinationConfigParamsFirefoxDestinationConfig extends DestinationConfigParams {


  /**
   * Builder.
   */
  public static class Builder {
    private String websiteUrl;
    private String publicKey;
    private Boolean preProd;

    public Builder(DestinationConfigParams destinationConfigParamsFirefoxDestinationConfig) {
      this.websiteUrl = destinationConfigParamsFirefoxDestinationConfig.websiteUrl;
      this.publicKey = destinationConfigParamsFirefoxDestinationConfig.publicKey;
      this.preProd = destinationConfigParamsFirefoxDestinationConfig.preProd;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param websiteUrl the websiteUrl
     */
    public Builder(String websiteUrl) {
      this.websiteUrl = websiteUrl;
    }

    /**
     * Builds a DestinationConfigParamsFirefoxDestinationConfig.
     *
     * @return the new DestinationConfigParamsFirefoxDestinationConfig instance
     */
    public DestinationConfigParamsFirefoxDestinationConfig build() {
      return new DestinationConfigParamsFirefoxDestinationConfig(this);
    }

    /**
     * Set the websiteUrl.
     *
     * @param websiteUrl the websiteUrl
     * @return the DestinationConfigParamsFirefoxDestinationConfig builder
     */
    public Builder websiteUrl(String websiteUrl) {
      this.websiteUrl = websiteUrl;
      return this;
    }

    /**
     * Set the publicKey.
     *
     * @param publicKey the publicKey
     * @return the DestinationConfigParamsFirefoxDestinationConfig builder
     */
    public Builder publicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigParamsFirefoxDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }
  }

  protected DestinationConfigParamsFirefoxDestinationConfig() { }

  protected DestinationConfigParamsFirefoxDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.websiteUrl,
      "websiteUrl cannot be null");
    websiteUrl = builder.websiteUrl;
    publicKey = builder.publicKey;
    preProd = builder.preProd;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigParamsFirefoxDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

