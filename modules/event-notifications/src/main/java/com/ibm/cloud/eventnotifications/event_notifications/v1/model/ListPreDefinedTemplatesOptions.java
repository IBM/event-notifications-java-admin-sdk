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
 * The listPreDefinedTemplates options.
 */
public class ListPreDefinedTemplatesOptions extends GenericModel {

  protected String instanceId;
  protected String source;
  protected String type;
  protected Long limit;
  protected Long offset;
  protected String search;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String source;
    private String type;
    private Long limit;
    private Long offset;
    private String search;

    /**
     * Instantiates a new Builder from an existing ListPreDefinedTemplatesOptions instance.
     *
     * @param listPreDefinedTemplatesOptions the instance to initialize the Builder with
     */
    private Builder(ListPreDefinedTemplatesOptions listPreDefinedTemplatesOptions) {
      this.instanceId = listPreDefinedTemplatesOptions.instanceId;
      this.source = listPreDefinedTemplatesOptions.source;
      this.type = listPreDefinedTemplatesOptions.type;
      this.limit = listPreDefinedTemplatesOptions.limit;
      this.offset = listPreDefinedTemplatesOptions.offset;
      this.search = listPreDefinedTemplatesOptions.search;
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
     * @param source the source
     * @param type the type
     */
    public Builder(String instanceId, String source, String type) {
      this.instanceId = instanceId;
      this.source = source;
      this.type = type;
    }

    /**
     * Builds a ListPreDefinedTemplatesOptions.
     *
     * @return the new ListPreDefinedTemplatesOptions instance
     */
    public ListPreDefinedTemplatesOptions build() {
      return new ListPreDefinedTemplatesOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListPreDefinedTemplatesOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the ListPreDefinedTemplatesOptions builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ListPreDefinedTemplatesOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListPreDefinedTemplatesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListPreDefinedTemplatesOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListPreDefinedTemplatesOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }
  }

  protected ListPreDefinedTemplatesOptions() { }

  protected ListPreDefinedTemplatesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    instanceId = builder.instanceId;
    source = builder.source;
    type = builder.type;
    limit = builder.limit;
    offset = builder.offset;
    search = builder.search;
  }

  /**
   * New builder.
   *
   * @return a ListPreDefinedTemplatesOptions builder
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
   * Gets the source.
   *
   * Source type.
   *
   * @return the source
   */
  public String source() {
    return source;
  }

  /**
   * Gets the type.
   *
   * Destination type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the limit.
   *
   * Page limit for paginated results.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * offset for paginated results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the search.
   *
   * Search string for filtering results.
   *
   * @return the search
   */
  public String search() {
    return search;
  }
}

