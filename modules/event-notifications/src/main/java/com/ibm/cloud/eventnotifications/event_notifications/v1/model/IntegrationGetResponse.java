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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Integration response object.
 */
public class IntegrationGetResponse extends GenericModel {

  protected String id;
  protected String type;
  protected IntegrationMetadata metadata;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected IntegrationGetResponse() { }

  /**
   * Gets the id.
   *
   * ID of the integration.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * Integration type. Allowed values are kms and hs-crypto.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the metadata.
   *
   * Integration Metadata object.
   *
   * @return the metadata
   */
  public IntegrationMetadata getMetadata() {
    return metadata;
  }

  /**
   * Gets the createdAt.
   *
   * Creation time of an integration.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Last update time of an integration.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

