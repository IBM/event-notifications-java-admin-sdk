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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a destination configuration.
 */
public class DestinationConfig extends GenericModel {

  protected DestinationConfigParams params;

  /**
   * Builder.
   */
  public static class Builder {
    private DestinationConfigParams params;

    private Builder(DestinationConfig destinationConfig) {
      this.params = destinationConfig.params;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param params the params
     */
    public Builder(DestinationConfigParams params) {
      this.params = params;
    }

    /**
     * Builds a DestinationConfig.
     *
     * @return the new DestinationConfig instance
     */
    public DestinationConfig build() {
      return new DestinationConfig(this);
    }

    /**
     * Set the params.
     *
     * @param params the params
     * @return the DestinationConfig builder
     */
    public Builder params(DestinationConfigParams params) {
      this.params = params;
      return this;
    }
  }

  protected DestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.params,
      "params cannot be null");
    params = builder.params;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the params.
   *
   * @return the params
   */
  public DestinationConfigParams params() {
    return params;
  }
}

