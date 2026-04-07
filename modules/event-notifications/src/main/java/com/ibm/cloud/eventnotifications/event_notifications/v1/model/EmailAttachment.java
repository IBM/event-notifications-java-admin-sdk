/*
 * (C) Copyright IBM Corp. 2026.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Email attachment object.
 */
public class EmailAttachment extends GenericModel {

  /**
   * Content disposition.
   */
  public interface Disposition {
    /** attachment. */
    String ATTACHMENT = "attachment";
  }

  protected String content;
  protected String filename;
  @SerializedName("content_type")
  protected String contentType;
  protected String disposition;

  /**
   * Builder.
   */
  public static class Builder {
    private String content;
    private String filename;
    private String contentType;
    private String disposition;

    /**
     * Instantiates a new Builder from an existing EmailAttachment instance.
     *
     * @param emailAttachment the instance to initialize the Builder with
     */
    private Builder(EmailAttachment emailAttachment) {
      this.content = emailAttachment.content;
      this.filename = emailAttachment.filename;
      this.contentType = emailAttachment.contentType;
      this.disposition = emailAttachment.disposition;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param content the content
     * @param filename the filename
     * @param contentType the contentType
     * @param disposition the disposition
     */
    public Builder(String content, String filename, String contentType, String disposition) {
      this.content = content;
      this.filename = filename;
      this.contentType = contentType;
      this.disposition = disposition;
    }

    /**
     * Builds a EmailAttachment.
     *
     * @return the new EmailAttachment instance
     */
    public EmailAttachment build() {
      return new EmailAttachment(this);
    }

    /**
     * Set the content.
     *
     * @param content the content
     * @return the EmailAttachment builder
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Set the filename.
     *
     * @param filename the filename
     * @return the EmailAttachment builder
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * Set the contentType.
     *
     * @param contentType the contentType
     * @return the EmailAttachment builder
     */
    public Builder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * Set the disposition.
     *
     * @param disposition the disposition
     * @return the EmailAttachment builder
     */
    public Builder disposition(String disposition) {
      this.disposition = disposition;
      return this;
    }
  }

  protected EmailAttachment() { }

  protected EmailAttachment(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.content,
      "content cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.filename,
      "filename cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.contentType,
      "contentType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.disposition,
      "disposition cannot be null");
    content = builder.content;
    filename = builder.filename;
    contentType = builder.contentType;
    disposition = builder.disposition;
  }

  /**
   * New builder.
   *
   * @return a EmailAttachment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the content.
   *
   * Base64 encoded file content.
   *
   * @return the content
   */
  public String content() {
    return content;
  }

  /**
   * Gets the filename.
   *
   * Name of the attachment file.
   *
   * @return the filename
   */
  public String filename() {
    return filename;
  }

  /**
   * Gets the contentType.
   *
   * MIME type of the attachment.
   *
   * @return the contentType
   */
  public String contentType() {
    return contentType;
  }

  /**
   * Gets the disposition.
   *
   * Content disposition.
   *
   * @return the disposition
   */
  public String disposition() {
    return disposition;
  }
}

