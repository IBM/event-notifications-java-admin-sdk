/*
 * (C) Copyright IBM Corp. 2023.
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
 * The updateDestination options.
 */
public class UpdateDestinationOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected String name;
  protected String description;
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
    private String id;
    private String name;
    private String description;
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
     * Instantiates a new Builder from an existing UpdateDestinationOptions instance.
     *
     * @param updateDestinationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDestinationOptions updateDestinationOptions) {
      this.instanceId = updateDestinationOptions.instanceId;
      this.id = updateDestinationOptions.id;
      this.name = updateDestinationOptions.name;
      this.description = updateDestinationOptions.description;
      this.config = updateDestinationOptions.config;
      this.certificate = updateDestinationOptions.certificate;
      this.certificateContentType = updateDestinationOptions.certificateContentType;
      this.icon16x16 = updateDestinationOptions.icon16x16;
      this.icon16x16ContentType = updateDestinationOptions.icon16x16ContentType;
      this.icon16x162x = updateDestinationOptions.icon16x162x;
      this.icon16x162xContentType = updateDestinationOptions.icon16x162xContentType;
      this.icon32x32 = updateDestinationOptions.icon32x32;
      this.icon32x32ContentType = updateDestinationOptions.icon32x32ContentType;
      this.icon32x322x = updateDestinationOptions.icon32x322x;
      this.icon32x322xContentType = updateDestinationOptions.icon32x322xContentType;
      this.icon128x128 = updateDestinationOptions.icon128x128;
      this.icon128x128ContentType = updateDestinationOptions.icon128x128ContentType;
      this.icon128x1282x = updateDestinationOptions.icon128x1282x;
      this.icon128x1282xContentType = updateDestinationOptions.icon128x1282xContentType;
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
     * @param id the id
     */
    public Builder(String instanceId, String id) {
      this.instanceId = instanceId;
      this.id = id;
    }

    /**
     * Builds a UpdateDestinationOptions.
     *
     * @return the new UpdateDestinationOptions instance
     */
    public UpdateDestinationOptions build() {
      return new UpdateDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateDestinationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateDestinationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateDestinationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the config.
     *
     * @param config the config
     * @return the UpdateDestinationOptions builder
     */
    public Builder config(DestinationConfig config) {
      this.config = config;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the UpdateDestinationOptions builder
     */
    public Builder certificate(InputStream certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the certificateContentType.
     *
     * @param certificateContentType the certificateContentType
     * @return the UpdateDestinationOptions builder
     */
    public Builder certificateContentType(String certificateContentType) {
      this.certificateContentType = certificateContentType;
      return this;
    }

    /**
     * Set the icon16x16.
     *
     * @param icon16x16 the icon16x16
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon16x16(InputStream icon16x16) {
      this.icon16x16 = icon16x16;
      return this;
    }

    /**
     * Set the icon16x16ContentType.
     *
     * @param icon16x16ContentType the icon16x16ContentType
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon16x16ContentType(String icon16x16ContentType) {
      this.icon16x16ContentType = icon16x16ContentType;
      return this;
    }

    /**
     * Set the icon16x162x.
     *
     * @param icon16x162x the icon16x162x
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon16x162x(InputStream icon16x162x) {
      this.icon16x162x = icon16x162x;
      return this;
    }

    /**
     * Set the icon16x162xContentType.
     *
     * @param icon16x162xContentType the icon16x162xContentType
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon16x162xContentType(String icon16x162xContentType) {
      this.icon16x162xContentType = icon16x162xContentType;
      return this;
    }

    /**
     * Set the icon32x32.
     *
     * @param icon32x32 the icon32x32
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon32x32(InputStream icon32x32) {
      this.icon32x32 = icon32x32;
      return this;
    }

    /**
     * Set the icon32x32ContentType.
     *
     * @param icon32x32ContentType the icon32x32ContentType
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon32x32ContentType(String icon32x32ContentType) {
      this.icon32x32ContentType = icon32x32ContentType;
      return this;
    }

    /**
     * Set the icon32x322x.
     *
     * @param icon32x322x the icon32x322x
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon32x322x(InputStream icon32x322x) {
      this.icon32x322x = icon32x322x;
      return this;
    }

    /**
     * Set the icon32x322xContentType.
     *
     * @param icon32x322xContentType the icon32x322xContentType
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon32x322xContentType(String icon32x322xContentType) {
      this.icon32x322xContentType = icon32x322xContentType;
      return this;
    }

    /**
     * Set the icon128x128.
     *
     * @param icon128x128 the icon128x128
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon128x128(InputStream icon128x128) {
      this.icon128x128 = icon128x128;
      return this;
    }

    /**
     * Set the icon128x128ContentType.
     *
     * @param icon128x128ContentType the icon128x128ContentType
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon128x128ContentType(String icon128x128ContentType) {
      this.icon128x128ContentType = icon128x128ContentType;
      return this;
    }

    /**
     * Set the icon128x1282x.
     *
     * @param icon128x1282x the icon128x1282x
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon128x1282x(InputStream icon128x1282x) {
      this.icon128x1282x = icon128x1282x;
      return this;
    }

    /**
     * Set the icon128x1282xContentType.
     *
     * @param icon128x1282xContentType the icon128x1282xContentType
     * @return the UpdateDestinationOptions builder
     */
    public Builder icon128x1282xContentType(String icon128x1282xContentType) {
      this.icon128x1282xContentType = icon128x1282xContentType;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the UpdateDestinationOptions builder
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
     * @return the UpdateDestinationOptions builder
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
     * @return the UpdateDestinationOptions builder
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
     * @return the UpdateDestinationOptions builder
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
     * @return the UpdateDestinationOptions builder
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
     * @return the UpdateDestinationOptions builder
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
     * @return the UpdateDestinationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder icon128x1282x(File icon128x1282x) throws FileNotFoundException {
      this.icon128x1282x = new FileInputStream(icon128x1282x);
      return this;
    }
  }

  protected UpdateDestinationOptions() { }

  protected UpdateDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
    name = builder.name;
    description = builder.description;
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
   * @return a UpdateDestinationOptions builder
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
   * Gets the id.
   *
   * Unique identifier for Destination.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Destination name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Destination description.
   *
   * @return the description
   */
  public String description() {
    return description;
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

