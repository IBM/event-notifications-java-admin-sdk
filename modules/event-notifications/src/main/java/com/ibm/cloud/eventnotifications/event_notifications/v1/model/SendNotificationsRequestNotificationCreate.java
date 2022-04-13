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
import java.util.HashMap;
import java.util.Map;

/**
 * Payload describing a notification create request.
 */
public class SendNotificationsRequestNotificationCreate extends SendNotificationsRequest {


  public SendNotificationsRequestNotificationCreate() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> data;
    private String ibmenseverity;
    private NotificationFCMBody ibmenfcmbody;
    private NotificationAPNSBody ibmenapnsbody;
    private NotificationDevices ibmenpushto;
    private Map<String, Object> ibmenapnsheaders;
    private String ibmendefaultshort;
    private String ibmendefaultlong;
    private NotificationChromeBody ibmenchromebody;
    private NotificationFirefoxBody ibmenfirefoxbody;
    private Map<String, Object> ibmenchromeheaders;
    private Map<String, Object> ibmenfirefoxheaders;
    private String ibmensourceid;
    private String datacontenttype;
    private String subject;
    private String id;
    private String source;
    private String type;
    private String specversion;
    private Date time;
    private Map<String, Object> dynamicProperties;

    public Builder(SendNotificationsRequest sendNotificationsRequestNotificationCreate) {
      this.data = sendNotificationsRequestNotificationCreate.data;
      this.ibmenseverity = sendNotificationsRequestNotificationCreate.ibmenseverity;
      this.ibmenfcmbody = sendNotificationsRequestNotificationCreate.ibmenfcmbody;
      this.ibmenapnsbody = sendNotificationsRequestNotificationCreate.ibmenapnsbody;
      this.ibmenpushto = sendNotificationsRequestNotificationCreate.ibmenpushto;
      this.ibmenapnsheaders = sendNotificationsRequestNotificationCreate.ibmenapnsheaders;
      this.ibmendefaultshort = sendNotificationsRequestNotificationCreate.ibmendefaultshort;
      this.ibmendefaultlong = sendNotificationsRequestNotificationCreate.ibmendefaultlong;
      this.ibmenchromebody = sendNotificationsRequestNotificationCreate.ibmenchromebody;
      this.ibmenfirefoxbody = sendNotificationsRequestNotificationCreate.ibmenfirefoxbody;
      this.ibmenchromeheaders = sendNotificationsRequestNotificationCreate.ibmenchromeheaders;
      this.ibmenfirefoxheaders = sendNotificationsRequestNotificationCreate.ibmenfirefoxheaders;
      this.ibmensourceid = sendNotificationsRequestNotificationCreate.ibmensourceid;
      this.datacontenttype = sendNotificationsRequestNotificationCreate.datacontenttype;
      this.subject = sendNotificationsRequestNotificationCreate.subject;
      this.id = sendNotificationsRequestNotificationCreate.id;
      this.source = sendNotificationsRequestNotificationCreate.source;
      this.type = sendNotificationsRequestNotificationCreate.type;
      this.specversion = sendNotificationsRequestNotificationCreate.specversion;
      this.time = sendNotificationsRequestNotificationCreate.time;
      this.dynamicProperties = sendNotificationsRequestNotificationCreate.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ibmenseverity the ibmenseverity
     * @param ibmensourceid the ibmensourceid
     * @param id the id
     * @param source the source
     * @param type the type
     * @param time the time
     */
    public Builder(String ibmenseverity, String ibmensourceid, String id, String source, String type, Date time) {
      this.ibmenseverity = ibmenseverity;
      this.ibmensourceid = ibmensourceid;
      this.id = id;
      this.source = source;
      this.type = type;
      this.time = time;
    }

    /**
     * Builds a SendNotificationsRequestNotificationCreate.
     *
     * @return the new SendNotificationsRequestNotificationCreate instance
     */
    public SendNotificationsRequestNotificationCreate build() {
      return new SendNotificationsRequestNotificationCreate(this);
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }

    /**
     * Set the ibmenseverity.
     *
     * @param ibmenseverity the ibmenseverity
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenseverity(String ibmenseverity) {
      this.ibmenseverity = ibmenseverity;
      return this;
    }

    /**
     * Set the ibmenfcmbody.
     *
     * @param ibmenfcmbody the ibmenfcmbody
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenfcmbody(NotificationFCMBody ibmenfcmbody) {
      this.ibmenfcmbody = ibmenfcmbody;
      return this;
    }

    /**
     * Set the ibmenapnsbody.
     *
     * @param ibmenapnsbody the ibmenapnsbody
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenapnsbody(NotificationAPNSBody ibmenapnsbody) {
      this.ibmenapnsbody = ibmenapnsbody;
      return this;
    }

    /**
     * Set the ibmenpushto.
     *
     * @param ibmenpushto the ibmenpushto
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenpushto(NotificationDevices ibmenpushto) {
      this.ibmenpushto = ibmenpushto;
      return this;
    }

    /**
     * Set the ibmenapnsheaders.
     *
     * @param ibmenapnsheaders the ibmenapnsheaders
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenapnsheaders(Map<String, Object> ibmenapnsheaders) {
      this.ibmenapnsheaders = ibmenapnsheaders;
      return this;
    }

    /**
     * Set the ibmendefaultshort.
     *
     * @param ibmendefaultshort the ibmendefaultshort
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmendefaultshort(String ibmendefaultshort) {
      this.ibmendefaultshort = ibmendefaultshort;
      return this;
    }

    /**
     * Set the ibmendefaultlong.
     *
     * @param ibmendefaultlong the ibmendefaultlong
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmendefaultlong(String ibmendefaultlong) {
      this.ibmendefaultlong = ibmendefaultlong;
      return this;
    }

    /**
     * Set the ibmenchromebody.
     *
     * @param ibmenchromebody the ibmenchromebody
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenchromebody(NotificationChromeBody ibmenchromebody) {
      this.ibmenchromebody = ibmenchromebody;
      return this;
    }

    /**
     * Set the ibmenfirefoxbody.
     *
     * @param ibmenfirefoxbody the ibmenfirefoxbody
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenfirefoxbody(NotificationFirefoxBody ibmenfirefoxbody) {
      this.ibmenfirefoxbody = ibmenfirefoxbody;
      return this;
    }

    /**
     * Set the ibmenchromeheaders.
     *
     * @param ibmenchromeheaders the ibmenchromeheaders
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenchromeheaders(Map<String, Object> ibmenchromeheaders) {
      this.ibmenchromeheaders = ibmenchromeheaders;
      return this;
    }

    /**
     * Set the ibmenfirefoxheaders.
     *
     * @param ibmenfirefoxheaders the ibmenfirefoxheaders
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmenfirefoxheaders(Map<String, Object> ibmenfirefoxheaders) {
      this.ibmenfirefoxheaders = ibmenfirefoxheaders;
      return this;
    }

    /**
     * Set the ibmensourceid.
     *
     * @param ibmensourceid the ibmensourceid
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder ibmensourceid(String ibmensourceid) {
      this.ibmensourceid = ibmensourceid;
      return this;
    }

    /**
     * Set the datacontenttype.
     *
     * @param datacontenttype the datacontenttype
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder datacontenttype(String datacontenttype) {
      this.datacontenttype = datacontenttype;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the specversion.
     *
     * @param specversion the specversion
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder specversion(String specversion) {
      this.specversion = specversion;
      return this;
    }

    /**
     * Set the time.
     *
     * @param time the time
     * @return the SendNotificationsRequestNotificationCreate builder
     */
    public Builder time(Date time) {
      this.time = time;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SendNotificationsRequestNotificationCreate builder
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

  protected SendNotificationsRequestNotificationCreate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmenseverity,
      "ibmenseverity cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmensourceid,
      "ibmensourceid cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.time,
      "time cannot be null");
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
   * @return a SendNotificationsRequestNotificationCreate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Sets the ibmenseverity.
   *
   * @param ibmenseverity the new ibmenseverity
   */
  public void setIbmenseverity(final String ibmenseverity) {
    this.ibmenseverity = ibmenseverity;
  }

  /**
   * Sets the ibmenfcmbody.
   *
   * @param ibmenfcmbody the new ibmenfcmbody
   */
  public void setIbmenfcmbody(final NotificationFCMBody ibmenfcmbody) {
    this.ibmenfcmbody = ibmenfcmbody;
  }

  /**
   * Sets the ibmenapnsbody.
   *
   * @param ibmenapnsbody the new ibmenapnsbody
   */
  public void setIbmenapnsbody(final NotificationAPNSBody ibmenapnsbody) {
    this.ibmenapnsbody = ibmenapnsbody;
  }

  /**
   * Sets the ibmenpushto.
   *
   * @param ibmenpushto the new ibmenpushto
   */
  public void setIbmenpushto(final NotificationDevices ibmenpushto) {
    this.ibmenpushto = ibmenpushto;
  }

  /**
   * Sets the ibmenapnsheaders.
   *
   * @param ibmenapnsheaders the new ibmenapnsheaders
   */
  public void setIbmenapnsheaders(final Map<String, Object> ibmenapnsheaders) {
    this.ibmenapnsheaders = ibmenapnsheaders;
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
   * Sets the ibmendefaultlong.
   *
   * @param ibmendefaultlong the new ibmendefaultlong
   */
  public void setIbmendefaultlong(final String ibmendefaultlong) {
    this.ibmendefaultlong = ibmendefaultlong;
  }

  /**
   * Sets the ibmenchromebody.
   *
   * @param ibmenchromebody the new ibmenchromebody
   */
  public void setIbmenchromebody(final NotificationChromeBody ibmenchromebody) {
    this.ibmenchromebody = ibmenchromebody;
  }

  /**
   * Sets the ibmenfirefoxbody.
   *
   * @param ibmenfirefoxbody the new ibmenfirefoxbody
   */
  public void setIbmenfirefoxbody(final NotificationFirefoxBody ibmenfirefoxbody) {
    this.ibmenfirefoxbody = ibmenfirefoxbody;
  }

  /**
   * Sets the ibmenchromeheaders.
   *
   * @param ibmenchromeheaders the new ibmenchromeheaders
   */
  public void setIbmenchromeheaders(final Map<String, Object> ibmenchromeheaders) {
    this.ibmenchromeheaders = ibmenchromeheaders;
  }

  /**
   * Sets the ibmenfirefoxheaders.
   *
   * @param ibmenfirefoxheaders the new ibmenfirefoxheaders
   */
  public void setIbmenfirefoxheaders(final Map<String, Object> ibmenfirefoxheaders) {
    this.ibmenfirefoxheaders = ibmenfirefoxheaders;
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
   * Sets the datacontenttype.
   *
   * @param datacontenttype the new datacontenttype
   */
  public void setDatacontenttype(final String datacontenttype) {
    this.datacontenttype = datacontenttype;
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
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(final String id) {
    this.id = id;
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
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
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
   * Sets the time.
   *
   * @param time the new time
   */
  public void setTime(final Date time) {
    this.time = time;
  }
}
