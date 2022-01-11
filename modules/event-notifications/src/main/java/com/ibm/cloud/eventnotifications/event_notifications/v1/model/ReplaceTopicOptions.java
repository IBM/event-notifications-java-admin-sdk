/*
 * (C) Copyright IBM Corp. 2021.
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
 * The replaceTopic options.
 */
public class ReplaceTopicOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String name;
  protected String description;
  protected List<TopicUpdateSourcesItem> sources;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String name;
    private String description;
    private List<TopicUpdateSourcesItem> sources;

    private Builder(ReplaceTopicOptions replaceTopicOptions) {
      this.instanceId = replaceTopicOptions.instanceId;
      this.id = replaceTopicOptions.id;
      this.name = replaceTopicOptions.name;
      this.description = replaceTopicOptions.description;
      this.sources = replaceTopicOptions.sources;
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
     * Builds a ReplaceTopicOptions.
     *
     * @return the new ReplaceTopicOptions instance
     */
    public ReplaceTopicOptions build() {
      return new ReplaceTopicOptions(this);
    }

    /**
     * Adds an sources to sources.
     *
     * @param sources the new sources
     * @return the ReplaceTopicOptions builder
     */
    public Builder addSources(TopicUpdateSourcesItem sources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sources,
        "sources cannot be null");
      if (this.sources == null) {
        this.sources = new ArrayList<TopicUpdateSourcesItem>();
      }
      this.sources.add(sources);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ReplaceTopicOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceTopicOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceTopicOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceTopicOptions builder
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
     * @return the ReplaceTopicOptions builder
     */
    public Builder sources(List<TopicUpdateSourcesItem> sources) {
      this.sources = sources;
      return this;
    }
  }

  protected ReplaceTopicOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    name = builder.name;
    description = builder.description;
    sources = builder.sources;
  }

  /**
   * New builder.
   *
   * @return a ReplaceTopicOptions builder
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
   * Unique identifier for Topic.
   *
   * @return the id
   */
  public String id() {
    return id;
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
  public List<TopicUpdateSourcesItem> sources() {
    return sources;
  }
}

