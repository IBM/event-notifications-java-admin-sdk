/*
 * (C) Copyright IBM Corp. 2022.
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
 * The email ids.
 */
public class EmailUpdateAttributesTo extends GenericModel {

  protected List<String> add;
  protected List<String> remove;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> add;
    private List<String> remove;

    private Builder(EmailUpdateAttributesTo emailUpdateAttributesTo) {
      this.add = emailUpdateAttributesTo.add;
      this.remove = emailUpdateAttributesTo.remove;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EmailUpdateAttributesTo.
     *
     * @return the new EmailUpdateAttributesTo instance
     */
    public EmailUpdateAttributesTo build() {
      return new EmailUpdateAttributesTo(this);
    }

    /**
     * Adds an add to add.
     *
     * @param add the new add
     * @return the EmailUpdateAttributesTo builder
     */
    public Builder addAdd(String add) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(add,
        "add cannot be null");
      if (this.add == null) {
        this.add = new ArrayList<String>();
      }
      this.add.add(add);
      return this;
    }

    /**
     * Adds an remove to remove.
     *
     * @param remove the new remove
     * @return the EmailUpdateAttributesTo builder
     */
    public Builder addRemove(String remove) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(remove,
        "remove cannot be null");
      if (this.remove == null) {
        this.remove = new ArrayList<String>();
      }
      this.remove.add(remove);
      return this;
    }

    /**
     * Set the add.
     * Existing add will be replaced.
     *
     * @param add the add
     * @return the EmailUpdateAttributesTo builder
     */
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    /**
     * Set the remove.
     * Existing remove will be replaced.
     *
     * @param remove the remove
     * @return the EmailUpdateAttributesTo builder
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }

  protected EmailUpdateAttributesTo(Builder builder) {
    add = builder.add;
    remove = builder.remove;
  }

  /**
   * New builder.
   *
   * @return a EmailUpdateAttributesTo builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the add.
   *
   * The email ids.
   *
   * @return the add
   */
  public List<String> add() {
    return add;
  }

  /**
   * Gets the remove.
   *
   * The email ids for removal.
   *
   * @return the remove
   */
  public List<String> remove() {
    return remove;
  }
}

