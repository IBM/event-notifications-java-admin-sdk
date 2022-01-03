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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a destination list request.
 */
public class DestinationList extends GenericModel {

  @SerializedName("total_count")
  protected Long totalCount;
  protected Long offset;
  protected Long limit;
  protected List<DestinationListItem> destinations;

  /**
   * Gets the totalCount.
   *
   * Total number of destinations.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the offset.
   *
   * Current offset.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * limit to show destinations.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the destinations.
   *
   * List of destinations.
   *
   * @return the destinations
   */
  public List<DestinationListItem> getDestinations() {
    return destinations;
  }
}

