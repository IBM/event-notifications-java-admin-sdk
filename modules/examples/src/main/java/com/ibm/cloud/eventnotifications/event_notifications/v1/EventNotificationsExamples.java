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

package com.ibm.cloud.eventnotifications.event_notifications.v1;

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import java.io.File;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//
// This file provides an example of how to use the Event Notifications service.
//
// The following configuration properties are assumed to be defined:
// EVENT_NOTIFICATIONS_URL=<service base url>
// EVENT_NOTIFICATIONS_AUTH_TYPE=iam
// EVENT_NOTIFICATIONS_APIKEY=<IAM apikey>
// EVENT_NOTIFICATIONS_AUTH_URL=<IAM token service base URL - omit this if using the production environment>
//
// These configuration properties can be exported as environment variables, or stored
// in a configuration file and then:
// export IBM_CREDENTIALS_FILE=<name of configuration file>
//
public class EventNotificationsExamples {
  private static final Logger logger = LoggerFactory.getLogger(EventNotificationsExamples.class);
  protected EventNotificationsExamples() { }

  public static String instanceId = "";
  public static String search = "";
  public static String topicName = "Admin Topic Compliance";
  public static String sourceId = "";
  public static String topicId = "";
  public static String destinationId = "";
  public static String subscriptionId = "";
  public static Map<String, String> config = null;

  static String getConfigFilename() {
    return "./event_notifications_v1.env";
  }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {

    File configFile = new File(getConfigFilename());
    if (!configFile.exists()) {
      System.out.println(
              String.format(">>> Configuration file %s not found, skipping execution.",
                      configFile.getCanonicalPath()));
    } else {
      // Set the system property to point to the config file.
      System.setProperty("IBM_CREDENTIALS_FILE", getConfigFilename());
    }

    EventNotifications eventNotificationsService = EventNotifications.newInstance();

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(EventNotifications.DEFAULT_SERVICE_NAME);
    instanceId = config.get("GUID");

    try {
      System.out.println("listSources() result:");
      // begin-list_sources
      ListSourcesOptions listSourcesOptions = new ListSourcesOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<SourceList> response = eventNotificationsService.listSources(listSourcesOptions).execute();
      SourceList sourceList = response.getResult();

      System.out.println(sourceList);
      // end-list_sources

      sourceId = sourceList.getSources().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSource() result:");
      // begin-get_source
      GetSourceOptions getSourceOptions = new GetSourceOptions.Builder()
        .instanceId(instanceId)
        .id(sourceId)
        .build();

      Response<Source> response = eventNotificationsService.getSource(getSourceOptions).execute();
      Source source = response.getResult();

      System.out.println(source);
      // end-get_source
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createTopic() result:");
      // begin-create_topic

      Rules rulesModel = new Rules.Builder()
              .enabled(true)
              .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
              .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
              .build();

      TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
              .id(sourceId)
              .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
              .build();

      CreateTopicOptions createTopicOptions = new CreateTopicOptions.Builder()
        .instanceId(instanceId)
        .name(topicName)
        .description("This topic is used for routing all compliance related notifications to the appropriate destinations")
        .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
        .build();

      Response<TopicResponse> response = eventNotificationsService.createTopic(createTopicOptions).execute();
      TopicResponse topicResponse = response.getResult();

      System.out.println(topicResponse);
      // end-create_topic

      topicId = topicResponse.getId();

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listTopics() result:");
      // begin-list_topics
      ListTopicsOptions listTopicsOptions = new ListTopicsOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<TopicList> response = eventNotificationsService.listTopics(listTopicsOptions).execute();
      TopicList topicList = response.getResult();

      System.out.println(topicList);
      // end-list_topics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTopic() result:");
      // begin-get_topic
      GetTopicOptions getTopicOptions = new GetTopicOptions.Builder()
        .instanceId(instanceId)
        .id(topicId)
        .build();

      Response<Topic> response = eventNotificationsService.getTopic(getTopicOptions).execute();
      Topic topic = response.getResult();

      System.out.println(topic);
      // end-get_topic
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceTopic() result:");
      // begin-replace_topic

      Rules rulesModel = new Rules.Builder()
              .enabled(true)
              .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
              .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
              .build();

      TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
              .id(sourceId)
              .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
              .build();

      String description = "Updated Topic for GCM notifications";
      String name = "Updated Admin Topic Compliance";

      ReplaceTopicOptions replaceTopicOptions = new ReplaceTopicOptions.Builder()
        .instanceId(instanceId)
        .id(topicId)
        .name(name)
        .description(description)
        .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
        .build();

      Response<Topic> response = eventNotificationsService.replaceTopic(replaceTopicOptions).execute();
      Topic topic = response.getResult();

      System.out.println(topic);
      // end-replace_topic
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDestination() result:");
      // begin-create_destination

      DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
              .url("https://gcm.com")
              .verb("get")
              .customHeaders(new java.util.HashMap<String, String>() { { put("Authorization", "aaa-r-t-fdsfs-55kfjsd-fsdfs"); } })
              .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("gcm_apikey")))
              .build();

      DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
              .params(destinationConfigParamsModel)
              .build();

      String name = "GCM_destination";
      String typeVal = "webhook";
      String description = "GCM Destination";

