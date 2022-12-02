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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.BulkNotificationResponse;
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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOf;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfChromeDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfFCMDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfFirefoxDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfIBMCloudFunctionsDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfIOSDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfMSTeamsDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfPagerDutyDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfSafariDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfSlackDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfWebhookDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationTagsSubscriptionResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailAttributesResponseInvitedItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailAttributesResponseSubscribedUnsubscribedItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationGetResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationMetadata;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListIntegrationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSubscriptionsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTopicsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationCreate;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PageHrefResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Rules;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.RulesGet;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMSAttributesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMSInviteAttributesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendBulkNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Source;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesListItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Subscription;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesEmailAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesSMSAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesSlackAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesWebhookAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesEmailAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesFCMAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesSMSAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesSlackAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesWebhookAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesEmailUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSMSUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSlackAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesWebhookAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Topic;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicsListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesInvited;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesSubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesUnsubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSourceOptions;
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
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the NotificationCreate model
    NotificationCreate notificationCreateModel = new NotificationCreate.Builder()
      .specversion("1.0")
      .time(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .id("testString")
      .source("testString")
      .type("testString")
      .ibmenseverity("testString")
      .ibmensourceid("testString")
      .ibmendefaultshort("testString")
      .ibmendefaultlong("testString")
      .subject("testString")
      .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .datacontenttype("application/json")
      .ibmenpushto("{\"platforms\":[\"push_android\"]}")
      .ibmenfcmbody("testString")
      .ibmenapnsbody("testString")
      .ibmenapnsheaders("testString")
      .ibmenchromebody("testString")
      .ibmenchromeheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmenfirefoxbody("testString")
      .ibmenfirefoxheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmensafaribody("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the SendNotificationsOptions model
    SendNotificationsOptions sendNotificationsOptionsModel = new SendNotificationsOptions.Builder()
      .instanceId("testString")
      .body(notificationCreateModel)
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

  // Test the sendBulkNotifications operation with a valid options model parameter
  @Test
  public void testSendBulkNotificationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bulk_notification_id\": \"bulkNotificationId\", \"bulk_messages\": [\"anyValue\"]}";
    String sendBulkNotificationsPath = "/v1/instances/testString/notifications/bulk";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the NotificationCreate model
    NotificationCreate notificationCreateModel = new NotificationCreate.Builder()
      .specversion("1.0")
      .time(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .id("testString")
      .source("testString")
      .type("testString")
      .ibmenseverity("testString")
      .ibmensourceid("testString")
      .ibmendefaultshort("testString")
      .ibmendefaultlong("testString")
      .subject("testString")
      .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .datacontenttype("application/json")
      .ibmenpushto("{\"platforms\":[\"push_android\"]}")
      .ibmenfcmbody("testString")
      .ibmenapnsbody("testString")
      .ibmenapnsheaders("testString")
      .ibmenchromebody("testString")
      .ibmenchromeheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmenfirefoxbody("testString")
      .ibmenfirefoxheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmensafaribody("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the SendBulkNotificationsOptions model
    SendBulkNotificationsOptions sendBulkNotificationsOptionsModel = new SendBulkNotificationsOptions.Builder()
      .instanceId("testString")
      .bulkMessages(java.util.Arrays.asList(notificationCreateModel))
      .build();

    // Invoke sendBulkNotifications() with a valid options model and verify the result
    Response<BulkNotificationResponse> response = eventNotificationsService.sendBulkNotifications(sendBulkNotificationsOptionsModel).execute();
    assertNotNull(response);
    BulkNotificationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, sendBulkNotificationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the sendBulkNotifications operation with and without retries enabled
  @Test
  public void testSendBulkNotificationsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testSendBulkNotificationsWOptions();

    eventNotificationsService.disableRetries();
    testSendBulkNotificationsWOptions();
  }

  // Test the sendBulkNotifications operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSendBulkNotificationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.sendBulkNotifications(null).execute();
  }

  // Test the createSources operation with a valid options model parameter
  @Test
  public void testCreateSourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"enabled\": false, \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createSourcesPath = "/v1/instances/testString/sources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSourcesOptions model
    CreateSourcesOptions createSourcesOptionsModel = new CreateSourcesOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .description("testString")
      .enabled(true)
      .build();

    // Invoke createSources() with a valid options model and verify the result
    Response<SourceResponse> response = eventNotificationsService.createSources(createSourcesOptionsModel).execute();
    assertNotNull(response);
    SourceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSourcesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSources operation with and without retries enabled
  @Test
  public void testCreateSourcesWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateSourcesWOptions();

    eventNotificationsService.disableRetries();
    testCreateSourcesWOptions();
  }

  // Test the createSources operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSourcesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createSources(null).execute();
  }

  // Test the listSources operation with a valid options model parameter
  @Test
  public void testListSourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"enabled\": false, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"topic_count\": 0}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listSourcesPath = "/v1/instances/testString/sources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSourcesOptions model
    ListSourcesOptions listSourcesOptionsModel = new ListSourcesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
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
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
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

  // Test the listSources operation using the SourcesPager.getNext() method
  @Test
  public void testListSourcesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"sources\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"enabled\":false,\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"topic_count\":0}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"sources\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"enabled\":false,\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"topic_count\":0}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSourcesOptions listSourcesOptions = new ListSourcesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<SourceListItem> allResults = new ArrayList<>();
    SourcesPager pager = new SourcesPager(eventNotificationsService, listSourcesOptions);
    while (pager.hasNext()) {
      List<SourceListItem> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSources operation using the SourcesPager.getAll() method
  @Test
  public void testListSourcesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"sources\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"enabled\":false,\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"topic_count\":0}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"sources\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"enabled\":false,\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"topic_count\":0}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSourcesOptions listSourcesOptions = new ListSourcesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    SourcesPager pager = new SourcesPager(eventNotificationsService, listSourcesOptions);
    List<SourceListItem> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
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

  // Test the deleteSource operation with a valid options model parameter
  @Test
  public void testDeleteSourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSourcePath = "/v1/instances/testString/sources/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSourceOptions model
    DeleteSourceOptions deleteSourceOptionsModel = new DeleteSourceOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke deleteSource() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteSource(deleteSourceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSourcePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSource operation with and without retries enabled
  @Test
  public void testDeleteSourceWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteSourceWOptions();

    eventNotificationsService.disableRetries();
    testDeleteSourceWOptions();
  }

  // Test the deleteSource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteSource(null).execute();
  }

  // Test the updateSource operation with a valid options model parameter
  @Test
  public void testUpdateSourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"enabled\": false, \"type\": \"type\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"topic_count\": 10, \"topic_names\": [\"topicNames\"]}";
    String updateSourcePath = "/v1/instances/testString/sources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateSourceOptions model
    UpdateSourceOptions updateSourceOptionsModel = new UpdateSourceOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .enabled(true)
      .build();

    // Invoke updateSource() with a valid options model and verify the result
    Response<Source> response = eventNotificationsService.updateSource(updateSourceOptionsModel).execute();
    assertNotNull(response);
    Source responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSourcePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSource operation with and without retries enabled
  @Test
  public void testUpdateSourceWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testUpdateSourceWOptions();

    eventNotificationsService.disableRetries();
    testUpdateSourceWOptions();
  }

  // Test the updateSource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.updateSource(null).execute();
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

    // Construct an instance of the SourcesItems model
    SourcesItems sourcesItemsModel = new SourcesItems.Builder()
      .id("e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api")
      .rules(java.util.Arrays.asList(rulesModel))
      .build();

    // Construct an instance of the CreateTopicOptions model
    CreateTopicOptions createTopicOptionsModel = new CreateTopicOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .description("testString")
      .sources(java.util.Arrays.asList(sourcesItemsModel))
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
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"topics\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"source_count\": 0, \"sources_names\": [\"sourcesNames\"], \"subscription_count\": 0}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listTopicsPath = "/v1/instances/testString/topics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTopicsOptions model
    ListTopicsOptions listTopicsOptionsModel = new ListTopicsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
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
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
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

  // Test the listTopics operation using the TopicsPager.getNext() method
  @Test
  public void testListTopicsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"topics\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source_count\":0,\"sources_names\":[\"sourcesNames\"],\"subscription_count\":0}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"topics\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source_count\":0,\"sources_names\":[\"sourcesNames\"],\"subscription_count\":0}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTopicsOptions listTopicsOptions = new ListTopicsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<TopicsListItem> allResults = new ArrayList<>();
    TopicsPager pager = new TopicsPager(eventNotificationsService, listTopicsOptions);
    while (pager.hasNext()) {
      List<TopicsListItem> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listTopics operation using the TopicsPager.getAll() method
  @Test
  public void testListTopicsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"topics\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source_count\":0,\"sources_names\":[\"sourcesNames\"],\"subscription_count\":0}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"topics\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source_count\":0,\"sources_names\":[\"sourcesNames\"],\"subscription_count\":0}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTopicsOptions listTopicsOptions = new ListTopicsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    TopicsPager pager = new TopicsPager(eventNotificationsService, listTopicsOptions);
    List<TopicsListItem> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
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

    // Construct an instance of the SourcesItems model
    SourcesItems sourcesItemsModel = new SourcesItems.Builder()
      .id("e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api")
      .rules(java.util.Arrays.asList(rulesModel))
      .build();

    // Construct an instance of the ReplaceTopicOptions model
    ReplaceTopicOptions replaceTopicOptionsModel = new ReplaceTopicOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .sources(java.util.Arrays.asList(sourcesItemsModel))
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

    // Construct an instance of the DestinationConfigOneOfWebhookDestinationConfig model
    DestinationConfigOneOfWebhookDestinationConfig destinationConfigOneOfModel = new DestinationConfigOneOfWebhookDestinationConfig.Builder()
      .url("testString")
      .verb("get")
      .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .sensitiveHeaders(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DestinationConfig model
    DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
      .params(destinationConfigOneOfModel)
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
      .icon16x16(TestUtilities.createMockStream("This is a mock file."))
      .icon16x16ContentType("testString")
      .icon16x162x(TestUtilities.createMockStream("This is a mock file."))
      .icon16x162xContentType("testString")
      .icon32x32(TestUtilities.createMockStream("This is a mock file."))
      .icon32x32ContentType("testString")
      .icon32x322x(TestUtilities.createMockStream("This is a mock file."))
      .icon32x322xContentType("testString")
      .icon128x128(TestUtilities.createMockStream("This is a mock file."))
      .icon128x128ContentType("testString")
      .icon128x1282x(TestUtilities.createMockStream("This is a mock file."))
      .icon128x1282xContentType("testString")
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
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"destinations\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"subscription_count\": 17, \"subscription_names\": [\"subscriptionNames\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listDestinationsPath = "/v1/instances/testString/destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDestinationsOptions model
    ListDestinationsOptions listDestinationsOptionsModel = new ListDestinationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
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
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
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

  // Test the listDestinations operation using the DestinationsPager.getNext() method
  @Test
  public void testListDestinationsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDestinationsOptions listDestinationsOptions = new ListDestinationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<DestinationListItem> allResults = new ArrayList<>();
    DestinationsPager pager = new DestinationsPager(eventNotificationsService, listDestinationsOptions);
    while (pager.hasNext()) {
      List<DestinationListItem> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDestinations operation using the DestinationsPager.getAll() method
  @Test
  public void testListDestinationsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDestinationsOptions listDestinationsOptions = new ListDestinationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    DestinationsPager pager = new DestinationsPager(eventNotificationsService, listDestinationsOptions);
    List<DestinationListItem> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
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

    // Construct an instance of the DestinationConfigOneOfWebhookDestinationConfig model
    DestinationConfigOneOfWebhookDestinationConfig destinationConfigOneOfModel = new DestinationConfigOneOfWebhookDestinationConfig.Builder()
      .url("testString")
      .verb("get")
      .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .sensitiveHeaders(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DestinationConfig model
    DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
      .params(destinationConfigOneOfModel)
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
      .icon16x16(TestUtilities.createMockStream("This is a mock file."))
      .icon16x16ContentType("testString")
      .icon16x162x(TestUtilities.createMockStream("This is a mock file."))
      .icon16x162xContentType("testString")
      .icon32x32(TestUtilities.createMockStream("This is a mock file."))
      .icon32x32ContentType("testString")
      .icon32x322x(TestUtilities.createMockStream("This is a mock file."))
      .icon32x322xContentType("testString")
      .icon128x128(TestUtilities.createMockStream("This is a mock file."))
      .icon128x128ContentType("testString")
      .icon128x1282x(TestUtilities.createMockStream("This is a mock file."))
      .icon128x1282xContentType("testString")
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

  // Test the listTagsSubscription operation with a valid options model parameter
  @Test
  public void testListTagsSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"tag_subscriptions\": [{\"id\": \"id\", \"device_id\": \"deviceId\", \"tag_name\": \"tagName\", \"user_id\": \"userId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
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
      .limit(Long.valueOf("10"))
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
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
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

  // Test the listTagsSubscription operation using the TagsSubscriptionPager.getNext() method
  @Test
  public void testListTagsSubscriptionWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"tag_subscriptions\":[{\"id\":\"id\",\"device_id\":\"deviceId\",\"tag_name\":\"tagName\",\"user_id\":\"userId\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"tag_subscriptions\":[{\"id\":\"id\",\"device_id\":\"deviceId\",\"tag_name\":\"tagName\",\"user_id\":\"userId\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTagsSubscriptionOptions listTagsSubscriptionOptions = new ListTagsSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .deviceId("testString")
      .userId("testString")
      .tagName("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<TagsSubscriptionListItem> allResults = new ArrayList<>();
    TagsSubscriptionPager pager = new TagsSubscriptionPager(eventNotificationsService, listTagsSubscriptionOptions);
    while (pager.hasNext()) {
      List<TagsSubscriptionListItem> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listTagsSubscription operation using the TagsSubscriptionPager.getAll() method
  @Test
  public void testListTagsSubscriptionWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"tag_subscriptions\":[{\"id\":\"id\",\"device_id\":\"deviceId\",\"tag_name\":\"tagName\",\"user_id\":\"userId\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"tag_subscriptions\":[{\"id\":\"id\",\"device_id\":\"deviceId\",\"tag_name\":\"tagName\",\"user_id\":\"userId\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTagsSubscriptionOptions listTagsSubscriptionOptions = new ListTagsSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .deviceId("testString")
      .userId("testString")
      .tagName("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    TagsSubscriptionPager pager = new TagsSubscriptionPager(eventNotificationsService, listTagsSubscriptionOptions);
    List<TagsSubscriptionListItem> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
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
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {\"subscribed\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"unsubscribed\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"invited\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"expires_at\": \"2019-01-01T12:00:00.000Z\"}]}}";
    String createSubscriptionPath = "/v1/instances/testString/subscriptions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SubscriptionCreateAttributesSMSAttributes model
    SubscriptionCreateAttributesSMSAttributes subscriptionCreateAttributesModel = new SubscriptionCreateAttributesSMSAttributes.Builder()
      .invited(java.util.Arrays.asList("testString"))
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
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listSubscriptionsPath = "/v1/instances/testString/subscriptions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSubscriptionsOptions model
    ListSubscriptionsOptions listSubscriptionsOptionsModel = new ListSubscriptionsOptions.Builder()
      .instanceId("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
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
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
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

  // Test the listSubscriptions operation using the SubscriptionsPager.getNext() method
  @Test
  public void testListSubscriptionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"subscriptions\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"destination_id\":\"destinationId\",\"destination_name\":\"destinationName\",\"destination_type\":\"sms_ibm\",\"topic_id\":\"topicId\",\"topic_name\":\"topicName\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"subscriptions\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"destination_id\":\"destinationId\",\"destination_name\":\"destinationName\",\"destination_type\":\"sms_ibm\",\"topic_id\":\"topicId\",\"topic_name\":\"topicName\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSubscriptionsOptions listSubscriptionsOptions = new ListSubscriptionsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<SubscriptionListItem> allResults = new ArrayList<>();
    SubscriptionsPager pager = new SubscriptionsPager(eventNotificationsService, listSubscriptionsOptions);
    while (pager.hasNext()) {
      List<SubscriptionListItem> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSubscriptions operation using the SubscriptionsPager.getAll() method
  @Test
  public void testListSubscriptionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"subscriptions\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"destination_id\":\"destinationId\",\"destination_name\":\"destinationName\",\"destination_type\":\"sms_ibm\",\"topic_id\":\"topicId\",\"topic_name\":\"topicName\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"subscriptions\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"destination_id\":\"destinationId\",\"destination_name\":\"destinationName\",\"destination_type\":\"sms_ibm\",\"topic_id\":\"topicId\",\"topic_name\":\"topicName\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSubscriptionsOptions listSubscriptionsOptions = new ListSubscriptionsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    SubscriptionsPager pager = new SubscriptionsPager(eventNotificationsService, listSubscriptionsOptions);
    List<SubscriptionListItem> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getSubscription operation with a valid options model parameter
  @Test
  public void testGetSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {\"subscribed\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"unsubscribed\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"invited\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"expires_at\": \"2019-01-01T12:00:00.000Z\"}]}}";
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
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {\"subscribed\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"unsubscribed\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"invited\": [{\"phone_number\": \"phoneNumber\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"expires_at\": \"2019-01-01T12:00:00.000Z\"}]}}";
    String updateSubscriptionPath = "/v1/instances/testString/subscriptions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateAttributesInvited model
    UpdateAttributesInvited updateAttributesInvitedModel = new UpdateAttributesInvited.Builder()
      .add(java.util.Arrays.asList("testString"))
      .remove(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the UpdateAttributesSubscribed model
    UpdateAttributesSubscribed updateAttributesSubscribedModel = new UpdateAttributesSubscribed.Builder()
      .remove(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the UpdateAttributesUnsubscribed model
    UpdateAttributesUnsubscribed updateAttributesUnsubscribedModel = new UpdateAttributesUnsubscribed.Builder()
      .remove(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the SubscriptionUpdateAttributesSMSUpdateAttributes model
    SubscriptionUpdateAttributesSMSUpdateAttributes subscriptionUpdateAttributesModel = new SubscriptionUpdateAttributesSMSUpdateAttributes.Builder()
      .invited(updateAttributesInvitedModel)
      .subscribed(updateAttributesSubscribedModel)
      .unsubscribed(updateAttributesUnsubscribedModel)
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

  // Test the listIntegrations operation with a valid options model parameter
  @Test
  public void testListIntegrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"integrations\": [{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"type\": \"type\", \"metadata\": {\"endpoint\": \"endpoint\", \"crn\": \"crn\", \"root_key_id\": \"rootKeyId\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listIntegrationsPath = "/v1/instances/testString/integrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListIntegrationsOptions model
    ListIntegrationsOptions listIntegrationsOptionsModel = new ListIntegrationsOptions.Builder()
      .instanceId("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    // Invoke listIntegrations() with a valid options model and verify the result
    Response<IntegrationList> response = eventNotificationsService.listIntegrations(listIntegrationsOptionsModel).execute();
    assertNotNull(response);
    IntegrationList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listIntegrationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listIntegrations operation with and without retries enabled
  @Test
  public void testListIntegrationsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListIntegrationsWOptions();

    eventNotificationsService.disableRetries();
    testListIntegrationsWOptions();
  }

  // Test the listIntegrations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListIntegrationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listIntegrations(null).execute();
  }

  // Test the listIntegrations operation using the IntegrationsPager.getNext() method
  @Test
  public void testListIntegrationsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListIntegrationsOptions listIntegrationsOptions = new ListIntegrationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<IntegrationListItem> allResults = new ArrayList<>();
    IntegrationsPager pager = new IntegrationsPager(eventNotificationsService, listIntegrationsOptions);
    while (pager.hasNext()) {
      List<IntegrationListItem> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listIntegrations operation using the IntegrationsPager.getAll() method
  @Test
  public void testListIntegrationsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListIntegrationsOptions listIntegrationsOptions = new ListIntegrationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    IntegrationsPager pager = new IntegrationsPager(eventNotificationsService, listIntegrationsOptions);
    List<IntegrationListItem> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getIntegration operation with a valid options model parameter
  @Test
  public void testGetIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"type\": \"type\", \"metadata\": {\"endpoint\": \"endpoint\", \"crn\": \"crn\", \"root_key_id\": \"rootKeyId\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getIntegrationPath = "/v1/instances/testString/integrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetIntegrationOptions model
    GetIntegrationOptions getIntegrationOptionsModel = new GetIntegrationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getIntegration() with a valid options model and verify the result
    Response<IntegrationGetResponse> response = eventNotificationsService.getIntegration(getIntegrationOptionsModel).execute();
    assertNotNull(response);
    IntegrationGetResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getIntegration operation with and without retries enabled
  @Test
  public void testGetIntegrationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetIntegrationWOptions();

    eventNotificationsService.disableRetries();
    testGetIntegrationWOptions();
  }

  // Test the getIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getIntegration(null).execute();
  }

  // Test the replaceIntegration operation with a valid options model parameter
  @Test
  public void testReplaceIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"type\": \"type\", \"metadata\": {\"endpoint\": \"endpoint\", \"crn\": \"crn\", \"root_key_id\": \"rootKeyId\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String replaceIntegrationPath = "/v1/instances/testString/integrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the IntegrationMetadata model
    IntegrationMetadata integrationMetadataModel = new IntegrationMetadata.Builder()
      .endpoint("testString")
      .crn("testString")
      .rootKeyId("testString")
      .build();

    // Construct an instance of the ReplaceIntegrationOptions model
    ReplaceIntegrationOptions replaceIntegrationOptionsModel = new ReplaceIntegrationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .type("testString")
      .metadata(integrationMetadataModel)
      .build();

    // Invoke replaceIntegration() with a valid options model and verify the result
    Response<IntegrationGetResponse> response = eventNotificationsService.replaceIntegration(replaceIntegrationOptionsModel).execute();
    assertNotNull(response);
    IntegrationGetResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceIntegration operation with and without retries enabled
  @Test
  public void testReplaceIntegrationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testReplaceIntegrationWOptions();

    eventNotificationsService.disableRetries();
    testReplaceIntegrationWOptions();
  }

  // Test the replaceIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.replaceIntegration(null).execute();
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