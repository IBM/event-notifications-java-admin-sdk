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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTopic options.
 */
public class CreateTopicOptions extends GenericModel {

  protected String instanceId;
  protected String name;
  protected String description;
  protected List<SourcesItems> sources;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String description;
    private List<SourcesItems> sources;

    /**
     * Instantiates a new Builder from an existing CreateTopicOptions instance.
     *
     * @param createTopicOptions the instance to initialize the Builder with
     */
    private Builder(CreateTopicOptions createTopicOptions) {
      this.instanceId = createTopicOptions.instanceId;
      this.name = createTopicOptions.name;
      this.description = createTopicOptions.description;
      this.sources = createTopicOptions.sources;
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
     */
    public Builder(String instanceId, String name) {
      this.instanceId = instanceId;
      this.name = name;
    }

    /**
     * Builds a CreateTopicOptions.
     *
     * @return the new CreateTopicOptions instance
     */
    public CreateTopicOptions build() {
      return new CreateTopicOptions(this);
    }

    /**
     * Adds an sources to sources.
     *
     * @param sources the new sources
     * @return the CreateTopicOptions builder
     */
    public Builder addSources(SourcesItems sources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sources,
        "sources cannot be null");
      if (this.sources == null) {
        this.sources = new ArrayList<SourcesItems>();
      }
      this.sources.add(sources);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateTopicOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateTopicOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateTopicOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the sources.
     * Existing sources will be replaced.
     *
     * @param sources the sources
     * @return the CreateTopicOptions builder
     */
    public Builder sources(List<SourcesItems> sources) {
      this.sources = sources;
      return this;
    }
  }

  protected CreateTopicOptions() { }

  protected CreateTopicOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    description = builder.description;
    sources = builder.sources;
  }

  /**
   * New builder.
   *
   * @return a CreateTopicOptions builder
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
   * Name of the topic.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the topic.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the sources.
   *
   * List of sources.
   *
   * @return the sources
   */
  public List<SourcesItems> sources() {
    return sources;
  }
}

