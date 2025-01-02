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
 * The deleteSmtpUser options.
 */
public class DeleteSmtpUserOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String userId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String userId;

    /**
     * Instantiates a new Builder from an existing DeleteSmtpUserOptions instance.
     *
     * @param deleteSmtpUserOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSmtpUserOptions deleteSmtpUserOptions) {
      this.instanceId = deleteSmtpUserOptions.instanceId;
      this.id = deleteSmtpUserOptions.id;
      this.userId = deleteSmtpUserOptions.userId;
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
     * Builds a DeleteSmtpUserOptions.
     *
     * @return the new DeleteSmtpUserOptions instance
     */
    public DeleteSmtpUserOptions build() {
      return new DeleteSmtpUserOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteSmtpUserOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSmtpUserOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the userId.
     *
     * @param userId the userId
     * @return the DeleteSmtpUserOptions builder
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }
  }

  protected DeleteSmtpUserOptions() { }

  protected DeleteSmtpUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.userId,
      "userId cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    userId = builder.userId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSmtpUserOptions builder
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
}

