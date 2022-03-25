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
  protected String ibmenseverity;
  protected String ibmensourceid;
  protected String subject;
  protected String id;
  protected String source;
  protected String type;
  protected Date time;
  protected Map<String, Object> data;
  protected NotificationFCMBody ibmenfcmbody;
  protected NotificationAPNSBody ibmenapnsbody;
  protected NotificationDevices ibmenpushto;
  protected Map<String, Object> ibmenapnsheaders;
  protected String datacontenttype;
  protected String specversion;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String ibmenseverity;
    private String ibmensourceid;
    private String subject;
    private String id;
    private String source;
    private String type;
    private Date time;
    private Map<String, Object> data;
    private NotificationFCMBody ibmenfcmbody;
    private NotificationAPNSBody ibmenapnsbody;
    private NotificationDevices ibmenpushto;
    private Map<String, Object> ibmenapnsheaders;
    private String datacontenttype;
    private String specversion;

    private Builder(SendNotificationsOptions sendNotificationsOptions) {
      this.instanceId = sendNotificationsOptions.instanceId;
      this.ibmenseverity = sendNotificationsOptions.ibmenseverity;
      this.ibmensourceid = sendNotificationsOptions.ibmensourceid;
      this.subject = sendNotificationsOptions.subject;
      this.id = sendNotificationsOptions.id;
      this.source = sendNotificationsOptions.source;
      this.type = sendNotificationsOptions.type;
      this.time = sendNotificationsOptions.time;
      this.data = sendNotificationsOptions.data;
      this.ibmenfcmbody = sendNotificationsOptions.ibmenfcmbody;
      this.ibmenapnsbody = sendNotificationsOptions.ibmenapnsbody;
      this.ibmenpushto = sendNotificationsOptions.ibmenpushto;
      this.ibmenapnsheaders = sendNotificationsOptions.ibmenapnsheaders;
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
     * @param ibmenseverity the ibmenseverity
     * @param ibmensourceid the ibmensourceid
     * @param subject the subject
     * @param id the id
     * @param source the source
     * @param type the type
     * @param time the time
     */
    public Builder(String instanceId, String ibmenseverity, String ibmensourceid, String subject, String id, String source, String type, Date time) {
      this.instanceId = instanceId;
      this.ibmenseverity = ibmenseverity;
      this.ibmensourceid = ibmensourceid;
      this.subject = subject;
      this.id = id;
      this.source = source;
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
     * Set the ibmenseverity.
     *
     * @param ibmenseverity the ibmenseverity
     * @return the SendNotificationsOptions builder
     */
    public Builder ibmenseverity(String ibmenseverity) {
      this.ibmenseverity = ibmenseverity;
      return this;
    }

    /**
     * Set the ibmensourceid.
     *
     * @param ibmensourceid the ibmensourceid
     * @return the SendNotificationsOptions builder
     */
    public Builder ibmensourceid(String ibmensourceid) {
      this.ibmensourceid = ibmensourceid;
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
     * Set the ibmenfcmbody.
     *
     * @param ibmenfcmbody the ibmenfcmbody
     * @return the SendNotificationsOptions builder
     */
    public Builder ibmenfcmbody(NotificationFCMBody ibmenfcmbody) {
      this.ibmenfcmbody = ibmenfcmbody;
      return this;
    }

    /**
     * Set the ibmenapnsbody.
     *
     * @param ibmenapnsbody the ibmenapnsbody
     * @return the SendNotificationsOptions builder
     */
    public Builder ibmenapnsbody(NotificationAPNSBody ibmenapnsbody) {
      this.ibmenapnsbody = ibmenapnsbody;
      return this;
    }

    /**
     * Set the ibmenpushto.
     *
     * @param ibmenpushto the ibmenpushto
     * @return the SendNotificationsOptions builder
     */
    public Builder ibmenpushto(NotificationDevices ibmenpushto) {
      this.ibmenpushto = ibmenpushto;
      return this;
    }

    /**
     * Set the ibmenapnsheaders.
     *
     * @param ibmenapnsheaders the ibmenapnsheaders
     * @return the SendNotificationsOptions builder
     */
    public Builder ibmenapnsheaders(Map<String, Object> ibmenapnsheaders) {
      this.ibmenapnsheaders = ibmenapnsheaders;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmenseverity,
      "ibmenseverity cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmensourceid,
      "ibmensourceid cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subject,
      "subject cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.time,
      "time cannot be null");
    instanceId = builder.instanceId;
    ibmenseverity = builder.ibmenseverity;
    ibmensourceid = builder.ibmensourceid;
    subject = builder.subject;
    id = builder.id;
    source = builder.source;
    type = builder.type;
    time = builder.time;
    data = builder.data;
    ibmenfcmbody = builder.ibmenfcmbody;
    ibmenapnsbody = builder.ibmenapnsbody;
    ibmenpushto = builder.ibmenpushto;
    ibmenapnsheaders = builder.ibmenapnsheaders;
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
   * Gets the ibmenseverity.
   *
   * The Notifications id.
   *
   * @return the ibmenseverity
   */
  public String ibmenseverity() {
    return ibmenseverity;
  }

  /**
   * Gets the ibmensourceid.
   *
   * The Event Notifications source id.
   *
   * @return the ibmensourceid
   */
  public String ibmensourceid() {
    return ibmensourceid;
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
   * Gets the ibmenfcmbody.
   *
   * @return the ibmenfcmbody
   */
  public NotificationFCMBody ibmenfcmbody() {
    return ibmenfcmbody;
  }

  /**
   * Gets the ibmenapnsbody.
   *
   * Payload describing a APNs Notifications body.
   *
   * @return the ibmenapnsbody
   */
  public NotificationAPNSBody ibmenapnsbody() {
    return ibmenapnsbody;
  }

  /**
   * Gets the ibmenpushto.
   *
   * Payload describing a FCM Notifications targets.
   *
   * @return the ibmenpushto
   */
  public NotificationDevices ibmenpushto() {
    return ibmenpushto;
  }

  /**
   * Gets the ibmenapnsheaders.
   *
   * The attributes for an FCM/APNs notification.
   *
   * @return the ibmenapnsheaders
   */
  public Map<String, Object> ibmenapnsheaders() {
    return ibmenapnsheaders;
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

