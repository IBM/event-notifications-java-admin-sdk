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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DestinationConfigOneOf.
 *
 * Classes which extend this class:
 * - DestinationConfigOneOfWebhookDestinationConfig
 * - DestinationConfigOneOfFCMDestinationConfig
 * - DestinationConfigOneOfIOSDestinationConfig
 * - DestinationConfigOneOfChromeDestinationConfig
 * - DestinationConfigOneOfFirefoxDestinationConfig
 * - DestinationConfigOneOfSlackDestinationConfig
 * - DestinationConfigOneOfSafariDestinationConfig
 * - DestinationConfigOneOfMSTeamsDestinationConfig
 * - DestinationConfigOneOfIBMCloudFunctionsDestinationConfig
 */
public class DestinationConfigOneOf extends GenericModel {

  /**
   * HTTP method of webhook.
   */
  public interface Verb {
    /** get. */
    String GET = "get";
    /** post. */
    String POST = "post";
  }

  protected String url;
  protected String verb;
  @SerializedName("custom_headers")
  protected Map<String, String> customHeaders;
  @SerializedName("sensitive_headers")
  protected List<String> sensitiveHeaders;
  @SerializedName("server_key")
  protected String serverKey;
  @SerializedName("sender_id")
  protected String senderId;
  @SerializedName("pre_prod")
  protected Boolean preProd;
  @SerializedName("cert_type")
  protected String certType;
  @SerializedName("is_sandbox")
  protected Boolean isSandbox;
  protected String password;
  @SerializedName("key_id")
  protected String keyId;
  @SerializedName("team_id")
  protected String teamId;
  @SerializedName("bundle_id")
  protected String bundleId;
  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("website_url")
  protected String websiteUrl;
  @SerializedName("public_key")
  protected String publicKey;
  @SerializedName("website_name")
  protected String websiteName;
  @SerializedName("url_format_string")
  protected String urlFormatString;
  @SerializedName("website_push_id")
  protected String websitePushId;

  protected DestinationConfigOneOf() {
  }

  /**
   * Gets the url.
   *
   * URL of webhook.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the verb.
   *
   * HTTP method of webhook.
   *
   * @return the verb
   */
  public String verb() {
    return verb;
  }

  /**
   * Gets the customHeaders.
   *
   * Custom headers (Key-Value pair) for webhook call.
   *
   * @return the customHeaders
   */
  public Map<String, String> customHeaders() {
    return customHeaders;
  }

  /**
   * Gets the sensitiveHeaders.
   *
   * List of sensitive headers from custom headers.
   *
   * @return the sensitiveHeaders
   */
  public List<String> sensitiveHeaders() {
    return sensitiveHeaders;
  }

  /**
   * Gets the serverKey.
   *
   * FCM server_key.
   *
   * @return the serverKey
   */
  public String serverKey() {
    return serverKey;
  }

  /**
   * Gets the senderId.
   *
   * FCM sender_id.
   *
   * @return the senderId
   */
  public String senderId() {
    return senderId;
  }

  /**
   * Gets the preProd.
   *
   * If pre prod enabled.
   *
   * @return the preProd
   */
  public Boolean preProd() {
    return preProd;
  }

  /**
   * Gets the certType.
   *
   * Authentication type (p8 or p12).
   *
   * @return the certType
   */
  public String certType() {
    return certType;
  }

  /**
   * Gets the isSandbox.
   *
   * Sandbox mode for IOS destinations.
   *
   * @return the isSandbox
   */
  public Boolean isSandbox() {
    return isSandbox;
  }

  /**
   * Gets the password.
   *
   * Password for certificate (Required when cert_type is p12).
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the keyId.
   *
   * Key ID for token (Required when cert_type is p8).
   *
   * @return the keyId
   */
  public String keyId() {
    return keyId;
  }

  /**
   * Gets the teamId.
   *
   * Team ID for token (Required when cert_type is p8).
   *
   * @return the teamId
   */
  public String teamId() {
    return teamId;
  }

  /**
   * Gets the bundleId.
   *
   * Bundle ID for token (Required when cert_type is p8).
   *
   * @return the bundleId
   */
  public String bundleId() {
    return bundleId;
  }

  /**
   * Gets the apiKey.
   *
   * FCM api_key.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the websiteUrl.
   *
   * Website url.
   *
   * @return the websiteUrl
   */
  public String websiteUrl() {
    return websiteUrl;
  }

  /**
   * Gets the publicKey.
   *
   * Chrome VAPID public key.
   *
   * @return the publicKey
   */
  public String publicKey() {
    return publicKey;
  }

  /**
   * Gets the websiteName.
   *
   * Websire url.
   *
   * @return the websiteName
   */
  public String websiteName() {
    return websiteName;
  }

  /**
   * Gets the urlFormatString.
   *
   * Websire url.
   *
   * @return the urlFormatString
   */
  public String urlFormatString() {
    return urlFormatString;
  }

  /**
   * Gets the websitePushId.
   *
   * Websire url.
   *
   * @return the websitePushId
   */
  public String websitePushId() {
    return websitePushId;
  }
}

