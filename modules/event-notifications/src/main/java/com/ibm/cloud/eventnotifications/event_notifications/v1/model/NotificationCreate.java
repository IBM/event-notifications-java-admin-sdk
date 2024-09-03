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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Payload describing a notification create request.
 */
public class NotificationCreate extends DynamicModel<Object> {

  @SerializedName("specversion")
  protected String specversion;
  @SerializedName("time")
  protected Date time;
  @SerializedName("id")
  protected String id;
  @SerializedName("source")
  protected String source;
  @SerializedName("type")
  protected String type;
  @SerializedName("ibmenseverity")
  protected String ibmenseverity;
  @SerializedName("ibmensourceid")
  protected String ibmensourceid;
  @SerializedName("ibmendefaultshort")
  protected String ibmendefaultshort;
  @SerializedName("ibmendefaultlong")
  protected String ibmendefaultlong;
  @SerializedName("ibmensubject")
  protected String ibmensubject;
  @SerializedName("ibmentemplates")
  protected String ibmentemplates;
  @SerializedName("ibmenmailto")
  protected String ibmenmailto;
  @SerializedName("ibmenslackto")
  protected String ibmenslackto;
  @SerializedName("ibmensmsto")
  protected String ibmensmsto;
  @SerializedName("ibmenhtmlbody")
  protected String ibmenhtmlbody;
  @SerializedName("subject")
  protected String subject;
  @SerializedName("ibmenmms")
  protected String ibmenmms;
  @SerializedName("data")
  protected Map<String, Object> data;
  @SerializedName("datacontenttype")
  protected String datacontenttype;
  @SerializedName("ibmenpushto")
  protected String ibmenpushto;
  @SerializedName("ibmenfcmbody")
  protected String ibmenfcmbody;
  @SerializedName("ibmenapnsbody")
  protected String ibmenapnsbody;
  @SerializedName("ibmenapnsheaders")
  protected String ibmenapnsheaders;
  @SerializedName("ibmenchromebody")
  protected String ibmenchromebody;
  @SerializedName("ibmenchromeheaders")
  protected String ibmenchromeheaders;
  @SerializedName("ibmenfirefoxbody")
  protected String ibmenfirefoxbody;
  @SerializedName("ibmenfirefoxheaders")
  protected String ibmenfirefoxheaders;
  @SerializedName("ibmenhuaweibody")
  protected String ibmenhuaweibody;
  @SerializedName("ibmensafaribody")
  protected String ibmensafaribody;

