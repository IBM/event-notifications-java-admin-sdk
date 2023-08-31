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
 * The updateTemplate options.
 */
public class UpdateTemplateOptions extends GenericModel {

  /**
   * The type of template.
   */
  public interface Type {
    /** smtp_custom.notification. */
    String SMTP_CUSTOM_NOTIFICATION = "smtp_custom.notification";
    /** smtp_custom.invitation. */
    String SMTP_CUSTOM_INVITATION = "smtp_custom.invitation";
  }

  protected String instanceId;
  protected String id;
  protected String name;
  protected String description;
  protected String type;
  protected TemplateConfig params;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String name;
    private String description;
    private String type;
    private TemplateConfig params;

    /**
     * Instantiates a new Builder from an existing UpdateTemplateOptions instance.
     *
     * @param updateTemplateOptions the instance to initialize the Builder with
     */
    private Builder(UpdateTemplateOptions updateTemplateOptions) {
      this.instanceId = updateTemplateOptions.instanceId;
      this.id = updateTemplateOptions.id;
      this.name = updateTemplateOptions.name;
      this.description = updateTemplateOptions.description;
      this.type = updateTemplateOptions.type;
      this.params = updateTemplateOptions.params;
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
     * Builds a UpdateTemplateOptions.
     *
     * @return the new UpdateTemplateOptions instance
     */
    public UpdateTemplateOptions build() {
      return new UpdateTemplateOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateTemplateOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateTemplateOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateTemplateOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateTemplateOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateTemplateOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the params.
     *
     * @param params the params
     * @return the UpdateTemplateOptions builder
     */
    public Builder params(TemplateConfig params) {
      this.params = params;
      return this;
    }
  }

  protected UpdateTemplateOptions() { }

  protected UpdateTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    name = builder.name;
    description = builder.description;
    type = builder.type;
    params = builder.params;
  }

  /**
   * New builder.
   *
   * @return a UpdateTemplateOptions builder
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
   * Unique identifier for Template.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Template name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Template description.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Payload describing a template configuration.
   *
   * @return the params
   */
  public TemplateConfig params() {
    return params;
  }
}
