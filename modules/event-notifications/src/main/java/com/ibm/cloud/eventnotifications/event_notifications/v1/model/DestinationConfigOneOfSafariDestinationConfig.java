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

/**
 * Payload describing a Safari destination configuration.
 */
public class DestinationConfigOneOfSafariDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String certType;
    private String password;
    private String websiteUrl;
    private String websiteName;
    private String urlFormatString;
    private String websitePushId;
    private Boolean preProd;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfSafariDestinationConfig instance.
     *
     * @param destinationConfigOneOfSafariDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfSafariDestinationConfig) {
      this.certType = destinationConfigOneOfSafariDestinationConfig.certType;
      this.password = destinationConfigOneOfSafariDestinationConfig.password;
      this.websiteUrl = destinationConfigOneOfSafariDestinationConfig.websiteUrl;
      this.websiteName = destinationConfigOneOfSafariDestinationConfig.websiteName;
      this.urlFormatString = destinationConfigOneOfSafariDestinationConfig.urlFormatString;
      this.websitePushId = destinationConfigOneOfSafariDestinationConfig.websitePushId;
      this.preProd = destinationConfigOneOfSafariDestinationConfig.preProd;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certType the certType
     * @param password the password
     * @param websiteUrl the websiteUrl
     * @param websiteName the websiteName
     * @param urlFormatString the urlFormatString
     * @param websitePushId the websitePushId
     */
    public Builder(String certType, String password, String websiteUrl, String websiteName, String urlFormatString, String websitePushId) {
      this.certType = certType;
      this.password = password;
      this.websiteUrl = websiteUrl;
      this.websiteName = websiteName;
      this.urlFormatString = urlFormatString;
      this.websitePushId = websitePushId;
    }

    /**
     * Builds a DestinationConfigOneOfSafariDestinationConfig.
     *
     * @return the new DestinationConfigOneOfSafariDestinationConfig instance
     */
    public DestinationConfigOneOfSafariDestinationConfig build() {
      return new DestinationConfigOneOfSafariDestinationConfig(this);
    }

    /**
     * Set the certType.
     *
     * @param certType the certType
     * @return the DestinationConfigOneOfSafariDestinationConfig builder
     */
    public Builder certType(String certType) {
      this.certType = certType;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the DestinationConfigOneOfSafariDestinationConfig builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the websiteUrl.
     *
     * @param websiteUrl the websiteUrl
     * @return the DestinationConfigOneOfSafariDestinationConfig builder
     */
    public Builder websiteUrl(String websiteUrl) {
      this.websiteUrl = websiteUrl;
      return this;
    }

    /**
     * Set the websiteName.
     *
     * @param websiteName the websiteName
     * @return the DestinationConfigOneOfSafariDestinationConfig builder
     */
    public Builder websiteName(String websiteName) {
      this.websiteName = websiteName;
      return this;
    }

    /**
     * Set the urlFormatString.
     *
     * @param urlFormatString the urlFormatString
     * @return the DestinationConfigOneOfSafariDestinationConfig builder
     */
    public Builder urlFormatString(String urlFormatString) {
      this.urlFormatString = urlFormatString;
      return this;
    }

    /**
     * Set the websitePushId.
     *
     * @param websitePushId the websitePushId
     * @return the DestinationConfigOneOfSafariDestinationConfig builder
     */
    public Builder websitePushId(String websitePushId) {
      this.websitePushId = websitePushId;
      return this;
    }

    /**
     * Set the preProd.
     *
     * @param preProd the preProd
     * @return the DestinationConfigOneOfSafariDestinationConfig builder
     */
    public Builder preProd(Boolean preProd) {
      this.preProd = preProd;
      return this;
    }
  }

  protected DestinationConfigOneOfSafariDestinationConfig() { }

  protected DestinationConfigOneOfSafariDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certType,
      "certType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.websiteUrl,
      "websiteUrl cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.websiteName,
      "websiteName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.urlFormatString,
      "urlFormatString cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.websitePushId,
      "websitePushId cannot be null");
    certType = builder.certType;
    password = builder.password;
    websiteUrl = builder.websiteUrl;
    websiteName = builder.websiteName;
    urlFormatString = builder.urlFormatString;
    websitePushId = builder.websitePushId;
    preProd = builder.preProd;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfSafariDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

