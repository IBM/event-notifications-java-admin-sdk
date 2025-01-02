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
 * The updateSmtpUser options.
 */
public class UpdateSmtpUserOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String userId;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String userId;
    private String description;

    /**
     * Instantiates a new Builder from an existing UpdateSmtpUserOptions instance.
     *
     * @param updateSmtpUserOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSmtpUserOptions updateSmtpUserOptions) {
      this.instanceId = updateSmtpUserOptions.instanceId;
      this.id = updateSmtpUserOptions.id;
      this.userId = updateSmtpUserOptions.userId;
      this.description = updateSmtpUserOptions.description;
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
     * @param userId the userId
     */
    public Builder(String instanceId, String id, String userId) {
      this.instanceId = instanceId;
      this.id = id;
      this.userId = userId;
    }

    /**
     * Builds a UpdateSmtpUserOptions.
     *
     * @return the new UpdateSmtpUserOptions instance
     */
    public UpdateSmtpUserOptions build() {
      return new UpdateSmtpUserOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateSmtpUserOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSmtpUserOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the userId.
     *
     * @param userId the userId
     * @return the UpdateSmtpUserOptions builder
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateSmtpUserOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected UpdateSmtpUserOptions() { }

  protected UpdateSmtpUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.userId,
      "userId cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    userId = builder.userId;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a UpdateSmtpUserOptions builder
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
   * Gets the userId.
   *
   * UserID.
   *
   * @return the userId
   */
  public String userId() {
    return userId;
  }

  /**
   * Gets the description.
   *
   * SMTP user description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

