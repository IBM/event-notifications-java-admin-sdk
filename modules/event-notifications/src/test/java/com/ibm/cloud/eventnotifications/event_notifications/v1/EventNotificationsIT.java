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
  public static String destinationId1 = "";
  public static String destinationId2 = "";
  public static String destinationId3 = "";
  public static String destinationId4 = "";
  public static String safariCertificatePath = "";
  public static String destinationId5 = "";
  public static String destinationId6 = "";
  public static String destinationId7 = "";
  public static String destinationId8 = "";
  public static String destinationId9 = "";
  public static String destinationId10 = "";
  public static String subscriptionId = "";
  public static String subscriptionId1 = "";
  public static String subscriptionId2 = "";
  public static String subscriptionId3 = "";
  public static String subscriptionId4 = "";
  public static String subscriptionId5 = "";
  public static String subscriptionId6 = "";
  public static String subscriptionId7 = "";
  public static String subscriptionId8 = "";
  public static String subscriptionId9 = "";
  public static String subscriptionId10 = "";
  public static String fcmServerKey = "";
  public static String fcmSenderId = "";
  public static String integrationId = "";

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

      SourcesItems topicUpdateSourcesItemModel = new SourcesItems.Builder()
              .id(sourceId)
              .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
              .build();

      String description = "Topic for GCM notifications";
      CreateTopicOptions createTopicOptions = new CreateTopicOptions.Builder()
              .instanceId(instanceId)
              .name(topicName)
              .description(description)
              .sources(new java.util.ArrayList<SourcesItems>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
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
              .sources(new java.util.ArrayList<SourcesItems>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
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
              .sources(new java.util.ArrayList<SourcesItems>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
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

      SourcesItems topicUpdateSourcesItemModel = new SourcesItems.Builder()
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
              .sources(new java.util.ArrayList<SourcesItems>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
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
      DestinationConfigOneOfWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigOneOfWebhookDestinationConfig.Builder()
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

      DestinationConfigOneOfFCMDestinationConfig fcmConfig = new DestinationConfigOneOfFCMDestinationConfig.Builder()
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
      DestinationConfigOneOfSlackDestinationConfig slackDestinationConfig= new DestinationConfigOneOfSlackDestinationConfig.Builder()
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
      DestinationConfigOneOfSafariDestinationConfig safariDestinationConfig= new DestinationConfigOneOfSafariDestinationConfig.Builder()
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

      DestinationConfigOneOfMSTeamsDestinationConfig msTeamsDestinationConfig= new DestinationConfigOneOfMSTeamsDestinationConfig.Builder()
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

      DestinationConfigOneOfIBMCloudFunctionsDestinationConfig cloudFunctionsDestinationConfig = new DestinationConfigOneOfIBMCloudFunctionsDestinationConfig.Builder()
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

      DestinationConfigOneOfChromeDestinationConfig chromeDestinationConfig = new DestinationConfigOneOfChromeDestinationConfig.Builder()
              .websiteUrl("https://cloud.ibm.com")
              .apiKey("aksndkasdnkasd")
              .preProd(false)
              .publicKey("ksddkasjdaksd")
              .build();

      DestinationConfig chromeDestinationConfigModel = new DestinationConfig.Builder()
              .params(chromeDestinationConfig)
              .build();

      String chromeName = "Chrome_destination";
      String chromeTypeVal = "push_chrome";
      String chromeDescription = "Google Chrome Destination";

      CreateDestinationOptions createChromeDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(chromeName)
              .type(chromeTypeVal)
              .description(chromeDescription)
              .config(chromeDestinationConfigModel)
              .build();

// Invoke operation
      Response<DestinationResponse> chromeResponse = service.createDestination(createChromeDestinationOptions).execute();
// Validate response
      assertNotNull(chromeResponse);
      assertEquals(chromeResponse.getStatusCode(), 201);

      DestinationResponse chromeDestinationResponseResult = chromeResponse.getResult();

      assertNotNull(chromeDestinationResponseResult);
      assertEquals(chromeDestinationResponseResult.getDescription(), chromeDescription);
      assertEquals(chromeDestinationResponseResult.getName(), chromeName);
      assertEquals(chromeDestinationResponseResult.getType(), chromeTypeVal);

      destinationId8 = chromeDestinationResponseResult.getId();

      DestinationConfigOneOfFirefoxDestinationConfig firefoxDestinationConfig = new DestinationConfigOneOfFirefoxDestinationConfig.Builder()
              .websiteUrl("https://cloud.ibm.com")
              .preProd(false)
              .publicKey("ksddkasjdaksd")
              .build();

      DestinationConfig fireFoxDestinationConfigModel = new DestinationConfig.Builder()
              .params(firefoxDestinationConfig)
              .build();

      String firefoxName = "Firefox_destination";
      String firefoxTypeVal = "push_firefox";
      String firefoxDescription = "Firefox Destination";

      CreateDestinationOptions createfirefoxDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(firefoxName)
              .type(firefoxTypeVal)
              .description(firefoxDescription)
              .config(fireFoxDestinationConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> firefoxResponse = service.createDestination(createfirefoxDestinationOptions).execute();
      // Validate response
      assertNotNull(firefoxResponse);
      assertEquals(firefoxResponse.getStatusCode(), 201);

      DestinationResponse destinationFirefoxResponseResult = firefoxResponse.getResult();

      assertNotNull(destinationFirefoxResponseResult);
      assertEquals(destinationFirefoxResponseResult.getDescription(), firefoxDescription);
      assertEquals(destinationFirefoxResponseResult.getName(), firefoxName);
      assertEquals(destinationFirefoxResponseResult.getType(), firefoxTypeVal);

      destinationId9 = destinationFirefoxResponseResult.getId();

      DestinationConfigOneOfPagerDutyDestinationConfig pdDestinationConfig = new DestinationConfigOneOfPagerDutyDestinationConfig.Builder()
              .apiKey("sdzCTz8Bdwc3NcsdcUVs72A")
              .routingKey("asjweioweioeweioww")
              .build();

      DestinationConfig pagerDutyDestinationConfigModel = new DestinationConfig.Builder()
              .params(pdDestinationConfig)
              .build();

      String pdName = "Pager_Duty_destination";
      String pdTypeVal = "pagerduty";
      String pdDescription = "PagerDuty Destination";

      CreateDestinationOptions createPagerDutyDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(pdName)
              .type(pdTypeVal)
              .description(pdDescription)
              .config(pagerDutyDestinationConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> pdResponse = service.createDestination(createPagerDutyDestinationOptions).execute();
      // Validate response
      assertNotNull(pdResponse);
      assertEquals(pdResponse.getStatusCode(), 201);

      DestinationResponse destinationPagerDutyResponseResult = pdResponse.getResult();

      assertNotNull(destinationPagerDutyResponseResult);
      assertEquals(destinationPagerDutyResponseResult.getDescription(), pdDescription);
      assertEquals(destinationPagerDutyResponseResult.getName(), pdName);
      assertEquals(destinationPagerDutyResponseResult.getType(), pdTypeVal);

      destinationId10 = destinationPagerDutyResponseResult.getId();

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
            if(destinationId1 != ""){
              break;
            }
          }
          if(destination.getType().equals("sms_ibm")){
            destinationId1 = destination.getId();
            if(destinationId2 != ""){
              break;
            }
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
      DestinationConfigOneOfWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigOneOfWebhookDestinationConfig.Builder()
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

      DestinationConfigOneOfFCMDestinationConfig fcmConfig = new DestinationConfigOneOfFCMDestinationConfig.Builder()
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


      DestinationConfigOneOfSlackDestinationConfig slackDestinationConfig= new DestinationConfigOneOfSlackDestinationConfig.Builder()
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

      DestinationConfigOneOfSafariDestinationConfig destinationConfig = new DestinationConfigOneOfSafariDestinationConfig.Builder()
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

      String safName = "Safari_dest";
      String safDescription = "This destination is for Safari";

      UpdateDestinationOptions updateSafariDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId5)
              .name(safName)
              .description(safDescription)
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
      assertEquals(safariDestinationResult.getDescription(), safDescription);
      assertEquals(safariDestinationResult.getName(), safName);

      DestinationConfigOneOfMSTeamsDestinationConfig msTeamsDestinationConfig= new DestinationConfigOneOfMSTeamsDestinationConfig.Builder()
              .url("https://teams.microsoft.com")
              .build();

      DestinationConfig destinationMsTeamsConfigModel = new DestinationConfig.Builder()
              .params(msTeamsDestinationConfig)
              .build();

      String msTeamsName = "MSTeams_destination_update";
      String msTeamsDescription = "MSTeams Destination update";

      UpdateDestinationOptions updateMsTeamsDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId6)
              .name(msTeamsName)
              .description(msTeamsDescription)
              .config(destinationMsTeamsConfigModel)
              .build();

      // Invoke operation
      Response<Destination> teamsResponse = service.updateDestination(updateMsTeamsDestinationOptions).execute();
      // Validate response
      assertNotNull(teamsResponse);
      assertEquals(teamsResponse.getStatusCode(), 200);

      Destination msTeamsDestinationResponseResult = teamsResponse.getResult();

      assertNotNull(msTeamsDestinationResponseResult);
      assertEquals(msTeamsDestinationResponseResult.getDescription(), msTeamsDescription);
      assertEquals(msTeamsDestinationResponseResult.getName(), msTeamsName);
      assertEquals(msTeamsDestinationResponseResult.getId(), destinationId6);

      DestinationConfigOneOfIBMCloudFunctionsDestinationConfig cloudFunctionsDestinationConfig= new DestinationConfigOneOfIBMCloudFunctionsDestinationConfig.Builder()
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

      DestinationConfigOneOfChromeDestinationConfig chromeDestinationConfig = new DestinationConfigOneOfChromeDestinationConfig.Builder()
              .websiteUrl("https://cloud.ibm.com")
              .apiKey("aksndkasdnkasd")
              .preProd(false)
              .publicKey("ksddkasjdaksd")
              .build();

      DestinationConfig destinationChromeConfigModel = new DestinationConfig.Builder()
              .params(chromeDestinationConfig)
              .build();

      String chromeName = "Chrome_destination_updated";
      String chromeDescription = "Google Chrome Destination updated";

      UpdateDestinationOptions updateChromeDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId8)
              .name(chromeName)
              .description(chromeDescription)
              .config(destinationChromeConfigModel)
              .build();

      Response<Destination> chromeResponse = service.updateDestination(updateChromeDestinationOptions).execute();;

      assertNotNull(chromeResponse);
      assertEquals(chromeResponse.getStatusCode(), 200);


      Destination chromeDestinationResult = chromeResponse.getResult();

      assertNotNull(chromeDestinationResult);

      assertEquals(chromeDestinationResult.getId(), destinationId8);
      assertEquals(chromeDestinationResult.getDescription(), chromeDescription);
      assertEquals(chromeDestinationResult.getName(), chromeName);

      DestinationConfigOneOfFirefoxDestinationConfig firefoxDestinationConfig = new DestinationConfigOneOfFirefoxDestinationConfig.Builder()
              .websiteUrl("https://cloud.ibm.com")
              .preProd(false)
              .publicKey("ksddkasjdaksd")
              .build();

      DestinationConfig destinationFirefoxConfigModel = new DestinationConfig.Builder()
              .params(firefoxDestinationConfig)
              .build();

      String firefoxName = "Firefox_destination_update";
      String firefoxDescription = "Firefox Destination updated";

      UpdateDestinationOptions updateFireFoxDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId9)
              .name(firefoxName)
              .description(firefoxDescription)
              .config(destinationFirefoxConfigModel)
              .build();

      Response<Destination> fireFoxResponse = service.updateDestination(updateFireFoxDestinationOptions).execute();;

      assertNotNull(fireFoxResponse);
      assertEquals(fireFoxResponse.getStatusCode(), 200);


      Destination firefoxDestinationResult = fireFoxResponse.getResult();

      assertNotNull(firefoxDestinationResult);

      assertEquals(firefoxDestinationResult.getId(), destinationId9);
      assertEquals(firefoxDestinationResult.getDescription(), firefoxDescription);
      assertEquals(firefoxDestinationResult.getName(), firefoxName);

      DestinationConfigOneOfPagerDutyDestinationConfig pagerDutyDestinationConfig = new DestinationConfigOneOfPagerDutyDestinationConfig.Builder()
              .apiKey("erererTz8Bdwc3NcUVs72A")
              .routingKey("eweewiu329489348934")
              .build();

      DestinationConfig destinationPagerDutyConfigModel = new DestinationConfig.Builder()
              .params(pagerDutyDestinationConfig)
              .build();

      String pdName = "Pager_Duty_destination_update";
      String pdDescription = "Pager Duty Destination updated";

      UpdateDestinationOptions updatePDDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId10)
              .name(pdName)
              .description(pdDescription)
              .config(destinationPagerDutyConfigModel)
              .build();

      Response<Destination> pdResponse = service.updateDestination(updatePDDestinationOptions).execute();;

      assertNotNull(pdResponse);
      assertEquals(pdResponse.getStatusCode(), 200);


      Destination pdDestinationResult = pdResponse.getResult();

      assertNotNull(pdDestinationResult);

      assertEquals(pdDestinationResult.getId(), destinationId10);
      assertEquals(pdDestinationResult.getDescription(), pdDescription);
      assertEquals(pdDestinationResult.getName(), pdName);

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


      ArrayList<String> toNumber = new ArrayList<String>();
      toNumber.add("+12064563059");
      toNumber.add("+12267054625");
      SubscriptionCreateAttributesSMSAttributes subscriptionCreateSMSAttributesModel = new SubscriptionCreateAttributesSMSAttributes.Builder()
              .invited(toNumber)
              .build();

      String smsName = "subscription_sms";
      String smsDescription = "Subscription sms";

      createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(smsName)
              .destinationId(destinationId1)
              .topicId(topicId)
              .attributes(subscriptionCreateSMSAttributesModel)
              .description(smsDescription)
              .build();

      Response<Subscription> smsResponse = service.createSubscription(createSubscriptionOptions).execute();
      // Validate response
      assertNotNull(smsResponse);
      assertEquals(smsResponse.getStatusCode(), 201);
      Subscription smsSubscriptionResult = smsResponse.getResult();
      assertNotNull(smsSubscriptionResult);
      assertEquals(smsSubscriptionResult.getDescription(), smsDescription);
      assertEquals(smsSubscriptionResult.getName(), smsName);

      subscriptionId1 = smsSubscriptionResult.getId();

      ArrayList<String> toMail = new ArrayList<String>();
      toMail.add("tester1@gmail.com");
      toMail.add("tester3@ibm.com");
      SubscriptionCreateAttributesEmailAttributes subscriptionCreateEmailAttributesModel = new SubscriptionCreateAttributesEmailAttributes.Builder()
              .invited(toMail)
              .addNotificationPayload(true)
              .replyToMail("reply_to_mail@us.com")
              .replyToName("US News")
              .fromName("IBM")
              .build();

      String emailName = "subscription_email";
      String emailDescription = "Subscription email";

      createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(emailName)
              .destinationId(destinationId2)
              .topicId(topicId)
              .attributes(subscriptionCreateEmailAttributesModel)
              .description(emailDescription)
              .build();

      Response<Subscription> emailResponse = service.createSubscription(createSubscriptionOptions).execute();
      // Validate response
      assertNotNull(emailResponse);
      assertEquals(emailResponse.getStatusCode(), 201);
      Subscription emailSubscriptionResult = emailResponse.getResult();
      assertNotNull(emailSubscriptionResult);
      assertEquals(emailSubscriptionResult.getDescription(), emailDescription);
      assertEquals(emailSubscriptionResult.getName(), emailName);

      subscriptionId2 = emailSubscriptionResult.getId();

      String fcmName = "subscription_FCM";
      String fcmDescription = "Subscription FCM";

      createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(fcmName)
              .destinationId(destinationId3)
              .topicId(topicId3)
              .description(fcmDescription)
              .build();

      Response<Subscription> fcmResponse = service.createSubscription(createSubscriptionOptions).execute();
      // Validate response
      assertNotNull(fcmResponse);
      assertEquals(fcmResponse.getStatusCode(), 201);
      Subscription fcmSubscriptionResult = fcmResponse.getResult();
      assertNotNull(fcmSubscriptionResult);
      assertEquals(fcmSubscriptionResult.getDescription(), fcmDescription);
      assertEquals(fcmSubscriptionResult.getName(), fcmName);

      subscriptionId3 = fcmSubscriptionResult.getId();

      String slackName = "subscription_slack";
      String slackDescription = "Subscription for slack";

      CreateSubscriptionOptions createSlackSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(slackName)
              .destinationId(destinationId4)
              .topicId(topicId)
              .description(slackDescription)
              .build();

      Response<Subscription> slackResponse = service.createSubscription(createSlackSubscriptionOptions).execute();

      assertNotNull(slackResponse);
      assertEquals(slackResponse.getStatusCode(), 201);
      Subscription slackSubscriptionResult = slackResponse.getResult();
      assertNotNull(slackSubscriptionResult);
      assertEquals(slackSubscriptionResult.getDescription(), slackDescription);
      assertEquals(slackSubscriptionResult.getName(), slackName);

      subscriptionId8 = slackSubscriptionResult.getId();

      String safName = "subscription_safari";
      String safDescription = "Subscription for safari";

      CreateSubscriptionOptions createSafariSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(safName)
              .destinationId(destinationId5)
              .topicId(topicId)
              .description(safDescription)
              .build();

      Response<Subscription> safResponse = service.createSubscription(createSafariSubscriptionOptions).execute();

      assertNotNull(safResponse);
      assertEquals(safResponse.getStatusCode(), 201);
      Subscription safSubscriptionResult = safResponse.getResult();
      assertNotNull(safSubscriptionResult);
      assertEquals(safSubscriptionResult.getDescription(), safDescription);
      assertEquals(safSubscriptionResult.getName(), safName);

      subscriptionId9 = safSubscriptionResult.getId();

      String msTeamsName = "subscription_msteams";
      String msTeamsDescription = "Subscription for msteams";

      CreateSubscriptionOptions createMsteamsSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(msTeamsName)
              .destinationId(destinationId6)
              .topicId(topicId)
              .description(msTeamsDescription)
              .build();

      // Invoke operation
      Response<Subscription> msteamsResponse = service.createSubscription(createMsteamsSubscriptionOptions).execute();
      // Validate response
      assertNotNull(msteamsResponse);
      assertEquals(msteamsResponse.getStatusCode(), 201);

      Subscription msTeamsSubscriptionResult = msteamsResponse.getResult();

      assertNotNull(msTeamsSubscriptionResult);
      assertEquals(msTeamsSubscriptionResult.getDescription(), msTeamsDescription);
      assertEquals(msTeamsSubscriptionResult.getName(), msTeamsName);

      subscriptionId4 = msTeamsSubscriptionResult.getId();

      String cfName = "subscription_cf";
      String cfDescription = "Subscription for cf";

      CreateSubscriptionOptions createCFSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(cfName)
              .destinationId(destinationId7)
              .topicId(topicId)
              .description(cfDescription)
              .build();

      Response<Subscription> cfResponse = service.createSubscription(createCFSubscriptionOptions).execute();
      // Validate response
      assertNotNull(cfResponse);
      assertEquals(cfResponse.getStatusCode(), 201);
      Subscription cfSubscriptionResult = cfResponse.getResult();
      assertNotNull(cfSubscriptionResult);
      assertEquals(cfSubscriptionResult.getDescription(), cfDescription);
      assertEquals(cfSubscriptionResult.getName(), cfName);

      subscriptionId5 = cfSubscriptionResult.getId();

      String chromeName = "subscription_chrome";
      String chromeDescription = "Subscription for chrome";

      CreateSubscriptionOptions createChromeSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(chromeName)
              .destinationId(destinationId8)
              .topicId(topicId)
              .description(chromeDescription)
              .build();

      Response<Subscription> chromeResponse = service.createSubscription(createChromeSubscriptionOptions).execute();
      // Validate response
      assertNotNull(chromeResponse);
      assertEquals(chromeResponse.getStatusCode(), 201);
      Subscription chromeSubscriptionResult = chromeResponse.getResult();
      assertNotNull(chromeSubscriptionResult);
      assertEquals(chromeSubscriptionResult.getDescription(), chromeDescription);
      assertEquals(chromeSubscriptionResult.getName(), chromeName);

      subscriptionId6 = chromeSubscriptionResult.getId();

      String fireName = "subscription_firefox";
      String fireDescription = "Subscription for firefox";

      CreateSubscriptionOptions createFireSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(fireName)
              .destinationId(destinationId9)
              .topicId(topicId)
              .description(fireDescription)
              .build();

      Response<Subscription> fireResponse = service.createSubscription(createFireSubscriptionOptions).execute();

      assertNotNull(fireResponse);
      assertEquals(fireResponse.getStatusCode(), 201);
      Subscription fireSubscriptionResult = fireResponse.getResult();
      assertNotNull(fireSubscriptionResult);
      assertEquals(fireSubscriptionResult.getDescription(), fireDescription);
      assertEquals(fireSubscriptionResult.getName(), fireName);

      subscriptionId7 = fireSubscriptionResult.getId();

      String pdName = "subscription_pager_duty";
      String pdDescription = "Subscription for pager duty";

      CreateSubscriptionOptions createPDSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(pdName)
              .destinationId(destinationId10)
              .topicId(topicId)
              .description(pdDescription)
              .build();

      Response<Subscription> pdResponse = service.createSubscription(createPDSubscriptionOptions).execute();

      assertNotNull(pdResponse);
      assertEquals(pdResponse.getStatusCode(), 201);
      Subscription pdSubscriptionResult = pdResponse.getResult();
      assertNotNull(pdSubscriptionResult);
      assertEquals(pdSubscriptionResult.getDescription(), pdDescription);
      assertEquals(pdSubscriptionResult.getName(), pdName);

      subscriptionId10 = pdSubscriptionResult.getId();

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

      ArrayList<String> toPhRemove = new ArrayList<String>();
      toPhRemove.add("+12064512559");

      ArrayList<String> toPhInvite = new ArrayList<String>();
      toPhInvite.add("+12064512559");

      UpdateAttributesSubscribed phSubscribed = new UpdateAttributesSubscribed.Builder()
              .remove(toPhRemove)
              .build();

      UpdateAttributesUnsubscribed phUnSubscribed = new UpdateAttributesUnsubscribed.Builder()
              .remove(toPhRemove)
              .build();

      UpdateAttributesInvited phInvited = new UpdateAttributesInvited.Builder()
              .add(toPhInvite)
              .build();

      SubscriptionUpdateAttributesSMSUpdateAttributes subscriptionUpdateSMSAttributesModel = new SubscriptionUpdateAttributesSMSUpdateAttributes.Builder()
              .invited(phInvited)
              .subscribed(phSubscribed)
              .unsubscribed(phUnSubscribed)
              .build();

      String smsName = "sms subscription update";
      String smsDescription = "subscription_update for sms";

      UpdateSubscriptionOptions smsUpdateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(smsName)
              .id(subscriptionId1)
              .attributes(subscriptionUpdateSMSAttributesModel)
              .description(smsDescription)
              .build();

      Response<Subscription> smsResponse = service.updateSubscription(smsUpdateSubscriptionOptions).execute();
      // Validate response
      assertNotNull(smsResponse);
      assertEquals(smsResponse.getStatusCode(), 200);
      Subscription smsSubscriptionResult = smsResponse.getResult();
      assertNotNull(smsSubscriptionResult);
      assertEquals(smsSubscriptionResult.getDescription(), smsDescription);
      assertEquals(smsSubscriptionResult.getName(), smsName);
      assertEquals(smsSubscriptionResult.getId(), subscriptionId1);

      ArrayList<String> toRemove = new ArrayList<String>();
      toRemove.add("tester3@ibm.com");

      ArrayList<String> toInvite = new ArrayList<String>();
      toInvite.add("tester4@ibm.com");

      UpdateAttributesSubscribed subscribed = new UpdateAttributesSubscribed.Builder()
              .remove(toRemove)
              .build();

      UpdateAttributesUnsubscribed unSubscribed = new UpdateAttributesUnsubscribed.Builder()
              .remove(toRemove)
              .build();

      UpdateAttributesInvited invited = new UpdateAttributesInvited.Builder()
              .add(toInvite)
              .build();

      SubscriptionUpdateAttributesEmailUpdateAttributes subscriptionUpdateEmailAttributesModel = new SubscriptionUpdateAttributesEmailUpdateAttributes.Builder()
              .addNotificationPayload(true)
              .invited(invited)
              .replyToMail("reply_to_mail@us.com")
              .replyToName("US News")
              .fromName("IBM")
              .subscribed(subscribed)
              .unsubscribed(unSubscribed)
              .build();

      String emailName = "email subscription";
      String emailDescription = "subscription_update for email";

      UpdateSubscriptionOptions emailUpdateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(emailName)
              .id(subscriptionId2)
              .attributes(subscriptionUpdateEmailAttributesModel)
              .description(emailDescription)
              .build();

      Response<Subscription> emailResponse = service.updateSubscription(emailUpdateSubscriptionOptions).execute();
      // Validate response
      assertNotNull(emailResponse);
      assertEquals(emailResponse.getStatusCode(), 200);
      Subscription emailSubscriptionResult = emailResponse.getResult();
      assertNotNull(emailSubscriptionResult);
      assertEquals(emailSubscriptionResult.getDescription(), emailDescription);
      assertEquals(emailSubscriptionResult.getName(), emailName);

      subscriptionId2 = emailSubscriptionResult.getId();

      String fcmName = "FCM_sub_updated";
      String fcmDescription = "Update FCM subscription";

      UpdateSubscriptionOptions updateFCMSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId3)
              .name(fcmName)
              .description(fcmDescription)
              .build();

      // Invoke operation
      Response<Subscription> fcmResponse = service.updateSubscription(updateFCMSubscriptionOptions).execute();
      // Validate response
      assertNotNull(fcmResponse);
      assertEquals(fcmResponse.getStatusCode(), 200);

      Subscription fcmSubscriptionResult = fcmResponse.getResult();

      assertNotNull(fcmSubscriptionResult);
      assertEquals(fcmSubscriptionResult.getName(), fcmName);
      assertEquals(fcmSubscriptionResult.getDescription(), fcmDescription);
      assertEquals(fcmSubscriptionResult.getId(), subscriptionId3);

      String msName = "MSTeams_sub_updated";
      String msDescription = "Update MSTeams subscription";

      UpdateSubscriptionOptions updateMSSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId4)
              .name(msName)
              .description(msDescription)
              .build();

      // Invoke operation
      Response<Subscription> msResponse = service.updateSubscription(updateMSSubscriptionOptions).execute();
      // Validate response
      assertNotNull(msResponse);
      assertEquals(msResponse.getStatusCode(), 200);

      Subscription msSubscriptionResult = msResponse.getResult();

      assertNotNull(msSubscriptionResult);
      assertEquals(msSubscriptionResult.getName(), msName);
      assertEquals(msSubscriptionResult.getDescription(), msDescription);
      assertEquals(msSubscriptionResult.getId(), subscriptionId4);

      String cfName = "subscription_cf";
      String cfDescription = "Subscription for cf";

      UpdateSubscriptionOptions updateCFSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId5)
              .name(cfName)
              .description(cfDescription)
              .build();

      // Invoke operation
      Response<Subscription> cfResponse = service.updateSubscription(updateCFSubscriptionOptions).execute();
      // Validate response
      assertNotNull(cfResponse);
      assertEquals(cfResponse.getStatusCode(), 200);
      Subscription cfSubscriptionResult = cfResponse.getResult();
      assertNotNull(cfSubscriptionResult);
      assertEquals(cfSubscriptionResult.getDescription(), cfDescription);
      assertEquals(cfSubscriptionResult.getName(), cfName);
      assertEquals(cfSubscriptionResult.getId(), subscriptionId5);

      String chromeName = "subscription_chrome_update";
      String chromeDescription = "Subscription chrome update";

      UpdateSubscriptionOptions updateChromeSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId6)
              .name(chromeName)
              .description(chromeDescription)
              .build();

      // Invoke operation
      Response<Subscription> chromeResponse = service.updateSubscription(updateChromeSubscriptionOptions).execute();
      // Validate response
      assertNotNull(chromeResponse);
      assertEquals(chromeResponse.getStatusCode(), 200);
      Subscription chromeSubscriptionResult = chromeResponse.getResult();
      assertNotNull(chromeSubscriptionResult);
      assertEquals(chromeSubscriptionResult.getDescription(), chromeDescription);
      assertEquals(chromeSubscriptionResult.getName(), chromeName);
      assertEquals(chromeSubscriptionResult.getId(), subscriptionId6);

      String fireName = "subscription_Firefox_update";
      String fireDescription = "Subscription Firefox update";

      UpdateSubscriptionOptions updateFireSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId7)
              .name(fireName)
              .description(fireDescription)
              .build();

      // Invoke operation
      Response<Subscription> fireResponse = service.updateSubscription(updateFireSubscriptionOptions).execute();
      // Validate response
      assertNotNull(fireResponse);
      assertEquals(fireResponse.getStatusCode(), 200);
      Subscription fireSubscriptionResult = fireResponse.getResult();
      assertNotNull(fireSubscriptionResult);
      assertEquals(fireSubscriptionResult.getDescription(), fireDescription);
      assertEquals(fireSubscriptionResult.getName(), fireName);
      assertEquals(fireSubscriptionResult.getId(), subscriptionId7);

      String slackName = "subscription_slack_update";
      String slackDescription = "Subscription slack update";

      UpdateSubscriptionOptions updateSlackSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId8)
              .name(slackName)
              .description(slackDescription)
              .build();

      // Invoke operation
      Response<Subscription> slackResponse = service.updateSubscription(updateSlackSubscriptionOptions).execute();
      // Validate response
      assertNotNull(slackResponse);
      assertEquals(slackResponse.getStatusCode(), 200);
      Subscription slackSubscriptionResult = slackResponse.getResult();
      assertNotNull(slackSubscriptionResult);
      assertEquals(slackSubscriptionResult.getDescription(), slackDescription);
      assertEquals(slackSubscriptionResult.getName(), slackName);
      assertEquals(slackSubscriptionResult.getId(), subscriptionId8);

      String safName = "subscription_safari_update";
      String safDescription = "Subscription safari update";

      UpdateSubscriptionOptions updateSafariSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId9)
              .name(safName)
              .description(safDescription)
              .build();

      // Invoke operation
      Response<Subscription> safariResponse = service.updateSubscription(updateSafariSubscriptionOptions).execute();
      // Validate response
      assertNotNull(safariResponse);
      assertEquals(safariResponse.getStatusCode(), 200);
      Subscription safariSubscriptionResult = safariResponse.getResult();
      assertNotNull(safariSubscriptionResult);
      assertEquals(safariSubscriptionResult.getDescription(), safDescription);
      assertEquals(safariSubscriptionResult.getName(), safName);
      assertEquals(safariSubscriptionResult.getId(), subscriptionId9);

      String pdName = "subscription_PD_update";
      String pdDescription = "Subscription Pager Duty update";

      UpdateSubscriptionOptions updatePDSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId10)
              .name(pdName)
              .description(pdDescription)
              .build();

      // Invoke operation
      Response<Subscription> pdResponse = service.updateSubscription(updatePDSubscriptionOptions).execute();
      // Validate response
      assertNotNull(pdResponse);
      assertEquals(pdResponse.getStatusCode(), 200);
      Subscription pdSubscriptionResult = pdResponse.getResult();
      assertNotNull(pdSubscriptionResult);
      assertEquals(pdSubscriptionResult.getDescription(), pdDescription);
      assertEquals(pdSubscriptionResult.getName(), pdName);
      assertEquals(pdSubscriptionResult.getId(), subscriptionId10);
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
      subscriptions.add(subscriptionId1);
      subscriptions.add(subscriptionId2);
      subscriptions.add(subscriptionId3);
      subscriptions.add(subscriptionId4);
      subscriptions.add(subscriptionId5);
      subscriptions.add(subscriptionId6);
      subscriptions.add(subscriptionId7);
      subscriptions.add(subscriptionId8);
      subscriptions.add(subscriptionId9);
      subscriptions.add(subscriptionId10);

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

      List<String> destinations = new ArrayList<>();
      destinations.add(destinationId);
      destinations.add(destinationId3);
      destinations.add(destinationId4);
      destinations.add(destinationId5);
      destinations.add(destinationId6);
      destinations.add(destinationId7);
      destinations.add(destinationId8);
      destinations.add(destinationId9);
      destinations.add(destinationId10);

      for (String destination :
              destinations) {
        DeleteDestinationOptions deleteDestinationOptions = new DeleteDestinationOptions.Builder()
                .instanceId(instanceId)
                .id(destination)
                .build();

        // Invoke operation
        Response<Void> response = service.deleteDestination(deleteDestinationOptions).execute();
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

  @Test
  public void test1XListIntegrations() throws Exception {
    try {
      int limit = 1;
      int offset = 0;
      ListIntegrationsOptions integrationsOptions = new ListIntegrationsOptions.Builder()
              .instanceId(instanceId)
              .limit(Long.valueOf(limit))
              .offset(Long.valueOf(offset))
              .search(search)
              .build();

      // Invoke operation
      Response<IntegrationList> response = service.listIntegrations(integrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      assertNotNull(response.getResult().getIntegrations());

      integrationId = response.getResult().getIntegrations().get(0).getId();

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1YGetIntegration() throws Exception {
    try {
      GetIntegrationOptions integrationsOptions = new GetIntegrationOptions.Builder()
              .instanceId(instanceId)
              .id(integrationId)
              .build();

      // Invoke operation
      Response<IntegrationGetResponse> response = service.getIntegration(integrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1ZUpdateIntegration() throws Exception {
    try {
      IntegrationMetadata metadata = new IntegrationMetadata.Builder()
              .endpoint("https://private.us-south.kms.cloud.ibm.com")
              .crn("crn:v1:staging:public:kms:us-south:a/****:****::")
              .rootKeyId("sddsds-f326-4688-baaf-611750e79b61")
              .build();

      ReplaceIntegrationOptions integrationsOptions = new ReplaceIntegrationOptions.Builder()
              .instanceId(instanceId)
              .id(integrationId)
              .type("kms")
              .metadata(metadata)
              .build();

      // Invoke operation
      Response<IntegrationGetResponse> response = service.replaceIntegration(integrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

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
