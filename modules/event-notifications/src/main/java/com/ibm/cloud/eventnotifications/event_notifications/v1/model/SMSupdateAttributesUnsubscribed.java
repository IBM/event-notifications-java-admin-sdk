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
 * The phone number to send the SMS to.
 */
public class SMSupdateAttributesUnsubscribed extends GenericModel {

  protected List<String> remove;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> remove;

    private Builder(SMSupdateAttributesUnsubscribed smSupdateAttributesUnsubscribed) {
      this.remove = smSupdateAttributesUnsubscribed.remove;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SMSupdateAttributesUnsubscribed.
     *
     * @return the new SMSupdateAttributesUnsubscribed instance
     */
    public SMSupdateAttributesUnsubscribed build() {
      return new SMSupdateAttributesUnsubscribed(this);
    }

    /**
     * Adds an remove to remove.
     *
     * @param remove the new remove
     * @return the SMSupdateAttributesUnsubscribed builder
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
     * Set the remove.
     * Existing remove will be replaced.
     *
     * @param remove the remove
     * @return the SMSupdateAttributesUnsubscribed builder
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }

  protected SMSupdateAttributesUnsubscribed() { }

  protected SMSupdateAttributesUnsubscribed(Builder builder) {
    remove = builder.remove;
  }

  /**
   * New builder.
   *
   * @return a SMSupdateAttributesUnsubscribed builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the remove.
   *
   * array to add new items.
   *
   * @return the remove
   */
  public List<String> remove() {
    return remove;
  }
}

