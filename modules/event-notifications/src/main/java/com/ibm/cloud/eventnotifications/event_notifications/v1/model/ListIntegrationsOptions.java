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
 * The listIntegrations options.
 */
public class ListIntegrationsOptions extends GenericModel {

  protected String instanceId;
  protected Long offset;
  protected Long limit;
  protected String search;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private Long offset;
    private Long limit;
    private String search;

    private Builder(ListIntegrationsOptions listIntegrationsOptions) {
      this.instanceId = listIntegrationsOptions.instanceId;
      this.offset = listIntegrationsOptions.offset;
      this.limit = listIntegrationsOptions.limit;
      this.search = listIntegrationsOptions.search;
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
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a ListIntegrationsOptions.
     *
     * @return the new ListIntegrationsOptions instance
     */
    public ListIntegrationsOptions build() {
      return new ListIntegrationsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListIntegrationsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListIntegrationsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListIntegrationsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListIntegrationsOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }
  }

  protected ListIntegrationsOptions() { }

  protected ListIntegrationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    offset = builder.offset;
    limit = builder.limit;
    search = builder.search;
  }

  /**
   * New builder.
   *
   * @return a ListIntegrationsOptions builder
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

