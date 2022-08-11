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
 * Payload describing a FCM destination configuration.
 */
public class DestinationConfigParamsFCMDestinationConfig extends DestinationConfigParams {


  /**
   * Builder.
   */
  public static class Builder {
    private String serverKey;
    private String senderId;
    private Boolean preProd;

    public Builder(DestinationConfigParams destinationConfigParamsFcmDestinationConfig) {
      this.serverKey = destinationConfigParamsFcmDestinationConfig.serverKey;
      this.senderId = destinationConfigParamsFcmDestinationConfig.senderId;
      this.preProd = destinationConfigParamsFcmDestinationConfig.preProd;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param serverKey the serverKey
     * @param senderId the senderId
     */
    public Builder(String serverKey, String senderId) {
      this.serverKey = serverKey;
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
     * Set the serverKey.
     *
     * @param serverKey the serverKey
     * @return the DestinationConfigParamsFCMDestinationConfig builder
     */
    public Builder serverKey(String serverKey) {
      this.serverKey = serverKey;
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

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigParamsFCMDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }
  }

  protected DestinationConfigParamsFCMDestinationConfig() { }

  protected DestinationConfigParamsFCMDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.serverKey,
      "serverKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.senderId,
      "senderId cannot be null");
    serverKey = builder.serverKey;
    senderId = builder.senderId;
    preProd = builder.preProd;
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

