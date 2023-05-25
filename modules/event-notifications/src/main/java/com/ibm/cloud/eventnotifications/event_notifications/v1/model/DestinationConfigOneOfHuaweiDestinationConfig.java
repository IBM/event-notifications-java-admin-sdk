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
 * Payload describing a Huawei destination configuration.
 */
public class DestinationConfigOneOfHuaweiDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String clientId;
    private String clientSecret;
    private Boolean preProd;

    public Builder(DestinationConfigOneOf destinationConfigOneOfHuaweiDestinationConfig) {
      this.clientId = destinationConfigOneOfHuaweiDestinationConfig.clientId;
      this.clientSecret = destinationConfigOneOfHuaweiDestinationConfig.clientSecret;
      this.preProd = destinationConfigOneOfHuaweiDestinationConfig.preProd;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clientId the clientId
     * @param clientSecret the clientSecret
     */
    public Builder(String clientId, String clientSecret) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
    }

    /**
     * Builds a DestinationConfigOneOfHuaweiDestinationConfig.
     *
     * @return the new DestinationConfigOneOfHuaweiDestinationConfig instance
     */
    public DestinationConfigOneOfHuaweiDestinationConfig build() {
      return new DestinationConfigOneOfHuaweiDestinationConfig(this);
    }

    /**
     * Set the clientId.
     *
     * @param clientId the clientId
     * @return the DestinationConfigOneOfHuaweiDestinationConfig builder
     */
    public Builder clientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    /**
     * Set the clientSecret.
     *
     * @param clientSecret the clientSecret
     * @return the DestinationConfigOneOfHuaweiDestinationConfig builder
     */
    public Builder clientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigOneOfHuaweiDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }
  }

  protected DestinationConfigOneOfHuaweiDestinationConfig() { }

  protected DestinationConfigOneOfHuaweiDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientId,
      "clientId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientSecret,
      "clientSecret cannot be null");
    clientId = builder.clientId;
    clientSecret = builder.clientSecret;
    preProd = builder.preProd;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfHuaweiDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

