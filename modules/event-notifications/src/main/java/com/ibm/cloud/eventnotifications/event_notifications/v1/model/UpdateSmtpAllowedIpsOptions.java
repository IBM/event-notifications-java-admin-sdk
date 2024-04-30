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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSmtpAllowedIps options.
 */
public class UpdateSmtpAllowedIpsOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected List<String> subnets;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private List<String> subnets;

    /**
     * Instantiates a new Builder from an existing UpdateSmtpAllowedIpsOptions instance.
     *
     * @param updateSmtpAllowedIpsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSmtpAllowedIpsOptions updateSmtpAllowedIpsOptions) {
      this.instanceId = updateSmtpAllowedIpsOptions.instanceId;
      this.id = updateSmtpAllowedIpsOptions.id;
      this.subnets = updateSmtpAllowedIpsOptions.subnets;
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
     * @param subnets the subnets
     */
    public Builder(String instanceId, String id, List<String> subnets) {
      this.instanceId = instanceId;
      this.id = id;
      this.subnets = subnets;
    }

    /**
     * Builds a UpdateSmtpAllowedIpsOptions.
     *
     * @return the new UpdateSmtpAllowedIpsOptions instance
     */
    public UpdateSmtpAllowedIpsOptions build() {
      return new UpdateSmtpAllowedIpsOptions(this);
    }

    /**
     * Adds an subnets to subnets.
     *
     * @param subnets the new subnets
     * @return the UpdateSmtpAllowedIpsOptions builder
     */
    public Builder addSubnets(String subnets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subnets,
        "subnets cannot be null");
      if (this.subnets == null) {
        this.subnets = new ArrayList<String>();
      }
      this.subnets.add(subnets);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateSmtpAllowedIpsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSmtpAllowedIpsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the subnets.
     * Existing subnets will be replaced.
     *
     * @param subnets the subnets
     * @return the UpdateSmtpAllowedIpsOptions builder
     */
    public Builder subnets(List<String> subnets) {
      this.subnets = subnets;
      return this;
    }
  }

  protected UpdateSmtpAllowedIpsOptions() { }

  protected UpdateSmtpAllowedIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnets,
      "subnets cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    subnets = builder.subnets;
  }

  /**
   * New builder.
   *
   * @return a UpdateSmtpAllowedIpsOptions builder
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
   * Gets the subnets.
   *
   * The SMTP allowed Ips.
   *
   * @return the subnets
   */
  public List<String> subnets() {
    return subnets;
  }
}

