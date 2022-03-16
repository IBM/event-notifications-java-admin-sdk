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

import java.util.Date;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The sendNotifications options.
 */
public class SendNotificationsOptions extends GenericModel {

  protected String instanceId;
  protected String subject;
  protected String severity;
  protected String id;
  protected String source;
  protected String enSourceId;
  protected String type;
  protected Date time;
  protected Map<String, Object> data;
  protected NotificationDevices pushTo;
  protected NotificationFCMBody messageFcmBody;
  protected Map<String, Object> messageApnsHeaders;
  protected NotificationAPNSBody messageApnsBody;
  protected String datacontenttype;
  protected String specversion;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String subject;
    private String severity;
    private String id;
    private String source;
    private String enSourceId;
    private String type;
    private Date time;
    private Map<String, Object> data;
    private NotificationDevices pushTo;
    private NotificationFCMBody messageFcmBody;
    private Map<String, Object> messageApnsHeaders;
    private NotificationAPNSBody messageApnsBody;
    private String datacontenttype;
    private String specversion;

    private Builder(SendNotificationsOptions sendNotificationsOptions) {
      this.instanceId = sendNotificationsOptions.instanceId;
      this.subject = sendNotificationsOptions.subject;
      this.severity = sendNotificationsOptions.severity;
      this.id = sendNotificationsOptions.id;
      this.source = sendNotificationsOptions.source;
      this.enSourceId = sendNotificationsOptions.enSourceId;
      this.type = sendNotificationsOptions.type;
      this.time = sendNotificationsOptions.time;
      this.data = sendNotificationsOptions.data;
      this.pushTo = sendNotificationsOptions.pushTo;
      this.messageFcmBody = sendNotificationsOptions.messageFcmBody;
      this.messageApnsHeaders = sendNotificationsOptions.messageApnsHeaders;
      this.messageApnsBody = sendNotificationsOptions.messageApnsBody;
      this.datacontenttype = sendNotificationsOptions.datacontenttype;
      this.specversion = sendNotificationsOptions.specversion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param subject the subject
     * @param severity the severity
     * @param id the id
     * @param source the source
     * @param enSourceId the enSourceId
     * @param type the type
     * @param time the time
     */
    public Builder(String instanceId, String subject, String severity, String id, String source, String enSourceId, String type, Date time) {
      this.instanceId = instanceId;
      this.subject = subject;
      this.severity = severity;
      this.id = id;
      this.source = source;
      this.enSourceId = enSourceId;
      this.type = type;
      this.time = time;
    }

    /**
     * Builds a SendNotificationsOptions.
     *
     * @return the new SendNotificationsOptions instance
     */
    public SendNotificationsOptions build() {
      return new SendNotificationsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the SendNotificationsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the SendNotificationsOptions builder
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }

    /**
     * Set the severity.
     *
     * @param severity the severity
     * @return the SendNotificationsOptions builder
     */
    public Builder severity(String severity) {
      this.severity = severity;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SendNotificationsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the SendNotificationsOptions builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the enSourceId.
     *
     * @param enSourceId the enSourceId
     * @return the SendNotificationsOptions builder
     */
    public Builder enSourceId(String enSourceId) {
      this.enSourceId = enSourceId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the SendNotificationsOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the time.
     *
     * @param time the time
     * @return the SendNotificationsOptions builder
     */
    public Builder time(Date time) {
      this.time = time;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the SendNotificationsOptions builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }

    /**
     * Set the pushTo.
     *
     * @param pushTo the pushTo
     * @return the SendNotificationsOptions builder
     */
    public Builder pushTo(NotificationDevices pushTo) {
      this.pushTo = pushTo;
      return this;
    }

    /**
     * Set the messageFcmBody.
     *
     * @param messageFcmBody the messageFcmBody
     * @return the SendNotificationsOptions builder
     */
    public Builder messageFcmBody(NotificationFCMBody messageFcmBody) {
      this.messageFcmBody = messageFcmBody;
      return this;
    }

    /**
     * Set the messageApnsHeaders.
     *
     * @param messageApnsHeaders the messageApnsHeaders
     * @return the SendNotificationsOptions builder
     */
    public Builder messageApnsHeaders(Map<String, Object> messageApnsHeaders) {
      this.messageApnsHeaders = messageApnsHeaders;
      return this;
    }

    /**
     * Set the messageApnsBody.
     *
     * @param messageApnsBody the messageApnsBody
     * @return the SendNotificationsOptions builder
     */
    public Builder messageApnsBody(NotificationAPNSBody messageApnsBody) {
      this.messageApnsBody = messageApnsBody;
      return this;
    }

    /**
     * Set the datacontenttype.
     *
     * @param datacontenttype the datacontenttype
     * @return the SendNotificationsOptions builder
     */
    public Builder datacontenttype(String datacontenttype) {
      this.datacontenttype = datacontenttype;
      return this;
    }

    /**
     * Set the specversion.
     *
     * @param specversion the specversion
     * @return the SendNotificationsOptions builder
     */
    public Builder specversion(String specversion) {
      this.specversion = specversion;
      return this;
    }
  }

  protected SendNotificationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subject,
      "subject cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.severity,
      "severity cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.enSourceId,
      "enSourceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.time,
      "time cannot be null");
    instanceId = builder.instanceId;
    subject = builder.subject;
    severity = builder.severity;
    id = builder.id;
    source = builder.source;
    enSourceId = builder.enSourceId;
    type = builder.type;
    time = builder.time;
    data = builder.data;
    pushTo = builder.pushTo;
    messageFcmBody = builder.messageFcmBody;
    messageApnsHeaders = builder.messageApnsHeaders;
    messageApnsBody = builder.messageApnsBody;
    datacontenttype = builder.datacontenttype;
    specversion = builder.specversion;
  }

