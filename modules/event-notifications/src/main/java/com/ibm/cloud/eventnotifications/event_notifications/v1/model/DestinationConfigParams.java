/*
 * (C) Copyright IBM Corp. 2021.
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
 * DestinationConfigParams.
 *
 * Classes which extend this class:
 * - DestinationConfigParamsWebhookDestinationConfig
 * - DestinationConfigParamsFCMDestinationConfig
 */
public class DestinationConfigParams extends GenericModel {

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
  protected String apiKey;
  protected String senderId;

  protected DestinationConfigParams() {
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
   * Gets the apiKey.
   *
   * FCM apiKey.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the senderId.
   *
   * FCM senderId.
   *
   * @return the senderId
   */
  public String senderId() {
    return senderId;
  }
}

