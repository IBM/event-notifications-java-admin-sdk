/*
 * (C) Copyright IBM Corp. 2026.
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
 * The updateEmailSandboxDestination options.
 */
public class UpdateEmailSandboxDestinationOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String domain;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String domain;

    /**
     * Instantiates a new Builder from an existing UpdateEmailSandboxDestinationOptions instance.
     *
     * @param updateEmailSandboxDestinationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateEmailSandboxDestinationOptions updateEmailSandboxDestinationOptions) {
      this.instanceId = updateEmailSandboxDestinationOptions.instanceId;
      this.id = updateEmailSandboxDestinationOptions.id;
      this.domain = updateEmailSandboxDestinationOptions.domain;
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
     * @param domain the domain
     */
    public Builder(String instanceId, String id, String domain) {
      this.instanceId = instanceId;
      this.id = id;
      this.domain = domain;
    }

    /**
     * Builds a UpdateEmailSandboxDestinationOptions.
     *
     * @return the new UpdateEmailSandboxDestinationOptions instance
     */
    public UpdateEmailSandboxDestinationOptions build() {
      return new UpdateEmailSandboxDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateEmailSandboxDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateEmailSandboxDestinationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the UpdateEmailSandboxDestinationOptions builder
     */
    public Builder domain(String domain) {
      this.domain = domain;
      return this;
    }
  }

  protected UpdateEmailSandboxDestinationOptions() { }

  protected UpdateEmailSandboxDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.domain,
      "domain cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    domain = builder.domain;
  }

  /**
   * New builder.
   *
   * @return a UpdateEmailSandboxDestinationOptions builder
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
   * Gets the domain.
   *
   * Email Domain.
   *
   * @return the domain
   */
  public String domain() {
    return domain;
  }
}

