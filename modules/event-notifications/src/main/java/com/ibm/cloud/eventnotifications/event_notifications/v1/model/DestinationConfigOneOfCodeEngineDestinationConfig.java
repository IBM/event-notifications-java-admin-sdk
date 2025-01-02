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
import java.util.Map;

/**
 * Payload describing a code engine destination configuration.
 */
public class DestinationConfigOneOfCodeEngineDestinationConfig extends DestinationConfigOneOf {

  /**
   * HTTP method of code engine.
   */
  public interface Verb {
    /** get. */
    String GET = "get";
    /** post. */
    String POST = "post";
  }

  /**
   * The code engine destination type.
   */
  public interface Type {
    /** job. */
    String JOB = "job";
    /** application. */
    String APPLICATION = "application";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String url;
    private String verb;
    private String type;
    private String projectCrn;
    private String jobName;
    private Map<String, String> customHeaders;
    private List<String> sensitiveHeaders;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfCodeEngineDestinationConfig instance.
     *
     * @param destinationConfigOneOfCodeEngineDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfCodeEngineDestinationConfig) {
      this.url = destinationConfigOneOfCodeEngineDestinationConfig.url;
      this.verb = destinationConfigOneOfCodeEngineDestinationConfig.verb;
      this.type = destinationConfigOneOfCodeEngineDestinationConfig.type;
      this.projectCrn = destinationConfigOneOfCodeEngineDestinationConfig.projectCrn;
      this.jobName = destinationConfigOneOfCodeEngineDestinationConfig.jobName;
      this.customHeaders = destinationConfigOneOfCodeEngineDestinationConfig.customHeaders;
      this.sensitiveHeaders = destinationConfigOneOfCodeEngineDestinationConfig.sensitiveHeaders;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a DestinationConfigOneOfCodeEngineDestinationConfig.
     *
     * @return the new DestinationConfigOneOfCodeEngineDestinationConfig instance
     */
    public DestinationConfigOneOfCodeEngineDestinationConfig build() {
      return new DestinationConfigOneOfCodeEngineDestinationConfig(this);
    }

    /**
     * Adds an sensitiveHeaders to sensitiveHeaders.
     *
     * @param sensitiveHeaders the new sensitiveHeaders
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
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
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the verb.
     *
     * @param verb the verb
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
     */
    public Builder verb(String verb) {
      this.verb = verb;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the projectCrn.
     *
     * @param projectCrn the projectCrn
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
     */
    public Builder projectCrn(String projectCrn) {
      this.projectCrn = projectCrn;
      return this;
    }

    /**
     * Set the jobName.
     *
     * @param jobName the jobName
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
     */
    public Builder jobName(String jobName) {
      this.jobName = jobName;
      return this;
    }

    /**
     * Set the customHeaders.
     *
     * @param customHeaders the customHeaders
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
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
     * @return the DestinationConfigOneOfCodeEngineDestinationConfig builder
     */
    public Builder sensitiveHeaders(List<String> sensitiveHeaders) {
      this.sensitiveHeaders = sensitiveHeaders;
      return this;
    }
  }

  protected DestinationConfigOneOfCodeEngineDestinationConfig() { }

  protected DestinationConfigOneOfCodeEngineDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    url = builder.url;
    verb = builder.verb;
    type = builder.type;
    projectCrn = builder.projectCrn;
    jobName = builder.jobName;
    customHeaders = builder.customHeaders;
    sensitiveHeaders = builder.sensitiveHeaders;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfCodeEngineDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

