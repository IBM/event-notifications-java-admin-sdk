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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing bounce metrics.
 */
public class BounceMetrics extends GenericModel {

  protected List<BounceMetricItem> metrics;
  @SerializedName("total_count")
  protected Long totalCount;

  protected BounceMetrics() { }

  /**
   * Gets the metrics.
   *
   * array of bounce metrics.
   *
   * @return the metrics
   */
  public List<BounceMetricItem> getMetrics() {
    return metrics;
  }

  /**
   * Gets the totalCount.
   *
   * total number of bounce metrics.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

