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

package com.ibm.cloud.eventnotifications.event_notifications.v1;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
  public static String fcmServerKey = "";
  public static String fcmSenderId = "";

  static String getConfigFilename() {
    return "./event_notifications_v1.env";
  }

  /*static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../event_notifications_v1.env");
  }*/

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
    fcmSenderId = config.get("FCM_ID");
    fcmServerKey = config.get("FCM_KEY");

    try {
      System.out.println("createSources() result:");
      // begin-create_sources
      CreateSourcesOptions createSourcesOptions = new CreateSourcesOptions.Builder()
              .instanceId(instanceId)
              .name("Event Notification Create Source Acme")
              .description("This source is used for Acme Bank")
              .enabled(false)
              .build();

      Response<SourceResponse> response = eventNotificationsService.createSources(createSourcesOptions).execute();
      SourceResponse sourceResponse = response.getResult();

      System.out.println(sourceResponse);
      // end-create_sources

      sourceId = sourceResponse.getId();

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

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
      System.out.println("updateSource() result:");
      // begin-update_source
      UpdateSourceOptions updateSourceOptions = new UpdateSourceOptions.Builder()
              .instanceId(instanceId)
              .id(sourceId)
              .name("Event Notification update Source Acme")
              .description("This source is used for updated Acme Bank")
              .enabled(true)
              .build();

      Response<Source> response = eventNotificationsService.updateSource(updateSourceOptions).execute();
      Source source = response.getResult();

      System.out.println(source);
      // end-update_source
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

      DestinationConfigParamsFCMDestinationConfig fcmConfig = new DestinationConfigParamsFCMDestinationConfig.Builder()
              .senderId(fcmSenderId)
              .serverKey(fcmServerKey)
              .build();

      DestinationConfig destinationFcmConfigModel = new DestinationConfig.Builder()
              .params(fcmConfig)
              .build();

      String fcmName = "FCM_destination";
      String fcmTypeVal = "push_android";
      String fcmDescription = "Fcm Destination";

      CreateDestinationOptions createFCMDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(fcmName)
              .type(fcmTypeVal)
              .description(fcmDescription)
              .config(destinationFcmConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> fcmResponse = eventNotificationsService.createDestination(createFCMDestinationOptions).execute();

      DestinationResponse destinationResponse = fcmResponse.getResult();

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

      DestinationConfigParamsFCMDestinationConfig fcmConfig = new DestinationConfigParamsFCMDestinationConfig.Builder()
              .senderId(fcmSenderId)
              .serverKey(fcmServerKey)
              .build();

      DestinationConfig destinationFcmConfigModel = new DestinationConfig.Builder()
              .params(fcmConfig)
              .build();

      String fcmName = "FCM_Admin Compliance";
      String fcmDescription = "This is a Destination for FCM compliance";

      UpdateDestinationOptions updateDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId)
              .name(fcmName)
              .description(fcmDescription)
              .config(destinationFcmConfigModel)
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
      System.out.println("listDestinationDevices() result:");
      // begin-list_destination_devices
      ListDestinationDevicesOptions listDestinationDevicesOptions = new ListDestinationDevicesOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId)
              .build();

      Response<DestinationDevicesList> response = eventNotificationsService.listDestinationDevices(listDestinationDevicesOptions).execute();
      DestinationDevicesList destinationDevicesList = response.getResult();

      System.out.println(destinationDevicesList);
      // end-list_destination_devices
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDestinationDevicesReport() result:");
      // begin-get_destination_devices_report
      GetDestinationDevicesReportOptions getDestinationDevicesReportOptions = new GetDestinationDevicesReportOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId)
              .build();

      Response<DestinationDevicesReport> response = eventNotificationsService.getDestinationDevicesReport(getDestinationDevicesReportOptions).execute();
      DestinationDevicesReport destinationDevicesReport = response.getResult();

      System.out.println(destinationDevicesReport);
      // end-get_destination_devices_report
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSubscription() result:");
      // begin-create_subscription

      String name = "FCM subscription";
      String description = "Subscription for FCM";

      CreateSubscriptionOptions createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .destinationId(destinationId)
              .topicId(topicId)
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

      String name = "FCM_sub_updated";
      String description = "Update FCM subscription";

      UpdateSubscriptionOptions updateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId)
              .name(name)
              .description(description)
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
      System.out.println("sendNotifications() result:");
      // begin-send_notifications
      List<String> userIds = new ArrayList<String>();
      userIds.add("Dev_User");

      NotificationDevices notificationDevices = new NotificationDevices.Builder()
              .userIds(userIds)
              .build();

      String jsonString = "{ 'title' : 'Portugal vs. Denmark', 'badge': 'great match' }";
      JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();

      NotificationFCMBodyNotificationPayload fcmBodyNotificationPayload = new NotificationFCMBodyNotificationPayload.Builder()
              .add("notification", jsonObject)
              .build();

      String apnsJsonString = "{'alert': 'Game Request', 'badge': 5 }";
      JsonObject apnsJsonObject = JsonParser.parseString(apnsJsonString).getAsJsonObject();

      NotificationAPNSBodyNotificationPayload apnsBodyNotificationPayload = new NotificationAPNSBodyNotificationPayload.Builder()
              .add("aps", apnsJsonObject)
              .build();

      Map<String, Object> messageApnsHeader = new java.util.HashMap<String, Object>() { { put("apns-collapse-id", "123"); } };

      SendNotificationsOptions sendNotificationsOptions = new SendNotificationsOptions.Builder()
              .instanceId(instanceId)
              .ceIbmenseverity("MEDIUM")
              .ceId("FCM ID")
              .ceSource(sourceId)
              .ceIbmensourceid(sourceId)
              .ceType("com.acme.offer:new")
              .ceTime(new java.util.Date())
              .ceIbmenpushto(notificationDevices)
              .ceIbmenfcmbody(fcmBodyNotificationPayload)
              .ceIbmenapnsbody(apnsBodyNotificationPayload)
              .ceIbmenapnsheaders(messageApnsHeader)
              .ceSpecversion("1.0")
              .build();

      Response<NotificationResponse> response = eventNotificationsService.sendNotifications(sendNotificationsOptions).execute();
      NotificationResponse notificationResponse = response.getResult();

      System.out.println(notificationResponse);
      // end-send_notifications
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

    try {
      // begin-delete_source
      DeleteSourceOptions deleteSourceOptions = new DeleteSourceOptions.Builder()
              .instanceId(instanceId)
              .id(sourceId)
              .build();

      Response<Void> response = eventNotificationsService.deleteSource(deleteSourceOptions).execute();
      // end-delete_source
      System.out.printf("deleteSource() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}

