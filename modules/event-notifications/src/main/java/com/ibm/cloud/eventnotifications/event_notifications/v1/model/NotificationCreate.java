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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Payload describing a notification create request.
 */
public class NotificationCreate extends DynamicModel<Object> {

  @SerializedName("data")
  protected Map<String, Object> data;
  @SerializedName("ibmenseverity")
  protected String ibmenseverity;
  @SerializedName("ibmenfcmbody")
  protected String ibmenfcmbody;
  @SerializedName("ibmenapnsbody")
  protected String ibmenapnsbody;
  @SerializedName("ibmenpushto")
  protected String ibmenpushto;
  @SerializedName("ibmenapnsheaders")
  protected String ibmenapnsheaders;
  @SerializedName("ibmendefaultshort")
  protected String ibmendefaultshort;
  @SerializedName("ibmendefaultlong")
  protected String ibmendefaultlong;
  @SerializedName("ibmenchromebody")
  protected String ibmenchromebody;
  @SerializedName("ibmenfirefoxbody")
  protected String ibmenfirefoxbody;
  @SerializedName("ibmenchromeheaders")
  protected String ibmenchromeheaders;
  @SerializedName("ibmenfirefoxheaders")
  protected String ibmenfirefoxheaders;
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
  protected String time;

  public NotificationCreate() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> data;
    private String ibmenseverity;
    private String ibmenfcmbody;
    private String ibmenapnsbody;
    private String ibmenpushto;
    private String ibmenapnsheaders;
    private String ibmendefaultshort;
    private String ibmendefaultlong;
    private String ibmenchromebody;
    private String ibmenfirefoxbody;
    private String ibmenchromeheaders;
    private String ibmenfirefoxheaders;
    private String ibmensourceid;
    private String datacontenttype;
    private String subject;
    private String id;
    private String source;
    private String type;
    private String specversion;
    private String time;
    private Map<String, Object> dynamicProperties;

