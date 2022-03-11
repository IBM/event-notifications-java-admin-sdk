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

import com.ibm.cloud.eventnotifications.event_notifications.v1.EventNotifications;
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
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EventNotifications service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class EventNotificationsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected EventNotifications eventNotificationsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new EventNotifications(serviceName, null);
  }

  // Test the sendNotifications operation with a valid options model parameter
  @Test
  public void testSendNotificationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"notification_id\": \"notificationId\"}";
    String sendNotificationsPath = "/v1/instances/testString/notifications";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NotificationDevices model
    NotificationDevices notificationDevicesModel = new NotificationDevices.Builder()
      .fcmDevices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .apnsDevices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .userIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .platforms(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

    // Construct an instance of the Lights model
    Lights lightsModel = new Lights.Builder()
      .ledArgb("testString")
      .ledOnMs(Long.valueOf("0"))
      .ledOffMs("testString")
      .build();

    // Construct an instance of the Style model
    Style styleModel = new Style.Builder()
      .type("testString")
      .title("testString")
      .url("testString")
      .text("testString")
      .lines(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();

    // Construct an instance of the NotificationFCMBodyMessageData model
    NotificationFCMBodyMessageData notificationFcmBodyMessageDataModel = new NotificationFCMBodyMessageData.Builder()
      .alert("testString")
      .collapseKey("testString")
      .interactiveCategory("testString")
      .icon("testString")
      .delayWhileIdle(true)
      .sync(true)
      .visibility("testString")
      .redact("testString")
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .priority("testString")
      .sound("testString")
      .timeToLive(Long.valueOf("0"))
      .lights(lightsModel)
      .androidTitle("testString")
      .groupId("testString")
      .style(styleModel)
      .type("DEFAULT")
      .build();

    // Construct an instance of the NotificationFCMBodyMessageENData model
    NotificationFCMBodyMessageENData notificationFcmBodyModel = new NotificationFCMBodyMessageENData.Builder()
      .enData(notificationFcmBodyMessageDataModel)
      .add("foo", "testString")
      .build();

    // Construct an instance of the NotificationAPNSBodyMessageData model
    NotificationAPNSBodyMessageData notificationApnsBodyMessageDataModel = new NotificationAPNSBodyMessageData.Builder()
      .alert("testString")
      .badge(Long.valueOf("26"))
      .interactiveCategory("testString")
      .iosActionKey("testString")
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .sound("testString")
      .titleLocKey("testString")
      .locKey("testString")
      .launchImage("testString")
      .titleLocArgs(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .locArgs(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .title("testString")
      .subtitle("testString")
      .attachmentUrl("testString")
      .type("DEFAULT")
      .apnsCollapseId("testString")
      .apnsThreadId("testString")
      .apnsGroupSummaryArg("testString")
      .apnsGroupSummaryArgCount(Long.valueOf("26"))
      .build();

    // Construct an instance of the NotificationAPNSBodyMessageENData model
    NotificationAPNSBodyMessageENData notificationApnsBodyModel = new NotificationAPNSBodyMessageENData.Builder()
      .enData(notificationApnsBodyMessageDataModel)
      .add("foo", "testString")
      .build();

    // Construct an instance of the SendNotificationsOptions model
    SendNotificationsOptions sendNotificationsOptionsModel = new SendNotificationsOptions.Builder()
      .instanceId("testString")
      .subject("testString")
      .severity("testString")
      .id("testString")
      .source("testString")
      .enSourceId("testString")
      .type("testString")
      .time(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .pushTo(notificationDevicesModel)
      .messageFcmBody(notificationFcmBodyModel)
      .messageApnsHeaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .messageApnsBody(notificationApnsBodyModel)
      .datacontenttype("application/json")
      .specversion("1.0")
      .build();

    // Invoke sendNotifications() with a valid options model and verify the result
    Response<NotificationResponse> response = eventNotificationsService.sendNotifications(sendNotificationsOptionsModel).execute();
    assertNotNull(response);
    NotificationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, sendNotificationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the sendNotifications operation with and without retries enabled
  @Test
  public void testSendNotificationsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testSendNotificationsWOptions();

    eventNotificationsService.disableRetries();
    testSendNotificationsWOptions();
  }

  // Test the sendNotifications operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSendNotificationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.sendNotifications(null).execute();
  }

  // Test the listSources operation with a valid options model parameter
  @Test
  public void testListSourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"enabled\": false, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"topic_count\": 0}]}";
    String listSourcesPath = "/v1/instances/testString/sources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSourcesOptions model
    ListSourcesOptions listSourcesOptionsModel = new ListSourcesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listSources() with a valid options model and verify the result
    Response<SourceList> response = eventNotificationsService.listSources(listSourcesOptionsModel).execute();
    assertNotNull(response);
    SourceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSourcesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listSources operation with and without retries enabled
  @Test
  public void testListSourcesWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListSourcesWOptions();

    eventNotificationsService.disableRetries();
    testListSourcesWOptions();
  }

  // Test the listSources operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSourcesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listSources(null).execute();
  }

  // Test the getSource operation with a valid options model parameter
  @Test
  public void testGetSourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"enabled\": false, \"type\": \"type\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"topic_count\": 10, \"topic_names\": [\"topicNames\"]}";
    String getSourcePath = "/v1/instances/testString/sources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSourceOptions model
    GetSourceOptions getSourceOptionsModel = new GetSourceOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getSource() with a valid options model and verify the result
    Response<Source> response = eventNotificationsService.getSource(getSourceOptionsModel).execute();
    assertNotNull(response);
    Source responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSourcePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSource operation with and without retries enabled
  @Test
  public void testGetSourceWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetSourceWOptions();

    eventNotificationsService.disableRetries();
    testGetSourceWOptions();
  }

  // Test the getSource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getSource(null).execute();
  }

  // Test the createTopic operation with a valid options model parameter
  @Test
  public void testCreateTopicWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"created_at\": \"createdAt\"}";
    String createTopicPath = "/v1/instances/testString/topics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the Rules model
    Rules rulesModel = new Rules.Builder()
      .enabled(true)
      .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
      .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
      .build();

    // Construct an instance of the TopicUpdateSourcesItem model
    TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
      .id("e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api")
      .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
      .build();

    // Construct an instance of the CreateTopicOptions model
    CreateTopicOptions createTopicOptionsModel = new CreateTopicOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .description("testString")
      .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
      .build();

    // Invoke createTopic() with a valid options model and verify the result
    Response<TopicResponse> response = eventNotificationsService.createTopic(createTopicOptionsModel).execute();
    assertNotNull(response);
    TopicResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTopicPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createTopic operation with and without retries enabled
  @Test
  public void testCreateTopicWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateTopicWOptions();

    eventNotificationsService.disableRetries();
    testCreateTopicWOptions();
  }

  // Test the createTopic operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTopicNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createTopic(null).execute();
  }

  // Test the listTopics operation with a valid options model parameter
  @Test
  public void testListTopicsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"topics\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"source_count\": 0, \"sources_names\": [\"sourcesNames\"], \"subscription_count\": 0}]}";
    String listTopicsPath = "/v1/instances/testString/topics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTopicsOptions model
    ListTopicsOptions listTopicsOptionsModel = new ListTopicsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listTopics() with a valid options model and verify the result
    Response<TopicList> response = eventNotificationsService.listTopics(listTopicsOptionsModel).execute();
    assertNotNull(response);
    TopicList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTopicsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listTopics operation with and without retries enabled
  @Test
  public void testListTopicsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListTopicsWOptions();

    eventNotificationsService.disableRetries();
    testListTopicsWOptions();
  }

  // Test the listTopics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTopicsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listTopics(null).execute();
  }

  // Test the getTopic operation with a valid options model parameter
  @Test
  public void testGetTopicWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"description\": \"description\", \"name\": \"name\", \"updated_at\": \"updatedAt\", \"source_count\": 11, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"rules\": [{\"enabled\": false, \"event_type_filter\": \"$.*\", \"notification_filter\": \"notificationFilter\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}]}], \"subscription_count\": 17, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String getTopicPath = "/v1/instances/testString/topics/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTopicOptions model
    GetTopicOptions getTopicOptionsModel = new GetTopicOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .include("testString")
      .build();

    // Invoke getTopic() with a valid options model and verify the result
    Response<Topic> response = eventNotificationsService.getTopic(getTopicOptionsModel).execute();
    assertNotNull(response);
    Topic responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTopicPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("include"), "testString");
  }

  // Test the getTopic operation with and without retries enabled
  @Test
  public void testGetTopicWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetTopicWOptions();

    eventNotificationsService.disableRetries();
    testGetTopicWOptions();
  }

  // Test the getTopic operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTopicNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getTopic(null).execute();
  }

  // Test the replaceTopic operation with a valid options model parameter
  @Test
  public void testReplaceTopicWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"description\": \"description\", \"name\": \"name\", \"updated_at\": \"updatedAt\", \"source_count\": 11, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"rules\": [{\"enabled\": false, \"event_type_filter\": \"$.*\", \"notification_filter\": \"notificationFilter\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}]}], \"subscription_count\": 17, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String replaceTopicPath = "/v1/instances/testString/topics/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the Rules model
    Rules rulesModel = new Rules.Builder()
      .enabled(true)
      .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
      .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
      .build();

    // Construct an instance of the TopicUpdateSourcesItem model
    TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
      .id("e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api")
      .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
      .build();

    // Construct an instance of the ReplaceTopicOptions model
    ReplaceTopicOptions replaceTopicOptionsModel = new ReplaceTopicOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
      .build();

    // Invoke replaceTopic() with a valid options model and verify the result
    Response<Topic> response = eventNotificationsService.replaceTopic(replaceTopicOptionsModel).execute();
    assertNotNull(response);
    Topic responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceTopicPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceTopic operation with and without retries enabled
  @Test
  public void testReplaceTopicWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testReplaceTopicWOptions();

    eventNotificationsService.disableRetries();
    testReplaceTopicWOptions();
  }

  // Test the replaceTopic operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTopicNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.replaceTopic(null).execute();
  }

  // Test the deleteTopic operation with a valid options model parameter
  @Test
  public void testDeleteTopicWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTopicPath = "/v1/instances/testString/topics/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTopicOptions model
    DeleteTopicOptions deleteTopicOptionsModel = new DeleteTopicOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke deleteTopic() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteTopic(deleteTopicOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTopicPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteTopic operation with and without retries enabled
  @Test
  public void testDeleteTopicWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteTopicWOptions();

    eventNotificationsService.disableRetries();
    testDeleteTopicWOptions();
  }

  // Test the deleteTopic operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTopicNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteTopic(null).execute();
  }

  // Test the createDestination operation with a valid options model parameter
  @Test
  public void testCreateDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"config\": {\"params\": {\"url\": \"url\", \"verb\": \"get\", \"custom_headers\": {\"mapKey\": \"inner\"}, \"sensitive_headers\": [\"sensitiveHeaders\"]}}, \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createDestinationPath = "/v1/instances/testString/destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DestinationConfigParamsWebhookDestinationConfig model
    DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
      .url("testString")
      .verb("get")
      .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

    // Construct an instance of the DestinationConfig model
    DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
      .params(destinationConfigParamsModel)
      .build();

    // Construct an instance of the CreateDestinationOptions model
    CreateDestinationOptions createDestinationOptionsModel = new CreateDestinationOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .type("webhook")
      .description("testString")
      .config(destinationConfigModel)
      .certificate(TestUtilities.createMockStream("This is a mock file."))
      .certificateContentType("testString")
      .build();

    // Invoke createDestination() with a valid options model and verify the result
    Response<DestinationResponse> response = eventNotificationsService.createDestination(createDestinationOptionsModel).execute();
    assertNotNull(response);
    DestinationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDestination operation with and without retries enabled
  @Test
  public void testCreateDestinationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateDestinationWOptions();

    eventNotificationsService.disableRetries();
    testCreateDestinationWOptions();
  }

  // Test the createDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createDestination(null).execute();
  }

  // Test the listDestinations operation with a valid options model parameter
  @Test
  public void testListDestinationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"destinations\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"subscription_count\": 17, \"subscription_names\": [\"subscriptionNames\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listDestinationsPath = "/v1/instances/testString/destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDestinationsOptions model
    ListDestinationsOptions listDestinationsOptionsModel = new ListDestinationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listDestinations() with a valid options model and verify the result
    Response<DestinationList> response = eventNotificationsService.listDestinations(listDestinationsOptionsModel).execute();
    assertNotNull(response);
    DestinationList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDestinationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listDestinations operation with and without retries enabled
  @Test
  public void testListDestinationsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListDestinationsWOptions();

    eventNotificationsService.disableRetries();
    testListDestinationsWOptions();
  }

  // Test the listDestinations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDestinationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listDestinations(null).execute();
  }

  // Test the getDestination operation with a valid options model parameter
  @Test
  public void testGetDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"config\": {\"params\": {\"url\": \"url\", \"verb\": \"get\", \"custom_headers\": {\"mapKey\": \"inner\"}, \"sensitive_headers\": [\"sensitiveHeaders\"]}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"subscription_count\": 0, \"subscription_names\": [\"subscriptionNames\"]}";
    String getDestinationPath = "/v1/instances/testString/destinations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDestinationOptions model
    GetDestinationOptions getDestinationOptionsModel = new GetDestinationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getDestination() with a valid options model and verify the result
    Response<Destination> response = eventNotificationsService.getDestination(getDestinationOptionsModel).execute();
    assertNotNull(response);
    Destination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDestination operation with and without retries enabled
  @Test
  public void testGetDestinationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetDestinationWOptions();

    eventNotificationsService.disableRetries();
    testGetDestinationWOptions();
  }

  // Test the getDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getDestination(null).execute();
  }

  // Test the updateDestination operation with a valid options model parameter
  @Test
  public void testUpdateDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"config\": {\"params\": {\"url\": \"url\", \"verb\": \"get\", \"custom_headers\": {\"mapKey\": \"inner\"}, \"sensitive_headers\": [\"sensitiveHeaders\"]}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"subscription_count\": 0, \"subscription_names\": [\"subscriptionNames\"]}";
    String updateDestinationPath = "/v1/instances/testString/destinations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DestinationConfigParamsWebhookDestinationConfig model
    DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
      .url("testString")
      .verb("get")
      .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

    // Construct an instance of the DestinationConfig model
    DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
      .params(destinationConfigParamsModel)
      .build();

    // Construct an instance of the UpdateDestinationOptions model
    UpdateDestinationOptions updateDestinationOptionsModel = new UpdateDestinationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .config(destinationConfigModel)
      .certificate(TestUtilities.createMockStream("This is a mock file."))
      .certificateContentType("testString")
      .build();

    // Invoke updateDestination() with a valid options model and verify the result
    Response<Destination> response = eventNotificationsService.updateDestination(updateDestinationOptionsModel).execute();
    assertNotNull(response);
    Destination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDestination operation with and without retries enabled
  @Test
  public void testUpdateDestinationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testUpdateDestinationWOptions();

    eventNotificationsService.disableRetries();
    testUpdateDestinationWOptions();
  }

  // Test the updateDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.updateDestination(null).execute();
  }

  // Test the deleteDestination operation with a valid options model parameter
  @Test
  public void testDeleteDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDestinationPath = "/v1/instances/testString/destinations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDestinationOptions model
    DeleteDestinationOptions deleteDestinationOptionsModel = new DeleteDestinationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke deleteDestination() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteDestination(deleteDestinationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDestination operation with and without retries enabled
  @Test
  public void testDeleteDestinationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteDestinationWOptions();

    eventNotificationsService.disableRetries();
    testDeleteDestinationWOptions();
  }

  // Test the deleteDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteDestination(null).execute();
  }

  // Test the listDestinationDevices operation with a valid options model parameter
  @Test
  public void testListDestinationDevicesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"devices\": [{\"id\": \"id\", \"user_id\": \"userId\", \"platform\": \"platform\", \"token\": \"token\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listDestinationDevicesPath = "/v1/instances/testString/destinations/testString/devices";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDestinationDevicesOptions model
    ListDestinationDevicesOptions listDestinationDevicesOptionsModel = new ListDestinationDevicesOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listDestinationDevices() with a valid options model and verify the result
    Response<DestinationDevicesList> response = eventNotificationsService.listDestinationDevices(listDestinationDevicesOptionsModel).execute();
    assertNotNull(response);
    DestinationDevicesList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDestinationDevicesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listDestinationDevices operation with and without retries enabled
  @Test
  public void testListDestinationDevicesWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListDestinationDevicesWOptions();

    eventNotificationsService.disableRetries();
    testListDestinationDevicesWOptions();
  }

  // Test the listDestinationDevices operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDestinationDevicesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listDestinationDevices(null).execute();
  }

  // Test the getDestinationDevicesReport operation with a valid options model parameter
  @Test
  public void testGetDestinationDevicesReportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"android\": 7, \"ios\": 3, \"chrome\": 6, \"firefox\": 7, \"safari\": 6, \"chromeAppExt\": 12, \"all\": 3}";
    String getDestinationDevicesReportPath = "/v1/instances/testString/destinations/testString/devices/report";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDestinationDevicesReportOptions model
    GetDestinationDevicesReportOptions getDestinationDevicesReportOptionsModel = new GetDestinationDevicesReportOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .days(Long.valueOf("1"))
      .build();

    // Invoke getDestinationDevicesReport() with a valid options model and verify the result
    Response<DestinationDevicesReport> response = eventNotificationsService.getDestinationDevicesReport(getDestinationDevicesReportOptionsModel).execute();
    assertNotNull(response);
    DestinationDevicesReport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDestinationDevicesReportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("days")), Long.valueOf("1"));
  }

  // Test the getDestinationDevicesReport operation with and without retries enabled
  @Test
  public void testGetDestinationDevicesReportWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetDestinationDevicesReportWOptions();

    eventNotificationsService.disableRetries();
    testGetDestinationDevicesReportWOptions();
  }

  // Test the getDestinationDevicesReport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDestinationDevicesReportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getDestinationDevicesReport(null).execute();
  }

  // Test the listTagsSubscriptionsDevice operation with a valid options model parameter
  @Test
  public void testListTagsSubscriptionsDeviceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"tag_subscriptions\": [{\"id\": \"id\", \"device_id\": \"deviceId\", \"tag_name\": \"tagName\", \"user_id\": \"userId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTagsSubscriptionsDevicePath = "/v1/instances/testString/destinations/testString/tag_subscriptions/devices/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTagsSubscriptionsDeviceOptions model
    ListTagsSubscriptionsDeviceOptions listTagsSubscriptionsDeviceOptionsModel = new ListTagsSubscriptionsDeviceOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .deviceId("testString")
      .tagName("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .build();

    // Invoke listTagsSubscriptionsDevice() with a valid options model and verify the result
    Response<TagsSubscriptionList> response = eventNotificationsService.listTagsSubscriptionsDevice(listTagsSubscriptionsDeviceOptionsModel).execute();
    assertNotNull(response);
    TagsSubscriptionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTagsSubscriptionsDevicePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("tag_name"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
  }

  // Test the listTagsSubscriptionsDevice operation with and without retries enabled
  @Test
  public void testListTagsSubscriptionsDeviceWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListTagsSubscriptionsDeviceWOptions();

    eventNotificationsService.disableRetries();
    testListTagsSubscriptionsDeviceWOptions();
  }

  // Test the listTagsSubscriptionsDevice operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTagsSubscriptionsDeviceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listTagsSubscriptionsDevice(null).execute();
  }

  // Test the listTagsSubscription operation with a valid options model parameter
  @Test
  public void testListTagsSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"tag_subscriptions\": [{\"id\": \"id\", \"device_id\": \"deviceId\", \"tag_name\": \"tagName\", \"user_id\": \"userId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTagsSubscriptionPath = "/v1/instances/testString/destinations/testString/tag_subscriptions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTagsSubscriptionOptions model
    ListTagsSubscriptionOptions listTagsSubscriptionOptionsModel = new ListTagsSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .deviceId("testString")
      .userId("testString")
      .tagName("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listTagsSubscription() with a valid options model and verify the result
    Response<TagsSubscriptionList> response = eventNotificationsService.listTagsSubscription(listTagsSubscriptionOptionsModel).execute();
    assertNotNull(response);
    TagsSubscriptionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTagsSubscriptionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("device_id"), "testString");
    assertEquals(query.get("user_id"), "testString");
    assertEquals(query.get("tag_name"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listTagsSubscription operation with and without retries enabled
  @Test
  public void testListTagsSubscriptionWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListTagsSubscriptionWOptions();

    eventNotificationsService.disableRetries();
    testListTagsSubscriptionWOptions();
  }

  // Test the listTagsSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTagsSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listTagsSubscription(null).execute();
  }

  // Test the createTagsSubscription operation with a valid options model parameter
  @Test
  public void testCreateTagsSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"device_id\": \"deviceId\", \"tag_name\": \"tagName\", \"user_id\": \"userId\", \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTagsSubscriptionPath = "/v1/instances/testString/destinations/testString/tag_subscriptions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateTagsSubscriptionOptions model
    CreateTagsSubscriptionOptions createTagsSubscriptionOptionsModel = new CreateTagsSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .deviceId("testString")
      .tagName("testString")
      .build();

    // Invoke createTagsSubscription() with a valid options model and verify the result
    Response<DestinationTagsSubscriptionResponse> response = eventNotificationsService.createTagsSubscription(createTagsSubscriptionOptionsModel).execute();
    assertNotNull(response);
    DestinationTagsSubscriptionResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTagsSubscriptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createTagsSubscription operation with and without retries enabled
  @Test
  public void testCreateTagsSubscriptionWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateTagsSubscriptionWOptions();

    eventNotificationsService.disableRetries();
    testCreateTagsSubscriptionWOptions();
  }

  // Test the createTagsSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTagsSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createTagsSubscription(null).execute();
  }

  // Test the deleteTagsSubscription operation with a valid options model parameter
  @Test
  public void testDeleteTagsSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTagsSubscriptionPath = "/v1/instances/testString/destinations/testString/tag_subscriptions";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTagsSubscriptionOptions model
    DeleteTagsSubscriptionOptions deleteTagsSubscriptionOptionsModel = new DeleteTagsSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .deviceId("testString")
      .tagName("testString")
      .build();

    // Invoke deleteTagsSubscription() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteTagsSubscription(deleteTagsSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTagsSubscriptionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("device_id"), "testString");
    assertEquals(query.get("tag_name"), "testString");
  }

  // Test the deleteTagsSubscription operation with and without retries enabled
  @Test
  public void testDeleteTagsSubscriptionWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteTagsSubscriptionWOptions();

    eventNotificationsService.disableRetries();
    testDeleteTagsSubscriptionWOptions();
  }

  // Test the deleteTagsSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTagsSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteTagsSubscription(null).execute();
  }

  // Test the createSubscription operation with a valid options model parameter
  @Test
  public void testCreateSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {}}";
    String createSubscriptionPath = "/v1/instances/testString/subscriptions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SubscriptionCreateAttributesSMSAttributes model
    SubscriptionCreateAttributesSMSAttributes subscriptionCreateAttributesModel = new SubscriptionCreateAttributesSMSAttributes.Builder()
      .to(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

    // Construct an instance of the CreateSubscriptionOptions model
    CreateSubscriptionOptions createSubscriptionOptionsModel = new CreateSubscriptionOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .destinationId("testString")
      .topicId("testString")
      .description("testString")
      .attributes(subscriptionCreateAttributesModel)
      .build();

    // Invoke createSubscription() with a valid options model and verify the result
    Response<Subscription> response = eventNotificationsService.createSubscription(createSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Subscription responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSubscriptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSubscription operation with and without retries enabled
  @Test
  public void testCreateSubscriptionWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateSubscriptionWOptions();

    eventNotificationsService.disableRetries();
    testCreateSubscriptionWOptions();
  }

  // Test the createSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createSubscription(null).execute();
  }

  // Test the listSubscriptions operation with a valid options model parameter
  @Test
  public void testListSubscriptionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listSubscriptionsPath = "/v1/instances/testString/subscriptions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSubscriptionsOptions model
    ListSubscriptionsOptions listSubscriptionsOptionsModel = new ListSubscriptionsOptions.Builder()
      .instanceId("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .search("testString")
      .build();

    // Invoke listSubscriptions() with a valid options model and verify the result
    Response<SubscriptionList> response = eventNotificationsService.listSubscriptions(listSubscriptionsOptionsModel).execute();
    assertNotNull(response);
    SubscriptionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSubscriptionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listSubscriptions operation with and without retries enabled
  @Test
  public void testListSubscriptionsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListSubscriptionsWOptions();

    eventNotificationsService.disableRetries();
    testListSubscriptionsWOptions();
  }

  // Test the listSubscriptions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSubscriptionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listSubscriptions(null).execute();
  }

  // Test the getSubscription operation with a valid options model parameter
  @Test
  public void testGetSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {}}";
    String getSubscriptionPath = "/v1/instances/testString/subscriptions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSubscriptionOptions model
    GetSubscriptionOptions getSubscriptionOptionsModel = new GetSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getSubscription() with a valid options model and verify the result
    Response<Subscription> response = eventNotificationsService.getSubscription(getSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Subscription responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSubscriptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSubscription operation with and without retries enabled
  @Test
  public void testGetSubscriptionWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetSubscriptionWOptions();

    eventNotificationsService.disableRetries();
    testGetSubscriptionWOptions();
  }

  // Test the getSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getSubscription(null).execute();
  }

  // Test the deleteSubscription operation with a valid options model parameter
  @Test
  public void testDeleteSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSubscriptionPath = "/v1/instances/testString/subscriptions/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSubscriptionOptions model
    DeleteSubscriptionOptions deleteSubscriptionOptionsModel = new DeleteSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke deleteSubscription() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteSubscription(deleteSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSubscriptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSubscription operation with and without retries enabled
  @Test
  public void testDeleteSubscriptionWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteSubscriptionWOptions();

    eventNotificationsService.disableRetries();
    testDeleteSubscriptionWOptions();
  }

  // Test the deleteSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteSubscription(null).execute();
  }

  // Test the updateSubscription operation with a valid options model parameter
  @Test
  public void testUpdateSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {}}";
    String updateSubscriptionPath = "/v1/instances/testString/subscriptions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SubscriptionUpdateAttributesSMSAttributes model
    SubscriptionUpdateAttributesSMSAttributes subscriptionUpdateAttributesModel = new SubscriptionUpdateAttributesSMSAttributes.Builder()
      .to(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

    // Construct an instance of the UpdateSubscriptionOptions model
    UpdateSubscriptionOptions updateSubscriptionOptionsModel = new UpdateSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .attributes(subscriptionUpdateAttributesModel)
      .build();

    // Invoke updateSubscription() with a valid options model and verify the result
    Response<Subscription> response = eventNotificationsService.updateSubscription(updateSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Subscription responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSubscriptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSubscription operation with and without retries enabled
  @Test
  public void testUpdateSubscriptionWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testUpdateSubscriptionWOptions();

    eventNotificationsService.disableRetries();
    testUpdateSubscriptionWOptions();
  }

  // Test the updateSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.updateSubscription(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    eventNotificationsService = null;
  }

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv()
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";

    eventNotificationsService = EventNotifications.newInstance(serviceName);
    String url = server.url("/").toString();
    eventNotificationsService.setServiceUrl(url);
  }
}