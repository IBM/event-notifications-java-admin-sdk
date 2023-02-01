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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a source list item.
 */
public class SourceListItem extends GenericModel {

  protected String id;
  protected String name;
  protected String description;
  protected String type;
  protected Boolean enabled;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("topic_count")
  protected Long topicCount;

  /**
   * Gets the id.
   *
   * ID of the source.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the source.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the source.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * Type of the source.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the enabled.
   *
   * Whether the source is enabled or not.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the updatedAt.
   *
   * Time of the last update.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the topicCount.
   *
   * Number of topics.
   *
   * @return the topicCount
   */
  public Long getTopicCount() {
    return topicCount;
  }
}