    private Builder(NotificationCreate notificationCreate) {
      this.data = notificationCreate.data;
      this.ibmenseverity = notificationCreate.ibmenseverity;
      this.ibmenfcmbody = notificationCreate.ibmenfcmbody;
      this.ibmenapnsbody = notificationCreate.ibmenapnsbody;
      this.ibmenpushto = notificationCreate.ibmenpushto;
      this.ibmenapnsheaders = notificationCreate.ibmenapnsheaders;
      this.ibmendefaultshort = notificationCreate.ibmendefaultshort;
      this.ibmendefaultlong = notificationCreate.ibmendefaultlong;
      this.ibmenchromebody = notificationCreate.ibmenchromebody;
      this.ibmenfirefoxbody = notificationCreate.ibmenfirefoxbody;
      this.ibmenchromeheaders = notificationCreate.ibmenchromeheaders;
      this.ibmenfirefoxheaders = notificationCreate.ibmenfirefoxheaders;
      this.ibmensourceid = notificationCreate.ibmensourceid;
      this.datacontenttype = notificationCreate.datacontenttype;
      this.subject = notificationCreate.subject;
      this.id = notificationCreate.id;
      this.source = notificationCreate.source;
      this.type = notificationCreate.type;
      this.specversion = notificationCreate.specversion;
      this.time = notificationCreate.time;
      this.dynamicProperties = notificationCreate.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NotificationCreate.
     *
     * @return the new NotificationCreate instance
     */
    public NotificationCreate build() {
      return new NotificationCreate(this);
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the NotificationCreate builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }

    /**
     * Set the ibmenseverity.
     *
     * @param ibmenseverity the ibmenseverity
     * @return the NotificationCreate builder
     */
    public Builder ibmenseverity(String ibmenseverity) {
      this.ibmenseverity = ibmenseverity;
      return this;
    }

    /**
     * Set the ibmenfcmbody.
     *
     * @param ibmenfcmbody the ibmenfcmbody
     * @return the NotificationCreate builder
     */
    public Builder ibmenfcmbody(String ibmenfcmbody) {
      this.ibmenfcmbody = ibmenfcmbody;
      return this;
    }

    /**
     * Set the ibmenapnsbody.
     *
     * @param ibmenapnsbody the ibmenapnsbody
     * @return the NotificationCreate builder
     */
    public Builder ibmenapnsbody(String ibmenapnsbody) {
      this.ibmenapnsbody = ibmenapnsbody;
      return this;
    }

    /**
     * Set the ibmenpushto.
     *
     * @param ibmenpushto the ibmenpushto
     * @return the NotificationCreate builder
     */
    public Builder ibmenpushto(String ibmenpushto) {
      this.ibmenpushto = ibmenpushto;
      return this;
    }

    /**
     * Set the ibmenapnsheaders.
     *
     * @param ibmenapnsheaders the ibmenapnsheaders
     * @return the NotificationCreate builder
     */
    public Builder ibmenapnsheaders(String ibmenapnsheaders) {
      this.ibmenapnsheaders = ibmenapnsheaders;
      return this;
    }

    /**
     * Set the ibmendefaultshort.
     *
     * @param ibmendefaultshort the ibmendefaultshort
     * @return the NotificationCreate builder
     */
    public Builder ibmendefaultshort(String ibmendefaultshort) {
      this.ibmendefaultshort = ibmendefaultshort;
      return this;
    }

    /**
     * Set the ibmendefaultlong.
     *
     * @param ibmendefaultlong the ibmendefaultlong
     * @return the NotificationCreate builder
     */
    public Builder ibmendefaultlong(String ibmendefaultlong) {
      this.ibmendefaultlong = ibmendefaultlong;
      return this;
    }

    /**
     * Set the ibmenchromebody.
     *
     * @param ibmenchromebody the ibmenchromebody
     * @return the NotificationCreate builder
     */
    public Builder ibmenchromebody(String ibmenchromebody) {
      this.ibmenchromebody = ibmenchromebody;
      return this;
    }

    /**
     * Set the ibmenfirefoxbody.
     *
     * @param ibmenfirefoxbody the ibmenfirefoxbody
     * @return the NotificationCreate builder
     */
    public Builder ibmenfirefoxbody(String ibmenfirefoxbody) {
      this.ibmenfirefoxbody = ibmenfirefoxbody;
      return this;
    }

    /**
     * Set the ibmenchromeheaders.
     *
     * @param ibmenchromeheaders the ibmenchromeheaders
     * @return the NotificationCreate builder
     */
    public Builder ibmenchromeheaders(String ibmenchromeheaders) {
      this.ibmenchromeheaders = ibmenchromeheaders;
      return this;
    }

    /**
     * Set the ibmenfirefoxheaders.
     *
     * @param ibmenfirefoxheaders the ibmenfirefoxheaders
     * @return the NotificationCreate builder
     */
    public Builder ibmenfirefoxheaders(String ibmenfirefoxheaders) {
      this.ibmenfirefoxheaders = ibmenfirefoxheaders;
      return this;
    }

    /**
     * Set the ibmensourceid.
     *
     * @param ibmensourceid the ibmensourceid
     * @return the NotificationCreate builder
     */
    public Builder ibmensourceid(String ibmensourceid) {
      this.ibmensourceid = ibmensourceid;
      return this;
    }

    /**
     * Set the datacontenttype.
     *
     * @param datacontenttype the datacontenttype
     * @return the NotificationCreate builder
     */
    public Builder datacontenttype(String datacontenttype) {
      this.datacontenttype = datacontenttype;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the NotificationCreate builder
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the NotificationCreate builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the NotificationCreate builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NotificationCreate builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the specversion.
     *
     * @param specversion the specversion
     * @return the NotificationCreate builder
     */
    public Builder specversion(String specversion) {
      this.specversion = specversion;
      return this;
    }

    /**
     * Set the time.
     *
     * @param time the time
     * @return the NotificationCreate builder
     */
    public Builder time(String time) {
      this.time = time;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the NotificationCreate builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected NotificationCreate(Builder builder) {
    super(new TypeToken<Object>() { });
    data = builder.data;
    ibmenseverity = builder.ibmenseverity;
    ibmenfcmbody = builder.ibmenfcmbody;
    ibmenapnsbody = builder.ibmenapnsbody;
    ibmenpushto = builder.ibmenpushto;
    ibmenapnsheaders = builder.ibmenapnsheaders;
    ibmendefaultshort = builder.ibmendefaultshort;
    ibmendefaultlong = builder.ibmendefaultlong;
    ibmenchromebody = builder.ibmenchromebody;
    ibmenfirefoxbody = builder.ibmenfirefoxbody;
    ibmenchromeheaders = builder.ibmenchromeheaders;
    ibmenfirefoxheaders = builder.ibmenfirefoxheaders;
    ibmensourceid = builder.ibmensourceid;
    datacontenttype = builder.datacontenttype;
    subject = builder.subject;
    id = builder.id;
    source = builder.source;
    type = builder.type;
    specversion = builder.specversion;
    time = builder.time;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a NotificationCreate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Sets the data.
   *
   * @param data the new data
   */
  public void setData(final Map<String, Object> data) {
    this.data = data;
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
   * Sets the ibmenseverity.
   *
   * @param ibmenseverity the new ibmenseverity
   */
  public void setIbmenseverity(final String ibmenseverity) {
    this.ibmenseverity = ibmenseverity;
  }

  /**
   * Gets the ibmenfcmbody.
   *
   * The Notifications FCM body.
   *
   * @return the ibmenfcmbody
   */
  public String getIbmenfcmbody() {
    return this.ibmenfcmbody;
  }

  /**
   * Sets the ibmenfcmbody.
   *
   * @param ibmenfcmbody the new ibmenfcmbody
   */
  public void setIbmenfcmbody(final String ibmenfcmbody) {
    this.ibmenfcmbody = ibmenfcmbody;
  }

  /**
   * Gets the ibmenapnsbody.
   *
   * The Notifications APNS body.
   *
   * @return the ibmenapnsbody
   */
  public String getIbmenapnsbody() {
    return this.ibmenapnsbody;
  }

  /**
   * Sets the ibmenapnsbody.
   *
   * @param ibmenapnsbody the new ibmenapnsbody
   */
  public void setIbmenapnsbody(final String ibmenapnsbody) {
    this.ibmenapnsbody = ibmenapnsbody;
  }

  /**
   * Gets the ibmenpushto.
   *
   * Payload describing a FCM Notifications targets.
   *
   * @return the ibmenpushto
   */
  public String getIbmenpushto() {
    return this.ibmenpushto;
  }

  /**
   * Sets the ibmenpushto.
   *
   * @param ibmenpushto the new ibmenpushto
   */
  public void setIbmenpushto(final String ibmenpushto) {
    this.ibmenpushto = ibmenpushto;
  }

  /**
   * Gets the ibmenapnsheaders.
   *
   * Headers for an APNs notification.
   *
   * @return the ibmenapnsheaders
   */
  public String getIbmenapnsheaders() {
    return this.ibmenapnsheaders;
  }

  /**
   * Sets the ibmenapnsheaders.
   *
   * @param ibmenapnsheaders the new ibmenapnsheaders
   */
  public void setIbmenapnsheaders(final String ibmenapnsheaders) {
    this.ibmenapnsheaders = ibmenapnsheaders;
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
   * Sets the ibmendefaultshort.
   *
   * @param ibmendefaultshort the new ibmendefaultshort
   */
  public void setIbmendefaultshort(final String ibmendefaultshort) {
    this.ibmendefaultshort = ibmendefaultshort;
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
   * Sets the ibmendefaultlong.
   *
   * @param ibmendefaultlong the new ibmendefaultlong
   */
  public void setIbmendefaultlong(final String ibmendefaultlong) {
    this.ibmendefaultlong = ibmendefaultlong;
  }

  /**
   * Gets the ibmenchromebody.
   *
   * The Notifications Chrome body.
   *
   * @return the ibmenchromebody
   */
  public String getIbmenchromebody() {
    return this.ibmenchromebody;
  }

  /**
   * Sets the ibmenchromebody.
   *
   * @param ibmenchromebody the new ibmenchromebody
   */
  public void setIbmenchromebody(final String ibmenchromebody) {
    this.ibmenchromebody = ibmenchromebody;
  }

  /**
   * Gets the ibmenfirefoxbody.
   *
   * The Notifications Firefox body.
   *
   * @return the ibmenfirefoxbody
   */
  public String getIbmenfirefoxbody() {
    return this.ibmenfirefoxbody;
  }

  /**
   * Sets the ibmenfirefoxbody.
   *
   * @param ibmenfirefoxbody the new ibmenfirefoxbody
   */
  public void setIbmenfirefoxbody(final String ibmenfirefoxbody) {
    this.ibmenfirefoxbody = ibmenfirefoxbody;
  }

  /**
   * Gets the ibmenchromeheaders.
   *
   * Headers for a Chrome notification.
   *
   * @return the ibmenchromeheaders
   */
  public String getIbmenchromeheaders() {
    return this.ibmenchromeheaders;
  }

  /**
   * Sets the ibmenchromeheaders.
   *
   * @param ibmenchromeheaders the new ibmenchromeheaders
   */
  public void setIbmenchromeheaders(final String ibmenchromeheaders) {
    this.ibmenchromeheaders = ibmenchromeheaders;
  }

  /**
   * Gets the ibmenfirefoxheaders.
   *
   * Headers for an FireFox notification.
   *
   * @return the ibmenfirefoxheaders
   */
  public String getIbmenfirefoxheaders() {
    return this.ibmenfirefoxheaders;
  }

  /**
   * Sets the ibmenfirefoxheaders.
   *
   * @param ibmenfirefoxheaders the new ibmenfirefoxheaders
   */
  public void setIbmenfirefoxheaders(final String ibmenfirefoxheaders) {
    this.ibmenfirefoxheaders = ibmenfirefoxheaders;
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
   * Sets the ibmensourceid.
   *
   * @param ibmensourceid the new ibmensourceid
   */
  public void setIbmensourceid(final String ibmensourceid) {
    this.ibmensourceid = ibmensourceid;
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
   * Sets the datacontenttype.
   *
   * @param datacontenttype the new datacontenttype
   */
  public void setDatacontenttype(final String datacontenttype) {
    this.datacontenttype = datacontenttype;
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
   * Sets the subject.
   *
   * @param subject the new subject
   */
  public void setSubject(final String subject) {
    this.subject = subject;
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
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(final String id) {
    this.id = id;
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
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(final String source) {
    this.source = source;
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
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
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
   * Sets the specversion.
   *
   * @param specversion the new specversion
   */
  public void setSpecversion(final String specversion) {
    this.specversion = specversion;
  }

  /**
   * Gets the time.
   *
   * The Notifications time.
   *
   * @return the time
   */
  public String getTime() {
    return this.time;
  }

  /**
   * Sets the time.
   *
   * @param time the new time
   */
  public void setTime(final String time) {
    this.time = time;
  }
}
