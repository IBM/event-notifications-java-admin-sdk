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
 * The createSmtpUser options.
 */
public class CreateSmtpUserOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateSmtpUserOptions instance.
     *
     * @param createSmtpUserOptions the instance to initialize the Builder with
     */
    private Builder(CreateSmtpUserOptions createSmtpUserOptions) {
      this.instanceId = createSmtpUserOptions.instanceId;
      this.id = createSmtpUserOptions.id;
      this.description = createSmtpUserOptions.description;
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
     * Builds a CreateSmtpUserOptions.
     *
     * @return the new CreateSmtpUserOptions instance
     */
    public CreateSmtpUserOptions build() {
      return new CreateSmtpUserOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateSmtpUserOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateSmtpUserOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateSmtpUserOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateSmtpUserOptions() { }

  protected CreateSmtpUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateSmtpUserOptions builder
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

