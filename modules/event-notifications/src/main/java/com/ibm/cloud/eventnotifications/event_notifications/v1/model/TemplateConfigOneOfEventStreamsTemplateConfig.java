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

/**
 * Payload describing a event streams template configuration.
 */
public class TemplateConfigOneOfEventStreamsTemplateConfig extends TemplateConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String body;

    /**
     * Instantiates a new Builder from an existing TemplateConfigOneOfEventStreamsTemplateConfig instance.
     *
     * @param templateConfigOneOfEventStreamsTemplateConfig the instance to initialize the Builder with
     */
    public Builder(TemplateConfigOneOf templateConfigOneOfEventStreamsTemplateConfig) {
      this.body = templateConfigOneOfEventStreamsTemplateConfig.body;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param body the body
     */
    public Builder(String body) {
      this.body = body;
    }

    /**
     * Builds a TemplateConfigOneOfEventStreamsTemplateConfig.
     *
     * @return the new TemplateConfigOneOfEventStreamsTemplateConfig instance
     */
    public TemplateConfigOneOfEventStreamsTemplateConfig build() {
      return new TemplateConfigOneOfEventStreamsTemplateConfig(this);
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the TemplateConfigOneOfEventStreamsTemplateConfig builder
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }
  }

  protected TemplateConfigOneOfEventStreamsTemplateConfig() { }

  protected TemplateConfigOneOfEventStreamsTemplateConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    body = builder.body;
  }

  /**
   * New builder.
   *
   * @return a TemplateConfigOneOfEventStreamsTemplateConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

