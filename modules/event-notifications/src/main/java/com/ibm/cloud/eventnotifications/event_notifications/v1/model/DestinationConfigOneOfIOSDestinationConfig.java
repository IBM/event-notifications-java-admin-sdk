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
 * Payload describing an iOS destination configuration.
 */
public class DestinationConfigOneOfIOSDestinationConfig extends DestinationConfigOneOf {


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
    private Boolean preProd;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfIOSDestinationConfig instance.
     *
     * @param destinationConfigOneOfIosDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfIosDestinationConfig) {
      this.certType = destinationConfigOneOfIosDestinationConfig.certType;
      this.isSandbox = destinationConfigOneOfIosDestinationConfig.isSandbox;
      this.password = destinationConfigOneOfIosDestinationConfig.password;
      this.keyId = destinationConfigOneOfIosDestinationConfig.keyId;
      this.teamId = destinationConfigOneOfIosDestinationConfig.teamId;
      this.bundleId = destinationConfigOneOfIosDestinationConfig.bundleId;
      this.preProd = destinationConfigOneOfIosDestinationConfig.preProd;
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
     * Builds a DestinationConfigOneOfIOSDestinationConfig.
     *
     * @return the new DestinationConfigOneOfIOSDestinationConfig instance
     */
    public DestinationConfigOneOfIOSDestinationConfig build() {
      return new DestinationConfigOneOfIOSDestinationConfig(this);
    }

    /**
     * Set the certType.
     *
     * @param certType the certType
     * @return the DestinationConfigOneOfIOSDestinationConfig builder
     */
    public Builder certType(String certType) {
      this.certType = certType;
      return this;
    }

    /**
     * Set the isSandbox.
     *
     * @param isSandbox the isSandbox
     * @return the DestinationConfigOneOfIOSDestinationConfig builder
     */
    public Builder isSandbox(Boolean isSandbox) {
      this.isSandbox = isSandbox;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the DestinationConfigOneOfIOSDestinationConfig builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the keyId.
     *
     * @param keyId the keyId
     * @return the DestinationConfigOneOfIOSDestinationConfig builder
     */
    public Builder keyId(String keyId) {
      this.keyId = keyId;
      return this;
    }

    /**
     * Set the teamId.
     *
     * @param teamId the teamId
     * @return the DestinationConfigOneOfIOSDestinationConfig builder
     */
    public Builder teamId(String teamId) {
      this.teamId = teamId;
      return this;
    }

    /**
     * Set the bundleId.
     *
     * @param bundleId the bundleId
     * @return the DestinationConfigOneOfIOSDestinationConfig builder
     */
    public Builder bundleId(String bundleId) {
      this.bundleId = bundleId;
      return this;
    }

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigOneOfIOSDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }
  }

  protected DestinationConfigOneOfIOSDestinationConfig() { }

  protected DestinationConfigOneOfIOSDestinationConfig(Builder builder) {
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
    preProd = builder.preProd;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfIOSDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

