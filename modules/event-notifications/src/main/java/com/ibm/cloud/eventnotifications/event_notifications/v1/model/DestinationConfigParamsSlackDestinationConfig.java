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

/**
 * Payload describing a slack destination configuration.
 */
public class DestinationConfigParamsSlackDestinationConfig extends DestinationConfigParams {


  /**
   * Builder.
   */
  public static class Builder {
    private String url;

    public Builder(DestinationConfigParams destinationConfigParamsSlackDestinationConfig) {
      this.url = destinationConfigParamsSlackDestinationConfig.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param url the url
     */
    public Builder(String url) {
      this.url = url;
    }

    /**
     * Builds a DestinationConfigParamsSlackDestinationConfig.
     *
     * @return the new DestinationConfigParamsSlackDestinationConfig instance
     */
    public DestinationConfigParamsSlackDestinationConfig build() {
      return new DestinationConfigParamsSlackDestinationConfig(this);
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the DestinationConfigParamsSlackDestinationConfig builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected DestinationConfigParamsSlackDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigParamsSlackDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

