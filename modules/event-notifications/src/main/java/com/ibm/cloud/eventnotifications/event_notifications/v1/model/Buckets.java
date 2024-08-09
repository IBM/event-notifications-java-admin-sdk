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
 * Bucket object.
 */
public class Buckets extends GenericModel {

  @SerializedName("doc_count")
  protected Long docCount;
  @SerializedName("key_as_string")
  protected Date keyAsString;

  protected Buckets() { }

  /**
   * Gets the docCount.
   *
   * Total count.
   *
   * @return the docCount
   */
  public Long getDocCount() {
    return docCount;
  }

  /**
   * Gets the keyAsString.
   *
   * Timestamp.
   *
   * @return the keyAsString
   */
  public Date getKeyAsString() {
    return keyAsString;
  }
}

