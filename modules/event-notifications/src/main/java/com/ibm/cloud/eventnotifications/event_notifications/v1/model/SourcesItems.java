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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SourcesItems.
 */
public class SourcesItems extends GenericModel {

  protected String id;
  protected List<Rules> rules;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<Rules> rules;

    /**
     * Instantiates a new Builder from an existing SourcesItems instance.
     *
     * @param sourcesItems the instance to initialize the Builder with
     */
    private Builder(SourcesItems sourcesItems) {
      this.id = sourcesItems.id;
      this.rules = sourcesItems.rules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param rules the rules
     */
    public Builder(String id, List<Rules> rules) {
      this.id = id;
      this.rules = rules;
    }

    /**
     * Builds a SourcesItems.
     *
     * @return the new SourcesItems instance
     */
    public SourcesItems build() {
      return new SourcesItems(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the SourcesItems builder
     */
    public Builder addRules(Rules rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<Rules>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SourcesItems builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the SourcesItems builder
     */
    public Builder rules(List<Rules> rules) {
      this.rules = rules;
      return this;
    }
  }

  protected SourcesItems() { }

  protected SourcesItems(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rules,
      "rules cannot be null");
    id = builder.id;
    rules = builder.rules;
  }

  /**
   * New builder.
   *
   * @return a SourcesItems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * ID of the source.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the rules.
   *
   * List of rules.
   *
   * @return the rules
   */
  public List<Rules> rules() {
    return rules;
  }
}

