/*
 * (C) Copyright IBM Corp. 2023.
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
 * The createSources options.
 */
public class CreateSourcesOptions extends GenericModel {

  protected String instanceId;
  protected String name;
  protected String description;
  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String description;
    private Boolean enabled;

    /**
     * Instantiates a new Builder from an existing CreateSourcesOptions instance.
     *
     * @param createSourcesOptions the instance to initialize the Builder with
     */
    private Builder(CreateSourcesOptions createSourcesOptions) {
      this.instanceId = createSourcesOptions.instanceId;
      this.name = createSourcesOptions.name;
      this.description = createSourcesOptions.description;
      this.enabled = createSourcesOptions.enabled;
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
     * @param description the description
     */
    public Builder(String instanceId, String name, String description) {
      this.instanceId = instanceId;
      this.name = name;
      this.description = description;
    }

    /**
     * Builds a CreateSourcesOptions.
     *
     * @return the new CreateSourcesOptions instance
     */
    public CreateSourcesOptions build() {
      return new CreateSourcesOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateSourcesOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSourcesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateSourcesOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreateSourcesOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected CreateSourcesOptions() { }

  protected CreateSourcesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    description = builder.description;
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a CreateSourcesOptions builder
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
   * Name of the source.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the source.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Whether the source is enabled or not.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

