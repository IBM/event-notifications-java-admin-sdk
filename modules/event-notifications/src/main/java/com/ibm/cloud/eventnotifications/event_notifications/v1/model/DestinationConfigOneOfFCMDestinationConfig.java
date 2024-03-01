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
 * Payload describing an FCM destination configuration. project_id, private_key and client_email for FCM HTTP v1 APIs.
 */
public class DestinationConfigOneOfFCMDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String serverKey;
    private String senderId;
    private Boolean preProd;
    private String projectId;
    private String privateKey;
    private String clientEmail;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfFCMDestinationConfig instance.
     *
     * @param destinationConfigOneOfFcmDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfFcmDestinationConfig) {
      this.serverKey = destinationConfigOneOfFcmDestinationConfig.serverKey;
      this.senderId = destinationConfigOneOfFcmDestinationConfig.senderId;
      this.preProd = destinationConfigOneOfFcmDestinationConfig.preProd;
      this.projectId = destinationConfigOneOfFcmDestinationConfig.projectId;
      this.privateKey = destinationConfigOneOfFcmDestinationConfig.privateKey;
      this.clientEmail = destinationConfigOneOfFcmDestinationConfig.clientEmail;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DestinationConfigOneOfFCMDestinationConfig.
     *
     * @return the new DestinationConfigOneOfFCMDestinationConfig instance
     */
    public DestinationConfigOneOfFCMDestinationConfig build() {
      return new DestinationConfigOneOfFCMDestinationConfig(this);
    }

    /**
     * Set the serverKey.
     *
     * @param serverKey the serverKey
     * @return the DestinationConfigOneOfFCMDestinationConfig builder
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder serverKey(String serverKey) {
      this.serverKey = serverKey;
      return this;
    }

    /**
     * Set the senderId.
     *
     * @param senderId the senderId
     * @return the DestinationConfigOneOfFCMDestinationConfig builder
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder senderId(String senderId) {
      this.senderId = senderId;
      return this;
    }

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigOneOfFCMDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the DestinationConfigOneOfFCMDestinationConfig builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the privateKey.
     *
     * @param privateKey the privateKey
     * @return the DestinationConfigOneOfFCMDestinationConfig builder
     */
    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * Set the clientEmail.
     *
     * @param clientEmail the clientEmail
     * @return the DestinationConfigOneOfFCMDestinationConfig builder
     */
    public Builder clientEmail(String clientEmail) {
      this.clientEmail = clientEmail;
      return this;
    }
  }

  protected DestinationConfigOneOfFCMDestinationConfig() { }

  protected DestinationConfigOneOfFCMDestinationConfig(Builder builder) {
    serverKey = builder.serverKey;
    senderId = builder.senderId;
    preProd = builder.preProd;
    projectId = builder.projectId;
    privateKey = builder.privateKey;
    clientEmail = builder.clientEmail;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfFCMDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

