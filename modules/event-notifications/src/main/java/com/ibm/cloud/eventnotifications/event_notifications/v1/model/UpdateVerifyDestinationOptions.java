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
 * The updateVerifyDestination options.
 */
public class UpdateVerifyDestinationOptions extends GenericModel {

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
     * Instantiates a new Builder from an existing UpdateVerifyDestinationOptions instance.
     *
     * @param updateVerifyDestinationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVerifyDestinationOptions updateVerifyDestinationOptions) {
      this.instanceId = updateVerifyDestinationOptions.instanceId;
      this.id = updateVerifyDestinationOptions.id;
      this.type = updateVerifyDestinationOptions.type;
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
     * Builds a UpdateVerifyDestinationOptions.
     *
     * @return the new UpdateVerifyDestinationOptions instance
     */
    public UpdateVerifyDestinationOptions build() {
      return new UpdateVerifyDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateVerifyDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVerifyDestinationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateVerifyDestinationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected UpdateVerifyDestinationOptions() { }

  protected UpdateVerifyDestinationOptions(Builder builder) {
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
   * @return a UpdateVerifyDestinationOptions builder
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
   * Unique identifier for Destination.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * Verification type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

