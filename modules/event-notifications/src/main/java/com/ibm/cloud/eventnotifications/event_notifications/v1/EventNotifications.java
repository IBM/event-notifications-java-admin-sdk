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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.70.0-7df966bf-20230419-195904
 */

package com.ibm.cloud.eventnotifications.event_notifications.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.event_notifications.common.SdkCommon;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Destination;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationTagsSubscriptionResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EnabledCountriesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetEnabledCountriesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetMetricsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetNotificationStatusResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetNotificationsStatusOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetPreDefinedTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetPredefinedTemplate;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSmtpAllowedIpsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationCreateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationGetResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListIntegrationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListPreDefinedTemplatesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSmtpConfigurationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSmtpUsersOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSubscriptionsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTemplatesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTopicsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Metrics;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PredefinedTemplatesList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPAllowedIPs;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfiguration;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfigurationsList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPCreateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPUser;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPUserResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPUsersList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPVerificationUpdateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Source;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Subscription;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Template;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TestDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TestDestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Topic;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateVerifyDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateVerifySmtpOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.VerificationResponse;
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

  /**
   * Default service name used when configuring the `EventNotifications` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "event_notifications";

  /**
   * Default service endpoint URL.
   */
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
   * Get metrics.
   *
   * Get metrics.
   *
   * @param getMetricsOptions the {@link GetMetricsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Metrics}
   */
  public ServiceCall<Metrics> getMetrics(GetMetricsOptions getMetricsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMetricsOptions,
      "getMetricsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getMetricsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/metrics", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getMetrics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("destination_type", String.valueOf(getMetricsOptions.destinationType()));
    builder.query("gte", String.valueOf(getMetricsOptions.gte()));
    builder.query("lte", String.valueOf(getMetricsOptions.lte()));
    if (getMetricsOptions.destinationId() != null) {
      builder.query("destination_id", String.valueOf(getMetricsOptions.destinationId()));
    }
    if (getMetricsOptions.sourceId() != null) {
      builder.query("source_id", String.valueOf(getMetricsOptions.sourceId()));
    }
    if (getMetricsOptions.emailTo() != null) {
      builder.query("email_to", String.valueOf(getMetricsOptions.emailTo()));
    }
    if (getMetricsOptions.notificationId() != null) {
      builder.query("notification_id", String.valueOf(getMetricsOptions.notificationId()));
    }
    if (getMetricsOptions.subject() != null) {
      builder.query("subject", String.valueOf(getMetricsOptions.subject()));
    }
    ResponseConverter<Metrics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Metrics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Send a notification.
   *
   * Send Notifications body from the instance. For more information about Event Notifications payload, see
   * [here](https://cloud.ibm.com/docs/event-notifications?topic=event-notifications-en-spec-payload).
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
   * Get a Source.
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
   * Create a new Template.
   *
   * Create a new Template.
   *
   * @param createTemplateOptions the {@link CreateTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateResponse}
   */
  public ServiceCall<TemplateResponse> createTemplate(CreateTemplateOptions createTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTemplateOptions,
      "createTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createTemplateOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/templates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createTemplateOptions.name());
    contentJson.addProperty("type", createTemplateOptions.type());
    contentJson.add("params", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTemplateOptions.params()));
    if (createTemplateOptions.description() != null) {
      contentJson.addProperty("description", createTemplateOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TemplateResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all templates.
   *
   * List all Templates.
   *
   * @param listTemplatesOptions the {@link ListTemplatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateList}
   */
  public ServiceCall<TemplateList> listTemplates(ListTemplatesOptions listTemplatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTemplatesOptions,
      "listTemplatesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listTemplatesOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/templates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listTemplates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTemplatesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTemplatesOptions.limit()));
    }
    if (listTemplatesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listTemplatesOptions.offset()));
    }
    if (listTemplatesOptions.search() != null) {
      builder.query("search", String.valueOf(listTemplatesOptions.search()));
    }
    ResponseConverter<TemplateList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of a Template.
   *
   * Get details of a Template.
   *
   * @param getTemplateOptions the {@link GetTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Template}
   */
  public ServiceCall<Template> getTemplate(GetTemplateOptions getTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateOptions,
      "getTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getTemplateOptions.instanceId());
    pathParamsMap.put("id", getTemplateOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/templates/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Template> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Template>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update details of a Template.
   *
   * Update details of a Template.
   *
   * @param replaceTemplateOptions the {@link ReplaceTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Template}
   */
  public ServiceCall<Template> replaceTemplate(ReplaceTemplateOptions replaceTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTemplateOptions,
      "replaceTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", replaceTemplateOptions.instanceId());
    pathParamsMap.put("id", replaceTemplateOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/templates/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "replaceTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceTemplateOptions.name() != null) {
      contentJson.addProperty("name", replaceTemplateOptions.name());
    }
    if (replaceTemplateOptions.description() != null) {
      contentJson.addProperty("description", replaceTemplateOptions.description());
    }
    if (replaceTemplateOptions.type() != null) {
      contentJson.addProperty("type", replaceTemplateOptions.type());
    }
    if (replaceTemplateOptions.params() != null) {
      contentJson.add("params", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceTemplateOptions.params()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Template> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Template>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Template.
   *
   * Delete a Template.
   *
   * @param deleteTemplateOptions the {@link DeleteTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTemplate(DeleteTemplateOptions deleteTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTemplateOptions,
      "deleteTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteTemplateOptions.instanceId());
    pathParamsMap.put("id", deleteTemplateOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/templates/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all predefined templates.
   *
   * List all predefined templates.
   *
   * @param listPreDefinedTemplatesOptions the {@link ListPreDefinedTemplatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PredefinedTemplatesList}
   */
  public ServiceCall<PredefinedTemplatesList> listPreDefinedTemplates(ListPreDefinedTemplatesOptions listPreDefinedTemplatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPreDefinedTemplatesOptions,
      "listPreDefinedTemplatesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listPreDefinedTemplatesOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/pre_defined_templates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listPreDefinedTemplates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("source", String.valueOf(listPreDefinedTemplatesOptions.source()));
    builder.query("type", String.valueOf(listPreDefinedTemplatesOptions.type()));
    if (listPreDefinedTemplatesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPreDefinedTemplatesOptions.limit()));
    }
    if (listPreDefinedTemplatesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listPreDefinedTemplatesOptions.offset()));
    }
    if (listPreDefinedTemplatesOptions.search() != null) {
      builder.query("search", String.valueOf(listPreDefinedTemplatesOptions.search()));
    }
    ResponseConverter<PredefinedTemplatesList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PredefinedTemplatesList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of a Predefined Template.
   *
   * Get details of a Predefined Template.
   *
   * @param getPreDefinedTemplateOptions the {@link GetPreDefinedTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetPredefinedTemplate}
   */
  public ServiceCall<GetPredefinedTemplate> getPreDefinedTemplate(GetPreDefinedTemplateOptions getPreDefinedTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPreDefinedTemplateOptions,
      "getPreDefinedTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getPreDefinedTemplateOptions.instanceId());
    pathParamsMap.put("id", getPreDefinedTemplateOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/pre_defined_templates/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getPreDefinedTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<GetPredefinedTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetPredefinedTemplate>() { }.getType());
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
    if (createDestinationOptions.collectFailedEvents() != null) {
      multipartBuilder.addFormDataPart("collect_failed_events", String.valueOf(createDestinationOptions.collectFailedEvents()));
    }
    if (createDestinationOptions.config() != null) {
      multipartBuilder.addFormDataPart("config", createDestinationOptions.config().toString());
    }
    if (createDestinationOptions.certificate() != null) {
      okhttp3.RequestBody certificateBody = RequestUtils.inputStreamBody(createDestinationOptions.certificate(), createDestinationOptions.certificateContentType());
      multipartBuilder.addFormDataPart("certificate", "filename", certificateBody);
    }
    if (createDestinationOptions.icon16x16() != null) {
      okhttp3.RequestBody icon16x16Body = RequestUtils.inputStreamBody(createDestinationOptions.icon16x16(), createDestinationOptions.icon16x16ContentType());
      multipartBuilder.addFormDataPart("icon_16x16", "filename", icon16x16Body);
    }
    if (createDestinationOptions.icon16x162x() != null) {
      okhttp3.RequestBody icon16x162xBody = RequestUtils.inputStreamBody(createDestinationOptions.icon16x162x(), createDestinationOptions.icon16x162xContentType());
      multipartBuilder.addFormDataPart("icon_16x16_2x", "filename", icon16x162xBody);
    }
    if (createDestinationOptions.icon32x32() != null) {
      okhttp3.RequestBody icon32x32Body = RequestUtils.inputStreamBody(createDestinationOptions.icon32x32(), createDestinationOptions.icon32x32ContentType());
      multipartBuilder.addFormDataPart("icon_32x32", "filename", icon32x32Body);
    }
    if (createDestinationOptions.icon32x322x() != null) {
      okhttp3.RequestBody icon32x322xBody = RequestUtils.inputStreamBody(createDestinationOptions.icon32x322x(), createDestinationOptions.icon32x322xContentType());
      multipartBuilder.addFormDataPart("icon_32x32_2x", "filename", icon32x322xBody);
    }
    if (createDestinationOptions.icon128x128() != null) {
      okhttp3.RequestBody icon128x128Body = RequestUtils.inputStreamBody(createDestinationOptions.icon128x128(), createDestinationOptions.icon128x128ContentType());
      multipartBuilder.addFormDataPart("icon_128x128", "filename", icon128x128Body);
    }
    if (createDestinationOptions.icon128x1282x() != null) {
      okhttp3.RequestBody icon128x1282xBody = RequestUtils.inputStreamBody(createDestinationOptions.icon128x1282x(), createDestinationOptions.icon128x1282xContentType());
      multipartBuilder.addFormDataPart("icon_128x128_2x", "filename", icon128x1282xBody);
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
    com.ibm.cloud.sdk.core.util.Validator.isTrue((updateDestinationOptions.name() != null) || (updateDestinationOptions.description() != null) || (updateDestinationOptions.collectFailedEvents() != null) || (updateDestinationOptions.config() != null) || (updateDestinationOptions.certificate() != null) || (updateDestinationOptions.icon16x16() != null) || (updateDestinationOptions.icon16x162x() != null) || (updateDestinationOptions.icon32x32() != null) || (updateDestinationOptions.icon32x322x() != null) || (updateDestinationOptions.icon128x128() != null) || (updateDestinationOptions.icon128x1282x() != null),
      "At least one of name, description, collectFailedEvents, config, certificate, icon16x16, icon16x162x, icon32x32, icon32x322x, icon128x128, or icon128x1282x must be supplied.");
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
    if (updateDestinationOptions.collectFailedEvents() != null) {
      multipartBuilder.addFormDataPart("collect_failed_events", String.valueOf(updateDestinationOptions.collectFailedEvents()));
    }
    if (updateDestinationOptions.config() != null) {
      multipartBuilder.addFormDataPart("config", updateDestinationOptions.config().toString());
    }
    if (updateDestinationOptions.certificate() != null) {
      okhttp3.RequestBody certificateBody = RequestUtils.inputStreamBody(updateDestinationOptions.certificate(), updateDestinationOptions.certificateContentType());
      multipartBuilder.addFormDataPart("certificate", "filename", certificateBody);
    }
    if (updateDestinationOptions.icon16x16() != null) {
      okhttp3.RequestBody icon16x16Body = RequestUtils.inputStreamBody(updateDestinationOptions.icon16x16(), updateDestinationOptions.icon16x16ContentType());
      multipartBuilder.addFormDataPart("icon_16x16", "filename", icon16x16Body);
    }
    if (updateDestinationOptions.icon16x162x() != null) {
      okhttp3.RequestBody icon16x162xBody = RequestUtils.inputStreamBody(updateDestinationOptions.icon16x162x(), updateDestinationOptions.icon16x162xContentType());
      multipartBuilder.addFormDataPart("icon_16x16_2x", "filename", icon16x162xBody);
    }
    if (updateDestinationOptions.icon32x32() != null) {
      okhttp3.RequestBody icon32x32Body = RequestUtils.inputStreamBody(updateDestinationOptions.icon32x32(), updateDestinationOptions.icon32x32ContentType());
      multipartBuilder.addFormDataPart("icon_32x32", "filename", icon32x32Body);
    }
    if (updateDestinationOptions.icon32x322x() != null) {
      okhttp3.RequestBody icon32x322xBody = RequestUtils.inputStreamBody(updateDestinationOptions.icon32x322x(), updateDestinationOptions.icon32x322xContentType());
      multipartBuilder.addFormDataPart("icon_32x32_2x", "filename", icon32x322xBody);
    }
    if (updateDestinationOptions.icon128x128() != null) {
      okhttp3.RequestBody icon128x128Body = RequestUtils.inputStreamBody(updateDestinationOptions.icon128x128(), updateDestinationOptions.icon128x128ContentType());
      multipartBuilder.addFormDataPart("icon_128x128", "filename", icon128x128Body);
    }
    if (updateDestinationOptions.icon128x1282x() != null) {
      okhttp3.RequestBody icon128x1282xBody = RequestUtils.inputStreamBody(updateDestinationOptions.icon128x1282x(), updateDestinationOptions.icon128x1282xContentType());
      multipartBuilder.addFormDataPart("icon_128x128_2x", "filename", icon128x1282xBody);
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
   * Get enabled country details of SMS destination.
   *
   * Get enabled country details of SMS destination.
   *
   * @param getEnabledCountriesOptions the {@link GetEnabledCountriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EnabledCountriesResponse}
   */
  public ServiceCall<EnabledCountriesResponse> getEnabledCountries(GetEnabledCountriesOptions getEnabledCountriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getEnabledCountriesOptions,
      "getEnabledCountriesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getEnabledCountriesOptions.instanceId());
    pathParamsMap.put("id", getEnabledCountriesOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/enabled_countries", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getEnabledCountries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<EnabledCountriesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EnabledCountriesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Test a Destination.
   *
   * Test a Destination.
   *
   * @param testDestinationOptions the {@link TestDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TestDestinationResponse}
   */
  public ServiceCall<TestDestinationResponse> testDestination(TestDestinationOptions testDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(testDestinationOptions,
      "testDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", testDestinationOptions.instanceId());
    pathParamsMap.put("id", testDestinationOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/test", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "testDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TestDestinationResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TestDestinationResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Verify SPF and DKIM records of custom domain.
   *
   * Verify SPF and DKIM records of custom domain.
   *
   * @param updateVerifyDestinationOptions the {@link UpdateVerifyDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VerificationResponse}
   */
  public ServiceCall<VerificationResponse> updateVerifyDestination(UpdateVerifyDestinationOptions updateVerifyDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVerifyDestinationOptions,
      "updateVerifyDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateVerifyDestinationOptions.instanceId());
    pathParamsMap.put("id", updateVerifyDestinationOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/destinations/{id}/verify", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "updateVerifyDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("type", String.valueOf(updateVerifyDestinationOptions.type()));
    ResponseConverter<VerificationResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VerificationResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new tag subscription.
   *
   * Create a new tag subscription.
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
   * List all tag subscriptions.
   *
   * List all tag subscriptions.
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
   * Delete a tag subscription.
   *
   * Delete a tag subscription.
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

  /**
   * Create an Integration.
   *
   * Create an Integration.
   *
   * @param createIntegrationOptions the {@link CreateIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IntegrationCreateResponse}
   */
  public ServiceCall<IntegrationCreateResponse> createIntegration(CreateIntegrationOptions createIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIntegrationOptions,
      "createIntegrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createIntegrationOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/integrations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", createIntegrationOptions.type());
    contentJson.add("metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIntegrationOptions.metadata()));
    builder.bodyJson(contentJson);
    ResponseConverter<IntegrationCreateResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IntegrationCreateResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all Integrations.
   *
   * List of all KMS Integrations.
   *
   * @param listIntegrationsOptions the {@link ListIntegrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IntegrationList}
   */
  public ServiceCall<IntegrationList> listIntegrations(ListIntegrationsOptions listIntegrationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listIntegrationsOptions,
      "listIntegrationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listIntegrationsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/integrations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listIntegrations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listIntegrationsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listIntegrationsOptions.offset()));
    }
    if (listIntegrationsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listIntegrationsOptions.limit()));
    }
    if (listIntegrationsOptions.search() != null) {
      builder.query("search", String.valueOf(listIntegrationsOptions.search()));
    }
    ResponseConverter<IntegrationList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IntegrationList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a single Integration.
   *
   * Get a single KMS Integration.
   *
   * @param getIntegrationOptions the {@link GetIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IntegrationGetResponse}
   */
  public ServiceCall<IntegrationGetResponse> getIntegration(GetIntegrationOptions getIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIntegrationOptions,
      "getIntegrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getIntegrationOptions.instanceId());
    pathParamsMap.put("id", getIntegrationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/integrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<IntegrationGetResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IntegrationGetResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an existing Integration.
   *
   * Update an existing Integration.
   *
   * @param replaceIntegrationOptions the {@link ReplaceIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IntegrationGetResponse}
   */
  public ServiceCall<IntegrationGetResponse> replaceIntegration(ReplaceIntegrationOptions replaceIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceIntegrationOptions,
      "replaceIntegrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", replaceIntegrationOptions.instanceId());
    pathParamsMap.put("id", replaceIntegrationOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/integrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "replaceIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", replaceIntegrationOptions.type());
    contentJson.add("metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceIntegrationOptions.metadata()));
    builder.bodyJson(contentJson);
    ResponseConverter<IntegrationGetResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IntegrationGetResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new SMTP Configuration.
   *
   * Create a new SMTP Configuration.
   *
   * @param createSmtpConfigurationOptions the {@link CreateSmtpConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPCreateResponse}
   */
  public ServiceCall<SMTPCreateResponse> createSmtpConfiguration(CreateSmtpConfigurationOptions createSmtpConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSmtpConfigurationOptions,
      "createSmtpConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createSmtpConfigurationOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createSmtpConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createSmtpConfigurationOptions.name());
    contentJson.addProperty("domain", createSmtpConfigurationOptions.domain());
    if (createSmtpConfigurationOptions.description() != null) {
      contentJson.addProperty("description", createSmtpConfigurationOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SMTPCreateResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPCreateResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all SMTP Configurations.
   *
   * List all SMTP Configurations.
   *
   * @param listSmtpConfigurationsOptions the {@link ListSmtpConfigurationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPConfigurationsList}
   */
  public ServiceCall<SMTPConfigurationsList> listSmtpConfigurations(ListSmtpConfigurationsOptions listSmtpConfigurationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSmtpConfigurationsOptions,
      "listSmtpConfigurationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listSmtpConfigurationsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listSmtpConfigurations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSmtpConfigurationsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSmtpConfigurationsOptions.limit()));
    }
    if (listSmtpConfigurationsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSmtpConfigurationsOptions.offset()));
    }
    if (listSmtpConfigurationsOptions.search() != null) {
      builder.query("search", String.valueOf(listSmtpConfigurationsOptions.search()));
    }
    ResponseConverter<SMTPConfigurationsList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPConfigurationsList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new SMTP User.
   *
   * Create a new SMTP User.
   *
   * @param createSmtpUserOptions the {@link CreateSmtpUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPUserResponse}
   */
  public ServiceCall<SMTPUserResponse> createSmtpUser(CreateSmtpUserOptions createSmtpUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSmtpUserOptions,
      "createSmtpUserOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createSmtpUserOptions.instanceId());
    pathParamsMap.put("id", createSmtpUserOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}/users", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "createSmtpUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createSmtpUserOptions.description() != null) {
      contentJson.addProperty("description", createSmtpUserOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SMTPUserResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPUserResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all SMTP users.
   *
   * List all SMTP users.
   *
   * @param listSmtpUsersOptions the {@link ListSmtpUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPUsersList}
   */
  public ServiceCall<SMTPUsersList> listSmtpUsers(ListSmtpUsersOptions listSmtpUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSmtpUsersOptions,
      "listSmtpUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listSmtpUsersOptions.instanceId());
    pathParamsMap.put("id", listSmtpUsersOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}/users", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "listSmtpUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSmtpUsersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSmtpUsersOptions.limit()));
    }
    if (listSmtpUsersOptions.offset() != null) {
      builder.query("offset", String.valueOf(listSmtpUsersOptions.offset()));
    }
    if (listSmtpUsersOptions.search() != null) {
      builder.query("search", String.valueOf(listSmtpUsersOptions.search()));
    }
    ResponseConverter<SMTPUsersList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPUsersList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of a SMTP Configuration.
   *
   * Get details of a SMTP Configuration.
   *
   * @param getSmtpConfigurationOptions the {@link GetSmtpConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPConfiguration}
   */
  public ServiceCall<SMTPConfiguration> getSmtpConfiguration(GetSmtpConfigurationOptions getSmtpConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSmtpConfigurationOptions,
      "getSmtpConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getSmtpConfigurationOptions.instanceId());
    pathParamsMap.put("id", getSmtpConfigurationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getSmtpConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SMTPConfiguration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPConfiguration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update details of SMTP Configuration.
   *
   * Update details of SMTP Configuration.
   *
   * @param updateSmtpConfigurationOptions the {@link UpdateSmtpConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPConfiguration}
   */
  public ServiceCall<SMTPConfiguration> updateSmtpConfiguration(UpdateSmtpConfigurationOptions updateSmtpConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSmtpConfigurationOptions,
      "updateSmtpConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateSmtpConfigurationOptions.instanceId());
    pathParamsMap.put("id", updateSmtpConfigurationOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "updateSmtpConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateSmtpConfigurationOptions.name() != null) {
      contentJson.addProperty("name", updateSmtpConfigurationOptions.name());
    }
    if (updateSmtpConfigurationOptions.description() != null) {
      contentJson.addProperty("description", updateSmtpConfigurationOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SMTPConfiguration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPConfiguration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a SMTP Configuration.
   *
   * Delete a SMTP Configuration.
   *
   * @param deleteSmtpConfigurationOptions the {@link DeleteSmtpConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSmtpConfiguration(DeleteSmtpConfigurationOptions deleteSmtpConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSmtpConfigurationOptions,
      "deleteSmtpConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteSmtpConfigurationOptions.instanceId());
    pathParamsMap.put("id", deleteSmtpConfigurationOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteSmtpConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of a SMTP User.
   *
   * Get details of a SMTP User.
   *
   * @param getSmtpUserOptions the {@link GetSmtpUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPUser}
   */
  public ServiceCall<SMTPUser> getSmtpUser(GetSmtpUserOptions getSmtpUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSmtpUserOptions,
      "getSmtpUserOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getSmtpUserOptions.instanceId());
    pathParamsMap.put("id", getSmtpUserOptions.id());
    pathParamsMap.put("user_id", getSmtpUserOptions.userId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}/users/{user_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getSmtpUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SMTPUser> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPUser>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update details of a SMTP User.
   *
   * Update details of a SMTP User.
   *
   * @param updateSmtpUserOptions the {@link UpdateSmtpUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPUser}
   */
  public ServiceCall<SMTPUser> updateSmtpUser(UpdateSmtpUserOptions updateSmtpUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSmtpUserOptions,
      "updateSmtpUserOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateSmtpUserOptions.instanceId());
    pathParamsMap.put("id", updateSmtpUserOptions.id());
    pathParamsMap.put("user_id", updateSmtpUserOptions.userId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}/users/{user_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "updateSmtpUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateSmtpUserOptions.description() != null) {
      contentJson.addProperty("description", updateSmtpUserOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SMTPUser> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPUser>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a SMTP user.
   *
   * Delete a SMTP user.
   *
   * @param deleteSmtpUserOptions the {@link DeleteSmtpUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSmtpUser(DeleteSmtpUserOptions deleteSmtpUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSmtpUserOptions,
      "deleteSmtpUserOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteSmtpUserOptions.instanceId());
    pathParamsMap.put("id", deleteSmtpUserOptions.id());
    pathParamsMap.put("user_id", deleteSmtpUserOptions.userId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}/users/{user_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "deleteSmtpUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of SMTP configuration allowed IPs.
   *
   * Get details of SMTP configuration allowed IPs.
   *
   * @param getSmtpAllowedIpsOptions the {@link GetSmtpAllowedIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPAllowedIPs}
   */
  public ServiceCall<SMTPAllowedIPs> getSmtpAllowedIps(GetSmtpAllowedIpsOptions getSmtpAllowedIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSmtpAllowedIpsOptions,
      "getSmtpAllowedIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getSmtpAllowedIpsOptions.instanceId());
    pathParamsMap.put("id", getSmtpAllowedIpsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}/allowed_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getSmtpAllowedIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SMTPAllowedIPs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPAllowedIPs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Verify SMTP configuration domain.
   *
   * Verify SMTP configuration domain.
   *
   * @param updateVerifySmtpOptions the {@link UpdateVerifySmtpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SMTPVerificationUpdateResponse}
   */
  public ServiceCall<SMTPVerificationUpdateResponse> updateVerifySmtp(UpdateVerifySmtpOptions updateVerifySmtpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVerifySmtpOptions,
      "updateVerifySmtpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateVerifySmtpOptions.instanceId());
    pathParamsMap.put("id", updateVerifySmtpOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/smtp/config/{id}/verify", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "updateVerifySmtp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("type", String.valueOf(updateVerifySmtpOptions.type()));
    ResponseConverter<SMTPVerificationUpdateResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SMTPVerificationUpdateResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get notification status.
   *
   * Get notification status.
   *
   * @param getNotificationsStatusOptions the {@link GetNotificationsStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetNotificationStatusResponse}
   */
  public ServiceCall<GetNotificationStatusResponse> getNotificationsStatus(GetNotificationsStatusOptions getNotificationsStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getNotificationsStatusOptions,
      "getNotificationsStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getNotificationsStatusOptions.instanceId());
    pathParamsMap.put("id", getNotificationsStatusOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/instances/{instance_id}/notifications/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "getNotificationsStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<GetNotificationStatusResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetNotificationStatusResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
