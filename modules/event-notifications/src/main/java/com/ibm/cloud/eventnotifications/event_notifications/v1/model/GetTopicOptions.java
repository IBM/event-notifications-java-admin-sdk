/*
 * (C) Copyright IBM Corp. 2022.
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
 * The getTopic options.
 */
public class GetTopicOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String include;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private String include;

    private Builder(GetTopicOptions getTopicOptions) {
      this.instanceId = getTopicOptions.instanceId;
      this.id = getTopicOptions.id;
      this.include = getTopicOptions.include;
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
     * Builds a GetTopicOptions.
     *
     * @return the new GetTopicOptions instance
     */
    public GetTopicOptions build() {
      return new GetTopicOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetTopicOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetTopicOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the include.
     *
     * @param include the include
     * @return the GetTopicOptions builder
     */
    public Builder include(String include) {
      this.include = include;
      return this;
    }
  }

  protected GetTopicOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    include = builder.include;
  }

  /**
   * New builder.
   *
   * @return a GetTopicOptions builder
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
   * Gets the include.
   *
   * Include sub topics.
   *
   * @return the include
   */
  public String include() {
    return include;
  }
}

