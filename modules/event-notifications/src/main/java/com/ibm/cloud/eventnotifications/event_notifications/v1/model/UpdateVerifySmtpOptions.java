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
 * The updateVerifySmtp options.
 */
public class UpdateVerifySmtpOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String type;

    /**
     * Instantiates a new Builder from an existing UpdateVerifySmtpOptions instance.
     *
     * @param updateVerifySmtpOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVerifySmtpOptions updateVerifySmtpOptions) {
      this.instanceId = updateVerifySmtpOptions.instanceId;
      this.id = updateVerifySmtpOptions.id;
      this.type = updateVerifySmtpOptions.type;
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
     * @param type the type
     */
    public Builder(String instanceId, String id, String type) {
      this.instanceId = instanceId;
      this.id = id;
      this.type = type;
    }

    /**
     * Builds a UpdateVerifySmtpOptions.
     *
     * @return the new UpdateVerifySmtpOptions instance
     */
    public UpdateVerifySmtpOptions build() {
      return new UpdateVerifySmtpOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateVerifySmtpOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVerifySmtpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateVerifySmtpOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected UpdateVerifySmtpOptions() { }

  protected UpdateVerifySmtpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a UpdateVerifySmtpOptions builder
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
   * Gets the type.
   *
   * SMTP verification type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

