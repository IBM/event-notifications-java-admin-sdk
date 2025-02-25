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
 * Payload describing a pagerduty template configuration.
 */
public class TemplateConfigOneOfPagerdutyTemplateConfig extends TemplateConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String body;

    /**
     * Instantiates a new Builder from an existing TemplateConfigOneOfPagerdutyTemplateConfig instance.
     *
     * @param templateConfigOneOfPagerdutyTemplateConfig the instance to initialize the Builder with
     */
    public Builder(TemplateConfigOneOf templateConfigOneOfPagerdutyTemplateConfig) {
      this.body = templateConfigOneOfPagerdutyTemplateConfig.body;
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
     * Builds a TemplateConfigOneOfPagerdutyTemplateConfig.
     *
     * @return the new TemplateConfigOneOfPagerdutyTemplateConfig instance
     */
    public TemplateConfigOneOfPagerdutyTemplateConfig build() {
      return new TemplateConfigOneOfPagerdutyTemplateConfig(this);
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the TemplateConfigOneOfPagerdutyTemplateConfig builder
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }
  }

  protected TemplateConfigOneOfPagerdutyTemplateConfig() { }

  protected TemplateConfigOneOfPagerdutyTemplateConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    body = builder.body;
  }

  /**
   * New builder.
   *
   * @return a TemplateConfigOneOfPagerdutyTemplateConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

