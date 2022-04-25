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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.46.0-a4e29da0-20220224-210428
 */

package com.ibm.cloud.eventnotifications.event_notifications.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.event_notifications.common.SdkCommon;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Destination;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationDevicesList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationDevicesReport;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationTagsSubscriptionResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationDevicesReportOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationDevicesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSubscriptionsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTagsSubscriptionsDeviceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTopicsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Source;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Subscription;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Topic;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSubscriptionOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator).
 *
 * API Version: 1.0
 */
public class EventNotifications extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "event_notifications";

  public static final String DEFAULT_SERVICE_URL = "https://us-south.event-notifications.cloud.ibm.com/event-notifications";

 /**
   * Class method which constructs an instance of the `EventNotifications` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `EventNotifications` client using external configuration
   */
  public static EventNotifications newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `EventNotifications` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `EventNotifications` client using external configuration
   */
  public static EventNotifications newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    EventNotifications service = new EventNotifications(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `EventNotifications` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public EventNotifications(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Send a notification.
   *
   * @param sendNotificationsOptions the {@link SendNotificationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NotificationResponse}
   */
  public ServiceCall<NotificationResponse> sendNotifications(SendNotificationsOptions sendNotificationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(sendNotificationsOptions,
      "sendNotificationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", sendNotificationsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/notifications", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "sendNotifications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (sendNotificationsOptions.ceIbmenseverity() != null) {
      builder.header("ce-ibmenseverity", sendNotificationsOptions.ceIbmenseverity());
    }
    if (sendNotificationsOptions.ceIbmendefaultshort() != null) {
      builder.header("ce-ibmendefaultshort", sendNotificationsOptions.ceIbmendefaultshort());
    }
    if (sendNotificationsOptions.ceIbmendefaultlong() != null) {
      builder.header("ce-ibmendefaultlong", sendNotificationsOptions.ceIbmendefaultlong());
    }
    if (sendNotificationsOptions.ceIbmenfcmbody() != null) {
      builder.header("ce-ibmenfcmbody", sendNotificationsOptions.ceIbmenfcmbody());
    }
    if (sendNotificationsOptions.ceIbmenapnsbody() != null) {
      builder.header("ce-ibmenapnsbody", sendNotificationsOptions.ceIbmenapnsbody());
    }
    if (sendNotificationsOptions.ceIbmenpushto() != null) {
      builder.header("ce-ibmenpushto", sendNotificationsOptions.ceIbmenpushto());
    }
    if (sendNotificationsOptions.ceIbmenapnsheaders() != null) {
      builder.header("ce-ibmenapnsheaders", sendNotificationsOptions.ceIbmenapnsheaders());
    }
    if (sendNotificationsOptions.ceIbmenchromebody() != null) {
      builder.header("ce-ibmenchromebody", sendNotificationsOptions.ceIbmenchromebody());
    }
    if (sendNotificationsOptions.ceIbmenfirefoxbody() != null) {
      builder.header("ce-ibmenfirefoxbody", sendNotificationsOptions.ceIbmenfirefoxbody());
    }
    if (sendNotificationsOptions.ceIbmenchromeheaders() != null) {
      builder.header("ce-ibmenchromeheaders", sendNotificationsOptions.ceIbmenchromeheaders());
    }
    if (sendNotificationsOptions.ceIbmenfirefoxheaders() != null) {
      builder.header("ce-ibmenfirefoxheaders", sendNotificationsOptions.ceIbmenfirefoxheaders());
    }
    if (sendNotificationsOptions.ceIbmensourceid() != null) {
      builder.header("ce-ibmensourceid", sendNotificationsOptions.ceIbmensourceid());
    }
    if (sendNotificationsOptions.ceId() != null) {
      builder.header("ce-id", sendNotificationsOptions.ceId());
    }
    if (sendNotificationsOptions.ceSource() != null) {
      builder.header("ce-source", sendNotificationsOptions.ceSource());
    }
    if (sendNotificationsOptions.ceType() != null) {
      builder.header("ce-type", sendNotificationsOptions.ceType());
    }
    if (sendNotificationsOptions.ceSpecversion() != null) {
      builder.header("ce-specversion", sendNotificationsOptions.ceSpecversion());
    }
    if (sendNotificationsOptions.ceTime() != null) {
      builder.header("ce-time", sendNotificationsOptions.ceTime());
    }
    if (sendNotificationsOptions.body() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(sendNotificationsOptions.body()), "application/json");
    }
    ResponseConverter<NotificationResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NotificationResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new API Source.
   *
   * Create a new API Source.
   *
   * @param createSourcesOptions the {@link CreateSourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SourceResponse}
   */
  public ServiceCall<SourceResponse> createSources(CreateSourcesOptions createSourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSourcesOptions,
      "createSourcesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createSourcesOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/sources", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createSources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createSourcesOptions.name());
    contentJson.addProperty("description", createSourcesOptions.description());
    if (createSourcesOptions.enabled() != null) {
      contentJson.addProperty("enabled", createSourcesOptions.enabled());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SourceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SourceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all Sources.
   *
   * List all Sources.
   *
   * @param listSourcesOptions the {@link ListSourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SourceList}
   */
  public ServiceCall<SourceList> listSources(ListSourcesOptions listSourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSourcesOptions,
      "listSourcesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listSourcesOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/sources", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listSources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSourcesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSourcesOptions.limit()));
    }
    if (listSourcesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSourcesOptions.offset()));
    }
    if (listSourcesOptions.search() != null) {
      builder.query("search", String.valueOf(listSourcesOptions.search()));
    }
    ResponseConverter<SourceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SourceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a Source.
   *
   * Get a Sources.
   *
   * @param getSourceOptions the {@link GetSourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Source}
   */
  public ServiceCall<Source> getSource(GetSourceOptions getSourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSourceOptions,
      "getSourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getSourceOptions.instanceId());
    pathParamsMap.put("id", getSourceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/sources/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getSource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Source> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Source>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Source.
   *
   * Delete a Source.
   *
   * @param deleteSourceOptions the {@link DeleteSourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSource(DeleteSourceOptions deleteSourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSourceOptions,
      "deleteSourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteSourceOptions.instanceId());
    pathParamsMap.put("id", deleteSourceOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/sources/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteSource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update details of a Source.
   *
   * Update details of a Source.
   *
   * @param updateSourceOptions the {@link UpdateSourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Source}
   */
  public ServiceCall<Source> updateSource(UpdateSourceOptions updateSourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSourceOptions,
      "updateSourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateSourceOptions.instanceId());
    pathParamsMap.put("id", updateSourceOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/sources/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "updateSource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateSourceOptions.name() != null) {
      contentJson.addProperty("name", updateSourceOptions.name());
    }
    if (updateSourceOptions.description() != null) {
      contentJson.addProperty("description", updateSourceOptions.description());
    }
    if (updateSourceOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateSourceOptions.enabled());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Source> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Source>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new Topic.
   *
   * Create a new Topic.
   *
   * @param createTopicOptions the {@link CreateTopicOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TopicResponse}
   */
  public ServiceCall<TopicResponse> createTopic(CreateTopicOptions createTopicOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTopicOptions,
      "createTopicOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createTopicOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/topics", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createTopic");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createTopicOptions.name());
    if (createTopicOptions.description() != null) {
      contentJson.addProperty("description", createTopicOptions.description());
    }
    if (createTopicOptions.sources() != null) {
      contentJson.add("sources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTopicOptions.sources()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TopicResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TopicResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all Topics.
   *
   * List all Topics.
   *
   * @param listTopicsOptions the {@link ListTopicsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TopicList}
   */
  public ServiceCall<TopicList> listTopics(ListTopicsOptions listTopicsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTopicsOptions,
      "listTopicsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listTopicsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/topics", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listTopics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTopicsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTopicsOptions.limit()));
    }
    if (listTopicsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listTopicsOptions.offset()));
    }
    if (listTopicsOptions.search() != null) {
      builder.query("search", String.valueOf(listTopicsOptions.search()));
    }
    ResponseConverter<TopicList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TopicList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of a Topic.
   *
   * Get details of a Topic.
   *
   * @param getTopicOptions the {@link GetTopicOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Topic}
   */
  public ServiceCall<Topic> getTopic(GetTopicOptions getTopicOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTopicOptions,
      "getTopicOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getTopicOptions.instanceId());
    pathParamsMap.put("id", getTopicOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/topics/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getTopic");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTopicOptions.include() != null) {
      builder.query("include", String.valueOf(getTopicOptions.include()));
    }
    ResponseConverter<Topic> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Topic>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update details of a Topic.
   *
   * Update details of a Topic.
   *
   * @param replaceTopicOptions the {@link ReplaceTopicOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Topic}
   */
  public ServiceCall<Topic> replaceTopic(ReplaceTopicOptions replaceTopicOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTopicOptions,
      "replaceTopicOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", replaceTopicOptions.instanceId());
    pathParamsMap.put("id", replaceTopicOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/topics/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "replaceTopic");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceTopicOptions.name() != null) {
      contentJson.addProperty("name", replaceTopicOptions.name());
    }
    if (replaceTopicOptions.description() != null) {
      contentJson.addProperty("description", replaceTopicOptions.description());
    }
    if (replaceTopicOptions.sources() != null) {
      contentJson.add("sources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceTopicOptions.sources()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Topic> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Topic>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Topic.
   *
   * Delete a Topic.
   *
   * @param deleteTopicOptions the {@link DeleteTopicOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTopic(DeleteTopicOptions deleteTopicOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTopicOptions,
      "deleteTopicOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteTopicOptions.instanceId());
    pathParamsMap.put("id", deleteTopicOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/topics/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteTopic");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new Destination.
   *
   * Create a new Destination.
   *
   * @param createDestinationOptions the {@link CreateDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DestinationResponse}
   */
  public ServiceCall<DestinationResponse> createDestination(CreateDestinationOptions createDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDestinationOptions,
      "createDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createDestinationOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("name", createDestinationOptions.name());
    multipartBuilder.addFormDataPart("type", createDestinationOptions.type());
    if (createDestinationOptions.description() != null) {
      multipartBuilder.addFormDataPart("description", createDestinationOptions.description());
    }
    if (createDestinationOptions.config() != null) {
      multipartBuilder.addFormDataPart("config", createDestinationOptions.config().toString());
    }
    if (createDestinationOptions.certificate() != null) {
      okhttp3.RequestBody certificateBody = RequestUtils.inputStreamBody(createDestinationOptions.certificate(), createDestinationOptions.certificateContentType());
      multipartBuilder.addFormDataPart("certificate", "filename", certificateBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<DestinationResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DestinationResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all Destinations.
   *
   * List all Destinations.
   *
   * @param listDestinationsOptions the {@link ListDestinationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DestinationList}
   */
  public ServiceCall<DestinationList> listDestinations(ListDestinationsOptions listDestinationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDestinationsOptions,
      "listDestinationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listDestinationsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listDestinations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDestinationsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDestinationsOptions.limit()));
    }
    if (listDestinationsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDestinationsOptions.offset()));
    }
    if (listDestinationsOptions.search() != null) {
      builder.query("search", String.valueOf(listDestinationsOptions.search()));
    }
    ResponseConverter<DestinationList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DestinationList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of a Destination.
   *
   * Get details of a Destination.
   *
   * @param getDestinationOptions the {@link GetDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Destination}
   */
  public ServiceCall<Destination> getDestination(GetDestinationOptions getDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDestinationOptions,
      "getDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getDestinationOptions.instanceId());
    pathParamsMap.put("id", getDestinationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Destination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Destination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update details of a Destination.
   *
   * Update details of a Destination.
   *
   * @param updateDestinationOptions the {@link UpdateDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Destination}
   */
  public ServiceCall<Destination> updateDestination(UpdateDestinationOptions updateDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDestinationOptions,
      "updateDestinationOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((updateDestinationOptions.name() != null) || (updateDestinationOptions.description() != null) || (updateDestinationOptions.config() != null) || (updateDestinationOptions.certificate() != null), "At least one of name, description, config, or certificate must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateDestinationOptions.instanceId());
    pathParamsMap.put("id", updateDestinationOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "updateDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (updateDestinationOptions.name() != null) {
      multipartBuilder.addFormDataPart("name", updateDestinationOptions.name());
    }
    if (updateDestinationOptions.description() != null) {
      multipartBuilder.addFormDataPart("description", updateDestinationOptions.description());
    }
    if (updateDestinationOptions.config() != null) {
      multipartBuilder.addFormDataPart("config", updateDestinationOptions.config().toString());
    }
    if (updateDestinationOptions.certificate() != null) {
      okhttp3.RequestBody certificateBody = RequestUtils.inputStreamBody(updateDestinationOptions.certificate(), updateDestinationOptions.certificateContentType());
      multipartBuilder.addFormDataPart("certificate", "filename", certificateBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<Destination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Destination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Destination.
   *
   * Delete a Destination.
   *
   * @param deleteDestinationOptions the {@link DeleteDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDestination(DeleteDestinationOptions deleteDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDestinationOptions,
      "deleteDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteDestinationOptions.instanceId());
    pathParamsMap.put("id", deleteDestinationOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of Destination devices.
   *
   * Get list of Destination devices.
   *
   * @param listDestinationDevicesOptions the {@link ListDestinationDevicesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DestinationDevicesList}
   */
  public ServiceCall<DestinationDevicesList> listDestinationDevices(ListDestinationDevicesOptions listDestinationDevicesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDestinationDevicesOptions,
      "listDestinationDevicesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listDestinationDevicesOptions.instanceId());
    pathParamsMap.put("id", listDestinationDevicesOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/devices", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listDestinationDevices");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDestinationDevicesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDestinationDevicesOptions.limit()));
    }
    if (listDestinationDevicesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDestinationDevicesOptions.offset()));
    }
    if (listDestinationDevicesOptions.search() != null) {
      builder.query("search", String.valueOf(listDestinationDevicesOptions.search()));
    }
    ResponseConverter<DestinationDevicesList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DestinationDevicesList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves report of destination devices registered.
   *
   * Retrieves report of destination devices registered.
   *
   * @param getDestinationDevicesReportOptions the {@link GetDestinationDevicesReportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DestinationDevicesReport}
   */
  public ServiceCall<DestinationDevicesReport> getDestinationDevicesReport(GetDestinationDevicesReportOptions getDestinationDevicesReportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDestinationDevicesReportOptions,
      "getDestinationDevicesReportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getDestinationDevicesReportOptions.instanceId());
    pathParamsMap.put("id", getDestinationDevicesReportOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/devices/report", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getDestinationDevicesReport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDestinationDevicesReportOptions.days() != null) {
      builder.query("days", String.valueOf(getDestinationDevicesReportOptions.days()));
    }
    ResponseConverter<DestinationDevicesReport> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DestinationDevicesReport>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all Tag Subscriptions for a device.
   *
   * List all Tag Subscriptions for a device.
   *
   * @param listTagsSubscriptionsDeviceOptions the {@link ListTagsSubscriptionsDeviceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TagsSubscriptionList}
   */
  public ServiceCall<TagsSubscriptionList> listTagsSubscriptionsDevice(ListTagsSubscriptionsDeviceOptions listTagsSubscriptionsDeviceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTagsSubscriptionsDeviceOptions,
      "listTagsSubscriptionsDeviceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listTagsSubscriptionsDeviceOptions.instanceId());
    pathParamsMap.put("id", listTagsSubscriptionsDeviceOptions.id());
    pathParamsMap.put("device_id", listTagsSubscriptionsDeviceOptions.deviceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/tag_subscriptions/devices/{device_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listTagsSubscriptionsDevice");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTagsSubscriptionsDeviceOptions.tagName() != null) {
      builder.query("tag_name", String.valueOf(listTagsSubscriptionsDeviceOptions.tagName()));
    }
    if (listTagsSubscriptionsDeviceOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTagsSubscriptionsDeviceOptions.limit()));
    }
    if (listTagsSubscriptionsDeviceOptions.offset() != null) {
      builder.query("offset", String.valueOf(listTagsSubscriptionsDeviceOptions.offset()));
    }
    ResponseConverter<TagsSubscriptionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TagsSubscriptionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all Tag Subscriptions.
   *
   * List all Tag Subscriptions.
   *
   * @param listTagsSubscriptionOptions the {@link ListTagsSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TagsSubscriptionList}
   */
  public ServiceCall<TagsSubscriptionList> listTagsSubscription(ListTagsSubscriptionOptions listTagsSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTagsSubscriptionOptions,
      "listTagsSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listTagsSubscriptionOptions.instanceId());
    pathParamsMap.put("id", listTagsSubscriptionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/tag_subscriptions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listTagsSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTagsSubscriptionOptions.deviceId() != null) {
      builder.query("device_id", String.valueOf(listTagsSubscriptionOptions.deviceId()));
    }
    if (listTagsSubscriptionOptions.userId() != null) {
      builder.query("user_id", String.valueOf(listTagsSubscriptionOptions.userId()));
    }
    if (listTagsSubscriptionOptions.tagName() != null) {
      builder.query("tag_name", String.valueOf(listTagsSubscriptionOptions.tagName()));
    }
    if (listTagsSubscriptionOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTagsSubscriptionOptions.limit()));
    }
    if (listTagsSubscriptionOptions.offset() != null) {
      builder.query("offset", String.valueOf(listTagsSubscriptionOptions.offset()));
    }
    if (listTagsSubscriptionOptions.search() != null) {
      builder.query("search", String.valueOf(listTagsSubscriptionOptions.search()));
    }
    ResponseConverter<TagsSubscriptionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TagsSubscriptionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new Tag subscription.
   *
   * Create a new Tag subscription.
   *
   * @param createTagsSubscriptionOptions the {@link CreateTagsSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DestinationTagsSubscriptionResponse}
   */
  public ServiceCall<DestinationTagsSubscriptionResponse> createTagsSubscription(CreateTagsSubscriptionOptions createTagsSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTagsSubscriptionOptions,
      "createTagsSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createTagsSubscriptionOptions.instanceId());
    pathParamsMap.put("id", createTagsSubscriptionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/tag_subscriptions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createTagsSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("device_id", createTagsSubscriptionOptions.deviceId());
    contentJson.addProperty("tag_name", createTagsSubscriptionOptions.tagName());
    builder.bodyJson(contentJson);
    ResponseConverter<DestinationTagsSubscriptionResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DestinationTagsSubscriptionResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Tag subcription.
   *
   * Delete a Tag subcription.
   *
   * @param deleteTagsSubscriptionOptions the {@link DeleteTagsSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTagsSubscription(DeleteTagsSubscriptionOptions deleteTagsSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTagsSubscriptionOptions,
      "deleteTagsSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteTagsSubscriptionOptions.instanceId());
    pathParamsMap.put("id", deleteTagsSubscriptionOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/tag_subscriptions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteTagsSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteTagsSubscriptionOptions.deviceId() != null) {
      builder.query("device_id", String.valueOf(deleteTagsSubscriptionOptions.deviceId()));
    }
    if (deleteTagsSubscriptionOptions.tagName() != null) {
      builder.query("tag_name", String.valueOf(deleteTagsSubscriptionOptions.tagName()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new Subscription.
   *
   * Create a new Subscription.
   *
   * @param createSubscriptionOptions the {@link CreateSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Subscription}
   */
  public ServiceCall<Subscription> createSubscription(CreateSubscriptionOptions createSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSubscriptionOptions,
      "createSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createSubscriptionOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/subscriptions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createSubscriptionOptions.name());
    contentJson.addProperty("destination_id", createSubscriptionOptions.destinationId());
    contentJson.addProperty("topic_id", createSubscriptionOptions.topicId());
    if (createSubscriptionOptions.description() != null) {
      contentJson.addProperty("description", createSubscriptionOptions.description());
    }
    if (createSubscriptionOptions.attributes() != null) {
      contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSubscriptionOptions.attributes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Subscription> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Subscription>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all Subscriptions.
   *
   * List all Subscriptions.
   *
   * @param listSubscriptionsOptions the {@link ListSubscriptionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SubscriptionList}
   */
  public ServiceCall<SubscriptionList> listSubscriptions(ListSubscriptionsOptions listSubscriptionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSubscriptionsOptions,
      "listSubscriptionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listSubscriptionsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/subscriptions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listSubscriptions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSubscriptionsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSubscriptionsOptions.offset()));
    }
    if (listSubscriptionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSubscriptionsOptions.limit()));
    }
    if (listSubscriptionsOptions.search() != null) {
      builder.query("search", String.valueOf(listSubscriptionsOptions.search()));
    }
    ResponseConverter<SubscriptionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SubscriptionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of a Subscription.
   *
   * Get details of a Subscription.
   *
   * @param getSubscriptionOptions the {@link GetSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Subscription}
   */
  public ServiceCall<Subscription> getSubscription(GetSubscriptionOptions getSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSubscriptionOptions,
      "getSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getSubscriptionOptions.instanceId());
    pathParamsMap.put("id", getSubscriptionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/subscriptions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Subscription> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Subscription>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Subscription.
   *
   * Delete a Subscription.
   *
   * @param deleteSubscriptionOptions the {@link DeleteSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSubscription(DeleteSubscriptionOptions deleteSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSubscriptionOptions,
      "deleteSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteSubscriptionOptions.instanceId());
    pathParamsMap.put("id", deleteSubscriptionOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/subscriptions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update details of a Subscription.
   *
   * Update details of a Subscription.
   *
   * @param updateSubscriptionOptions the {@link UpdateSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Subscription}
   */
  public ServiceCall<Subscription> updateSubscription(UpdateSubscriptionOptions updateSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSubscriptionOptions,
      "updateSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateSubscriptionOptions.instanceId());
    pathParamsMap.put("id", updateSubscriptionOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/subscriptions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "updateSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateSubscriptionOptions.name() != null) {
      contentJson.addProperty("name", updateSubscriptionOptions.name());
    }
    if (updateSubscriptionOptions.description() != null) {
      contentJson.addProperty("description", updateSubscriptionOptions.description());
    }
    if (updateSubscriptionOptions.attributes() != null) {
      contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSubscriptionOptions.attributes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Subscription> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Subscription>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