  /**
   * New builder.
   *
   * @return a SendNotificationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * Unique identifier for IBM Cloud Event Notifications instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the subject.
   *
   * The Notifications subject.
   *
   * @return the subject
   */
  public String subject() {
    return subject;
  }

  /**
   * Gets the severity.
   *
   * The Notifications severity.
   *
   * @return the severity
   */
  public String severity() {
    return severity;
  }

  /**
   * Gets the id.
   *
   * The Notifications id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the source.
   *
   * The source of Notifications.
   *
   * @return the source
   */
  public String source() {
    return source;
  }

  /**
   * Gets the enSourceId.
   *
   * The Event Notifications source id.
   *
   * @return the enSourceId
   */
  public String enSourceId() {
    return enSourceId;
  }

  /**
   * Gets the type.
   *
   * The Notifications type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the time.
   *
   * The Notifications time.
   *
   * @return the time
   */
  public Date time() {
    return time;
  }

  /**
   * Gets the data.
   *
   * The Notifications data for webhook.
   *
   * @return the data
   */
  public Map<String, Object> data() {
    return data;
  }

  /**
   * Gets the pushTo.
   *
   * Payload describing a FCM Notifications targets.
   *
   * @return the pushTo
   */
  public NotificationDevices pushTo() {
    return pushTo;
  }

  /**
   * Gets the messageFcmBody.
   *
   * @return the messageFcmBody
   */
  public NotificationFCMBody messageFcmBody() {
    return messageFcmBody;
  }

  /**
   * Gets the messageApnsHeaders.
   *
   * The attributes for an FCM/APNs notification.
   *
   * @return the messageApnsHeaders
   */
  public Map<String, Object> messageApnsHeaders() {
    return messageApnsHeaders;
  }

  /**
   * Gets the messageApnsBody.
   *
   * Payload describing a APNs Notifications body.
   *
   * @return the messageApnsBody
   */
  public NotificationAPNSBody messageApnsBody() {
    return messageApnsBody;
  }

  /**
   * Gets the datacontenttype.
   *
   * The Notifications content type.
   *
   * @return the datacontenttype
   */
  public String datacontenttype() {
    return datacontenttype;
  }

  /**
   * Gets the specversion.
   *
   * The Notifications specversion.
   *
   * @return the specversion
   */
  public String specversion() {
    return specversion;
  }
}

