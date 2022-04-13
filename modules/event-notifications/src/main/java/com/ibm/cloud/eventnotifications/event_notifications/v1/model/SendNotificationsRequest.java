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

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * SendNotificationsRequest.
 *
 * Classes which extend this class:
 * - SendNotificationsRequestNotificationCreate
 * - SendNotificationsRequestNotificationBinaryMode
 */
public class SendNotificationsRequest extends DynamicModel<Object> {

  @SerializedName("data")
  protected Map<String, Object> data;
  @SerializedName("ibmenseverity")
  protected String ibmenseverity;
  @SerializedName("ibmenfcmbody")
  protected NotificationFCMBody ibmenfcmbody;
  @SerializedName("ibmenapnsbody")
  protected NotificationAPNSBody ibmenapnsbody;
  @SerializedName("ibmenpushto")
  protected NotificationDevices ibmenpushto;
  @SerializedName("ibmenapnsheaders")
  protected Map<String, Object> ibmenapnsheaders;
  @SerializedName("ibmendefaultshort")
  protected String ibmendefaultshort;
  @SerializedName("ibmendefaultlong")
  protected String ibmendefaultlong;
  @SerializedName("ibmenchromebody")
  protected NotificationChromeBody ibmenchromebody;
  @SerializedName("ibmenfirefoxbody")
  protected NotificationFirefoxBody ibmenfirefoxbody;
  @SerializedName("ibmenchromeheaders")
  protected Map<String, Object> ibmenchromeheaders;
  @SerializedName("ibmenfirefoxheaders")
  protected Map<String, Object> ibmenfirefoxheaders;
  @SerializedName("ibmensourceid")
  protected String ibmensourceid;
  @SerializedName("datacontenttype")
  protected String datacontenttype;
  @SerializedName("subject")
  protected String subject;
  @SerializedName("id")
  protected String id;
  @SerializedName("source")
  protected String source;
  @SerializedName("type")
  protected String type;
  @SerializedName("specversion")
  protected String specversion;
  @SerializedName("time")
  protected Date time;

  protected SendNotificationsRequest() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the data.
   *
   * The Notifications data for webhook.
   *
   * @return the data
   */
  public Map<String, Object> getData() {
    return this.data;
  }

  /**
   * Gets the ibmenseverity.
   *
   * The Notifications id.
   *
   * @return the ibmenseverity
   */
  public String getIbmenseverity() {
    return this.ibmenseverity;
  }

  /**
   * Gets the ibmenfcmbody.
   *
   * @return the ibmenfcmbody
   */
  public NotificationFCMBody getIbmenfcmbody() {
    return this.ibmenfcmbody;
  }

  /**
   * Gets the ibmenapnsbody.
   *
   * Payload describing a APNs Notifications body.
   *
   * @return the ibmenapnsbody
   */
  public NotificationAPNSBody getIbmenapnsbody() {
    return this.ibmenapnsbody;
  }

  /**
   * Gets the ibmenpushto.
   *
   * Payload describing a FCM Notifications targets.
   *
   * @return the ibmenpushto
   */
  public NotificationDevices getIbmenpushto() {
    return this.ibmenpushto;
  }

  /**
   * Gets the ibmenapnsheaders.
   *
   * Headers for an APNs notification.
   *
   * @return the ibmenapnsheaders
   */
  public Map<String, Object> getIbmenapnsheaders() {
    return this.ibmenapnsheaders;
  }

  /**
   * Gets the ibmendefaultshort.
   *
   * Default short text for the message.
   *
   * @return the ibmendefaultshort
   */
  public String getIbmendefaultshort() {
    return this.ibmendefaultshort;
  }

  /**
   * Gets the ibmendefaultlong.
   *
   * Default long text for the message.
   *
   * @return the ibmendefaultlong
   */
  public String getIbmendefaultlong() {
    return this.ibmendefaultlong;
  }

  /**
   * Gets the ibmenchromebody.
   *
   * @return the ibmenchromebody
   */
  public NotificationChromeBody getIbmenchromebody() {
    return this.ibmenchromebody;
  }

  /**
   * Gets the ibmenfirefoxbody.
   *
   * @return the ibmenfirefoxbody
   */
  public NotificationFirefoxBody getIbmenfirefoxbody() {
    return this.ibmenfirefoxbody;
  }

  /**
   * Gets the ibmenchromeheaders.
   *
   * Headers for a Chrome notification.
   *
   * @return the ibmenchromeheaders
   */
  public Map<String, Object> getIbmenchromeheaders() {
    return this.ibmenchromeheaders;
  }

  /**
   * Gets the ibmenfirefoxheaders.
   *
   * Headers for an FireFox notification.
   *
   * @return the ibmenfirefoxheaders
   */
  public Map<String, Object> getIbmenfirefoxheaders() {
    return this.ibmenfirefoxheaders;
  }

  /**
   * Gets the ibmensourceid.
   *
   * The Event Notifications source id.
   *
   * @return the ibmensourceid
   */
  public String getIbmensourceid() {
    return this.ibmensourceid;
  }

  /**
   * Gets the datacontenttype.
   *
   * The Notifications content type.
   *
   * @return the datacontenttype
   */
  public String getDatacontenttype() {
    return this.datacontenttype;
  }

  /**
   * Gets the subject.
   *
   * The Notifications subject.
   *
   * @return the subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Gets the id.
   *
   * The Notifications id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the source.
   *
   * The source of Notifications.
   *
   * @return the source
   */
  public String getSource() {
    return this.source;
  }

  /**
   * Gets the type.
   *
   * The Notifications type.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Gets the specversion.
   *
   * The Notifications specversion.
   *
   * @return the specversion
   */
  public String getSpecversion() {
    return this.specversion;
  }

  /**
   * Gets the time.
   *
   * The Notifications time.
   *
   * @return the time
   */
  public Date getTime() {
    return this.time;
  }
}
