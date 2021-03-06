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
 * Payload describing a IOS destination configuration.
 */
public class DestinationConfigParamsIOSDestinationConfig extends DestinationConfigParams {


  /**
   * Builder.
   */
  public static class Builder {
    private String certType;
    private Boolean isSandbox;
    private String password;
    private String keyId;
    private String teamId;
    private String bundleId;

    public Builder(DestinationConfigParams destinationConfigParamsIosDestinationConfig) {
      this.certType = destinationConfigParamsIosDestinationConfig.certType;
      this.isSandbox = destinationConfigParamsIosDestinationConfig.isSandbox;
      this.password = destinationConfigParamsIosDestinationConfig.password;
      this.keyId = destinationConfigParamsIosDestinationConfig.keyId;
      this.teamId = destinationConfigParamsIosDestinationConfig.teamId;
      this.bundleId = destinationConfigParamsIosDestinationConfig.bundleId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certType the certType
     * @param isSandbox the isSandbox
     */
    public Builder(String certType, Boolean isSandbox) {
      this.certType = certType;
      this.isSandbox = isSandbox;
    }

    /**
     * Builds a DestinationConfigParamsIOSDestinationConfig.
     *
     * @return the new DestinationConfigParamsIOSDestinationConfig instance
     */
    public DestinationConfigParamsIOSDestinationConfig build() {
      return new DestinationConfigParamsIOSDestinationConfig(this);
    }

    /**
     * Set the certType.
     *
     * @param certType the certType
     * @return the DestinationConfigParamsIOSDestinationConfig builder
     */
    public Builder certType(String certType) {
      this.certType = certType;
      return this;
    }

    /**
     * Set the isSandbox.
     *
     * @param isSandbox the isSandbox
     * @return the DestinationConfigParamsIOSDestinationConfig builder
     */
    public Builder isSandbox(Boolean isSandbox) {
      this.isSandbox = isSandbox;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the DestinationConfigParamsIOSDestinationConfig builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the keyId.
     *
     * @param keyId the keyId
     * @return the DestinationConfigParamsIOSDestinationConfig builder
     */
    public Builder keyId(String keyId) {
      this.keyId = keyId;
      return this;
    }

    /**
     * Set the teamId.
     *
     * @param teamId the teamId
     * @return the DestinationConfigParamsIOSDestinationConfig builder
     */
    public Builder teamId(String teamId) {
      this.teamId = teamId;
      return this;
    }

    /**
     * Set the bundleId.
     *
     * @param bundleId the bundleId
     * @return the DestinationConfigParamsIOSDestinationConfig builder
     */
    public Builder bundleId(String bundleId) {
      this.bundleId = bundleId;
      return this;
    }
  }

  protected DestinationConfigParamsIOSDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certType,
      "certType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.isSandbox,
      "isSandbox cannot be null");
    certType = builder.certType;
    isSandbox = builder.isSandbox;
    password = builder.password;
    keyId = builder.keyId;
    teamId = builder.teamId;
    bundleId = builder.bundleId;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigParamsIOSDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

