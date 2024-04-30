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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSmtpConfiguration options.
 */
public class CreateSmtpConfigurationOptions extends GenericModel {

  protected String instanceId;
  protected String name;
  protected String domain;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String domain;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateSmtpConfigurationOptions instance.
     *
     * @param createSmtpConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(CreateSmtpConfigurationOptions createSmtpConfigurationOptions) {
      this.instanceId = createSmtpConfigurationOptions.instanceId;
      this.name = createSmtpConfigurationOptions.name;
      this.domain = createSmtpConfigurationOptions.domain;
      this.description = createSmtpConfigurationOptions.description;
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
     * @param name the name
     * @param domain the domain
     */
    public Builder(String instanceId, String name, String domain) {
      this.instanceId = instanceId;
      this.name = name;
      this.domain = domain;
    }

    /**
     * Builds a CreateSmtpConfigurationOptions.
     *
     * @return the new CreateSmtpConfigurationOptions instance
     */
    public CreateSmtpConfigurationOptions build() {
      return new CreateSmtpConfigurationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateSmtpConfigurationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSmtpConfigurationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the CreateSmtpConfigurationOptions builder
     */
    public Builder domain(String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateSmtpConfigurationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateSmtpConfigurationOptions() { }

  protected CreateSmtpConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.domain,
      "domain cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    domain = builder.domain;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateSmtpConfigurationOptions builder
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
   * Gets the name.
   *
   * The name of SMTP configuration.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the domain.
   *
   * Domain Name.
   *
   * @return the domain
   */
  public String domain() {
    return domain;
  }

  /**
   * Gets the description.
   *
   * The description of SMTP configuration.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

