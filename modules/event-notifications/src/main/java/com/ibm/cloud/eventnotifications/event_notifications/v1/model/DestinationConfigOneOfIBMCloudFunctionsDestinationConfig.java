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

/**
 * Payload describing an IBM Cloud Functions destination configuration.
 */
public class DestinationConfigOneOfIBMCloudFunctionsDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String url;
    private String apiKey;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfIBMCloudFunctionsDestinationConfig instance.
     *
     * @param destinationConfigOneOfIbmCloudFunctionsDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfIbmCloudFunctionsDestinationConfig) {
      this.url = destinationConfigOneOfIbmCloudFunctionsDestinationConfig.url;
      this.apiKey = destinationConfigOneOfIbmCloudFunctionsDestinationConfig.apiKey;
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
     */
    public Builder(String url) {
      this.url = url;
    }

    /**
     * Builds a DestinationConfigOneOfIBMCloudFunctionsDestinationConfig.
     *
     * @return the new DestinationConfigOneOfIBMCloudFunctionsDestinationConfig instance
     */
    public DestinationConfigOneOfIBMCloudFunctionsDestinationConfig build() {
      return new DestinationConfigOneOfIBMCloudFunctionsDestinationConfig(this);
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the DestinationConfigOneOfIBMCloudFunctionsDestinationConfig builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the DestinationConfigOneOfIBMCloudFunctionsDestinationConfig builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }
  }

  protected DestinationConfigOneOfIBMCloudFunctionsDestinationConfig() { }

  protected DestinationConfigOneOfIBMCloudFunctionsDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    url = builder.url;
    apiKey = builder.apiKey;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfIBMCloudFunctionsDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

