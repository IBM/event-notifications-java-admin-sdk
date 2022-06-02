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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The sendNotifications options.
 */
public class SendNotificationsOptions extends GenericModel {

  protected String instanceId;
  protected NotificationCreate body;
  protected String ceIbmenseverity;
  protected String ceIbmendefaultshort;
  protected String ceIbmendefaultlong;
  protected String ceIbmenfcmbody;
  protected String ceIbmenapnsbody;
  protected String ceIbmensafaribody;
  protected String ceIbmenpushto;
  protected String ceIbmenapnsheaders;
  protected String ceIbmenchromebody;
  protected String ceIbmenfirefoxbody;
  protected String ceIbmenchromeheaders;
  protected String ceIbmenfirefoxheaders;
  protected String ceIbmensourceid;
  protected String ceId;
  protected String ceSource;
  protected String ceType;
  protected String ceSpecversion;
  protected String ceTime;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private NotificationCreate body;
    private String ceIbmenseverity;
    private String ceIbmendefaultshort;
    private String ceIbmendefaultlong;
    private String ceIbmenfcmbody;
    private String ceIbmenapnsbody;
    private String ceIbmensafaribody;
    private String ceIbmenpushto;
    private String ceIbmenapnsheaders;
    private String ceIbmenchromebody;
    private String ceIbmenfirefoxbody;
    private String ceIbmenchromeheaders;
    private String ceIbmenfirefoxheaders;
    private String ceIbmensourceid;
    private String ceId;
    private String ceSource;
    private String ceType;
    private String ceSpecversion;
    private String ceTime;

