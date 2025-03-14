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
 * Subscription list object.
 */
public class SubscriptionList extends GenericModel {

  @SerializedName("total_count")
  protected Long totalCount;
  protected Long offset;
  protected Long limit;
  protected List<SubscriptionListItem> subscriptions;
  protected PageHrefResponse first;
  protected PageHrefResponse previous;
  protected PageHrefResponse next;

  protected SubscriptionList() { }

  /**
   * Gets the totalCount.
   *
   * Number of subscriptions.
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
   * limit to show subscriptions.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the subscriptions.
   *
   * List of subscriptions.
   *
   * @return the subscriptions
   */
  public List<SubscriptionListItem> getSubscriptions() {
    return subscriptions;
  }

  /**
   * Gets the first.
   *
   * Response having URL of the page.
   *
   * @return the first
   */
  public PageHrefResponse getFirst() {
    return first;
  }

  /**
   * Gets the previous.
   *
   * Response having URL of the page.
   *
   * @return the previous
   */
  public PageHrefResponse getPrevious() {
    return previous;
  }

  /**
   * Gets the next.
   *
   * Response having URL of the page.
   *
   * @return the next
   */
  public PageHrefResponse getNext() {
    return next;
  }
}

