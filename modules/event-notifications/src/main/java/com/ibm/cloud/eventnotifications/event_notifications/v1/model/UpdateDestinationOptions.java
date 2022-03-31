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

    private Builder(UpdateDestinationOptions updateDestinationOptions) {
      this.instanceId = updateDestinationOptions.instanceId;
      this.id = updateDestinationOptions.id;
      this.name = updateDestinationOptions.name;
      this.description = updateDestinationOptions.description;
      this.config = updateDestinationOptions.config;
      this.certificate = updateDestinationOptions.certificate;
      this.certificateContentType = updateDestinationOptions.certificateContentType;
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
  }

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
}
