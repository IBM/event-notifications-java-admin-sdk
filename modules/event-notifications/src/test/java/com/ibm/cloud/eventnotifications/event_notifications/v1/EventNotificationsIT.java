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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Destination;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParams;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsFCMDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsIOSDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsWebhookDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationDevicesList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationDevicesListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationDevicesReport;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationTagsSubscriptionResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailUpdateAttributesTo;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailUpdateAttributesUnsubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationDevicesReportOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Lights;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationDevicesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSubscriptionsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTagsSubscriptionsDeviceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTopicsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBody;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBodyNotificationPayload;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationDevices;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBody;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyNotificationPayload;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Rules;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.RulesGet;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Source;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Style;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Subscription;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesEmailAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesSMSAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesWebhookAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesEmailAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesFCMAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesSMSAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesWebhookAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesEmailUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSMSAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesWebhookAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Topic;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicUpdateSourcesItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicsListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.event_notifications.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the EventNotifications service.
 */
public class EventNotificationsIT extends SdkIntegrationTestBase {
  public EventNotifications service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  public static String instanceId = "";
  public static String search = "";
  public static String topicName = "GCMTopic";
  public static String sourceId = "";
  public static String topicId = "";
  public static String topicId2 = "";
  public static String topicId3 = "";
  public static String destinationId = "";
  public static String destinationId2 = "";
  public static String destinationId3 = "";
  public static String subscriptionId = "";
  public static String subscriptionId2 = "";
  public static String subscriptionId3 = "";
  public static String fcmServerKey = "";
  public static String fcmSenderId = "";

  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../event_notifications_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = EventNotifications.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(EventNotifications.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));
    instanceId = config.get("GUID");
    fcmSenderId = config.get("FCM_ID");
    fcmServerKey = config.get("FCM_KEY");
    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void test1AListSources() throws Exception {
    try {
      Boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListSourcesOptions listSourcesOptions = new ListSourcesOptions.Builder()
                .instanceId(instanceId)
                .limit(Long.valueOf(limit))
                .offset(Long.valueOf(offset))
                .search(search)
                .build();

        // Invoke operation
        Response<SourceList> response = service.listSources(listSourcesOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        SourceList sourceListResult = response.getResult();

        assertNotNull(sourceListResult);

        if (offset == 0) {
          sourceId = sourceListResult.getSources().get(0).getId();
        }

        if (sourceListResult.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1BGetSource() throws Exception {
    try {
      GetSourceOptions getSourceOptions = new GetSourceOptions.Builder()
              .instanceId(instanceId)
              .id(sourceId)
              .build();

      // Invoke operation
      Response<Source> response = service.getSource(getSourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Source sourceResult = response.getResult();
      assertNotNull(sourceResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1CCreateTopic() throws Exception {
    try {
      Rules rulesModel = new Rules.Builder()
              .enabled(true)
              .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
              .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
              .build();

      TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
              .id(sourceId)
              .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
              .build();

      String description = "Topic for GCM notifications";
      CreateTopicOptions createTopicOptions = new CreateTopicOptions.Builder()
              .instanceId(instanceId)
              .name(topicName)
              .description(description)
              .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
              .build();

      // Invoke operation
      Response<TopicResponse> response = service.createTopic(createTopicOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      TopicResponse topicResponseResult = response.getResult();

      assertNotNull(topicResponseResult);
      assertEquals(topicResponseResult.getName(), topicName);
      assertEquals(topicResponseResult.getDescription(), description);

      topicId = topicResponseResult.getId();

      description = "Topic 2 for GCM notifications";
      String name = "topic2";

      createTopicOptions = new CreateTopicOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .description(description)
              .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
              .build();

      // Invoke operation
      Response<TopicResponse> response1 = service.createTopic(createTopicOptions).execute();
      // Validate response
      assertNotNull(response1);
      assertEquals(response1.getStatusCode(), 201);

      TopicResponse topicResponseResult1 = response1.getResult();

      assertNotNull(topicResponseResult1);
      assertEquals(topicResponseResult1.getName(), name);
      assertEquals(topicResponseResult1.getDescription(), description);

      topicId2 = topicResponseResult1.getId();

      description = "Topic 3 for GCM notifications";
      name = "topic3";

      createTopicOptions = new CreateTopicOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .description(description)
              .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
              .build();

      // Invoke operation
      Response<TopicResponse> response2 = service.createTopic(createTopicOptions).execute();
      // Validate response
      assertNotNull(response2);
      assertEquals(response2.getStatusCode(), 201);

      TopicResponse topicResponseResult2 = response2.getResult();

      assertNotNull(topicResponseResult2);
      assertEquals(topicResponseResult2.getName(), name);
      assertEquals(topicResponseResult2.getDescription(), description);

      topicId3 = topicResponseResult2.getId();



      assertNotEquals(topicId, "");
      assertNotEquals(topicId2, "");
      assertNotEquals(topicId3, "");

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 404
      // 409
      // 415
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1DListTopics() throws Exception {
    try {
      Boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListTopicsOptions listTopicsOptions = new ListTopicsOptions.Builder()
                .instanceId(instanceId)
                .limit(Long.valueOf(limit))
                .offset(Long.valueOf(offset))
                .search(search)
                .build();

        // Invoke operation
        Response<TopicList> response = service.listTopics(listTopicsOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        TopicList topicListResult = response.getResult();
        assertNotNull(topicListResult);

        if (topicListResult.getTotalCount() <= offset) {
          moreResults = false;
        }

        offset += 1;
      }
      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1EGetTopic() throws Exception {
    try {
      GetTopicOptions getTopicOptions = new GetTopicOptions.Builder()
              .instanceId(instanceId)
              .id(topicId)
              .include(search)
              .build();

      // Invoke operation
      Response<Topic> response = service.getTopic(getTopicOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Topic topicResult = response.getResult();

      assertNotNull(topicResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1FReplaceTopic() throws Exception {
    try {
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
      String name = topicName + "2";
      ReplaceTopicOptions replaceTopicOptions = new ReplaceTopicOptions.Builder()
              .instanceId(instanceId)
              .id(topicId)
              .name(name)
              .description(description)
              .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
              .build();

      // Invoke operation
      Response<Topic> response = service.replaceTopic(replaceTopicOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Topic topicResult = response.getResult();
      assertNotNull(topicResult);

      assertEquals(topicResult.getDescription(), description);
      assertEquals(topicResult.getName(), name);
      assertEquals(topicResult.getId(), topicId);
      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 404
      // 409
      // 415
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1GCreateDestination() throws Exception {
    try {
      DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
              .url("https://gcm.com")
              .verb("get")
              .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
              .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("gcm_apikey")))
              .build();

      DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
              .params(destinationConfigParamsModel)
              .build();

      String name = "webhook_destination";
      String typeVal = "webhook";
      String description = "webhook Destination";

      CreateDestinationOptions createDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .type(typeVal)
              .description(description)
              .config(destinationConfigModel)
              .certificate(TestUtilities.createMockStream("This is a mock file."))
              .certificateContentType("testString")
              .build();

      // Invoke operation
      Response<DestinationResponse> response = service.createDestination(createDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DestinationResponse destinationResponseResult = response.getResult();

      assertNotNull(destinationResponseResult);
      assertEquals(destinationResponseResult.getDescription(), description);
      assertEquals(destinationResponseResult.getName(), name);
      assertEquals(destinationResponseResult.getType(), typeVal);

      destinationId = destinationResponseResult.getId();

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
      Response<DestinationResponse> fcmResponse = service.createDestination(createFCMDestinationOptions).execute();
      // Validate response
      assertNotNull(fcmResponse);
      assertEquals(fcmResponse.getStatusCode(), 201);

      DestinationResponse destinationFCMResponseResult = fcmResponse.getResult();

      assertNotNull(destinationFCMResponseResult);
      assertEquals(destinationFCMResponseResult.getDescription(), fcmDescription);
      assertEquals(destinationFCMResponseResult.getName(), fcmName);
      assertEquals(destinationFCMResponseResult.getType(), fcmTypeVal);

      destinationId3 = destinationFCMResponseResult.getId();

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 409
      // 415
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1HListDestinations() throws Exception {
    try {
      Boolean moreResults = true;
      int limit = 1;
      int offset = 0;

      while (moreResults) {
        ListDestinationsOptions listDestinationsOptions = new ListDestinationsOptions.Builder()
                .instanceId(instanceId)
                .limit(Long.valueOf(limit))
                .offset(Long.valueOf(offset))
                .search(search)
                .build();

        // Invoke operation
        Response<DestinationList> response = service.listDestinations(listDestinationsOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        DestinationList destinationListResult = response.getResult();

        assertNotNull(destinationListResult.getDestinations());

        List<DestinationListItem> destinations = destinationListResult.getDestinations();

        for (int i = 0; i < destinations.size(); i++) {
          DestinationListItem destination = destinations.get(i);
          if (destination.getId() != destinationId && destination.getId() != destinationId3 && destination.getType().equals("smtp_ibm")) {
            destinationId2 = destination.getId();
          }
        }

        if (destinationListResult.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 500
      //
      //
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1IGetDestination() throws Exception {
    try {
      GetDestinationOptions getDestinationOptions = new GetDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId)
              .build();

      // Invoke operation
      Response<Destination> response = service.getDestination(getDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Destination destinationResult = response.getResult();

      assertNotNull(destinationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1JUpdateDestination() throws Exception {
    try {
      DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
              .url("https://cloud.ibm.com/nhwebhook/sendwebhook")
              .verb("get")
              .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
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
              .certificate(TestUtilities.createMockStream("This is a mock file."))
              .certificateContentType("testString")
              .build();

      // Invoke operation
      Response<Destination> response = service.updateDestination(updateDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Destination destinationResult = response.getResult();

      assertNotNull(destinationResult);

      assertEquals(destinationResult.getId(), destinationId);
      assertEquals(destinationResult.getDescription(), description);
      assertEquals(destinationResult.getName(), name);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 404
      // 409
      // 415
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1KListDestinationDevices() throws Exception {
    try {
      ListDestinationDevicesOptions listDestinationDevicesOptions = new ListDestinationDevicesOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId3)
              .limit(Long.valueOf("1"))
              .offset(Long.valueOf("0"))
              .search("")
              .build();

      // Invoke operation
      Response<DestinationDevicesList> response = service.listDestinationDevices(listDestinationDevicesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DestinationDevicesList destinationDevicesListResult = response.getResult();

      assertNotNull(destinationDevicesListResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1LGetDestinationDevicesReport() throws Exception {
    try {
      GetDestinationDevicesReportOptions getDestinationDevicesReportOptions = new GetDestinationDevicesReportOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId3)
              .days(Long.valueOf("1"))
              .build();

      // Invoke operation
      Response<DestinationDevicesReport> response = service.getDestinationDevicesReport(getDestinationDevicesReportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DestinationDevicesReport destinationDevicesReportResult = response.getResult();

      assertNotNull(destinationDevicesReportResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1MCreateSubscription() throws Exception {
    try {
      /*SubscriptionCreateAttributesSMSAttributes subscriptionCreateAttributesModel = new SubscriptionCreateAttributesSMSAttributes.Builder()
      .to(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();*/
      SubscriptionCreateAttributesWebhookAttributes subscriptionCreateWebAttributesModel = new SubscriptionCreateAttributesWebhookAttributes.Builder()
              .signingEnabled(true).build();
      String name = "subscription_web";
      String description = "Subscription for web";

      CreateSubscriptionOptions createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .destinationId(destinationId)
              .topicId(topicId)
              .description(description)
              .attributes(subscriptionCreateWebAttributesModel)
              .build();

      // Invoke operation
      Response<Subscription> response = service.createSubscription(createSubscriptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Subscription subscriptionResult = response.getResult();

      assertNotNull(subscriptionResult);
      assertEquals(subscriptionResult.getDescription(), description);
      assertEquals(subscriptionResult.getName(), name);

      subscriptionId = subscriptionResult.getId();

      ArrayList<String> toMail = new ArrayList<String>();
      toMail.add("tester1@gmail.com");
      toMail.add("tester3@ibm.com");
      SubscriptionCreateAttributesEmailAttributes subscriptionCreateEmailAttributesModel = new SubscriptionCreateAttributesEmailAttributes.Builder()
              .to(toMail)
              .addNotificationPayload(true)
              .replyToMail("reply_to_mail@us.com")
              .replyToName("US News")
              .fromName("IBM")
              .build();

      name = "subscription_web_2";
      description = "Subscription 2 for web";

      createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .destinationId(destinationId2)
              .topicId(topicId)
              .attributes(subscriptionCreateEmailAttributesModel)
              .description(description)
              .build();

      response = service.createSubscription(createSubscriptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);
      subscriptionResult = response.getResult();
      assertNotNull(subscriptionResult);
      assertEquals(subscriptionResult.getDescription(), description);
      assertEquals(subscriptionResult.getName(), name);

      subscriptionId2 = subscriptionResult.getId();

      name = "subscription_sms";
      description = "Subscription for sms";

      createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .destinationId(destinationId3)
              .topicId(topicId3)
              .description(description)
              .build();

      response = service.createSubscription(createSubscriptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);
      subscriptionResult = response.getResult();
      assertNotNull(subscriptionResult);
      assertEquals(subscriptionResult.getDescription(), description);
      assertEquals(subscriptionResult.getName(), name);

      subscriptionId3 = subscriptionResult.getId();


      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 404
      // 409
      // 415
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1NListSubscriptions() throws Exception {
    try {
      Boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListSubscriptionsOptions listSubscriptionsOptions = new ListSubscriptionsOptions.Builder()
                .instanceId(instanceId)
                .offset(offset)
                .limit(limit)
                .search(search)
                .build();

        // Invoke operation
        Response<SubscriptionList> response = service.listSubscriptions(listSubscriptionsOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        SubscriptionList subscriptionListResult = response.getResult();

        assertNotNull(subscriptionListResult);

        if (subscriptionListResult.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1OGetSubscription() throws Exception {
    try {
      GetSubscriptionOptions getSubscriptionOptions = new GetSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId)
              .build();

      // Invoke operation
      Response<Subscription> response = service.getSubscription(getSubscriptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subscription subscriptionResult = response.getResult();

      assertNotNull(subscriptionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1PUpdateSubscription() throws Exception {
    try {
      /*SubscriptionUpdateAttributesSMSAttributes subscriptionUpdateAttributesModel = new SubscriptionUpdateAttributesSMSAttributes.Builder()
      .to(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();*/
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

      // Invoke operation
      Response<Subscription> response = service.updateSubscription(updateSubscriptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subscription subscriptionResult = response.getResult();

      assertNotNull(subscriptionResult);
      assertEquals(subscriptionResult.getName(), name);
      assertEquals(subscriptionResult.getDescription(), description);
      assertEquals(subscriptionResult.getId(), subscriptionId);


      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 404
      // 409
      // 415
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1QSendNotifications() throws Exception {
    try {
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
              .subject("FCM_SUBJECT")
              .severity("MEDIUM")
              .id("FCM ID")
              .source(sourceId)
              .enSourceId(sourceId)
              .type("com.acme.offer:new")
              .time(new java.util.Date())
              .pushTo(notificationDevices)
              .messageFcmBody(fcmBodyNotificationPayload)
              .messageApnsBody(apnsBodyNotificationPayload)
              .messageApnsHeaders(messageApnsHeader)
              .build();

      Response<NotificationResponse> response = service.sendNotifications(sendNotificationsOptions).execute();
      NotificationResponse notificationResponse = response.getResult();

      System.out.println(notificationResponse);
      // end-send_notifications
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }

  @Test
  public void test1RDeleteSubscription() throws Exception {
    try {

      List<String> subscriptions = new ArrayList<>();
      subscriptions.add(subscriptionId);
      subscriptions.add(subscriptionId2);
      subscriptions.add(subscriptionId3);

      for (String subscription :
              subscriptions) {
        DeleteSubscriptionOptions deleteSubscriptionOptions = new DeleteSubscriptionOptions.Builder()
                .instanceId(instanceId)
                .id(subscription)
                .build();

        // Invoke operation
        Response<Void> response = service.deleteSubscription(deleteSubscriptionOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
      }
      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1SDeleteTopic() throws Exception {
    try {

      List<String> topics = new ArrayList<>();
      topics.add(topicId);
      topics.add(topicId2);
      topics.add(topicId3);

      for (String topic :
              topics) {
        DeleteTopicOptions deleteTopicOptions = new DeleteTopicOptions.Builder()
                .instanceId(instanceId)
                .id(topic)
                .build();

        // Invoke operation
        Response<Void> response = service.deleteTopic(deleteTopicOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
      }
      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1TDeleteDestination() throws Exception {
    try {
      DeleteDestinationOptions deleteDestinationOptions = new DeleteDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId)
              .build();

      // Invoke operation
      Response<Void> response = service.deleteDestination(deleteDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      deleteDestinationOptions = new DeleteDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId3)
              .build();

      // Invoke operation
      response = service.deleteDestination(deleteDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);



      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
}
