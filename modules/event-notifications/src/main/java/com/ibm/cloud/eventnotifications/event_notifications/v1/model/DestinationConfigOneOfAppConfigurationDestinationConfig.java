/*
 * (C) Copyright IBM Corp. 2025.
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
 * Payload describing a App Configuration destination configuration.
 */
public class DestinationConfigOneOfAppConfigurationDestinationConfig extends DestinationConfigOneOf {

  /**
   * The App Configuration Destination type.
   */
  public interface Type {
    /** features. */
    String FEATURES = "features";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String crn;
    private String environmentId;
    private String featureId;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfAppConfigurationDestinationConfig instance.
     *
     * @param destinationConfigOneOfAppConfigurationDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfAppConfigurationDestinationConfig) {
      this.type = destinationConfigOneOfAppConfigurationDestinationConfig.type;
      this.crn = destinationConfigOneOfAppConfigurationDestinationConfig.crn;
      this.environmentId = destinationConfigOneOfAppConfigurationDestinationConfig.environmentId;
      this.featureId = destinationConfigOneOfAppConfigurationDestinationConfig.featureId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param crn the crn
     * @param environmentId the environmentId
     * @param featureId the featureId
     */
    public Builder(String type, String crn, String environmentId, String featureId) {
      this.type = type;
      this.crn = crn;
      this.environmentId = environmentId;
      this.featureId = featureId;
    }

    /**
     * Builds a DestinationConfigOneOfAppConfigurationDestinationConfig.
     *
     * @return the new DestinationConfigOneOfAppConfigurationDestinationConfig instance
     */
    public DestinationConfigOneOfAppConfigurationDestinationConfig build() {
      return new DestinationConfigOneOfAppConfigurationDestinationConfig(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DestinationConfigOneOfAppConfigurationDestinationConfig builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the DestinationConfigOneOfAppConfigurationDestinationConfig builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the environmentId.
     *
     * @param environmentId the environmentId
     * @return the DestinationConfigOneOfAppConfigurationDestinationConfig builder
     */
    public Builder environmentId(String environmentId) {
      this.environmentId = environmentId;
      return this;
    }

    /**
     * Set the featureId.
     *
     * @param featureId the featureId
     * @return the DestinationConfigOneOfAppConfigurationDestinationConfig builder
     */
    public Builder featureId(String featureId) {
      this.featureId = featureId;
      return this;
    }
  }

  protected DestinationConfigOneOfAppConfigurationDestinationConfig() { }

  protected DestinationConfigOneOfAppConfigurationDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.environmentId,
      "environmentId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.featureId,
      "featureId cannot be null");
    type = builder.type;
    crn = builder.crn;
    environmentId = builder.environmentId;
    featureId = builder.featureId;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfAppConfigurationDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

