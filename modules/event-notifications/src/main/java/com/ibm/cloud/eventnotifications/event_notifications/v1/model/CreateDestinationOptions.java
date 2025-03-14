/*
 * (C) Copyright IBM Corp. 2025.
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDestination options.
 */
public class CreateDestinationOptions extends GenericModel {

  /**
   * The type of Destination Webhook.
   */
  public interface Type {
    /** webhook. */
    String WEBHOOK = "webhook";
    /** push_android. */
    String PUSH_ANDROID = "push_android";
    /** push_ios. */
    String PUSH_IOS = "push_ios";
    /** push_chrome. */
    String PUSH_CHROME = "push_chrome";
    /** push_firefox. */
    String PUSH_FIREFOX = "push_firefox";
    /** slack. */
    String SLACK = "slack";
    /** ibmce. */
    String IBMCE = "ibmce";
    /** pagerduty. */
    String PAGERDUTY = "pagerduty";
    /** push_safari. */
    String PUSH_SAFARI = "push_safari";
    /** msteams. */
    String MSTEAMS = "msteams";
    /** servicenow. */
    String SERVICENOW = "servicenow";
    /** ibmcos. */
    String IBMCOS = "ibmcos";
    /** push_huawei. */
    String PUSH_HUAWEI = "push_huawei";
    /** smtp_custom. */
    String SMTP_CUSTOM = "smtp_custom";
    /** sms_custom. */
    String SMS_CUSTOM = "sms_custom";
    /** event_streams. */
    String EVENT_STREAMS = "event_streams";
  }

  protected String instanceId;
  protected String name;
  protected String type;
  protected String description;
  protected Boolean collectFailedEvents;
  protected DestinationConfig config;
  protected InputStream certificate;
  protected String certificateContentType;
  protected InputStream icon16x16;
  protected String icon16x16ContentType;
  protected InputStream icon16x162x;
  protected String icon16x162xContentType;
  protected InputStream icon32x32;
  protected String icon32x32ContentType;
  protected InputStream icon32x322x;
  protected String icon32x322xContentType;
  protected InputStream icon128x128;
  protected String icon128x128ContentType;
  protected InputStream icon128x1282x;
  protected String icon128x1282xContentType;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String type;
    private String description;
    private Boolean collectFailedEvents;
    private DestinationConfig config;
    private InputStream certificate;
    private String certificateContentType;
    private InputStream icon16x16;
    private String icon16x16ContentType;
    private InputStream icon16x162x;
    private String icon16x162xContentType;
    private InputStream icon32x32;
    private String icon32x32ContentType;
    private InputStream icon32x322x;
    private String icon32x322xContentType;
    private InputStream icon128x128;
    private String icon128x128ContentType;
    private InputStream icon128x1282x;
    private String icon128x1282xContentType;

