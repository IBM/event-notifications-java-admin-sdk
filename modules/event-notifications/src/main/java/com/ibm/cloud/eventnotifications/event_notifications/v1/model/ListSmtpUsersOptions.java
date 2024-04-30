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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSmtpUsers options.
 */
public class ListSmtpUsersOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Long limit;
  protected Long offset;
  protected String search;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Long limit;
    private Long offset;
    private String search;

    /**
     * Instantiates a new Builder from an existing ListSmtpUsersOptions instance.
     *
     * @param listSmtpUsersOptions the instance to initialize the Builder with
     */
    private Builder(ListSmtpUsersOptions listSmtpUsersOptions) {
      this.instanceId = listSmtpUsersOptions.instanceId;
      this.id = listSmtpUsersOptions.id;
      this.limit = listSmtpUsersOptions.limit;
      this.offset = listSmtpUsersOptions.offset;
      this.search = listSmtpUsersOptions.search;
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
     * Builds a ListSmtpUsersOptions.
     *
     * @return the new ListSmtpUsersOptions instance
     */
    public ListSmtpUsersOptions build() {
      return new ListSmtpUsersOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListSmtpUsersOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListSmtpUsersOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSmtpUsersOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListSmtpUsersOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the ListSmtpUsersOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }
  }

  protected ListSmtpUsersOptions() { }

  protected ListSmtpUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    limit = builder.limit;
    offset = builder.offset;
    search = builder.search;
  }

  /**
   * New builder.
   *
   * @return a ListSmtpUsersOptions builder
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