    private Builder(SendNotificationsOptions sendNotificationsOptions) {
      this.instanceId = sendNotificationsOptions.instanceId;
      this.body = sendNotificationsOptions.body;
      this.ceIbmenseverity = sendNotificationsOptions.ceIbmenseverity;
      this.ceIbmendefaultshort = sendNotificationsOptions.ceIbmendefaultshort;
      this.ceIbmendefaultlong = sendNotificationsOptions.ceIbmendefaultlong;
      this.ceIbmenfcmbody = sendNotificationsOptions.ceIbmenfcmbody;
      this.ceIbmenapnsbody = sendNotificationsOptions.ceIbmenapnsbody;
      this.ceIbmensafaribody = sendNotificationsOptions.ceIbmensafaribody;
      this.ceIbmenpushto = sendNotificationsOptions.ceIbmenpushto;
      this.ceIbmenapnsheaders = sendNotificationsOptions.ceIbmenapnsheaders;
      this.ceIbmenchromebody = sendNotificationsOptions.ceIbmenchromebody;
      this.ceIbmenfirefoxbody = sendNotificationsOptions.ceIbmenfirefoxbody;
      this.ceIbmenchromeheaders = sendNotificationsOptions.ceIbmenchromeheaders;
      this.ceIbmenfirefoxheaders = sendNotificationsOptions.ceIbmenfirefoxheaders;
      this.ceIbmensourceid = sendNotificationsOptions.ceIbmensourceid;
      this.ceId = sendNotificationsOptions.ceId;
      this.ceSource = sendNotificationsOptions.ceSource;
      this.ceType = sendNotificationsOptions.ceType;
      this.ceSpecversion = sendNotificationsOptions.ceSpecversion;
      this.ceTime = sendNotificationsOptions.ceTime;
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
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
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
     * Set the body.
     *
     * @param body the body
     * @return the SendNotificationsOptions builder
     */
    public Builder body(NotificationCreate body) {
      this.body = body;
      return this;
    }

    /**
     * Set the ceIbmenseverity.
     *
     * @param ceIbmenseverity the ceIbmenseverity
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenseverity(String ceIbmenseverity) {
      this.ceIbmenseverity = ceIbmenseverity;
      return this;
    }

    /**
     * Set the ceIbmendefaultshort.
     *
     * @param ceIbmendefaultshort the ceIbmendefaultshort
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmendefaultshort(String ceIbmendefaultshort) {
      this.ceIbmendefaultshort = ceIbmendefaultshort;
      return this;
    }

    /**
     * Set the ceIbmendefaultlong.
     *
     * @param ceIbmendefaultlong the ceIbmendefaultlong
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmendefaultlong(String ceIbmendefaultlong) {
      this.ceIbmendefaultlong = ceIbmendefaultlong;
      return this;
    }

    /**
     * Set the ceIbmenfcmbody.
     *
     * @param ceIbmenfcmbody the ceIbmenfcmbody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenfcmbody(String ceIbmenfcmbody) {
      this.ceIbmenfcmbody = ceIbmenfcmbody;
      return this;
    }

    /**
     * Set the ceIbmenapnsbody.
     *
     * @param ceIbmenapnsbody the ceIbmenapnsbody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenapnsbody(String ceIbmenapnsbody) {
      this.ceIbmenapnsbody = ceIbmenapnsbody;
      return this;
    }

    /**
     * Set the ceIbmensafaribody.
     *
     * @param ceIbmensafaribody the ceIbmensafaribody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmensafaribody(String ceIbmensafaribody) {
      this.ceIbmensafaribody = ceIbmensafaribody;
      return this;
    }

    /**
     * Set the ceIbmenpushto.
     *
     * @param ceIbmenpushto the ceIbmenpushto
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenpushto(String ceIbmenpushto) {
      this.ceIbmenpushto = ceIbmenpushto;
      return this;
    }

    /**
     * Set the ceIbmenapnsheaders.
     *
     * @param ceIbmenapnsheaders the ceIbmenapnsheaders
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenapnsheaders(String ceIbmenapnsheaders) {
      this.ceIbmenapnsheaders = ceIbmenapnsheaders;
      return this;
    }

    /**
     * Set the ceIbmenchromebody.
     *
     * @param ceIbmenchromebody the ceIbmenchromebody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenchromebody(String ceIbmenchromebody) {
      this.ceIbmenchromebody = ceIbmenchromebody;
      return this;
    }

    /**
     * Set the ceIbmenfirefoxbody.
     *
     * @param ceIbmenfirefoxbody the ceIbmenfirefoxbody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenfirefoxbody(String ceIbmenfirefoxbody) {
      this.ceIbmenfirefoxbody = ceIbmenfirefoxbody;
      return this;
    }

    /**
     * Set the ceIbmenchromeheaders.
     *
     * @param ceIbmenchromeheaders the ceIbmenchromeheaders
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenchromeheaders(String ceIbmenchromeheaders) {
      this.ceIbmenchromeheaders = ceIbmenchromeheaders;
      return this;
    }

    /**
     * Set the ceIbmenfirefoxheaders.
     *
     * @param ceIbmenfirefoxheaders the ceIbmenfirefoxheaders
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenfirefoxheaders(String ceIbmenfirefoxheaders) {
      this.ceIbmenfirefoxheaders = ceIbmenfirefoxheaders;
      return this;
    }

    /**
     * Set the ceIbmensourceid.
     *
     * @param ceIbmensourceid the ceIbmensourceid
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmensourceid(String ceIbmensourceid) {
      this.ceIbmensourceid = ceIbmensourceid;
      return this;
    }

    /**
     * Set the ceId.
     *
     * @param ceId the ceId
     * @return the SendNotificationsOptions builder
     */
    public Builder ceId(String ceId) {
      this.ceId = ceId;
      return this;
    }

    /**
     * Set the ceSource.
     *
     * @param ceSource the ceSource
     * @return the SendNotificationsOptions builder
     */
    public Builder ceSource(String ceSource) {
      this.ceSource = ceSource;
      return this;
    }

    /**
     * Set the ceType.
     *
     * @param ceType the ceType
     * @return the SendNotificationsOptions builder
     */
    public Builder ceType(String ceType) {
      this.ceType = ceType;
      return this;
    }

    /**
     * Set the ceSpecversion.
     *
     * @param ceSpecversion the ceSpecversion
     * @return the SendNotificationsOptions builder
     */
    public Builder ceSpecversion(String ceSpecversion) {
      this.ceSpecversion = ceSpecversion;
      return this;
    }

    /**
     * Set the ceTime.
     *
     * @param ceTime the ceTime
     * @return the SendNotificationsOptions builder
     */
    public Builder ceTime(String ceTime) {
      this.ceTime = ceTime;
      return this;
    }
  }

  protected SendNotificationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    body = builder.body;
    ceIbmenseverity = builder.ceIbmenseverity;
    ceIbmendefaultshort = builder.ceIbmendefaultshort;
    ceIbmendefaultlong = builder.ceIbmendefaultlong;
    ceIbmenfcmbody = builder.ceIbmenfcmbody;
    ceIbmenapnsbody = builder.ceIbmenapnsbody;
    ceIbmensafaribody = builder.ceIbmensafaribody;
    ceIbmenpushto = builder.ceIbmenpushto;
    ceIbmenapnsheaders = builder.ceIbmenapnsheaders;
    ceIbmenchromebody = builder.ceIbmenchromebody;
    ceIbmenfirefoxbody = builder.ceIbmenfirefoxbody;
    ceIbmenchromeheaders = builder.ceIbmenchromeheaders;
    ceIbmenfirefoxheaders = builder.ceIbmenfirefoxheaders;
    ceIbmensourceid = builder.ceIbmensourceid;
    ceId = builder.ceId;
    ceSource = builder.ceSource;
    ceType = builder.ceType;
    ceSpecversion = builder.ceSpecversion;
    ceTime = builder.ceTime;
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
   * Gets the body.
   *
   * Payload describing a notification create request.
   *
   * @return the body
   */
  public NotificationCreate body() {
    return body;
  }