    /**
     * Instantiates a new Builder from an existing CreateDestinationOptions instance.
     *
     * @param createDestinationOptions the instance to initialize the Builder with
     */
    private Builder(CreateDestinationOptions createDestinationOptions) {
      this.instanceId = createDestinationOptions.instanceId;
      this.name = createDestinationOptions.name;
      this.type = createDestinationOptions.type;
      this.description = createDestinationOptions.description;
      this.collectFailedEvents = createDestinationOptions.collectFailedEvents;
      this.config = createDestinationOptions.config;
      this.certificate = createDestinationOptions.certificate;
      this.certificateContentType = createDestinationOptions.certificateContentType;
      this.icon16x16 = createDestinationOptions.icon16x16;
      this.icon16x16ContentType = createDestinationOptions.icon16x16ContentType;
      this.icon16x162x = createDestinationOptions.icon16x162x;
      this.icon16x162xContentType = createDestinationOptions.icon16x162xContentType;
      this.icon32x32 = createDestinationOptions.icon32x32;
      this.icon32x32ContentType = createDestinationOptions.icon32x32ContentType;
      this.icon32x322x = createDestinationOptions.icon32x322x;
      this.icon32x322xContentType = createDestinationOptions.icon32x322xContentType;
      this.icon128x128 = createDestinationOptions.icon128x128;
      this.icon128x128ContentType = createDestinationOptions.icon128x128ContentType;
      this.icon128x1282x = createDestinationOptions.icon128x1282x;
      this.icon128x1282xContentType = createDestinationOptions.icon128x1282xContentType;
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
     * @param name the name
     * @param type the type
     */
    public Builder(String instanceId, String name, String type) {
      this.instanceId = instanceId;
      this.name = name;
      this.type = type;
    }

    /**
     * Builds a CreateDestinationOptions.
     *
     * @return the new CreateDestinationOptions instance
     */
    public CreateDestinationOptions build() {
      return new CreateDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDestinationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDestinationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDestinationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the collectFailedEvents.
     *
     * @param collectFailedEvents the collectFailedEvents
     * @return the CreateDestinationOptions builder
     */
    public Builder collectFailedEvents(Boolean collectFailedEvents) {
      this.collectFailedEvents = collectFailedEvents;
      return this;
    }

    /**
     * Set the config.
     *
     * @param config the config
     * @return the CreateDestinationOptions builder
     */
    public Builder config(DestinationConfig config) {
      this.config = config;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the CreateDestinationOptions builder
     */
    public Builder certificate(InputStream certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the certificateContentType.
     *
     * @param certificateContentType the certificateContentType
     * @return the CreateDestinationOptions builder
     */
    public Builder certificateContentType(String certificateContentType) {
      this.certificateContentType = certificateContentType;
      return this;
    }

    /**
     * Set the icon16x16.
     *
     * @param icon16x16 the icon16x16
     * @return the CreateDestinationOptions builder
     */
    public Builder icon16x16(InputStream icon16x16) {
      this.icon16x16 = icon16x16;
      return this;
    }

    /**
     * Set the icon16x16ContentType.
     *
     * @param icon16x16ContentType the icon16x16ContentType
     * @return the CreateDestinationOptions builder
     */
    public Builder icon16x16ContentType(String icon16x16ContentType) {
      this.icon16x16ContentType = icon16x16ContentType;
      return this;
    }

    /**
     * Set the icon16x162x.
     *
     * @param icon16x162x the icon16x162x
     * @return the CreateDestinationOptions builder
     */
    public Builder icon16x162x(InputStream icon16x162x) {
      this.icon16x162x = icon16x162x;
      return this;
    }

    /**
     * Set the icon16x162xContentType.
     *
     * @param icon16x162xContentType the icon16x162xContentType
     * @return the CreateDestinationOptions builder
     */
    public Builder icon16x162xContentType(String icon16x162xContentType) {
      this.icon16x162xContentType = icon16x162xContentType;
      return this;
    }

    /**
     * Set the icon32x32.
     *
     * @param icon32x32 the icon32x32
     * @return the CreateDestinationOptions builder
     */
    public Builder icon32x32(InputStream icon32x32) {
      this.icon32x32 = icon32x32;
      return this;
    }

    /**
     * Set the icon32x32ContentType.
     *
     * @param icon32x32ContentType the icon32x32ContentType
     * @return the CreateDestinationOptions builder
     */
    public Builder icon32x32ContentType(String icon32x32ContentType) {
      this.icon32x32ContentType = icon32x32ContentType;
      return this;
    }

    /**
     * Set the icon32x322x.
     *
     * @param icon32x322x the icon32x322x
     * @return the CreateDestinationOptions builder
     */
    public Builder icon32x322x(InputStream icon32x322x) {
      this.icon32x322x = icon32x322x;
      return this;
    }

    /**
     * Set the icon32x322xContentType.
     *
     * @param icon32x322xContentType the icon32x322xContentType
     * @return the CreateDestinationOptions builder
     */
    public Builder icon32x322xContentType(String icon32x322xContentType) {
      this.icon32x322xContentType = icon32x322xContentType;
      return this;
    }

    /**
     * Set the icon128x128.
     *
     * @param icon128x128 the icon128x128
     * @return the CreateDestinationOptions builder
     */
    public Builder icon128x128(InputStream icon128x128) {
      this.icon128x128 = icon128x128;
      return this;
    }

    /**
     * Set the icon128x128ContentType.
     *
     * @param icon128x128ContentType the icon128x128ContentType
     * @return the CreateDestinationOptions builder
     */
    public Builder icon128x128ContentType(String icon128x128ContentType) {
      this.icon128x128ContentType = icon128x128ContentType;
      return this;
    }

    /**
     * Set the icon128x1282x.
     *
     * @param icon128x1282x the icon128x1282x
     * @return the CreateDestinationOptions builder
     */
    public Builder icon128x1282x(InputStream icon128x1282x) {
      this.icon128x1282x = icon128x1282x;
      return this;
    }

    /**
     * Set the icon128x1282xContentType.
     *
     * @param icon128x1282xContentType the icon128x1282xContentType
     * @return the CreateDestinationOptions builder
     */
    public Builder icon128x1282xContentType(String icon128x1282xContentType) {
      this.icon128x1282xContentType = icon128x1282xContentType;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the CreateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder certificate(File certificate) throws FileNotFoundException {
      this.certificate = new FileInputStream(certificate);
      return this;
    }

    /**
     * Set the icon16x16.
     *
     * @param icon16x16 the icon16x16
     * @return the CreateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder icon16x16(File icon16x16) throws FileNotFoundException {
      this.icon16x16 = new FileInputStream(icon16x16);
      return this;
    }

    /**
     * Set the icon16x162x.
     *
     * @param icon16x162x the icon16x162x
     * @return the CreateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder icon16x162x(File icon16x162x) throws FileNotFoundException {
      this.icon16x162x = new FileInputStream(icon16x162x);
      return this;
    }

    /**
     * Set the icon32x32.
     *
     * @param icon32x32 the icon32x32
     * @return the CreateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder icon32x32(File icon32x32) throws FileNotFoundException {
      this.icon32x32 = new FileInputStream(icon32x32);
      return this;
    }

    /**
     * Set the icon32x322x.
     *
     * @param icon32x322x the icon32x322x
     * @return the CreateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder icon32x322x(File icon32x322x) throws FileNotFoundException {
      this.icon32x322x = new FileInputStream(icon32x322x);
      return this;
    }

    /**
     * Set the icon128x128.
     *
     * @param icon128x128 the icon128x128
     * @return the CreateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder icon128x128(File icon128x128) throws FileNotFoundException {
      this.icon128x128 = new FileInputStream(icon128x128);
      return this;
    }

    /**
     * Set the icon128x1282x.
     *
     * @param icon128x1282x the icon128x1282x
     * @return the CreateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder icon128x1282x(File icon128x1282x) throws FileNotFoundException {
      this.icon128x1282x = new FileInputStream(icon128x1282x);
      return this;
    }
  }

  protected CreateDestinationOptions() { }

  protected CreateDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    type = builder.type;
    description = builder.description;
    collectFailedEvents = builder.collectFailedEvents;
    config = builder.config;
    certificate = builder.certificate;
    certificateContentType = builder.certificateContentType;
    icon16x16 = builder.icon16x16;
    icon16x16ContentType = builder.icon16x16ContentType;
    icon16x162x = builder.icon16x162x;
    icon16x162xContentType = builder.icon16x162xContentType;
    icon32x32 = builder.icon32x32;
    icon32x32ContentType = builder.icon32x32ContentType;
    icon32x322x = builder.icon32x322x;
    icon32x322xContentType = builder.icon32x322xContentType;
    icon128x128 = builder.icon128x128;
    icon128x128ContentType = builder.icon128x128ContentType;
    icon128x1282x = builder.icon128x1282x;
    icon128x1282xContentType = builder.icon128x1282xContentType;
  }

  /**
   * New builder.
   *
   * @return a CreateDestinationOptions builder
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
   * Gets the name.
   *
   * The Destination name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of Destination Webhook.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * The Destination description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the collectFailedEvents.
   *
   * Whether to collect the failed event in Cloud Object Storage bucket.
   *
   * @return the collectFailedEvents
   */
  public Boolean collectFailedEvents() {
    return collectFailedEvents;
  }

  /**
   * Gets the config.
   *
   * Payload describing a destination configuration.
   *
   * @return the config
   */
  public DestinationConfig config() {
    return config;
  }

  /**
   * Gets the certificate.
   *
   * Certificate for APNS.
   *
   * @return the certificate
   */
  public InputStream certificate() {
    return certificate;
  }

  /**
   * Gets the certificateContentType.
   *
   * The content type of certificate. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the certificateContentType
   */
  public String certificateContentType() {
    return certificateContentType;
  }

  /**
   * Gets the icon16x16.
   *
   * Safari icon 16x16.
   *
   * @return the icon16x16
   */
  public InputStream icon16x16() {
    return icon16x16;
  }

  /**
   * Gets the icon16x16ContentType.
   *
   * The content type of icon16x16. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the icon16x16ContentType
   */
  public String icon16x16ContentType() {
    return icon16x16ContentType;
  }

  /**
   * Gets the icon16x162x.
   *
   * Safari icon 16x16@2x.
   *
   * @return the icon16x162x
   */
  public InputStream icon16x162x() {
    return icon16x162x;
  }

  /**
   * Gets the icon16x162xContentType.
   *
   * The content type of icon16x162x. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the icon16x162xContentType
   */
  public String icon16x162xContentType() {
    return icon16x162xContentType;
  }

  /**
   * Gets the icon32x32.
   *
   * Safari icon 32x32.
   *
   * @return the icon32x32
   */
  public InputStream icon32x32() {
    return icon32x32;
  }

  /**
   * Gets the icon32x32ContentType.
   *
   * The content type of icon32x32. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the icon32x32ContentType
   */
  public String icon32x32ContentType() {
    return icon32x32ContentType;
  }

  /**
   * Gets the icon32x322x.
   *
   * Safari icon 32x32@2x.
   *
   * @return the icon32x322x
   */
  public InputStream icon32x322x() {
    return icon32x322x;
  }

  /**
   * Gets the icon32x322xContentType.
   *
   * The content type of icon32x322x. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the icon32x322xContentType
   */
  public String icon32x322xContentType() {
    return icon32x322xContentType;
  }

  /**
   * Gets the icon128x128.
   *
   * Safari icon 128x128.
   *
   * @return the icon128x128
   */
  public InputStream icon128x128() {
    return icon128x128;
  }

  /**
   * Gets the icon128x128ContentType.
   *
   * The content type of icon128x128. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the icon128x128ContentType
   */
  public String icon128x128ContentType() {
    return icon128x128ContentType;
  }

  /**
   * Gets the icon128x1282x.
   *
   * Safari icon 128x128@2x.
   *
   * @return the icon128x1282x
   */
  public InputStream icon128x1282x() {
    return icon128x1282x;
  }

  /**
   * Gets the icon128x1282xContentType.
   *
   * The content type of icon128x1282x. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the icon128x1282xContentType
   */
  public String icon128x1282xContentType() {
    return icon128x1282xContentType;
  }
}

