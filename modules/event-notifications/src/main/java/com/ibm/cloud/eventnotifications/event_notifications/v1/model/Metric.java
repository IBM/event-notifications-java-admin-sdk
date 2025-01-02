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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing metrics request.
 */
public class Metric extends GenericModel {

  /**
   * key.
   */
  public interface Key {
    /** bounced. */
    String BOUNCED = "bounced";
    /** deferred. */
    String DEFERRED = "deferred";
    /** opened. */
    String OPENED = "opened";
    /** success. */
    String SUCCESS = "success";
    /** submitted. */
    String SUBMITTED = "submitted";
  }

  protected String key;
  @SerializedName("doc_count")
  protected Long docCount;
  protected Histrogram histogram;

  protected Metric() { }

  /**
   * Gets the key.
   *
   * key.
   *
   * @return the key
   */
  public String getKey() {
    return key;
  }

  /**
   * Gets the docCount.
   *
   * doc count.
   *
   * @return the docCount
   */
  public Long getDocCount() {
    return docCount;
  }

  /**
   * Gets the histogram.
   *
   * Payload describing histogram.
   *
   * @return the histogram
   */
  public Histrogram getHistogram() {
    return histogram;
  }
}

