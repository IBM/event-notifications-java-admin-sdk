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
  protected SendNotificationsRequest body;
  protected String ceIbmenseverity;
  protected String ceIbmendefaultshort;
  protected String ceIbmendefaultlong;
  protected NotificationFCMBody ceIbmenfcmbody;
  protected NotificationAPNSBody ceIbmenapnsbody;
  protected NotificationDevices ceIbmenpushto;
  protected Map<String, Object> ceIbmenapnsheaders;
  protected NotificationChromeBody ceIbmenchromebody;
  protected NotificationFirefoxBody ceIbmenfirefoxbody;
  protected Map<String, Object> ceIbmenchromeheaders;
  protected Map<String, Object> ceIbmenfirefoxheaders;
  protected String ceIbmensourceid;
  protected String ceId;
  protected String ceSource;
  protected String ceType;
  protected String ceSpecversion;
  protected Date ceTime;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private SendNotificationsRequest body;
    private String ceIbmenseverity;
    private String ceIbmendefaultshort;
    private String ceIbmendefaultlong;
    private NotificationFCMBody ceIbmenfcmbody;
    private NotificationAPNSBody ceIbmenapnsbody;
    private NotificationDevices ceIbmenpushto;
    private Map<String, Object> ceIbmenapnsheaders;
    private NotificationChromeBody ceIbmenchromebody;
    private NotificationFirefoxBody ceIbmenfirefoxbody;
    private Map<String, Object> ceIbmenchromeheaders;
    private Map<String, Object> ceIbmenfirefoxheaders;
    private String ceIbmensourceid;
    private String ceId;
    private String ceSource;
    private String ceType;
    private String ceSpecversion;
    private Date ceTime;

    private Builder(SendNotificationsOptions sendNotificationsOptions) {
      this.instanceId = sendNotificationsOptions.instanceId;
      this.body = sendNotificationsOptions.body;
      this.ceIbmenseverity = sendNotificationsOptions.ceIbmenseverity;
      this.ceIbmendefaultshort = sendNotificationsOptions.ceIbmendefaultshort;
      this.ceIbmendefaultlong = sendNotificationsOptions.ceIbmendefaultlong;
      this.ceIbmenfcmbody = sendNotificationsOptions.ceIbmenfcmbody;
      this.ceIbmenapnsbody = sendNotificationsOptions.ceIbmenapnsbody;
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
    public Builder body(SendNotificationsRequest body) {
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
    public Builder ceIbmenfcmbody(NotificationFCMBody ceIbmenfcmbody) {
      this.ceIbmenfcmbody = ceIbmenfcmbody;
      return this;
    }

    /**
     * Set the ceIbmenapnsbody.
     *
     * @param ceIbmenapnsbody the ceIbmenapnsbody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenapnsbody(NotificationAPNSBody ceIbmenapnsbody) {
      this.ceIbmenapnsbody = ceIbmenapnsbody;
      return this;
    }

    /**
     * Set the ceIbmenpushto.
     *
     * @param ceIbmenpushto the ceIbmenpushto
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenpushto(NotificationDevices ceIbmenpushto) {
      this.ceIbmenpushto = ceIbmenpushto;
      return this;
    }

    /**
     * Set the ceIbmenapnsheaders.
     *
     * @param ceIbmenapnsheaders the ceIbmenapnsheaders
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenapnsheaders(Map<String, Object> ceIbmenapnsheaders) {
      this.ceIbmenapnsheaders = ceIbmenapnsheaders;
      return this;
    }

    /**
     * Set the ceIbmenchromebody.
     *
     * @param ceIbmenchromebody the ceIbmenchromebody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenchromebody(NotificationChromeBody ceIbmenchromebody) {
      this.ceIbmenchromebody = ceIbmenchromebody;
      return this;
    }

    /**
     * Set the ceIbmenfirefoxbody.
     *
     * @param ceIbmenfirefoxbody the ceIbmenfirefoxbody
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenfirefoxbody(NotificationFirefoxBody ceIbmenfirefoxbody) {
      this.ceIbmenfirefoxbody = ceIbmenfirefoxbody;
      return this;
    }

    /**
     * Set the ceIbmenchromeheaders.
     *
     * @param ceIbmenchromeheaders the ceIbmenchromeheaders
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenchromeheaders(Map<String, Object> ceIbmenchromeheaders) {
      this.ceIbmenchromeheaders = ceIbmenchromeheaders;
      return this;
    }

    /**
     * Set the ceIbmenfirefoxheaders.
     *
     * @param ceIbmenfirefoxheaders the ceIbmenfirefoxheaders
     * @return the SendNotificationsOptions builder
     */
    public Builder ceIbmenfirefoxheaders(Map<String, Object> ceIbmenfirefoxheaders) {
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
    public Builder ceTime(Date ceTime) {
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
   * @return the body
   */
  public SendNotificationsRequest body() {
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
  public NotificationFCMBody ceIbmenfcmbody() {
    return ceIbmenfcmbody;
  }

  /**
   * Gets the ceIbmenapnsbody.
   *
   * The APNS Notification body.
   *
   * @return the ceIbmenapnsbody
   */
  public NotificationAPNSBody ceIbmenapnsbody() {
    return ceIbmenapnsbody;
  }

  /**
   * Gets the ceIbmenpushto.
   *
   * Push Notifications Targets.
   *
   * @return the ceIbmenpushto
   */
  public NotificationDevices ceIbmenpushto() {
    return ceIbmenpushto;
  }

  /**
   * Gets the ceIbmenapnsheaders.
   *
   * Push Notifications APNS Headers.
   *
   * @return the ceIbmenapnsheaders
   */
  public Map<String, Object> ceIbmenapnsheaders() {
    return ceIbmenapnsheaders;
  }

  /**
   * Gets the ceIbmenchromebody.
   *
   * Push Notifications Chrome body.
   *
   * @return the ceIbmenchromebody
   */
  public NotificationChromeBody ceIbmenchromebody() {
    return ceIbmenchromebody;
  }

  /**
   * Gets the ceIbmenfirefoxbody.
   *
   * Push Notifications Firefox body.
   *
   * @return the ceIbmenfirefoxbody
   */
  public NotificationFirefoxBody ceIbmenfirefoxbody() {
    return ceIbmenfirefoxbody;
  }

  /**
   * Gets the ceIbmenchromeheaders.
   *
   * Push Notifications Chrome Headers.
   *
   * @return the ceIbmenchromeheaders
   */
  public Map<String, Object> ceIbmenchromeheaders() {
    return ceIbmenchromeheaders;
  }

  /**
   * Gets the ceIbmenfirefoxheaders.
   *
   * Push Notifications Firefox Headers.
   *
   * @return the ceIbmenfirefoxheaders
   */
  public Map<String, Object> ceIbmenfirefoxheaders() {
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
  public Date ceTime() {
    return ceTime;
  }
}