      CreateDestinationOptions createDestinationOptions = new CreateDestinationOptions.Builder()
        .instanceId(instanceId)
        .name(name)
        .type(typeVal)
        .description(description)
        .config(destinationConfigModel)
        .build();

      Response<DestinationResponse> response = eventNotificationsService.createDestination(createDestinationOptions).execute();
      DestinationResponse destinationResponse = response.getResult();

      System.out.println(destinationResponse);
      // end-create_destination

      destinationId = destinationResponse.getId();

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDestinations() result:");
      // begin-list_destinations
      ListDestinationsOptions listDestinationsOptions = new ListDestinationsOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<DestinationList> response = eventNotificationsService.listDestinations(listDestinationsOptions).execute();
      DestinationList destinationList = response.getResult();

      System.out.println(destinationList);
      // end-list_destinations
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDestination() result:");
      // begin-get_destination
      GetDestinationOptions getDestinationOptions = new GetDestinationOptions.Builder()
        .instanceId(instanceId)
        .id(destinationId)
        .build();

      Response<Destination> response = eventNotificationsService.getDestination(getDestinationOptions).execute();
      Destination destination = response.getResult();

      System.out.println(destination);
      // end-get_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDestination() result:");
      // begin-update_destination

      DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
              .url("https://cloud.ibm.com/nhwebhook/sendwebhook")
              .verb("post")
              .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("authorization")))
              .build();

      DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
              .params(destinationConfigParamsModel)
              .build();

      String name = "Admin GCM Compliance";
      String description = "This destination is for creating admin GCM webhook to receive compliance notifications";


      UpdateDestinationOptions updateDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId)
              .name(name)
              .description(description)
              .config(destinationConfigModel)
              .build();

      Response<Destination> response = eventNotificationsService.updateDestination(updateDestinationOptions).execute();
      Destination destination = response.getResult();

      System.out.println(destination);
      // end-update_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSubscription() result:");
      // begin-create_subscription
      SubscriptionCreateAttributesWebhookAttributes subscriptionCreateWebAttributesModel = new SubscriptionCreateAttributesWebhookAttributes.Builder()
              .signingEnabled(false).build();
      String name = "subscription_web";
      String description = "Subscription for web";

      CreateSubscriptionOptions createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .destinationId(destinationId)
              .topicId(topicId)
              .attributes(subscriptionCreateWebAttributesModel)
              .description(description)
              .build();

      Response<Subscription> response = eventNotificationsService.createSubscription(createSubscriptionOptions).execute();
      Subscription subscription = response.getResult();

      System.out.println(subscription);
      // end-create_subscription

      subscriptionId = subscription.getId();

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSubscriptions() result:");
      // begin-list_subscriptions
      ListSubscriptionsOptions listSubscriptionsOptions = new ListSubscriptionsOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<SubscriptionList> response = eventNotificationsService.listSubscriptions(listSubscriptionsOptions).execute();
      SubscriptionList subscriptionList = response.getResult();

      System.out.println(subscriptionList);
      // end-list_subscriptions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubscription() result:");
      // begin-get_subscription
      GetSubscriptionOptions getSubscriptionOptions = new GetSubscriptionOptions.Builder()
        .instanceId(instanceId)
        .id(subscriptionId)
        .build();

      Response<Subscription> response = eventNotificationsService.getSubscription(getSubscriptionOptions).execute();
      Subscription subscription = response.getResult();

      System.out.println(subscription);
      // end-get_subscription
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSubscription() result:");
      // begin-update_subscription
      SubscriptionUpdateAttributesWebhookAttributes subscriptionUpdateWebAttributesModel = new SubscriptionUpdateAttributesWebhookAttributes.Builder()
              .signingEnabled(true)
              .build();

      String name = "GCM_sub_updated";
      String description = "Update GCM subscription";

      UpdateSubscriptionOptions updateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId)
              .name(name)
              .description(description)
              .attributes(subscriptionUpdateWebAttributesModel)
              .build();

      Response<Subscription> response = eventNotificationsService.updateSubscription(updateSubscriptionOptions).execute();
      Subscription subscription = response.getResult();

      System.out.println(subscription);
      // end-update_subscription
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_subscription
      DeleteSubscriptionOptions deleteSubscriptionOptions = new DeleteSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId)
              .build();

      Response<Void> response = eventNotificationsService.deleteSubscription(deleteSubscriptionOptions).execute();
      // end-delete_subscription
      System.out.printf("deleteSubscription() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_topic
      DeleteTopicOptions deleteTopicOptions = new DeleteTopicOptions.Builder()
        .instanceId(instanceId)
        .id(topicId)
        .build();

      Response<Void> response = eventNotificationsService.deleteTopic(deleteTopicOptions).execute();
      // end-delete_topic
      System.out.printf("deleteTopic() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_destination
      DeleteDestinationOptions deleteDestinationOptions = new DeleteDestinationOptions.Builder()
        .instanceId(instanceId)
        .id(destinationId)
        .build();

      Response<Void> response = eventNotificationsService.deleteDestination(deleteDestinationOptions).execute();
      // end-delete_destination
      System.out.printf("deleteDestination() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