  public NotificationCreate() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String specversion;
    private Date time;
    private String id;
    private String source;
    private String type;
    private String ibmenseverity;
    private String ibmensourceid;
    private String ibmendefaultshort;
    private String ibmendefaultlong;
    private String ibmensubject;
    private String ibmentemplates;
    private String ibmenmailto;
    private String ibmenslackto;
    private String ibmensmsto;
    private String ibmenhtmlbody;
    private String subject;
    private String ibmenmms;
    private Map<String, Object> data;
    private String datacontenttype;
    private String ibmenpushto;
    private String ibmenfcmbody;
    private String ibmenapnsbody;
    private String ibmenapnsheaders;
    private String ibmenchromebody;
    private String ibmenchromeheaders;
    private String ibmenfirefoxbody;
    private String ibmenfirefoxheaders;
    private String ibmenhuaweibody;
    private String ibmensafaribody;
    private Map<String, Object> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing NotificationCreate instance.
     *
     * @param notificationCreate the instance to initialize the Builder with
     */
    private Builder(NotificationCreate notificationCreate) {
      this.specversion = notificationCreate.specversion;
      this.time = notificationCreate.time;
      this.id = notificationCreate.id;
      this.source = notificationCreate.source;
      this.type = notificationCreate.type;
      this.ibmenseverity = notificationCreate.ibmenseverity;
      this.ibmensourceid = notificationCreate.ibmensourceid;
      this.ibmendefaultshort = notificationCreate.ibmendefaultshort;
      this.ibmendefaultlong = notificationCreate.ibmendefaultlong;
      this.ibmensubject = notificationCreate.ibmensubject;
      this.ibmentemplates = notificationCreate.ibmentemplates;
      this.ibmenmailto = notificationCreate.ibmenmailto;
      this.ibmenslackto = notificationCreate.ibmenslackto;
      this.ibmensmsto = notificationCreate.ibmensmsto;
      this.ibmenhtmlbody = notificationCreate.ibmenhtmlbody;
      this.subject = notificationCreate.subject;
      this.ibmenmms = notificationCreate.ibmenmms;
      this.data = notificationCreate.data;
      this.datacontenttype = notificationCreate.datacontenttype;
      this.ibmenpushto = notificationCreate.ibmenpushto;
      this.ibmenfcmbody = notificationCreate.ibmenfcmbody;
      this.ibmenapnsbody = notificationCreate.ibmenapnsbody;
      this.ibmenapnsheaders = notificationCreate.ibmenapnsheaders;
      this.ibmenchromebody = notificationCreate.ibmenchromebody;
      this.ibmenchromeheaders = notificationCreate.ibmenchromeheaders;
      this.ibmenfirefoxbody = notificationCreate.ibmenfirefoxbody;
      this.ibmenfirefoxheaders = notificationCreate.ibmenfirefoxheaders;
      this.ibmenhuaweibody = notificationCreate.ibmenhuaweibody;
      this.ibmensafaribody = notificationCreate.ibmensafaribody;
      this.dynamicProperties = notificationCreate.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param specversion the specversion
     * @param id the id
     * @param source the source
     * @param type the type
     * @param ibmensourceid the ibmensourceid
     * @param ibmendefaultshort the ibmendefaultshort
     * @param ibmendefaultlong the ibmendefaultlong
     */
    public Builder(String specversion, String id, String source, String type, String ibmensourceid, String ibmendefaultshort, String ibmendefaultlong) {
      this.specversion = specversion;
      this.id = id;
      this.source = source;
      this.type = type;
      this.ibmensourceid = ibmensourceid;
      this.ibmendefaultshort = ibmendefaultshort;
      this.ibmendefaultlong = ibmendefaultlong;
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
    public Builder time(Date time) {
      this.time = time;
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
     * Set the ibmensubject.
     *
     * @param ibmensubject the ibmensubject
     * @return the NotificationCreate builder
     */
    public Builder ibmensubject(String ibmensubject) {
      this.ibmensubject = ibmensubject;
      return this;
    }

    /**
     * Set the ibmentemplates.
     *
     * @param ibmentemplates the ibmentemplates
     * @return the NotificationCreate builder
     */
    public Builder ibmentemplates(String ibmentemplates) {
      this.ibmentemplates = ibmentemplates;
      return this;
    }

    /**
     * Set the ibmenmailto.
     *
     * @param ibmenmailto the ibmenmailto
     * @return the NotificationCreate builder
     */
    public Builder ibmenmailto(String ibmenmailto) {
      this.ibmenmailto = ibmenmailto;
      return this;
    }

    /**
     * Set the ibmenslackto.
     *
     * @param ibmenslackto the ibmenslackto
     * @return the NotificationCreate builder
     */
    public Builder ibmenslackto(String ibmenslackto) {
      this.ibmenslackto = ibmenslackto;
      return this;
    }

    /**
     * Set the ibmensmsto.
     *
     * @param ibmensmsto the ibmensmsto
     * @return the NotificationCreate builder
     */
    public Builder ibmensmsto(String ibmensmsto) {
      this.ibmensmsto = ibmensmsto;
      return this;
    }

    /**
     * Set the ibmenhtmlbody.
     *
     * @param ibmenhtmlbody the ibmenhtmlbody
     * @return the NotificationCreate builder
     */
    public Builder ibmenhtmlbody(String ibmenhtmlbody) {
      this.ibmenhtmlbody = ibmenhtmlbody;
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
     * Set the ibmenmms.
     *
     * @param ibmenmms the ibmenmms
     * @return the NotificationCreate builder
     */
    public Builder ibmenmms(String ibmenmms) {
      this.ibmenmms = ibmenmms;
      return this;
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
     * Set the ibmenhuaweibody.
     *
     * @param ibmenhuaweibody the ibmenhuaweibody
     * @return the NotificationCreate builder
     */
    public Builder ibmenhuaweibody(String ibmenhuaweibody) {
      this.ibmenhuaweibody = ibmenhuaweibody;
      return this;
    }

    /**
     * Set the ibmensafaribody.
     *
     * @param ibmensafaribody the ibmensafaribody
     * @return the NotificationCreate builder
     */
    public Builder ibmensafaribody(String ibmensafaribody) {
      this.ibmensafaribody = ibmensafaribody;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.specversion,
      "specversion cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmensourceid,
      "ibmensourceid cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmendefaultshort,
      "ibmendefaultshort cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmendefaultlong,
      "ibmendefaultlong cannot be null");
    specversion = builder.specversion;
    time = builder.time;
    id = builder.id;
    source = builder.source;
    type = builder.type;
    ibmenseverity = builder.ibmenseverity;
    ibmensourceid = builder.ibmensourceid;
    ibmendefaultshort = builder.ibmendefaultshort;
    ibmendefaultlong = builder.ibmendefaultlong;
    ibmensubject = builder.ibmensubject;
    ibmentemplates = builder.ibmentemplates;
    ibmenmailto = builder.ibmenmailto;
    ibmenslackto = builder.ibmenslackto;
    ibmensmsto = builder.ibmensmsto;
    ibmenhtmlbody = builder.ibmenhtmlbody;
    subject = builder.subject;
    ibmenmms = builder.ibmenmms;
    data = builder.data;
    datacontenttype = builder.datacontenttype;
    ibmenpushto = builder.ibmenpushto;
    ibmenfcmbody = builder.ibmenfcmbody;
    ibmenapnsbody = builder.ibmenapnsbody;
    ibmenapnsheaders = builder.ibmenapnsheaders;
    ibmenchromebody = builder.ibmenchromebody;
    ibmenchromeheaders = builder.ibmenchromeheaders;
    ibmenfirefoxbody = builder.ibmenfirefoxbody;
    ibmenfirefoxheaders = builder.ibmenfirefoxheaders;
    ibmenhuaweibody = builder.ibmenhuaweibody;
    ibmensafaribody = builder.ibmensafaribody;
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
   * Gets the specversion.
   *
   * The version of the notification specification.
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
   * The time notification was created.
   *
   * @return the time
   */
  public Date getTime() {
    return this.time;
  }

  /**
   * Sets the time.
   *
   * @param time the new time
   */
  public void setTime(final Date time) {
    this.time = time;
  }

  /**
   * Gets the id.
   *
   * The unique identifier of the notification.
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
   * The source of notifications.
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
   * The notifications type.
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
   * Gets the ibmenseverity.
   *
   * The severity of the notification.
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
   * Gets the ibmensourceid.
   *
   * The source id of the notification.
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
   * Gets the ibmensubject.
   *
   * The subject of the notification.
   *
   * @return the ibmensubject
   */
  public String getIbmensubject() {
    return this.ibmensubject;
  }

  /**
   * Sets the ibmensubject.
   *
   * @param ibmensubject the new ibmensubject
   */
  public void setIbmensubject(final String ibmensubject) {
    this.ibmensubject = ibmensubject;
  }

  /**
   * Gets the ibmentemplates.
   *
   * The template id Array of string.
   *
   * @return the ibmentemplates
   */
  public String getIbmentemplates() {
    return this.ibmentemplates;
  }

  /**
   * Sets the ibmentemplates.
   *
   * @param ibmentemplates the new ibmentemplates
   */
  public void setIbmentemplates(final String ibmentemplates) {
    this.ibmentemplates = ibmentemplates;
  }

  /**
   * Gets the ibmenmailto.
   *
   * The email id string.
   *
   * @return the ibmenmailto
   */
  public String getIbmenmailto() {
    return this.ibmenmailto;
  }

  /**
   * Sets the ibmenmailto.
   *
   * @param ibmenmailto the new ibmenmailto
   */
  public void setIbmenmailto(final String ibmenmailto) {
    this.ibmenmailto = ibmenmailto;
  }

  /**
   * Gets the ibmenslackto.
   *
   * The slack channel id/member id stringified array.
   *
   * @return the ibmenslackto
   */
  public String getIbmenslackto() {
    return this.ibmenslackto;
  }

  /**
   * Sets the ibmenslackto.
   *
   * @param ibmenslackto the new ibmenslackto
   */
  public void setIbmenslackto(final String ibmenslackto) {
    this.ibmenslackto = ibmenslackto;
  }

  /**
   * Gets the ibmensmsto.
   *
   * The SMS number string.
   *
   * @return the ibmensmsto
   */
  public String getIbmensmsto() {
    return this.ibmensmsto;
  }

  /**
   * Sets the ibmensmsto.
   *
   * @param ibmensmsto the new ibmensmsto
   */
  public void setIbmensmsto(final String ibmensmsto) {
    this.ibmensmsto = ibmensmsto;
  }

  /**
   * Gets the ibmenhtmlbody.
   *
   * The html body of notification.
   *
   * @return the ibmenhtmlbody
   */
  public String getIbmenhtmlbody() {
    return this.ibmenhtmlbody;
  }

  /**
   * Sets the ibmenhtmlbody.
   *
   * @param ibmenhtmlbody the new ibmenhtmlbody
   */
  public void setIbmenhtmlbody(final String ibmenhtmlbody) {
    this.ibmenhtmlbody = ibmenhtmlbody;
  }

  /**
   * Gets the subject.
   *
   * The subject of the notification.
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
   * Gets the ibmenmms.
   *
   * Stringified MMS Attachment JSON.
   *
   * @return the ibmenmms
   */
  public String getIbmenmms() {
    return this.ibmenmms;
  }

  /**
   * Sets the ibmenmms.
   *
   * @param ibmenmms the new ibmenmms
   */
  public void setIbmenmms(final String ibmenmms) {
    this.ibmenmms = ibmenmms;
  }

  /**
   * Gets the data.
   *
   * The payload for webhook notification.
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
   * Gets the datacontenttype.
   *
   * The notification content type.
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
   * Gets the ibmenpushto.
   *
   * If platforms or tags or user_ids is used then do not use fcm_devices / apns_devices / chrome_devices /
   * firefox_devices / safari_devices with it. Value should be stringified.
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
   * Gets the ibmenfcmbody.
   *
   * Payload describing a notification FCM body. Value should be stringified.
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
   * Payload describing a notification APNs body. Value should be stringified.
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
   * Gets the ibmenapnsheaders.
   *
   * Headers for iOS notification. Value should be stringified.
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
   * Gets the ibmenchromebody.
   *
   * Notification payload for Chrome. Value should be stringified.
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
   * Gets the ibmenchromeheaders.
   *
   * Headers for a Chrome notification. Value should be stringified.
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
   * Gets the ibmenfirefoxbody.
   *
   * Notification payload for Firefox. Value should be stringified.
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
   * Gets the ibmenfirefoxheaders.
   *
   * Headers for a Firefox notification. Value should be stringified.
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
   * Gets the ibmenhuaweibody.
   *
   * Payload describing a notification Huawei body. Value should be stringified.
   *
   * @return the ibmenhuaweibody
   */
  public String getIbmenhuaweibody() {
    return this.ibmenhuaweibody;
  }

  /**
   * Sets the ibmenhuaweibody.
   *
   * @param ibmenhuaweibody the new ibmenhuaweibody
   */
  public void setIbmenhuaweibody(final String ibmenhuaweibody) {
    this.ibmenhuaweibody = ibmenhuaweibody;
  }

  /**
   * Gets the ibmensafaribody.
   *
   * Payload describing a notification Safari body. Value should be stringified.
   *
   * @return the ibmensafaribody
   */
  public String getIbmensafaribody() {
    return this.ibmensafaribody;
  }

  /**
   * Sets the ibmensafaribody.
   *
   * @param ibmensafaribody the new ibmensafaribody
   */
  public void setIbmensafaribody(final String ibmensafaribody) {
    this.ibmensafaribody = ibmensafaribody;
  }
}
