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

import com.ibm.cloud.eventnotifications.event_notifications.v1.EventNotifications;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Destination;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParams;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsFCMDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsWebhookDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailUpdateAttributesTo;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailUpdateAttributesUnsubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSubscriptionsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTopicsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Rules;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.RulesGet;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Source;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesListItem;
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

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";

    eventNotificationsService = EventNotifications.newInstance(serviceName);
    String url = server.url("/").toString();
    eventNotificationsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new EventNotifications(serviceName, null);
  }

  @Test
  public void testListSourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"enabled\": false, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"topic_count\": 0}]}";
    String listSourcesPath = "/v1/instances/testString/sources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSourcesOptions model
    ListSourcesOptions listSourcesOptionsModel = new ListSourcesOptions.Builder()
    .instanceId("testString")
    .limit(Long.valueOf("1"))
    .offset(Long.valueOf("0"))
    .search("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SourceList> response = eventNotificationsService.listSources(listSourcesOptionsModel).execute();
    assertNotNull(response);
    SourceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSourcesPath);
  }
  
  public void testListSourcesWOptionsWRetries() throws Throwable {
    // Enable retries and run testListSourcesWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testListSourcesWOptions();

    // Disable retries and run testListSourcesWOptions.
    eventNotificationsService.disableRetries();
    testListSourcesWOptions();
  }  

  // Test the listSources operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSourcesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.listSources(null).execute();
  }

  @Test
  public void testGetSourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"enabled\": false, \"type\": \"type\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"topic_count\": 10, \"topic_names\": [\"topicNames\"]}";
    String getSourcePath = "/v1/instances/testString/sources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSourceOptions model
    GetSourceOptions getSourceOptionsModel = new GetSourceOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Source> response = eventNotificationsService.getSource(getSourceOptionsModel).execute();
    assertNotNull(response);
    Source responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSourcePath);
  }
  
  public void testGetSourceWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetSourceWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testGetSourceWOptions();

    // Disable retries and run testGetSourceWOptions.
    eventNotificationsService.disableRetries();
    testGetSourceWOptions();
  }  

  // Test the getSource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.getSource(null).execute();
  }

  @Test
  public void testCreateTopicWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"created_at\": \"createdAt\"}";
    String createTopicPath = "/v1/instances/testString/topics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

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

    // Invoke operation with valid options model (positive test)
    Response<TopicResponse> response = eventNotificationsService.createTopic(createTopicOptionsModel).execute();
    assertNotNull(response);
    TopicResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTopicPath);
  }
  
  public void testCreateTopicWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateTopicWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testCreateTopicWOptions();

    // Disable retries and run testCreateTopicWOptions.
    eventNotificationsService.disableRetries();
    testCreateTopicWOptions();
  }  

  // Test the createTopic operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTopicNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.createTopic(null).execute();
  }

  @Test
  public void testListTopicsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"topics\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"source_count\": 0, \"sources_names\": [\"sourcesNames\"], \"subscription_count\": 0}]}";
    String listTopicsPath = "/v1/instances/testString/topics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTopicsOptions model
    ListTopicsOptions listTopicsOptionsModel = new ListTopicsOptions.Builder()
    .instanceId("testString")
    .limit(Long.valueOf("1"))
    .offset(Long.valueOf("0"))
    .search("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TopicList> response = eventNotificationsService.listTopics(listTopicsOptionsModel).execute();
    assertNotNull(response);
    TopicList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTopicsPath);
  }
  
  public void testListTopicsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListTopicsWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testListTopicsWOptions();

    // Disable retries and run testListTopicsWOptions.
    eventNotificationsService.disableRetries();
    testListTopicsWOptions();
  }  

  // Test the listTopics operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTopicsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.listTopics(null).execute();
  }

  @Test
  public void testGetTopicWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"description\": \"description\", \"name\": \"name\", \"updated_at\": \"updatedAt\", \"source_count\": 11, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"rules\": [{\"enabled\": false, \"event_type_filter\": \"$.*\", \"notification_filter\": \"notificationFilter\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}]}], \"subscription_count\": 17, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String getTopicPath = "/v1/instances/testString/topics/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTopicOptions model
    GetTopicOptions getTopicOptionsModel = new GetTopicOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .include("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Topic> response = eventNotificationsService.getTopic(getTopicOptionsModel).execute();
    assertNotNull(response);
    Topic responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("include"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTopicPath);
  }
  
  public void testGetTopicWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetTopicWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testGetTopicWOptions();

    // Disable retries and run testGetTopicWOptions.
    eventNotificationsService.disableRetries();
    testGetTopicWOptions();
  }  

  // Test the getTopic operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTopicNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.getTopic(null).execute();
  }

  @Test
  public void testReplaceTopicWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"description\": \"description\", \"name\": \"name\", \"updated_at\": \"updatedAt\", \"source_count\": 11, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"rules\": [{\"enabled\": false, \"event_type_filter\": \"$.*\", \"notification_filter\": \"notificationFilter\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}]}], \"subscription_count\": 17, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String replaceTopicPath = "/v1/instances/testString/topics/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

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

    // Invoke operation with valid options model (positive test)
    Response<Topic> response = eventNotificationsService.replaceTopic(replaceTopicOptionsModel).execute();
    assertNotNull(response);
    Topic responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceTopicPath);
  }
  
  public void testReplaceTopicWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceTopicWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testReplaceTopicWOptions();

    // Disable retries and run testReplaceTopicWOptions.
    eventNotificationsService.disableRetries();
    testReplaceTopicWOptions();
  }  

  // Test the replaceTopic operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTopicNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.replaceTopic(null).execute();
  }

  @Test
  public void testDeleteTopicWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteTopicPath = "/v1/instances/testString/topics/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteTopicOptions model
    DeleteTopicOptions deleteTopicOptionsModel = new DeleteTopicOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = eventNotificationsService.deleteTopic(deleteTopicOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTopicPath);
  }
  
  public void testDeleteTopicWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteTopicWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testDeleteTopicWOptions();

    // Disable retries and run testDeleteTopicWOptions.
    eventNotificationsService.disableRetries();
    testDeleteTopicWOptions();
  }  

  // Test the deleteTopic operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTopicNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.deleteTopic(null).execute();
  }

  @Test
  public void testCreateDestinationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"config\": {\"params\": {\"url\": \"url\", \"verb\": \"get\", \"custom_headers\": {\"mapKey\": \"inner\"}, \"sensitive_headers\": [\"sensitiveHeaders\"]}}, \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createDestinationPath = "/v1/instances/testString/destinations";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

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
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DestinationResponse> response = eventNotificationsService.createDestination(createDestinationOptionsModel).execute();
    assertNotNull(response);
    DestinationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDestinationPath);
  }
  
  public void testCreateDestinationWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateDestinationWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testCreateDestinationWOptions();

    // Disable retries and run testCreateDestinationWOptions.
    eventNotificationsService.disableRetries();
    testCreateDestinationWOptions();
  }  

  // Test the createDestination operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDestinationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.createDestination(null).execute();
  }

  @Test
  public void testListDestinationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"destinations\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"subscription_count\": 17, \"subscription_names\": [\"subscriptionNames\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listDestinationsPath = "/v1/instances/testString/destinations";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDestinationsOptions model
    ListDestinationsOptions listDestinationsOptionsModel = new ListDestinationsOptions.Builder()
    .instanceId("testString")
    .limit(Long.valueOf("1"))
    .offset(Long.valueOf("0"))
    .search("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DestinationList> response = eventNotificationsService.listDestinations(listDestinationsOptionsModel).execute();
    assertNotNull(response);
    DestinationList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDestinationsPath);
  }
  
  public void testListDestinationsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDestinationsWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testListDestinationsWOptions();

    // Disable retries and run testListDestinationsWOptions.
    eventNotificationsService.disableRetries();
    testListDestinationsWOptions();
  }  

  // Test the listDestinations operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDestinationsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.listDestinations(null).execute();
  }

  @Test
  public void testGetDestinationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"config\": {\"params\": {\"url\": \"url\", \"verb\": \"get\", \"custom_headers\": {\"mapKey\": \"inner\"}, \"sensitive_headers\": [\"sensitiveHeaders\"]}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"subscription_count\": 0, \"subscription_names\": [\"subscriptionNames\"]}";
    String getDestinationPath = "/v1/instances/testString/destinations/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDestinationOptions model
    GetDestinationOptions getDestinationOptionsModel = new GetDestinationOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Destination> response = eventNotificationsService.getDestination(getDestinationOptionsModel).execute();
    assertNotNull(response);
    Destination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDestinationPath);
  }
  
  public void testGetDestinationWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDestinationWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testGetDestinationWOptions();

    // Disable retries and run testGetDestinationWOptions.
    eventNotificationsService.disableRetries();
    testGetDestinationWOptions();
  }  

  // Test the getDestination operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDestinationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.getDestination(null).execute();
  }

  @Test
  public void testUpdateDestinationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"config\": {\"params\": {\"url\": \"url\", \"verb\": \"get\", \"custom_headers\": {\"mapKey\": \"inner\"}, \"sensitive_headers\": [\"sensitiveHeaders\"]}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"subscription_count\": 0, \"subscription_names\": [\"subscriptionNames\"]}";
    String updateDestinationPath = "/v1/instances/testString/destinations/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

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
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Destination> response = eventNotificationsService.updateDestination(updateDestinationOptionsModel).execute();
    assertNotNull(response);
    Destination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDestinationPath);
  }
  
  public void testUpdateDestinationWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateDestinationWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testUpdateDestinationWOptions();

    // Disable retries and run testUpdateDestinationWOptions.
    eventNotificationsService.disableRetries();
    testUpdateDestinationWOptions();
  }  

  // Test the updateDestination operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDestinationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.updateDestination(null).execute();
  }

  @Test
  public void testDeleteDestinationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteDestinationPath = "/v1/instances/testString/destinations/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteDestinationOptions model
    DeleteDestinationOptions deleteDestinationOptionsModel = new DeleteDestinationOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = eventNotificationsService.deleteDestination(deleteDestinationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDestinationPath);
  }
  
  public void testDeleteDestinationWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteDestinationWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testDeleteDestinationWOptions();

    // Disable retries and run testDeleteDestinationWOptions.
    eventNotificationsService.disableRetries();
    testDeleteDestinationWOptions();
  }  

  // Test the deleteDestination operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDestinationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.deleteDestination(null).execute();
  }

  @Test
  public void testCreateSubscriptionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {}}";
    String createSubscriptionPath = "/v1/instances/testString/subscriptions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

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
    .attributes(subscriptionCreateAttributesModel)
    .description("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Subscription> response = eventNotificationsService.createSubscription(createSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Subscription responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSubscriptionPath);
  }
  
  public void testCreateSubscriptionWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateSubscriptionWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testCreateSubscriptionWOptions();

    // Disable retries and run testCreateSubscriptionWOptions.
    eventNotificationsService.disableRetries();
    testCreateSubscriptionWOptions();
  }  

  // Test the createSubscription operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSubscriptionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.createSubscription(null).execute();
  }

  @Test
  public void testListSubscriptionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listSubscriptionsPath = "/v1/instances/testString/subscriptions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSubscriptionsOptions model
    ListSubscriptionsOptions listSubscriptionsOptionsModel = new ListSubscriptionsOptions.Builder()
    .instanceId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .search("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SubscriptionList> response = eventNotificationsService.listSubscriptions(listSubscriptionsOptionsModel).execute();
    assertNotNull(response);
    SubscriptionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("search"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSubscriptionsPath);
  }
  
  public void testListSubscriptionsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListSubscriptionsWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testListSubscriptionsWOptions();

    // Disable retries and run testListSubscriptionsWOptions.
    eventNotificationsService.disableRetries();
    testListSubscriptionsWOptions();
  }  

  // Test the listSubscriptions operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSubscriptionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.listSubscriptions(null).execute();
  }

  @Test
  public void testGetSubscriptionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {}}";
    String getSubscriptionPath = "/v1/instances/testString/subscriptions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSubscriptionOptions model
    GetSubscriptionOptions getSubscriptionOptionsModel = new GetSubscriptionOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Subscription> response = eventNotificationsService.getSubscription(getSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Subscription responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSubscriptionPath);
  }
  
  public void testGetSubscriptionWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetSubscriptionWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testGetSubscriptionWOptions();

    // Disable retries and run testGetSubscriptionWOptions.
    eventNotificationsService.disableRetries();
    testGetSubscriptionWOptions();
  }  

  // Test the getSubscription operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSubscriptionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.getSubscription(null).execute();
  }

  @Test
  public void testDeleteSubscriptionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteSubscriptionPath = "/v1/instances/testString/subscriptions/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteSubscriptionOptions model
    DeleteSubscriptionOptions deleteSubscriptionOptionsModel = new DeleteSubscriptionOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = eventNotificationsService.deleteSubscription(deleteSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSubscriptionPath);
  }
  
  public void testDeleteSubscriptionWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteSubscriptionWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testDeleteSubscriptionWOptions();

    // Disable retries and run testDeleteSubscriptionWOptions.
    eventNotificationsService.disableRetries();
    testDeleteSubscriptionWOptions();
  }  

  // Test the deleteSubscription operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSubscriptionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.deleteSubscription(null).execute();
  }

  @Test
  public void testUpdateSubscriptionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"updated_at\": \"updatedAt\", \"from\": \"from\", \"destination_type\": \"sms_ibm\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"attributes\": {}}";
    String updateSubscriptionPath = "/v1/instances/testString/subscriptions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

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

    // Invoke operation with valid options model (positive test)
    Response<Subscription> response = eventNotificationsService.updateSubscription(updateSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Subscription responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSubscriptionPath);
  }
  
  public void testUpdateSubscriptionWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateSubscriptionWOptions.
    eventNotificationsService.enableRetries(4, 30);
    testUpdateSubscriptionWOptions();

    // Disable retries and run testUpdateSubscriptionWOptions.
    eventNotificationsService.disableRetries();
    testUpdateSubscriptionWOptions();
  }  

  // Test the updateSubscription operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSubscriptionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    eventNotificationsService.updateSubscription(null).execute();
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    eventNotificationsService = null;
  }
}