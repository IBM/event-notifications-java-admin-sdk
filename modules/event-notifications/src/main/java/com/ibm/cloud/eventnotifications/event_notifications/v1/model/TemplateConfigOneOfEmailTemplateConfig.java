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

/**
 * Payload describing an email template configuration.
 */
public class TemplateConfigOneOfEmailTemplateConfig extends TemplateConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String body;
    private String subject;

    /**
     * Instantiates a new Builder from an existing TemplateConfigOneOfEmailTemplateConfig instance.
     *
     * @param templateConfigOneOfEmailTemplateConfig the instance to initialize the Builder with
     */
    public Builder(TemplateConfigOneOf templateConfigOneOfEmailTemplateConfig) {
      this.body = templateConfigOneOfEmailTemplateConfig.body;
      this.subject = templateConfigOneOfEmailTemplateConfig.subject;
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
     * Builds a TemplateConfigOneOfEmailTemplateConfig.
     *
     * @return the new TemplateConfigOneOfEmailTemplateConfig instance
     */
    public TemplateConfigOneOfEmailTemplateConfig build() {
      return new TemplateConfigOneOfEmailTemplateConfig(this);
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the TemplateConfigOneOfEmailTemplateConfig builder
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the TemplateConfigOneOfEmailTemplateConfig builder
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }
  }

  protected TemplateConfigOneOfEmailTemplateConfig() { }

  protected TemplateConfigOneOfEmailTemplateConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    body = builder.body;
    subject = builder.subject;
  }

  /**
   * New builder.
   *
   * @return a TemplateConfigOneOfEmailTemplateConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

