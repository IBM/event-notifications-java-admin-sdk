/*
 * (C) Copyright IBM Corp. 2021.
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
 * Payload describing a FCM destination configuration.
 */
public class DestinationConfigParamsFCMDestinationConfig extends DestinationConfigParams {


  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String senderId;

    public Builder(DestinationConfigParams destinationConfigParamsFcmDestinationConfig) {
      this.apiKey = destinationConfigParamsFcmDestinationConfig.apiKey;
      this.senderId = destinationConfigParamsFcmDestinationConfig.senderId;
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
     * @param senderId the senderId
     */
    public Builder(String apiKey, String senderId) {
      this.apiKey = apiKey;
      this.senderId = senderId;
    }

    /**
     * Builds a DestinationConfigParamsFCMDestinationConfig.
     *
     * @return the new DestinationConfigParamsFCMDestinationConfig instance
     */
    public DestinationConfigParamsFCMDestinationConfig build() {
      return new DestinationConfigParamsFCMDestinationConfig(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the DestinationConfigParamsFCMDestinationConfig builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the senderId.
     *
     * @param senderId the senderId
     * @return the DestinationConfigParamsFCMDestinationConfig builder
     */
    public Builder senderId(String senderId) {
      this.senderId = senderId;
      return this;
    }
  }

  protected DestinationConfigParamsFCMDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiKey,
      "apiKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.senderId,
      "senderId cannot be null");
    apiKey = builder.apiKey;
    senderId = builder.senderId;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigParamsFCMDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

