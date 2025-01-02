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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a source list item.
 */
public class SourcesListItems extends GenericModel {

  protected String id;
  protected String name;
  protected List<RulesGet> rules;

  protected SourcesListItems() { }

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
   * Gets the rules.
   *
   * List of rules.
   *
   * @return the rules
   */
  public List<RulesGet> getRules() {
    return rules;
  }
}

