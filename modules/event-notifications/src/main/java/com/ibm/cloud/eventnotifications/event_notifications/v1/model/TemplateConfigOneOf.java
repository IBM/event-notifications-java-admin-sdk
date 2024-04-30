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
 * TemplateConfigOneOf.
 *
 * Classes which extend this class:
 * - TemplateConfigOneOfEmailTemplateConfig
 * - TemplateConfigOneOfSlackTemplateConfig
 */
public class TemplateConfigOneOf extends GenericModel {

  protected String body;
  protected String subject;

  protected TemplateConfigOneOf() { }

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

