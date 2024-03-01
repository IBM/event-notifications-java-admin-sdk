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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Payload describing a webhook destination configuration.
 */
public class DestinationConfigOneOfWebhookDestinationConfig extends DestinationConfigOneOf {

  /**
   * HTTP method of webhook.
   */
  public interface Verb {
    /** get. */
    String GET = "get";
    /** post. */
    String POST = "post";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String url;
    private String verb;
    private Map<String, String> customHeaders;
    private List<String> sensitiveHeaders;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfWebhookDestinationConfig instance.
     *
     * @param destinationConfigOneOfWebhookDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfWebhookDestinationConfig) {
      this.url = destinationConfigOneOfWebhookDestinationConfig.url;
      this.verb = destinationConfigOneOfWebhookDestinationConfig.verb;
      this.customHeaders = destinationConfigOneOfWebhookDestinationConfig.customHeaders;
      this.sensitiveHeaders = destinationConfigOneOfWebhookDestinationConfig.sensitiveHeaders;
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
     * @param verb the verb
     */
    public Builder(String url, String verb) {
      this.url = url;
      this.verb = verb;
    }

    /**
     * Builds a DestinationConfigOneOfWebhookDestinationConfig.
     *
     * @return the new DestinationConfigOneOfWebhookDestinationConfig instance
     */
    public DestinationConfigOneOfWebhookDestinationConfig build() {
      return new DestinationConfigOneOfWebhookDestinationConfig(this);
    }

    /**
     * Adds an sensitiveHeaders to sensitiveHeaders.
     *
     * @param sensitiveHeaders the new sensitiveHeaders
     * @return the DestinationConfigOneOfWebhookDestinationConfig builder
     */
    public Builder addSensitiveHeaders(String sensitiveHeaders) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sensitiveHeaders,
        "sensitiveHeaders cannot be null");
      if (this.sensitiveHeaders == null) {
        this.sensitiveHeaders = new ArrayList<String>();
      }
      this.sensitiveHeaders.add(sensitiveHeaders);
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the DestinationConfigOneOfWebhookDestinationConfig builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the verb.
     *
     * @param verb the verb
     * @return the DestinationConfigOneOfWebhookDestinationConfig builder
     */
    public Builder verb(String verb) {
      this.verb = verb;
      return this;
    }

    /**
     * Set the customHeaders.
     *
     * @param customHeaders the customHeaders
     * @return the DestinationConfigOneOfWebhookDestinationConfig builder
     */
    public Builder customHeaders(Map<String, String> customHeaders) {
      this.customHeaders = customHeaders;
      return this;
    }

    /**
     * Set the sensitiveHeaders.
     * Existing sensitiveHeaders will be replaced.
     *
     * @param sensitiveHeaders the sensitiveHeaders
     * @return the DestinationConfigOneOfWebhookDestinationConfig builder
     */
    public Builder sensitiveHeaders(List<String> sensitiveHeaders) {
      this.sensitiveHeaders = sensitiveHeaders;
      return this;
    }
  }

  protected DestinationConfigOneOfWebhookDestinationConfig() { }

  protected DestinationConfigOneOfWebhookDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.verb,
      "verb cannot be null");
    url = builder.url;
    verb = builder.verb;
    customHeaders = builder.customHeaders;
    sensitiveHeaders = builder.sensitiveHeaders;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfWebhookDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