  /**
   * Gets the ceIbmenseverity.
   *
   * The Notification severity.
   *
   * @return the ceIbmenseverity
   */
  public String ceIbmenseverity() {
    return ceIbmenseverity;
  }

  /**
   * Gets the ceIbmendefaultshort.
   *
   * The Notification default short text.
   *
   * @return the ceIbmendefaultshort
   */
  public String ceIbmendefaultshort() {
    return ceIbmendefaultshort;
  }

  /**
   * Gets the ceIbmendefaultlong.
   *
   * The Notification default long text.
   *
   * @return the ceIbmendefaultlong
   */
  public String ceIbmendefaultlong() {
    return ceIbmendefaultlong;
  }

  /**
   * Gets the ceIbmenfcmbody.
   *
   * The FCM Notification body.
   *
   * @return the ceIbmenfcmbody
   */
  public String ceIbmenfcmbody() {
    return ceIbmenfcmbody;
  }

  /**
   * Gets the ceIbmenapnsbody.
   *
   * The APNS Notification body.
   *
   * @return the ceIbmenapnsbody
   */
  public String ceIbmenapnsbody() {
    return ceIbmenapnsbody;
  }

  /**
   * Gets the ceIbmensafaribody.
   *
   * The safari Notification body.
   *
   * @return the ceIbmensafaribody
   */
  public String ceIbmensafaribody() {
    return ceIbmensafaribody;
  }

  /**
   * Gets the ceIbmenpushto.
   *
   * Push Notifications Targets.
   *
   * @return the ceIbmenpushto
   */
  public String ceIbmenpushto() {
    return ceIbmenpushto;
  }

  /**
   * Gets the ceIbmenapnsheaders.
   *
   * Push Notifications APNS Headers.
   *
   * @return the ceIbmenapnsheaders
   */
  public String ceIbmenapnsheaders() {
    return ceIbmenapnsheaders;
  }

  /**
   * Gets the ceIbmenchromebody.
   *
   * Push Notifications Chrome body.
   *
   * @return the ceIbmenchromebody
   */
  public String ceIbmenchromebody() {
    return ceIbmenchromebody;
  }

  /**
   * Gets the ceIbmenfirefoxbody.
   *
   * Push Notifications Firefox body.
   *
   * @return the ceIbmenfirefoxbody
   */
  public String ceIbmenfirefoxbody() {
    return ceIbmenfirefoxbody;
  }

  /**
   * Gets the ceIbmenchromeheaders.
   *
   * Push Notifications Chrome Headers.
   *
   * @return the ceIbmenchromeheaders
   */
  public String ceIbmenchromeheaders() {
    return ceIbmenchromeheaders;
  }

  /**
   * Gets the ceIbmenfirefoxheaders.
   *
   * Push Notifications Firefox Headers.
   *
   * @return the ceIbmenfirefoxheaders
   */
  public String ceIbmenfirefoxheaders() {
    return ceIbmenfirefoxheaders;
  }

  /**
   * Gets the ceIbmensourceid.
   *
   * Event Notifications Target source ID.
   *
   * @return the ceIbmensourceid
   */
  public String ceIbmensourceid() {
    return ceIbmensourceid;
  }

  /**
   * Gets the ceId.
   *
   * custom ID to track notifications from client side (Mandatory identifier for the binary mode).
   *
   * @return the ceId
   */
  public String ceId() {
    return ceId;
  }

  /**
   * Gets the ceSource.
   *
   * custom source odentifier from the client side.
   *
   * @return the ceSource
   */
  public String ceSource() {
    return ceSource;
  }

  /**
   * Gets the ceType.
   *
   * Type identifier for source filters.
   *
   * @return the ceType
   */
  public String ceType() {
    return ceType;
  }

  /**
   * Gets the ceSpecversion.
   *
   * Version of the Cloud Event specification (Mandatory header to make the request Binary Mode).
   *
   * @return the ceSpecversion
   */
  public String ceSpecversion() {
    return ceSpecversion;
  }

  /**
   * Gets the ceTime.
   *
   * The time of the notification.
   *
   * @return the ceTime
   */
  public String ceTime() {
    return ceTime;
  }
}

