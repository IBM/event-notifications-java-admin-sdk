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
 * The createTemplate options.
 */
public class CreateTemplateOptions extends GenericModel {

  protected String instanceId;
  protected String name;
  protected String type;
  protected TemplateConfigOneOf params;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String type;
    private TemplateConfigOneOf params;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateTemplateOptions instance.
     *
     * @param createTemplateOptions the instance to initialize the Builder with
     */
    private Builder(CreateTemplateOptions createTemplateOptions) {
      this.instanceId = createTemplateOptions.instanceId;
      this.name = createTemplateOptions.name;
      this.type = createTemplateOptions.type;
      this.params = createTemplateOptions.params;
      this.description = createTemplateOptions.description;
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
     * @param type the type
     * @param params the params
     */
    public Builder(String instanceId, String name, String type, TemplateConfigOneOf params) {
      this.instanceId = instanceId;
      this.name = name;
      this.type = type;
      this.params = params;
    }

    /**
     * Builds a CreateTemplateOptions.
     *
     * @return the new CreateTemplateOptions instance
     */
    public CreateTemplateOptions build() {
      return new CreateTemplateOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateTemplateOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateTemplateOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateTemplateOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the params.
     *
     * @param params the params
     * @return the CreateTemplateOptions builder
     */
    public Builder params(TemplateConfigOneOf params) {
      this.params = params;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateTemplateOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateTemplateOptions() { }

  protected CreateTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.params,
      "params cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    type = builder.type;
    params = builder.params;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateTemplateOptions builder
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
   * The Message Template.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of template.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the params.
   *
   * @return the params
   */
  public TemplateConfigOneOf params() {
    return params;
  }

  /**
   * Gets the description.
   *
   * The Template description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

