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
 * Payload describing a ServiceNow destination configuration.
 */
public class DestinationConfigOneOfServiceNowDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String clientId;
    private String clientSecret;
    private String username;
    private String password;
    private String instanceName;

    public Builder(DestinationConfigOneOf destinationConfigOneOfServiceNowDestinationConfig) {
      this.clientId = destinationConfigOneOfServiceNowDestinationConfig.clientId;
      this.clientSecret = destinationConfigOneOfServiceNowDestinationConfig.clientSecret;
      this.username = destinationConfigOneOfServiceNowDestinationConfig.username;
      this.password = destinationConfigOneOfServiceNowDestinationConfig.password;
      this.instanceName = destinationConfigOneOfServiceNowDestinationConfig.instanceName;
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
     * @param username the username
     * @param password the password
     * @param instanceName the instanceName
     */
    public Builder(String clientId, String clientSecret, String username, String password, String instanceName) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
      this.username = username;
      this.password = password;
      this.instanceName = instanceName;
    }

    /**
     * Builds a DestinationConfigOneOfServiceNowDestinationConfig.
     *
     * @return the new DestinationConfigOneOfServiceNowDestinationConfig instance
     */
    public DestinationConfigOneOfServiceNowDestinationConfig build() {
      return new DestinationConfigOneOfServiceNowDestinationConfig(this);
    }

    /**
     * Set the clientId.
     *
     * @param clientId the clientId
     * @return the DestinationConfigOneOfServiceNowDestinationConfig builder
     */
    public Builder clientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    /**
     * Set the clientSecret.
     *
     * @param clientSecret the clientSecret
     * @return the DestinationConfigOneOfServiceNowDestinationConfig builder
     */
    public Builder clientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the DestinationConfigOneOfServiceNowDestinationConfig builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the DestinationConfigOneOfServiceNowDestinationConfig builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the instanceName.
     *
     * @param instanceName the instanceName
     * @return the DestinationConfigOneOfServiceNowDestinationConfig builder
     */
    public Builder instanceName(String instanceName) {
      this.instanceName = instanceName;
      return this;
    }
  }

  protected DestinationConfigOneOfServiceNowDestinationConfig() { }

  protected DestinationConfigOneOfServiceNowDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientId,
      "clientId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientSecret,
      "clientSecret cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceName,
      "instanceName cannot be null");
    clientId = builder.clientId;
    clientSecret = builder.clientSecret;
    username = builder.username;
    password = builder.password;
    instanceName = builder.instanceName;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfServiceNowDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

