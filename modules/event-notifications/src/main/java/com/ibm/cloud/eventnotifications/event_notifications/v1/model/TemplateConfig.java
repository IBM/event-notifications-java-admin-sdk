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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a template configuration.
 */
public class TemplateConfig extends GenericModel {

  protected String body;
  protected String subject;

  /**
   * Builder.
   */
  public static class Builder {
    private String body;
    private String subject;

    /**
     * Instantiates a new Builder from an existing TemplateConfig instance.
     *
     * @param templateConfig the instance to initialize the Builder with
     */
    private Builder(TemplateConfig templateConfig) {
      this.body = templateConfig.body;
      this.subject = templateConfig.subject;
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
     * @param subject the subject
     */
    public Builder(String body, String subject) {
      this.body = body;
      this.subject = subject;
    }

    /**
     * Builds a TemplateConfig.
     *
     * @return the new TemplateConfig instance
     */
    public TemplateConfig build() {
      return new TemplateConfig(this);
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the TemplateConfig builder
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the TemplateConfig builder
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }
  }

  protected TemplateConfig() { }

  protected TemplateConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subject,
      "subject cannot be null");
    body = builder.body;
    subject = builder.subject;
  }

  /**
   * New builder.
   *
   * @return a TemplateConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the body.
   *
   * Template body.
   *
   * @return the body
   */
  public String body() {
    return body;
  }

  /**
   * Gets the subject.
   *
   * The template subject.
   *
   * @return the subject
   */
  public String subject() {
    return subject;
  }
}

