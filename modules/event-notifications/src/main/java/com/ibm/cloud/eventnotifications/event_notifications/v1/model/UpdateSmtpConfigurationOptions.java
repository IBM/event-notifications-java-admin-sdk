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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSmtpConfiguration options.
 */
public class UpdateSmtpConfigurationOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String name;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String name;
    private String description;

    /**
     * Instantiates a new Builder from an existing UpdateSmtpConfigurationOptions instance.
     *
     * @param updateSmtpConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSmtpConfigurationOptions updateSmtpConfigurationOptions) {
      this.instanceId = updateSmtpConfigurationOptions.instanceId;
      this.id = updateSmtpConfigurationOptions.id;
      this.name = updateSmtpConfigurationOptions.name;
      this.description = updateSmtpConfigurationOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param id the id
     */
    public Builder(String instanceId, String id) {
      this.instanceId = instanceId;
      this.id = id;
    }

    /**
     * Builds a UpdateSmtpConfigurationOptions.
     *
     * @return the new UpdateSmtpConfigurationOptions instance
     */
    public UpdateSmtpConfigurationOptions build() {
      return new UpdateSmtpConfigurationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateSmtpConfigurationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSmtpConfigurationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateSmtpConfigurationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateSmtpConfigurationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected UpdateSmtpConfigurationOptions() { }

  protected UpdateSmtpConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    name = builder.name;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a UpdateSmtpConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * Unique identifier for IBM Cloud Event Notifications instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * Unique identifier for SMTP.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * SMTP name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * SMTP description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

