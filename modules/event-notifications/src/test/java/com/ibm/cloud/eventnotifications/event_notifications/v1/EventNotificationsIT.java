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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.*;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.event_notifications.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

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
  public static String destinationId4 = "";
  public static String safariCertificatePath = "";
  public static String destinationId5 = "";
  public static String destinationId6 = "";
  public static String destinationId7 = "";
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
    safariCertificatePath = config.get("SAFARI_CERTIFICATE");
    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void test1ACreateSources() throws Exception {
    try {
      CreateSourcesOptions createSourcesOptions = new CreateSourcesOptions.Builder()
              .instanceId(instanceId)
              .name("Event Notification Create Source Acme")
              .description("This source is used for Acme Bank")
              .enabled(false)
              .build();

      // Invoke operation
      Response<SourceResponse> response = service.createSources(createSourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SourceResponse sourceResponseResult = response.getResult();

      assertNotNull(sourceResponseResult);

      sourceId = sourceResponseResult.getId();

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
  public void test1BListSources() throws Exception {
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
  public void test1CGetSource() throws Exception {
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
  public void test1DUpdateSource() throws Exception {
    try {
      UpdateSourceOptions updateSourceOptions = new UpdateSourceOptions.Builder()
              .instanceId(instanceId)
              .id(sourceId)
              .name("Event Notification update Source Acme")
              .description("This source is used for updated Acme Bank")
              .enabled(true)
              .build();

      // Invoke operation
      Response<Source> response = service.updateSource(updateSourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Source sourceResult = response.getResult();

      assertNotNull(sourceResult);

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
  public void test1ECreateTopic() throws Exception {
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
  public void test1FListTopics() throws Exception {
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
  public void test1GGetTopic() throws Exception {
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
  public void test1HReplaceTopic() throws Exception {
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
  public void test1ICreateDestination() throws Exception {
    try {
      DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
              .url("https://gcm.com")
              .verb("get")
              .customHeaders(new java.util.HashMap<String, String>() { { put("gcm_apikey", "testString"); } })
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
              .preProd(false)
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
      DestinationConfigParamsSlackDestinationConfig slackDestinationConfig= new DestinationConfigParamsSlackDestinationConfig.Builder()
              .url("https://api.slack.com/myslack")
              .build();

      DestinationConfig destinationSlackConfigModel = new DestinationConfig.Builder()
              .params(slackDestinationConfig)
              .build();

      String slackName = "Slack_destination";
      String slackTypeVal = "slack";
      String slackDescription = "Slack Destination";

      CreateDestinationOptions createSlackDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(slackName)
              .type(slackTypeVal)
              .description(slackDescription)
              .config(destinationSlackConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> slackResponse = service.createDestination(createSlackDestinationOptions).execute();
      // Validate response
      assertNotNull(slackResponse);
      assertEquals(slackResponse.getStatusCode(), 201);

      DestinationResponse slackDestinationResponseResult = slackResponse.getResult();

      assertNotNull(slackDestinationResponseResult);
      assertEquals(slackDestinationResponseResult.getDescription(), slackDescription);
      assertEquals(slackDestinationResponseResult.getName(), slackName);
      assertEquals(slackDestinationResponseResult.getType(), slackTypeVal);

      destinationId4 = slackDestinationResponseResult.getId();
      DestinationConfigParamsSafariDestinationConfig safariDestinationConfig= new DestinationConfigParamsSafariDestinationConfig.Builder()
              .certType("p12")
              .password("safari")
              .websiteUrl("https://ensafaripush.mybluemix.net")
              .websiteName("NodeJS Starter Application")
              .urlFormatString("https://ensafaripush.mybluemix.net/%@/?flight=%@")
              .websitePushId("web.net.mybluemix.ensafaripush")
              .build();

      DestinationConfig destinationSafariConfigModel = new DestinationConfig.Builder()
              .params(safariDestinationConfig)
              .build();

      String safariName = "Safari_destination";
      String safariTypeVal = "push_safari";
      String safariDescription = "Safari Destination";

      File file = new File(safariCertificatePath);
      InputStream stream = new FileInputStream(file);

      CreateDestinationOptions createSafariDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(safariName)
              .type(safariTypeVal)
              .description(safariDescription)
              .config(destinationSafariConfigModel)
              .certificate(stream)
              .build();

      // Invoke operation
      Response<DestinationResponse> safariResponse = service.createDestination(createSafariDestinationOptions).execute();
      // Validate response
      assertNotNull(safariResponse);
      assertEquals(safariResponse.getStatusCode(), 201);

      DestinationResponse safariDestinationResponseResult = safariResponse.getResult();

      assertNotNull(safariDestinationResponseResult);
      assertEquals(safariDestinationResponseResult.getDescription(), safariDescription);
      assertEquals(safariDestinationResponseResult.getName(), safariName);
      assertEquals(safariDestinationResponseResult.getType(), safariTypeVal);

      destinationId5 = safariDestinationResponseResult.getId();

      DestinationConfigParamsMSTeamsDestinationConfig msTeamsDestinationConfig= new DestinationConfigParamsMSTeamsDestinationConfig.Builder()
              .url("https://teams.microsoft.com")
              .build();

      DestinationConfig destinationMsTeamsConfigModel = new DestinationConfig.Builder()
              .params(msTeamsDestinationConfig)
              .build();

      String msTeamsName = "MSTeams_destination";
      String msTeamsTypeVal = "msteams";
      String msTeamsDescription = "MSTeams Destination";

      CreateDestinationOptions createMsTeamsDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(msTeamsName)
              .type(msTeamsTypeVal)
              .description(msTeamsDescription)
              .config(destinationMsTeamsConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> teamsResponse = service.createDestination(createMsTeamsDestinationOptions).execute();
      // Validate response
      assertNotNull(teamsResponse);
      assertEquals(teamsResponse.getStatusCode(), 201);

      DestinationResponse msTeamsDestinationResponseResult = teamsResponse.getResult();

      assertNotNull(msTeamsDestinationResponseResult);
      assertEquals(msTeamsDestinationResponseResult.getDescription(), msTeamsDescription);
      assertEquals(msTeamsDestinationResponseResult.getName(), msTeamsName);
      assertEquals(msTeamsDestinationResponseResult.getType(), msTeamsTypeVal);

      destinationId6 = msTeamsDestinationResponseResult.getId();

      DestinationConfigParamsIBMCloudFunctionsDestinationConfig cloudFunctionsDestinationConfig = new DestinationConfigParamsIBMCloudFunctionsDestinationConfig.Builder()
              .url("https://www.ibmcfendpoint.com/")
              .apiKey("qwellqwlaskasddasdla")
              .build();

      DestinationConfig cloudDestinationConfigModel = new DestinationConfig.Builder()
              .params(cloudFunctionsDestinationConfig)
              .build();

      String cloudFunctionName = "Cloud_Functions_destination";
      String cloudfunctionTypeVal = "ibmcf";
      String cloudFunctionsDescription = "Cloud Functions Destination";

      CreateDestinationOptions createCloudFunctionsDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(cloudFunctionName)
              .type(cloudfunctionTypeVal)
              .description(cloudFunctionsDescription)
              .config(cloudDestinationConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> cloudFunctionsResponse = service.createDestination(createCloudFunctionsDestinationOptions).execute();
      // Validate response
      assertNotNull(cloudFunctionsResponse);
      assertEquals(cloudFunctionsResponse.getStatusCode(), 201);

      DestinationResponse cloudfunctionsDestinationResponseResult = cloudFunctionsResponse.getResult();

      assertNotNull(cloudfunctionsDestinationResponseResult);
      assertEquals(cloudfunctionsDestinationResponseResult.getDescription(), cloudFunctionsDescription);
      assertEquals(cloudfunctionsDestinationResponseResult.getName(), cloudFunctionName);
      assertEquals(cloudfunctionsDestinationResponseResult.getType(), cloudfunctionTypeVal);

      destinationId7 = cloudfunctionsDestinationResponseResult.getId();

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
  public void test1JListDestinations() throws Exception {
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
  public void test1KGetDestination() throws Exception {
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
  public void test1LUpdateDestination() throws Exception {
    try {
      DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
              .url("https://cloud.ibm.com/nhwebhook/sendwebhook")
              .verb("get")
              .customHeaders(new java.util.HashMap<String, String>() { { put("authorization", "testString"); } })
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

      DestinationConfigParamsFCMDestinationConfig fcmConfig = new DestinationConfigParamsFCMDestinationConfig.Builder()
              .senderId(fcmSenderId)
              .serverKey(fcmServerKey)
              .build();


      DestinationConfig destinationFcmConfigModel = new DestinationConfig.Builder()
              .params(fcmConfig)
              .build();

      String fcmName = "FCM_Admin Compliance";
      String fcmDescription = "This is a Destination for FCM compliance";

      updateDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId3)
              .name(fcmName)
              .description(fcmDescription)
              .config(destinationFcmConfigModel)
              .build();

      response = service.updateDestination(updateDestinationOptions).execute();;

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);


      destinationResult = response.getResult();

      assertNotNull(destinationResult);

      assertEquals(destinationResult.getId(), destinationId3);
      assertEquals(destinationResult.getDescription(), fcmDescription);
      assertEquals(destinationResult.getName(), fcmName);


      DestinationConfigParamsSlackDestinationConfig slackDestinationConfig= new DestinationConfigParamsSlackDestinationConfig.Builder()
              .url("https://api.slack.com/myslack")
              .build();

      DestinationConfig destinationSlackConfigModel = new DestinationConfig.Builder()
              .params(slackDestinationConfig)
              .build();

      String slackName = "Slack_destination";
      String slackTypeVal = "slack";
      String slackDescription = "Slack Destination";

      UpdateDestinationOptions updateSlackDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId4)
              .name(slackName)
              .description(slackDescription)
              .config(destinationSlackConfigModel)
              .build();

      // Invoke operation
      Response<Destination> slackResponse = service.updateDestination(updateSlackDestinationOptions).execute();
      // Validate response
      assertNotNull(slackResponse);
      assertEquals(slackResponse.getStatusCode(), 200);

      Destination slackDestinationResponseResult = slackResponse.getResult();

      assertNotNull(slackDestinationResponseResult);
      assertEquals(slackDestinationResponseResult.getDescription(), slackDescription);
      assertEquals(slackDestinationResponseResult.getName(), slackName);
      assertEquals(slackDestinationResponseResult.getType(), slackTypeVal);

     DestinationConfigParamsSafariDestinationConfig destinationConfig = new DestinationConfigParamsSafariDestinationConfig.Builder()
              .certType("p12")
              .password("safari")
              .urlFormatString("https://ensafaripush.mybluemix.net/%@/?flight=%@")
              .websitePushId("web.net.mybluemix.ensafaripush")
              .websiteUrl("https://ensafaripush.mybluemix.net")
              .websiteName("NodeJS Starter Application")
              .build();

      DestinationConfig destinationsafariConfigModel = new DestinationConfig.Builder()
              .params(destinationConfig)
              .build();

      name = "Safari_dest";
      description = "This destination is for Safari";

      UpdateDestinationOptions updateSafariDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId5)
              .name(name)
              .description(description)
              .config(destinationsafariConfigModel)
              .certificate(TestUtilities.createMockStream("This is a mock file."))
              .certificateContentType("testString")
              .build();

      // Invoke operation
      Response<Destination> safariResponse = service.updateDestination(updateSafariDestinationOptions).execute();
      // Validate response
      assertNotNull(safariResponse);
      assertEquals(safariResponse.getStatusCode(), 200);

      Destination safariDestinationResult = safariResponse.getResult();

      assertNotNull(safariDestinationResult);

      assertEquals(safariDestinationResult.getId(), destinationId5);
      assertEquals(safariDestinationResult.getDescription(), description);
      assertEquals(safariDestinationResult.getName(), name);

      DestinationConfigParamsIBMCloudFunctionsDestinationConfig cloudFunctionsDestinationConfig= new DestinationConfigParamsIBMCloudFunctionsDestinationConfig.Builder()
              .url("https://www.ibmcfendpoint.com/")
              .apiKey("HzE55cF87iApSKJ4I4FQhOa4mAqYG1NMDmZ888")
              .build();

      DestinationConfig destinationCFConfigModel = new DestinationConfig.Builder()
              .params(cloudFunctionsDestinationConfig)
              .build();

      String cfName = "Cloud_Function_destination";
      String cfDescription = "Cloud Fun. Destination";
      String cfTypeval= "ibmcf";

      UpdateDestinationOptions updateCFDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId7)
              .name(cfName)
              .description(cfDescription)
              .config(destinationCFConfigModel)
              .build();

      // Invoke operation
      Response<Destination> cloudFunctionsResponse = service.updateDestination(updateCFDestinationOptions).execute();
      // Validate response
      assertNotNull(cloudFunctionsResponse);
      assertEquals(cloudFunctionsResponse.getStatusCode(), 200);

      Destination cloudFunctionsDestinationResponseResult = cloudFunctionsResponse.getResult();

      assertNotNull(cloudFunctionsDestinationResponseResult);
      assertEquals(cloudFunctionsDestinationResponseResult.getDescription(), cfDescription);
      assertEquals(cloudFunctionsDestinationResponseResult.getName(), cfName);
      assertEquals(cloudFunctionsDestinationResponseResult.getType(), cfTypeval);

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
  public void test1MGetDeviceCount() throws Exception{
    try {
      GetDeviceCountOptions getDeviceCountOptionsModel = new GetDeviceCountOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId3)
              .build();

      // Invoke getDeviceCount() with a valid options model and verify the result
      Response<DeviceCount> response = service.getDeviceCount(getDeviceCountOptionsModel).execute();
      assertNotNull(response);
      DeviceCount responseObj = response.getResult();
      assertNotNull(responseObj.getTotalCount());
    }
    catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1NCreateSubscription() throws Exception {
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
  public void test1OListSubscriptions() throws Exception {
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
  public void test1PGetSubscription() throws Exception {
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
  public void test1QUpdateSubscription() throws Exception {
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
  public void test1RSendNotifications() throws Exception {
    try {
      // begin-send_notifications
      String notificationDevices = "{\"user_ids\": [\"userId\"]}";
      String fcmJsonString = "{ \"title\" : \"Portugal vs. Denmark\", \"badge\": \"great match\" }";
      String apnsJsonString = "{\"alert\": \"Game Request\", \"badge\": 5 }";
      String safariJsonString = "{\"aps\":{\"alert\":{\"title\":\"FlightA998NowBoarding\",\"body\":\"BoardinghasbegunforFlightA998.\",\"action\":\"View\"},\"url-args\":[\"boarding\",\"A998\"]}}";

      NotificationCreate body = new NotificationCreate.Builder()
              .id(instanceId)
              .ibmenseverity("MEDIUM")
              .id("FCM ID")
              .source(sourceId)
              .ibmensourceid(sourceId)
              .type("com.acme.offer:new")
              .time(new java.util.Date())
              .ibmenpushto(notificationDevices)
              .ibmenfcmbody(fcmJsonString)
              .ibmenapnsbody(apnsJsonString)
              .ibmensafaribody(safariJsonString)
              .ibmendefaultshort("Match Info")
              .ibmendefaultlong("Portugal lead the group with a 2-0 win")
              .specversion("1.0")
              .build();

      SendNotificationsOptions sendNotificationsOptions = new SendNotificationsOptions.Builder()
              .instanceId(instanceId)
              .body(body)
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
  public void test1SSendBulkNotifications() throws Exception {
    try {
      String notificationDevices = "{\"user_ids\": [\"userId\"]}";
      String fcmJsonString = "{ \"title\" : \"Portugal vs. Denmark\", \"badge\": \"great match\" }";
      String apnsJsonString = "{\"alert\": \"Game Request\", \"badge\": 5 }";
      String safariJsonString = "{\"aps\":{\"alert\":{\"title\":\"FlightA998NowBoarding\",\"body\":\"BoardinghasbegunforFlightA998.\",\"action\":\"View\"},\"url-args\":[\"boarding\",\"A998\"]}}";

      NotificationCreate notificationCreateModel = new NotificationCreate.Builder()
              .ibmenseverity("MEDIUM")
              .ibmenfcmbody(fcmJsonString)
              .ibmenapnsbody(apnsJsonString)
              .ibmensafaribody(safariJsonString)
              .ibmenpushto(notificationDevices)
              .ibmensourceid(sourceId)
              .id("FCM ID")
              .source(sourceId)
              .type("com.acme.offer:new")
              .specversion("1.0")
              .time(new Date())
              .build();

      NotificationCreate notificationCreateModel1 = new NotificationCreate.Builder()
              .ibmenseverity("LOW")
              .ibmenfcmbody(fcmJsonString)
              .ibmenapnsbody(apnsJsonString)
              .ibmensafaribody(safariJsonString)
              .ibmenpushto(notificationDevices)
              .ibmensourceid(sourceId)
              .id("FCM ID")
              .source(sourceId)
              .type("com.ibm.cloud.compliance.certificate_manager:certificate_expired")
              .specversion("1.0")
              .time(new Date())
              .build();

      SendBulkNotificationsOptions sendBulkNotificationsOptions = new SendBulkNotificationsOptions.Builder()
              .instanceId(instanceId)
              .bulkMessages(new java.util.ArrayList<NotificationCreate>(java.util.Arrays.asList(notificationCreateModel,notificationCreateModel1)))
              .build();

      // Invoke operation
      Response<BulkNotificationResponse> response = service.sendBulkNotifications(sendBulkNotificationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BulkNotificationResponse bulkNotificationResponseResult = response.getResult();

      assertNotNull(bulkNotificationResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
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
  public void test1TDeleteSubscription() throws Exception {
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
  public void test1UDeleteTopic() throws Exception {
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
  public void test1VDeleteDestination() throws Exception {
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

      deleteDestinationOptions = new DeleteDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId7)
              .build();

      // Invoke operation
      response = service.deleteDestination(deleteDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      deleteDestinationOptions = new DeleteDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId4)
              .build();

      // Invoke operation
      response = service.deleteDestination(deleteDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      deleteDestinationOptions = new DeleteDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId5)
              .build();

      // Invoke operation
      response = service.deleteDestination(deleteDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      deleteDestinationOptions = new DeleteDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId6)
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

  @Test
  public void test1WDeleteSource() throws Exception {
    try {
      DeleteSourceOptions deleteSourceOptions = new DeleteSourceOptions.Builder()
              .instanceId(instanceId)
              .id(sourceId)
              .build();

      // Invoke operation
      Response<Void> response = service.deleteSource(deleteSourceOptions).execute();
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
