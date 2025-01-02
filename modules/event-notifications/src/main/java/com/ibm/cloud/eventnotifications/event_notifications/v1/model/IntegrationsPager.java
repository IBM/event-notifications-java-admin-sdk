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

import com.ibm.cloud.eventnotifications.event_notifications.v1.EventNotifications;
import com.ibm.cloud.sdk.core.util.UrlHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * IntegrationsPager can be used to simplify the use of the "listIntegrations" method.
 */
public class IntegrationsPager {
  private static class PageContext {
    private Long next;
    public Long getNext() {
      return next;
    }
    public void setNext(Long next) {
      this.next = next;
    }
  }

  protected boolean hasNext;
  protected ListIntegrationsOptions options;
  protected EventNotifications client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected IntegrationsPager() { }

  /**
   * Constructs a new IntegrationsPager instance with the specified client and options model instance.
   * @param client the EventNotifications instance to be used to invoke the "listIntegrations" method
   * @param options the ListIntegrationsOptions instance to be used to invoke the "listIntegrations" method
   */
  public IntegrationsPager(EventNotifications client, ListIntegrationsOptions options) {
    if (options.offset() != null && options.offset().longValue() != 0) {
      throw new IllegalArgumentException("The options 'offset' field should not be set");
    }

    this.hasNext = true;
    this.client = client;
    this.options = options.newBuilder().build();
    this.pageContext = new PageContext();
  }

  /**
   * Returns true if there are more results to be retrieved.
   * @return boolean
   */
  public boolean hasNext() {
    return hasNext;
  }

  /**
   * Returns the next page of results.
   * @return a List&lt;IntegrationListItem&gt; that contains the next page of results
   */
  public List<IntegrationListItem> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    ListIntegrationsOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.offset(this.pageContext.getNext());
    }
    this.options = builder.build();

    IntegrationList result = client.listIntegrations(options).execute().getResult();

    Long next = null;
    if (result.getNext() != null) {
      String queryParam = UrlHelper.getQueryParam(result.getNext().getHref(), "offset");
      if (queryParam != null) {
        next = Long.valueOf(queryParam);
      }
    }
    this.pageContext.setNext(next);
    if (next == null) {
      this.hasNext = false;
    }

    return result.getIntegrations();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;IntegrationListItem&gt; containing all results returned by the "listIntegrations" method
   */
  public List<IntegrationListItem> getAll() {
    List<IntegrationListItem> results = new ArrayList<>();
    while (hasNext()) {
      List<IntegrationListItem> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
