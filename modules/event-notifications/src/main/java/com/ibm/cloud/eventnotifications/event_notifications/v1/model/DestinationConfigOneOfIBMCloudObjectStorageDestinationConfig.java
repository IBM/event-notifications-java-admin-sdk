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
 * Payload describing a Cloud Object Storage destination configuration.
 */
public class DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String bucketName;
    private String instanceId;
    private String endpoint;

    public Builder(DestinationConfigOneOf destinationConfigOneOfIbmCloudObjectStorageDestinationConfig) {
      this.bucketName = destinationConfigOneOfIbmCloudObjectStorageDestinationConfig.bucketName;
      this.instanceId = destinationConfigOneOfIbmCloudObjectStorageDestinationConfig.instanceId;
      this.endpoint = destinationConfigOneOfIbmCloudObjectStorageDestinationConfig.endpoint;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketName the bucketName
     * @param instanceId the instanceId
     * @param endpoint the endpoint
     */
    public Builder(String bucketName, String instanceId, String endpoint) {
      this.bucketName = bucketName;
      this.instanceId = instanceId;
      this.endpoint = endpoint;
    }

    /**
     * Builds a DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig.
     *
     * @return the new DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig instance
     */
    public DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig build() {
      return new DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig(this);
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }
  }

  protected DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig() { }

  protected DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceId,
      "instanceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpoint,
      "endpoint cannot be null");
    bucketName = builder.bucketName;
    instanceId = builder.instanceId;
    endpoint = builder.endpoint;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

