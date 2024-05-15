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
  public static String destinationId11 = "";
  public static String destinationId12 = "";
  public static String destinationId13 = "";
  public static String destinationId14 = "";
  public static String destinationId15 = "";
  public static String destinationId16 = "";
  public static String destinationId17 = "";
  public static String destinationId18 = "";
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
  public static String subscriptionId11 = "";
  public static String subscriptionId12 = "";
  public static String subscriptionId13 = "";
  public static String subscriptionId14 = "";
  public static String subscriptionId15 = "";
  public static String subscriptionId16 = "";
  public static String subscriptionId17 = "";
  public static String subscriptionId18 = "";
  public static String fcmServerKey = "";
  public static String fcmSenderId = "";
  public static String integrationId = "";
  public static String sNowClientId = "";
  public static String sNowClientSecret = "";
  public static String sNowUserName = "";
  public static String sNowPassword = "";
  public static String sNowInstanceName = "";
  public static String fcmProjectID = "";
  public static String fcmPrivateKey = "";
  public static String fcmClientEmail = "";
  public static String codeEngineURL = "";
  public static String huaweiClientId = "";
  public static String huaweiClientSecret = "";
  public static String cosBucketName = "";
  public static String cosInstanceID = "";
  public static String cosEndPoint = "";
  public static String templateInvitationID = "";
  public static String templateNotificationID = "";
  public static String slackTemplateID = "";
  public static String slackURL = "";
  public static String teamsURL = "";
  public static String pagerDutyApiKey = "";
  public static String pagerDutyRoutingKey = "";
  public static String templateBody = "";
  public static String slackTemplateBody = "";
  public static String cosInstanceCRN = "";
  public static String cosIntegrationID = "";
  public static String codeEngineProjectCRN = "";
  public static String smtpConfigID = "";
  public static String smtpUserID = "";




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
    sNowClientId = config.get("SNOW_CLIENT_ID");
    sNowClientSecret = config.get("SNOW_CLIENT_SECRET");
    sNowUserName = config.get("SNOW_USER_NAME");
    sNowPassword = config.get("SNOW_PASSWORD");
    sNowInstanceName = config.get("SNOW_INSTANCE_NAME");
    fcmProjectID = config.get("FCM_PROJECT_ID");
    fcmPrivateKey = config.get("FCM_PRIVATE_KEY");
    fcmClientEmail = config.get("FCM_CLIENT_EMAIL");
    codeEngineURL = config.get("CODE_ENGINE_URL");
    huaweiClientId = config.get("HUAWEI_CLIENT_ID");
    huaweiClientSecret = config.get("HUAWEI_CLIENT_SECRET");
    cosBucketName = config.get("COS_BUCKET_NAME");
    cosEndPoint = config.get("COS_ENDPOINT");
    cosInstanceID = config.get("COS_INSTANCE");
    cosInstanceCRN = config.get("COS_INSTANCE_CRN");
    slackURL = config.get("SLACK_URL");
    teamsURL = config.get("MS_TEAMS_URL");
    pagerDutyApiKey = config.get("PD_API_KEY");
    pagerDutyRoutingKey = config.get("PD_ROUTING_KEY");
    templateBody = config.get("TEMPLATE_BODY");
    slackTemplateBody = config.get("SLACK_TEMPLATE_BODY");
    codeEngineProjectCRN = config.get("CODE_ENGINE_PROJECT_CRN");

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
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListSourcesOptions listSourcesOptions = new ListSourcesOptions.Builder()
                .instanceId(instanceId)
                .limit(limit)
                .offset(offset)
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
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListTopicsOptions listTopicsOptions = new ListTopicsOptions.Builder()
                .instanceId(instanceId)
                .limit(limit)
                .offset(offset)
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
              .url(slackURL)
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
              .url(teamsURL)
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
              .apiKey(pagerDutyApiKey)
              .routingKey(pagerDutyRoutingKey)
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

      DestinationConfigOneOfServiceNowDestinationConfig serviceNowDestinationConfig = new DestinationConfigOneOfServiceNowDestinationConfig.Builder()
              .clientId(sNowClientId)
              .clientSecret(sNowClientSecret)
              .username(sNowUserName)
              .password(sNowPassword)
              .instanceName(sNowInstanceName)
              .build();

      DestinationConfig serviceNowDestinationConfigModel = new DestinationConfig.Builder()
              .params(serviceNowDestinationConfig)
              .build();

      String serviceNowName = "servicenow_destination";
      String serviceNowTypeVal = "servicenow";
      String serviceNowDescription = "ServiceNow Destination";

      CreateDestinationOptions createServiceNowDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(serviceNowName)
              .type(serviceNowTypeVal)
              .description(serviceNowDescription)
              .config(serviceNowDestinationConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> serviceNowResponse = service.createDestination(createServiceNowDestinationOptions).execute();
      // Validate response
      assertNotNull(serviceNowResponse);
      assertEquals(serviceNowResponse.getStatusCode(), 201);

      DestinationResponse destinationServiceNowResponseResult = serviceNowResponse.getResult();

      assertNotNull(destinationServiceNowResponseResult);
      assertEquals(destinationServiceNowResponseResult.getDescription(), serviceNowDescription);
      assertEquals(destinationServiceNowResponseResult.getName(), serviceNowName);
      assertEquals(destinationServiceNowResponseResult.getType(), serviceNowTypeVal);

      destinationId11 = destinationServiceNowResponseResult.getId();

      fcmConfig = new DestinationConfigOneOfFCMDestinationConfig.Builder()
              .clientEmail(fcmClientEmail)
              .privateKey(fcmPrivateKey)
              .projectId(fcmProjectID)
              .preProd(false)
              .build();

      destinationFcmConfigModel = new DestinationConfig.Builder()
              .params(fcmConfig)
              .build();

      fcmName = "FCM_destination_v1";
      fcmTypeVal = "push_android";
      fcmDescription = "Fcm Destination_v1";

      createFCMDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(fcmName)
              .type(fcmTypeVal)
              .description(fcmDescription)
              .config(destinationFcmConfigModel)
              .build();

      // Invoke operation
      fcmResponse = service.createDestination(createFCMDestinationOptions).execute();
      // Validate response
      assertNotNull(fcmResponse);
      assertEquals(fcmResponse.getStatusCode(), 201);

      destinationFCMResponseResult = fcmResponse.getResult();

      assertNotNull(destinationFCMResponseResult);
      assertEquals(destinationFCMResponseResult.getDescription(), fcmDescription);
      assertEquals(destinationFCMResponseResult.getName(), fcmName);
      assertEquals(destinationFCMResponseResult.getType(), fcmTypeVal);

      destinationId12 = destinationFCMResponseResult.getId();

      DestinationConfigOneOfCodeEngineDestinationConfig destinationCEConfigParamsModel = new DestinationConfigOneOfCodeEngineDestinationConfig.Builder()
              .url(codeEngineURL)
              .verb("get")
              .type("application")
              .customHeaders(new java.util.HashMap<String, String>() { { put("authorization", "testString"); } })
              .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("authorization")))
              .build();

      DestinationConfig destinationCEConfigModel = new DestinationConfig.Builder()
              .params(destinationCEConfigParamsModel)
              .build();

      String codeEngineName = "code-engine_destination";
      String codeEngineTypeVal = "ibmce";
      String codeEngineDescription = "code engine Destination";

      CreateDestinationOptions createCEDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(codeEngineName)
              .type(codeEngineTypeVal)
              .description(codeEngineDescription)
              .config(destinationCEConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> ceResponse = service.createDestination(createCEDestinationOptions).execute();
      // Validate response
      assertNotNull(ceResponse);
      assertEquals(ceResponse.getStatusCode(), 201);

      DestinationResponse destinationCEResponseResult = ceResponse.getResult();

      assertNotNull(destinationCEResponseResult);
      assertEquals(destinationCEResponseResult.getDescription(), codeEngineDescription);
      assertEquals(destinationCEResponseResult.getName(), codeEngineName);
      assertEquals(destinationCEResponseResult.getType(), codeEngineTypeVal);

      destinationId13 = destinationCEResponseResult.getId();

      DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig destinationCOSConfigParamsModel = new DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig.Builder()
              .bucketName(cosBucketName)
              .instanceId(cosInstanceID)
              .endpoint(cosEndPoint)
              .build();

      DestinationConfig destinationCOSConfigModel = new DestinationConfig.Builder()
              .params(destinationCOSConfigParamsModel)
              .build();

      String cosName = "Cloud Object Storage";
      String cosTypeVal = "ibmcos";
      String cosDescription = "Cloud Object Storage Destination";

      CreateDestinationOptions createCOSDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(cosName)
              .type(cosTypeVal)
              .description(cosDescription)
              .config(destinationCOSConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> cosResponse = service.createDestination(createCOSDestinationOptions).execute();
      // Validate response
      assertNotNull(cosResponse);
      assertEquals(cosResponse.getStatusCode(), 201);

      DestinationResponse destinationCOSResponseResult = cosResponse.getResult();

      assertNotNull(destinationCOSResponseResult);
      assertEquals(destinationCOSResponseResult.getDescription(), cosDescription);
      assertEquals(destinationCOSResponseResult.getName(), cosName);
      assertEquals(destinationCOSResponseResult.getType(), cosTypeVal);

      destinationId14 = destinationCOSResponseResult.getId();

      DestinationConfigOneOfHuaweiDestinationConfig destinationHuaweiConfigParamsModel = new DestinationConfigOneOfHuaweiDestinationConfig.Builder()
              .clientId(huaweiClientId)
              .clientSecret(huaweiClientSecret)
              .preProd(false)
              .build();

      DestinationConfig destinationHuaweiConfigModel = new DestinationConfig.Builder()
              .params(destinationHuaweiConfigParamsModel)
              .build();

      String huaweiName = "Huawei";
      String huaweiTypeVal = "push_huawei";
      String huaweiDescription = "Huawei Destination";

      CreateDestinationOptions createHuaweiDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(huaweiName)
              .type(huaweiTypeVal)
              .description(huaweiDescription)
              .config(destinationHuaweiConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> huaweiResponse = service.createDestination(createHuaweiDestinationOptions).execute();
      // Validate response
      assertNotNull(huaweiResponse);
      assertEquals(huaweiResponse.getStatusCode(), 201);

      DestinationResponse destinationHuaweiResponseResult = huaweiResponse.getResult();

      assertNotNull(destinationHuaweiResponseResult);
      assertEquals(destinationHuaweiResponseResult.getDescription(), huaweiDescription);
      assertEquals(destinationHuaweiResponseResult.getName(), huaweiName);
      assertEquals(destinationHuaweiResponseResult.getType(), huaweiTypeVal);

      destinationId15 = destinationHuaweiResponseResult.getId();

      DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationCustomConfigParamsModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
              .domain("test.event-notifications.test.cloud.ibm.com").build();

      DestinationConfig destinationcustomConfigModel = new DestinationConfig.Builder()
              .params(destinationCustomConfigParamsModel)
              .build();

      String customName = "Custom Email";
      String customTypeVal = "smtp_custom";
      String customDescription = "Custom Email Destination";

      CreateDestinationOptions createCustomEmailDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(customName)
              .type(customTypeVal)
              .description(customDescription)
              .config(destinationcustomConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> customResponse = service.createDestination(createCustomEmailDestinationOptions).execute();
      // Validate response
      assertNotNull(customResponse);
      assertEquals(customResponse.getStatusCode(), 201);

      DestinationResponse destinationCustomResponseResult = customResponse.getResult();

      assertNotNull(destinationCustomResponseResult);
      assertEquals(destinationCustomResponseResult.getDescription(), customDescription);
      assertEquals(destinationCustomResponseResult.getName(), customName);
      assertEquals(destinationCustomResponseResult.getType(), customTypeVal);

      destinationId16 = destinationCustomResponseResult.getId();

      String customSMSName = "Custom SMS";
      String customSMSTypeVal = "sms_custom";
      String customSMSDescription = "Custom SMS Destination";

      CreateDestinationOptions createCustomSMSDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(customSMSName)
              .type(customSMSTypeVal)
              .collectFailedEvents(false)
              .description(customSMSDescription)
              .build();

      Response<DestinationResponse> customSMSResponse = service.createDestination(createCustomSMSDestinationOptions).execute();
      // Validate response
      assertNotNull(customSMSResponse);
      assertEquals(customSMSResponse.getStatusCode(), 201);

      DestinationResponse destinationCustomSMSResponseResult = customSMSResponse.getResult();
      destinationId17 = destinationCustomSMSResponseResult.getId();

      DestinationConfigOneOfCodeEngineDestinationConfig destinationCEJobConfigParamsModel = new DestinationConfigOneOfCodeEngineDestinationConfig.Builder()
              .type("job")
              .projectCrn(codeEngineProjectCRN)
              .jobName("custom-job")
              .build();

      DestinationConfig destinationCEJobConfigModel = new DestinationConfig.Builder()
              .params(destinationCEJobConfigParamsModel)
              .build();

      codeEngineName = "code-engine_job_destination";
      codeEngineDescription = "code engine job Destination";

      CreateDestinationOptions createCEJobDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(codeEngineName)
              .type(codeEngineTypeVal)
              .description(codeEngineDescription)
              .config(destinationCEJobConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> ceJobResponse = service.createDestination(createCEJobDestinationOptions).execute();
      // Validate response
      assertNotNull(ceJobResponse);
      assertEquals(ceJobResponse.getStatusCode(), 201);

      DestinationResponse destinationCEJobResponseResult = ceJobResponse.getResult();

      assertNotNull(destinationCEJobResponseResult);
      assertEquals(destinationCEJobResponseResult.getDescription(), codeEngineDescription);
      assertEquals(destinationCEJobResponseResult.getName(), codeEngineName);
      assertEquals(destinationCEJobResponseResult.getType(), codeEngineTypeVal);

      destinationId18 = destinationCEJobResponseResult.getId();

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
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;

      while (moreResults) {
        ListDestinationsOptions listDestinationsOptions = new ListDestinationsOptions.Builder()
                .instanceId(instanceId)
                .limit(limit)
                .offset(offset)
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

      response = service.updateDestination(updateDestinationOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);


      destinationResult = response.getResult();

      assertNotNull(destinationResult);

      assertEquals(destinationResult.getId(), destinationId3);
      assertEquals(destinationResult.getDescription(), fcmDescription);
      assertEquals(destinationResult.getName(), fcmName);


      DestinationConfigOneOfSlackDestinationConfig slackDestinationConfig= new DestinationConfigOneOfSlackDestinationConfig.Builder()
              .url(slackURL)
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
              .url(teamsURL)
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
              .apiKey("apikey")
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

      Response<Destination> chromeResponse = service.updateDestination(updateChromeDestinationOptions).execute();

      assertNotNull(chromeResponse);
      assertEquals(chromeResponse.getStatusCode(), 200);


      Destination chromeDestinationResult = chromeResponse.getResult();

      assertNotNull(chromeDestinationResult);

      assertEquals(chromeDestinationResult.getId(), destinationId8);
      assertEquals(chromeDestinationResult.getDescription(), chromeDescription);
      assertEquals(chromeDestinationResult.getName(), chromeName);

      DestinationConfigOneOfFirefoxDestinationConfig firefoxDestinationConfig = new DestinationConfigOneOfFirefoxDestinationConfig.Builder()
              .websiteUrl("https://cloud.ibm.com")
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

      Response<Destination> fireFoxResponse = service.updateDestination(updateFireFoxDestinationOptions).execute();

      assertNotNull(fireFoxResponse);
      assertEquals(fireFoxResponse.getStatusCode(), 200);


      Destination firefoxDestinationResult = fireFoxResponse.getResult();

      assertNotNull(firefoxDestinationResult);

      assertEquals(firefoxDestinationResult.getId(), destinationId9);
      assertEquals(firefoxDestinationResult.getDescription(), firefoxDescription);
      assertEquals(firefoxDestinationResult.getName(), firefoxName);

      DestinationConfigOneOfPagerDutyDestinationConfig pagerDutyDestinationConfig = new DestinationConfigOneOfPagerDutyDestinationConfig.Builder()
              .apiKey(pagerDutyApiKey)
              .routingKey(pagerDutyRoutingKey)
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

      Response<Destination> pdResponse = service.updateDestination(updatePDDestinationOptions).execute();

      assertNotNull(pdResponse);
      assertEquals(pdResponse.getStatusCode(), 200);


      Destination pdDestinationResult = pdResponse.getResult();

      assertNotNull(pdDestinationResult);

      assertEquals(pdDestinationResult.getId(), destinationId10);
      assertEquals(pdDestinationResult.getDescription(), pdDescription);
      assertEquals(pdDestinationResult.getName(), pdName);

      DestinationConfigOneOfServiceNowDestinationConfig serviceNowDestinationConfig = new DestinationConfigOneOfServiceNowDestinationConfig.Builder()
              .clientId(sNowClientId)
              .clientSecret(sNowClientSecret)
              .username(sNowUserName)
              .password(sNowPassword)
              .instanceName(sNowInstanceName)
              .build();

      DestinationConfig serviceNowDestinationConfigModel = new DestinationConfig.Builder()
              .params(serviceNowDestinationConfig)
              .build();

      String serviceNowName = "servicenow_destination_update";
      String serviceNowDescription = "update ServiceNow Destination";

      UpdateDestinationOptions updateServiceNowDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId11)
              .name(serviceNowName)
              .description(serviceNowDescription)
              .config(serviceNowDestinationConfigModel)
              .build();

      Response<Destination> sNowResponse = service.updateDestination(updateServiceNowDestinationOptions).execute();

      assertNotNull(sNowResponse);
      assertEquals(sNowResponse.getStatusCode(), 200);


      Destination sNowDestinationResult = sNowResponse.getResult();

      assertNotNull(sNowDestinationResult);

      assertEquals(sNowDestinationResult.getId(), destinationId11);
      assertEquals(sNowDestinationResult.getDescription(), serviceNowDescription);
      assertEquals(sNowDestinationResult.getName(), serviceNowName);

      fcmConfig = new DestinationConfigOneOfFCMDestinationConfig.Builder()
              .clientEmail(fcmClientEmail)
              .privateKey(fcmPrivateKey)
              .projectId(fcmProjectID)
              .build();


      destinationFcmConfigModel = new DestinationConfig.Builder()
              .params(fcmConfig)
              .build();

      fcmName = "FCM destination v1 update";
      fcmDescription = "This is a Destination for FCM V1 update";

      updateDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId12)
              .name(fcmName)
              .description(fcmDescription)
              .config(destinationFcmConfigModel)
              .build();

      response = service.updateDestination(updateDestinationOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      destinationResult = response.getResult();
      assertNotNull(destinationResult);
      assertEquals(destinationResult.getId(), destinationId12);
      assertEquals(destinationResult.getDescription(), fcmDescription);
      assertEquals(destinationResult.getName(), fcmName);

      DestinationConfigOneOfCodeEngineDestinationConfig destinationConfigCEParamsModel = new DestinationConfigOneOfCodeEngineDestinationConfig.Builder()
              .url(codeEngineURL)
              .verb("get")
              .type("application")
              .customHeaders(new java.util.HashMap<String, String>() { { put("authorization1", "testString"); } })
              .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("authorization1")))
              .build();

      DestinationConfig destinationCEConfigModel = new DestinationConfig.Builder()
              .params(destinationConfigCEParamsModel)
              .build();

      String ceName = "code engine update";
      String ceDescription = "This destination is for code engine to receive notifications";

      UpdateDestinationOptions updateCEDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId13)
              .name(ceName)
              .description(ceDescription)
              .config(destinationCEConfigModel)
              .build();

      // Invoke operation
      Response<Destination> ceResponse = service.updateDestination(updateCEDestinationOptions).execute();
      // Validate response
      assertNotNull(ceResponse);
      assertEquals(ceResponse.getStatusCode(), 200);

      Destination destinationCEResult = ceResponse.getResult();

      assertNotNull(destinationCEResult);

      assertEquals(destinationCEResult.getId(), destinationId13);
      assertEquals(destinationCEResult.getDescription(), ceDescription);
      assertEquals(destinationCEResult.getName(), ceName);

      DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig destinationCOSConfigParamsModel = new DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig.Builder()
              .bucketName(cosBucketName)
              .instanceId(cosInstanceID)
              .endpoint(cosEndPoint)
              .build();

      DestinationConfig destinationCOSConfigModel = new DestinationConfig.Builder()
              .params(destinationCOSConfigParamsModel)
              .build();

      String cosName = "Cloud Object Storage update";
      String cosDescription = "Cloud Object Storage Destination updated";

      UpdateDestinationOptions updateCOSDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId14)
              .name(cosName)
              .description(cosDescription)
              .config(destinationCOSConfigModel)
              .build();

      // Invoke operation
      Response<Destination> cosResponse = service.updateDestination(updateCOSDestinationOptions).execute();
      // Validate response
      assertNotNull(cosResponse);
      assertEquals(cosResponse.getStatusCode(), 200);

      Destination destinationCOSResult = cosResponse.getResult();

      assertNotNull(destinationCOSResult);

      assertEquals(destinationCOSResult.getId(), destinationId14);
      assertEquals(destinationCOSResult.getDescription(), cosDescription);
      assertEquals(destinationCOSResult.getName(), cosName);

      DestinationConfigOneOfHuaweiDestinationConfig destinationHuaweiConfigParamsModel = new DestinationConfigOneOfHuaweiDestinationConfig.Builder()
              .clientId(huaweiClientId)
              .clientSecret(huaweiClientSecret)
              .preProd(false)
              .build();

      DestinationConfig destinationHuaweiConfigModel = new DestinationConfig.Builder()
              .params(destinationHuaweiConfigParamsModel)
              .build();

      String huaweiName = "Huawei update";
      String huaweiDescription = "Huawei Destination updated";

      UpdateDestinationOptions updateHuaweiDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId15)
              .name(huaweiName)
              .description(huaweiDescription)
              .config(destinationHuaweiConfigModel)
              .build();

      // Invoke operation
      Response<Destination> huaweiResponse = service.updateDestination(updateHuaweiDestinationOptions).execute();
      // Validate response
      assertNotNull(huaweiResponse);
      assertEquals(huaweiResponse.getStatusCode(), 200);

      Destination destinationHuaweiResult = huaweiResponse.getResult();

      assertNotNull(destinationHuaweiResult);

      assertEquals(destinationHuaweiResult.getId(), destinationId15);
      assertEquals(destinationHuaweiResult.getDescription(), huaweiDescription);
      assertEquals(destinationHuaweiResult.getName(), huaweiName);

      DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationCustomConfigParamsModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
              .domain("test.event-notifications.test.cloud.ibm.com")
              .build();

      DestinationConfig destinationCustomConfigModel = new DestinationConfig.Builder()
              .params(destinationCustomConfigParamsModel)
              .build();

      String customName = "Custom email update";
      String customDescription = "Custom Email Destination updated";

      UpdateDestinationOptions updateCustomDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId16)
              .name(customName)
              .description(customDescription)
              .config(destinationCustomConfigModel)
              .build();

      // Invoke operation
      Response<Destination> customResponse = service.updateDestination(updateCustomDestinationOptions).execute();
      // Validate response
      assertNotNull(customResponse);
      assertEquals(customResponse.getStatusCode(), 200);

      Destination destinationCustomResult = customResponse.getResult();

      assertNotNull(destinationCustomResult);

      assertEquals(destinationCustomResult.getId(), destinationId16);
      assertEquals(destinationCustomResult.getDescription(), customDescription);
      assertEquals(destinationCustomResult.getName(), customName);

      UpdateVerifyDestinationOptions updateSpfVerifyDestinationOptionsModel = new UpdateVerifyDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId16)
              .type("spf")
              .build();

      Response<VerificationResponse> spfVerificationResponse = service.updateVerifyDestination(updateSpfVerifyDestinationOptionsModel).execute();
      VerificationResponse spfResponseObj = spfVerificationResponse.getResult();
      assertNotNull(spfResponseObj);

      UpdateVerifyDestinationOptions updateDkimVerifyDestinationOptionsModel = new UpdateVerifyDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId16)
              .type("dkim")
              .build();

      Response<VerificationResponse> dkimVerificationResponse = service.updateVerifyDestination(updateDkimVerifyDestinationOptionsModel).execute();
      VerificationResponse dkimResponseObj = dkimVerificationResponse.getResult();
      assertNotNull(dkimResponseObj);

      String customSMSName = "Custom SMS update";
      String customSMSDescription = "Custom SMS Destination update";

      UpdateDestinationOptions updateCustomSMSDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(customSMSName)
              .id(destinationId17)
              .collectFailedEvents(false)
              .description(customSMSDescription)
              .build();

      Response<Destination> customSMSResponse = service.updateDestination(updateCustomSMSDestinationOptions).execute();
      // Validate response
      assertNotNull(customSMSResponse);
      assertEquals(customSMSResponse.getStatusCode(), 200);

      Destination destinationCustomSMSResponseResult = customSMSResponse.getResult();

      assertNotNull(destinationCustomSMSResponseResult);

      assertEquals(destinationCustomSMSResponseResult.getId(), destinationId17);
      assertEquals(destinationCustomSMSResponseResult.getDescription(), customSMSDescription);
      assertEquals(destinationCustomSMSResponseResult.getName(), customSMSName);

      DestinationConfigOneOfCodeEngineDestinationConfig destinationConfigCEJobParamsModel = new DestinationConfigOneOfCodeEngineDestinationConfig.Builder()
              .type("job")
              .projectCrn(codeEngineProjectCRN)
              .jobName("custom-job")
              .build();

      DestinationConfig destinationCEJobConfigModel = new DestinationConfig.Builder()
              .params(destinationConfigCEJobParamsModel)
              .build();

      ceName = "code engine job update";
      ceDescription = "This destination is for code engine job to receive notifications";

      UpdateDestinationOptions updateCEJobDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId18)
              .name(ceName)
              .description(ceDescription)
              .config(destinationCEJobConfigModel)
              .build();

      // Invoke operation
      Response<Destination> ceJobResponse = service.updateDestination(updateCEJobDestinationOptions).execute();
      // Validate response
      assertNotNull(ceJobResponse);
      assertEquals(ceJobResponse.getStatusCode(), 200);

      Destination destinationCEJobResult = ceJobResponse.getResult();

      assertNotNull(destinationCEJobResult);

      assertEquals(destinationCEJobResult.getId(), destinationId18);
      assertEquals(destinationCEJobResult.getDescription(), ceDescription);
      assertEquals(destinationCEJobResult.getName(), ceName);

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
  public void test1MCreateTemplate() throws Exception {
    try {
      String name = "template invitation name";
      String description = "template description";

      TemplateConfigOneOfEmailTemplateConfig templateConfig = new TemplateConfigOneOfEmailTemplateConfig.Builder()
              .body(templateBody)
              .subject("Hi this is invitation for invitation message")
              .build();

      CreateTemplateOptions createTemplateInvitationOptions = new CreateTemplateOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .description(description)
              .type("smtp_custom.invitation")
              .params(templateConfig)
              .build();

      Response<TemplateResponse> invitationResponse = service.createTemplate(createTemplateInvitationOptions).execute();
      assertNotNull(invitationResponse);
      assertEquals(invitationResponse.getStatusCode(), 201);
      TemplateResponse invitationTemplateResult = invitationResponse.getResult();

      assertNotNull(invitationTemplateResult);
      assertEquals(invitationTemplateResult.getDescription(), description);
      assertEquals(invitationTemplateResult.getName(), name);

      templateInvitationID = invitationTemplateResult.getId();

      name = "template notification name";
      CreateTemplateOptions createTemplateNotificationOptions = new CreateTemplateOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .description(description)
              .type("smtp_custom.notification")
              .params(templateConfig)
              .build();

      Response<TemplateResponse> notificationResponse = service.createTemplate(createTemplateNotificationOptions).execute();
      assertNotNull(notificationResponse);
      assertEquals(notificationResponse.getStatusCode(), 201);
      TemplateResponse notificationTemplateResult = notificationResponse.getResult();

      assertNotNull(notificationTemplateResult );
      assertEquals(notificationTemplateResult .getDescription(), description);
      assertEquals(notificationTemplateResult .getName(), name);
      templateNotificationID= notificationTemplateResult.getId();

      TemplateConfigOneOfSlackTemplateConfig slackTemplateConfig = new TemplateConfigOneOfSlackTemplateConfig.Builder()
              .body(slackTemplateBody)
              .build();

      name = "slack template notification name";
      CreateTemplateOptions createSlackTemplateNotificationOptions = new CreateTemplateOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .description(description)
              .type("slack.notification")
              .params(slackTemplateConfig)
              .build();

      Response<TemplateResponse> slackTemplatenotificationResponse = service.createTemplate(createSlackTemplateNotificationOptions).execute();
      assertNotNull(slackTemplatenotificationResponse);
      assertEquals(slackTemplatenotificationResponse.getStatusCode(), 201);
      TemplateResponse SlackTemplateResult = slackTemplatenotificationResponse.getResult();

      assertNotNull(SlackTemplateResult);
      assertEquals(SlackTemplateResult.getDescription(), description);
      assertEquals(SlackTemplateResult .getName(), name);
      slackTemplateID= SlackTemplateResult.getId();

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1NGetTemplate() throws Exception {
    try {
      GetTemplateOptions getTemplateOptions = new GetTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(templateInvitationID)
              .build();

      // Invoke operation
      Response<Template> response = service.getTemplate(getTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Template template = response.getResult();
      assertNotNull(template);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1OUpdateTemplate() throws Exception {
    try {
      String name = "template name update";
      String description = "template description update";

      TemplateConfigOneOfEmailTemplateConfig templateConfig = new TemplateConfigOneOfEmailTemplateConfig.Builder()
              .body(templateBody)
              .subject("Hi this is invitation for invitation message")
              .build();

      ReplaceTemplateOptions updateTemplateInvitationOptions = new ReplaceTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(templateInvitationID)
              .name(name)
              .description(description)
              .type("smtp_custom.invitation")
              .params(templateConfig)
              .build();

      Response<Template> invitationResponse = service.replaceTemplate(updateTemplateInvitationOptions).execute();
      assertNotNull(invitationResponse);
      assertEquals(invitationResponse.getStatusCode(), 200);
      Template invitationTemplateResult = invitationResponse.getResult();

      assertNotNull(invitationTemplateResult);
      assertEquals(invitationTemplateResult.getDescription(), description);
      assertEquals(invitationTemplateResult.getName(), name);
      assertEquals(invitationTemplateResult.getId(), templateInvitationID);

      ReplaceTemplateOptions updateTemplateNotificationOptions = new ReplaceTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(templateNotificationID)
              .name(name)
              .description(description)
              .type("smtp_custom.notification")
              .params(templateConfig)
              .build();

      Response<Template> notificationResponse = service.replaceTemplate(updateTemplateNotificationOptions).execute();
      assertNotNull(notificationResponse);
      assertEquals(notificationResponse.getStatusCode(), 200);
      Template notificationTemplateResult = notificationResponse.getResult();

      assertNotNull(notificationTemplateResult );
      assertEquals(notificationTemplateResult .getDescription(), description);
      assertEquals(notificationTemplateResult .getName(), name);
      assertEquals(notificationTemplateResult.getId(), templateNotificationID);

      TemplateConfigOneOfSlackTemplateConfig slackTemplateConfig = new TemplateConfigOneOfSlackTemplateConfig.Builder()
              .body(slackTemplateBody)
              .build();

      ReplaceTemplateOptions updateSlackTemplateOptions = new ReplaceTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(slackTemplateID)
              .name(name)
              .description(description)
              .type("slack.notification")
              .params(slackTemplateConfig)
              .build();

      Response<Template> slackTemplateResponse = service.replaceTemplate(updateSlackTemplateOptions).execute();
      assertNotNull(slackTemplateResponse);
      assertEquals(slackTemplateResponse.getStatusCode(), 200);
      Template slackTemplateResult = slackTemplateResponse.getResult();

      assertNotNull(slackTemplateResult);
      assertEquals(slackTemplateResult.getDescription(), description);
      assertEquals(slackTemplateResult.getName(), name);
      assertEquals(slackTemplateResult.getId(), slackTemplateID);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test1PListTemplates() throws Exception {
    try {
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListTemplatesOptions listTemplatesOptions = new ListTemplatesOptions.Builder()
                .instanceId(instanceId)
                .offset(offset)
                .limit(limit)
                .search(search)
                .build();

        // Invoke operation
        Response<TemplateList> response = service.listTemplates(listTemplatesOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        TemplateList templateListResult = response.getResult();

        assertNotNull(templateListResult);

        if (templateListResult.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test
  public void test1QCreateSubscription() throws Exception {
    try {
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

      SubscriptionCreateAttributesSlackAttributes slackCreateAttributes = new SubscriptionCreateAttributesSlackAttributes.Builder()
              .attachmentColor("#0000FF")
              .templateIdNotification(slackTemplateID)
              .build();

      CreateSubscriptionOptions createSlackSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(slackName)
              .destinationId(destinationId4)
              .topicId(topicId)
              .description(slackDescription)
              .attributes(slackCreateAttributes)
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

      String sNowName = "subscription_service_now";
      String sNowDescription = "Subscription for service now";

      SubscriptionCreateAttributesServiceNowAttributes sNowAttributes = new SubscriptionCreateAttributesServiceNowAttributes.Builder()
              .assignedTo("user")
              .assignmentGroup("group")
              .build();

      CreateSubscriptionOptions createSNowSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(sNowName)
              .destinationId(destinationId11)
              .topicId(topicId)
              .description(sNowDescription)
              .attributes(sNowAttributes)
              .build();

      Response<Subscription> sNowResponse = service.createSubscription(createSNowSubscriptionOptions).execute();

      assertNotNull(sNowResponse);
      assertEquals(sNowResponse.getStatusCode(), 201);
      Subscription sNowSubscriptionResult = sNowResponse.getResult();
      assertNotNull(sNowSubscriptionResult);
      assertEquals(sNowSubscriptionResult.getDescription(), sNowDescription);
      assertEquals(sNowSubscriptionResult.getName(), sNowName);

      subscriptionId11 = sNowSubscriptionResult.getId();

      fcmName = "subscription_V1_FCM";
      fcmDescription = "Subscription V1 FCM";

      createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(fcmName)
              .destinationId(destinationId12)
              .topicId(topicId3)
              .description(fcmDescription)
              .build();

      fcmResponse = service.createSubscription(createSubscriptionOptions).execute();
      // Validate response
      assertNotNull(fcmResponse);
      assertEquals(fcmResponse.getStatusCode(), 201);
      fcmSubscriptionResult = fcmResponse.getResult();
      assertNotNull(fcmSubscriptionResult);
      assertEquals(fcmSubscriptionResult.getDescription(), fcmDescription);
      assertEquals(fcmSubscriptionResult.getName(), fcmName);

      subscriptionId12 = fcmSubscriptionResult.getId();

      SubscriptionCreateAttributesWebhookAttributes subscriptionCreateCEAttributesModel = new SubscriptionCreateAttributesWebhookAttributes.Builder()
              .signingEnabled(true).build();
      String ceName = "subscription_code_engine";
      String ceDescription = "Subscription for code engine";

      CreateSubscriptionOptions createCESubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(ceName)
              .destinationId(destinationId13)
              .topicId(topicId)
              .description(ceDescription)
              .attributes(subscriptionCreateCEAttributesModel)
              .build();

      // Invoke operation
      Response<Subscription> ceResponse = service.createSubscription(createCESubscriptionOptions).execute();
      // Validate response
      assertNotNull(ceResponse);
      assertEquals(ceResponse.getStatusCode(), 201);

      Subscription subscriptionCEResult = ceResponse.getResult();

      assertNotNull(subscriptionCEResult);
      assertEquals(subscriptionCEResult.getDescription(), ceDescription);
      assertEquals(subscriptionCEResult.getName(), ceName);

      subscriptionId13 = subscriptionCEResult.getId();

      String cosName = "subscription_COS";
      String cosDescription = "Subscription for COS";
      CreateSubscriptionOptions createCOSSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(cosName)
              .destinationId(destinationId14)
              .topicId(topicId)
              .description(cosDescription)
              .build();

      Response<Subscription> cosResponse = service.createSubscription(createCOSSubscriptionOptions).execute();

      assertNotNull(cosResponse);
      assertEquals(cosResponse.getStatusCode(), 201);
      Subscription cosSubscriptionResult = cosResponse.getResult();
      assertNotNull(cosSubscriptionResult);
      assertEquals(cosSubscriptionResult.getDescription(), cosDescription);
      assertEquals(cosSubscriptionResult.getName(), cosName);

      subscriptionId14 = cosSubscriptionResult.getId();

      String huaweiName = "subscription_Huawei";
      String huaweiDescription = "Subscription for Huawei";
      CreateSubscriptionOptions createHuaweiSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(huaweiName)
              .destinationId(destinationId15)
              .topicId(topicId)
              .description(huaweiDescription)
              .build();

      Response<Subscription> huaweiResponse = service.createSubscription(createHuaweiSubscriptionOptions).execute();

      assertNotNull(huaweiResponse);
      assertEquals(huaweiResponse.getStatusCode(), 201);
      Subscription huaweiSubscriptionResult = huaweiResponse.getResult();
      assertNotNull(huaweiSubscriptionResult);
      assertEquals(huaweiSubscriptionResult.getDescription(), huaweiDescription);
      assertEquals(huaweiSubscriptionResult.getName(), huaweiName);

      subscriptionId15 = huaweiSubscriptionResult.getId();

      ArrayList<String> customToMail = new ArrayList<String>();
      customToMail.add("xyz@ibm.com");
      SubscriptionCreateAttributesCustomEmailAttributes subscriptionCreateCustomEmailAttributesModel = new SubscriptionCreateAttributesCustomEmailAttributes.Builder()
              .invited(customToMail)
              .addNotificationPayload(true)
              .replyToMail("abc@gmail.com")
              .replyToName("abc")
              .fromName("IBM")
              .templateIdInvitation(templateInvitationID)
              .templateIdNotification(templateNotificationID)
              .fromEmail("test@test.event-notifications.test.cloud.ibm.com")
              .build();

      String customName = "subscription_Custom_Email";
      String customDescription = "Subscription for Custom Email";
      CreateSubscriptionOptions createCustomSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(customName)
              .destinationId(destinationId16)
              .topicId(topicId)
              .attributes(subscriptionCreateCustomEmailAttributesModel)
              .description(customDescription)
              .build();

      Response<Subscription> customResponse = service.createSubscription(createCustomSubscriptionOptions).execute();

      assertNotNull(customResponse);
      assertEquals(customResponse.getStatusCode(), 201);
      Subscription customSubscriptionResult = customResponse.getResult();
      assertNotNull(customSubscriptionResult);
      assertEquals(customSubscriptionResult.getDescription(), customDescription);
      assertEquals(customSubscriptionResult.getName(), customName);

      subscriptionId16 = customSubscriptionResult.getId();

      ArrayList<String> customToNumber = new ArrayList<String>();
      customToNumber.add("+911234567890");
      customToNumber.add("+122670546254");
      SubscriptionCreateAttributesCustomSMSAttributes subscriptionCreateCustomSMSAttributesModel = new SubscriptionCreateAttributesCustomSMSAttributes.Builder()
              .invited(customToNumber)
              .build();

      String customSMSName = "subscription_custom_sms";
      String customSMSDescription = "Subscription custom sms";

      CreateSubscriptionOptions createCustomSMSSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(customSMSName)
              .destinationId(destinationId17)
              .topicId(topicId)
              .attributes(subscriptionCreateCustomSMSAttributesModel)
              .description(customSMSDescription)
              .build();

      Response<Subscription> customSMSResponse = service.createSubscription(createCustomSMSSubscriptionOptions).execute();
      // Validate response
      assertNotNull(customSMSResponse);
      assertEquals(customSMSResponse.getStatusCode(), 201);
      Subscription customSMSSubscriptionResult = customSMSResponse.getResult();
      assertNotNull(customSMSSubscriptionResult);
      assertEquals(customSMSSubscriptionResult.getDescription(), customSMSDescription);
      assertEquals(customSMSSubscriptionResult.getName(), customSMSName);

      subscriptionId17 = customSMSSubscriptionResult.getId();

      SubscriptionCreateAttributesWebhookAttributes subscriptionCreateCEJobAttributesModel = new SubscriptionCreateAttributesWebhookAttributes.Builder()
              .signingEnabled(true).build();
      ceName = "subscription_code_engine_job";
      ceDescription = "Subscription for code engine job";

      CreateSubscriptionOptions createCEJobSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(ceName)
              .destinationId(destinationId18)
              .topicId(topicId)
              .description(ceDescription)
              .attributes(subscriptionCreateCEJobAttributesModel)
              .build();

      // Invoke operation
      Response<Subscription> ceJobResponse = service.createSubscription(createCEJobSubscriptionOptions).execute();
      // Validate response
      assertNotNull(ceJobResponse);
      assertEquals(ceJobResponse.getStatusCode(), 201);

      Subscription subscriptionCEJobResult = ceJobResponse.getResult();

      assertNotNull(subscriptionCEJobResult);
      assertEquals(subscriptionCEJobResult.getDescription(), ceDescription);
      assertEquals(subscriptionCEJobResult.getName(), ceName);

      subscriptionId18 = subscriptionCEJobResult.getId();

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
  public void test1RListSubscriptions() throws Exception {
    try {
      boolean moreResults = true;
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
  public void test1SGetSubscription() throws Exception {
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
  public void test1TUpdateSubscription() throws Exception {
    try {
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

      SubscriptionUpdateAttributesSlackAttributes slackUpdateAttributes = new SubscriptionUpdateAttributesSlackAttributes.Builder()
              .attachmentColor("#0000FF")
              .templateIdNotification(slackTemplateID)
              .build();

      UpdateSubscriptionOptions updateSlackSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId8)
              .name(slackName)
              .description(slackDescription)
              .attributes(slackUpdateAttributes)
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

      String sNowName = "subscription_Service_Now_update";
      String sNowDescription = "Subscription Service Now update";

      SubscriptionUpdateAttributesServiceNowAttributes sNowAttributes = new SubscriptionUpdateAttributesServiceNowAttributes.Builder()
              .assignedTo("user")
              .assignmentGroup("group")
              .build();

      UpdateSubscriptionOptions updateSNowSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId11)
              .name(sNowName)
              .description(sNowDescription)
              .attributes(sNowAttributes)
              .build();

      // Invoke operation
      Response<Subscription> sNowResponse = service.updateSubscription(updateSNowSubscriptionOptions).execute();
      // Validate response
      assertNotNull(sNowResponse);
      assertEquals(sNowResponse.getStatusCode(), 200);
      Subscription sNowSubscriptionResult = sNowResponse.getResult();
      assertNotNull(sNowSubscriptionResult);
      assertEquals(sNowSubscriptionResult.getDescription(), sNowDescription);
      assertEquals(sNowSubscriptionResult.getName(), sNowName);
      assertEquals(sNowSubscriptionResult.getId(), subscriptionId11);

      fcmName = "FCM_sub_V1_updated";
      fcmDescription = "Update FCM V1 subscription";

      updateFCMSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId12)
              .name(fcmName)
              .description(fcmDescription)
              .build();

      // Invoke operation
      fcmResponse = service.updateSubscription(updateFCMSubscriptionOptions).execute();
      // Validate response
      assertNotNull(fcmResponse);
      assertEquals(fcmResponse.getStatusCode(), 200);

      fcmSubscriptionResult = fcmResponse.getResult();

      assertNotNull(fcmSubscriptionResult);
      assertEquals(fcmSubscriptionResult.getName(), fcmName);
      assertEquals(fcmSubscriptionResult.getDescription(), fcmDescription);
      assertEquals(fcmSubscriptionResult.getId(), subscriptionId12);

      SubscriptionUpdateAttributesWebhookAttributes subscriptionUpdateCEAttributesModel = new SubscriptionUpdateAttributesWebhookAttributes.Builder()
              .signingEnabled(true)
              .build();

      String ceName = "CE_sub_updated";
      String ceDescription = "Update code engine subscription";

      UpdateSubscriptionOptions updateCESubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId13)
              .name(ceName)
              .description(ceDescription)
              .attributes(subscriptionUpdateCEAttributesModel)
              .build();

      // Invoke operation
      Response<Subscription> ceResponse = service.updateSubscription(updateCESubscriptionOptions).execute();
      // Validate response
      assertNotNull(ceResponse);
      assertEquals(ceResponse.getStatusCode(), 200);

      Subscription subscriptionCEResult = ceResponse.getResult();

      assertNotNull(subscriptionCEResult);
      assertEquals(subscriptionCEResult.getName(), ceName);
      assertEquals(subscriptionCEResult.getDescription(), ceDescription);
      assertEquals(subscriptionCEResult.getId(), subscriptionId13);

      String cosName = "subscription_COS_update";
      String cosDescription = "Subscription COS update";

      UpdateSubscriptionOptions updateCOSSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId14)
              .name(cosName)
              .description(cosDescription)
              .build();

      // Invoke operation
      Response<Subscription> cosResponse = service.updateSubscription(updateCOSSubscriptionOptions).execute();
      // Validate response
      assertNotNull(cosResponse);
      assertEquals(cosResponse.getStatusCode(), 200);
      Subscription cosSubscriptionResult = cosResponse.getResult();
      assertNotNull(cosSubscriptionResult);
      assertEquals(cosSubscriptionResult.getDescription(), cosDescription);
      assertEquals(cosSubscriptionResult.getName(), cosName);
      assertEquals(cosSubscriptionResult.getId(), subscriptionId14);

      String huaweiName = "subscription_Huawei_update";
      String huaweiDescription = "Subscription Huawei update";

      UpdateSubscriptionOptions updateHuaweiSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId15)
              .name(huaweiName)
              .description(huaweiDescription)
              .build();

      // Invoke operation
      Response<Subscription> huaweiResponse = service.updateSubscription(updateHuaweiSubscriptionOptions).execute();
      // Validate response
      assertNotNull(huaweiResponse);
      assertEquals(huaweiResponse.getStatusCode(), 200);
      Subscription huaweiSubscriptionResult = huaweiResponse.getResult();
      assertNotNull(huaweiSubscriptionResult);
      assertEquals(huaweiSubscriptionResult.getDescription(), huaweiDescription);
      assertEquals(huaweiSubscriptionResult.getName(), huaweiName);
      assertEquals(huaweiSubscriptionResult.getId(), subscriptionId15);

      ArrayList<String> toCustomRemove = new ArrayList<String>();
      toCustomRemove.add("tester3@ibm.com");

      ArrayList<String> toCustomInvite = new ArrayList<String>();
      toCustomInvite.add("tester4@ibm.com");

      UpdateAttributesSubscribed customSubscribed = new UpdateAttributesSubscribed.Builder()
              .remove(toCustomRemove)
              .build();

      UpdateAttributesUnsubscribed customUnSubscribed = new UpdateAttributesUnsubscribed.Builder()
              .remove(toCustomRemove)
              .build();

      UpdateAttributesInvited customInvited = new UpdateAttributesInvited.Builder()
              .add(toCustomInvite)
              .build();

      SubscriptionUpdateAttributesCustomEmailUpdateAttributes subscriptionUpdateCustomEmailAttributesModel = new SubscriptionUpdateAttributesCustomEmailUpdateAttributes.Builder()
              .addNotificationPayload(true)
              .invited(customInvited)
              .replyToMail("abc@gmail.com")
              .replyToName("US News")
              .fromName("IBM")
              .fromEmail("test@test.event-notifications.test.cloud.ibm.com")
              .templateIdInvitation(templateInvitationID)
              .templateIdNotification(templateNotificationID)
              .subscribed(customSubscribed)
              .unsubscribed(customUnSubscribed)
              .build();

      String customEmailName = "Custom email subscription";
      String customEmailDescription = "subscription_update for Custom email";

      UpdateSubscriptionOptions customEmailUpdateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(customEmailName)
              .id(subscriptionId16)
              .attributes(subscriptionUpdateCustomEmailAttributesModel)
              .description(customEmailDescription)
              .build();

      Response<Subscription> customEmailResponse = service.updateSubscription(customEmailUpdateSubscriptionOptions).execute();
      // Validate response
      assertNotNull(customEmailResponse);
      assertEquals(customEmailResponse.getStatusCode(), 200);
      Subscription customEmailSubscriptionResult = customEmailResponse.getResult();
      assertNotNull(customEmailSubscriptionResult);
      assertEquals(customEmailSubscriptionResult.getDescription(), customEmailDescription);
      assertEquals(customEmailSubscriptionResult.getName(), customEmailName);

      ArrayList<String> toCustomPhRemove = new ArrayList<String>();
      toCustomPhRemove.add("+12064512559");

      ArrayList<String> toCustomPhInvite = new ArrayList<String>();
      toCustomPhInvite.add("+12064512559");

      UpdateAttributesSubscribed customPhSubscribed = new UpdateAttributesSubscribed.Builder()
              .remove(toCustomPhRemove)
              .build();

      UpdateAttributesUnsubscribed customPhUnSubscribed = new UpdateAttributesUnsubscribed.Builder()
              .remove(toCustomPhRemove)
              .build();

      UpdateAttributesInvited customPhInvited = new UpdateAttributesInvited.Builder()
              .add(toCustomPhInvite)
              .build();

      SubscriptionUpdateAttributesCustomSMSUpdateAttributes subscriptionUpdateCustomSMSAttributesModel = new SubscriptionUpdateAttributesCustomSMSUpdateAttributes.Builder()
              .invited(customPhInvited)
              .subscribed(customPhSubscribed)
              .unsubscribed(customPhUnSubscribed)
              .build();

      String customSMSName = "custom sms subscription update";
      String customSMSDescription = "custom subscription_update for sms";

      UpdateSubscriptionOptions customSMSUpdateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(customSMSName)
              .id(subscriptionId17)
              .attributes(subscriptionUpdateCustomSMSAttributesModel)
              .description(customSMSDescription)
              .build();

      Response<Subscription> customSMSResponse = service.updateSubscription(customSMSUpdateSubscriptionOptions).execute();
      // Validate response
      assertNotNull(customSMSResponse);
      assertEquals(customSMSResponse.getStatusCode(), 200);
      Subscription customSMSSubscriptionResult = customSMSResponse.getResult();
      assertNotNull(customSMSSubscriptionResult);
      assertEquals(customSMSSubscriptionResult.getDescription(), customSMSDescription);
      assertEquals(customSMSSubscriptionResult.getName(), customSMSName);
      assertEquals(customSMSSubscriptionResult.getId(), subscriptionId17);

      SubscriptionUpdateAttributesWebhookAttributes subscriptionUpdateCEJobAttributesModel = new SubscriptionUpdateAttributesWebhookAttributes.Builder()
              .signingEnabled(true)
              .build();

      ceName = "CE_job_sub_updated";
      ceDescription = "Update code engine job subscription";

      UpdateSubscriptionOptions updateCEJobSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId18)
              .name(ceName)
              .description(ceDescription)
              .attributes(subscriptionUpdateCEJobAttributesModel)
              .build();

      // Invoke operation
      Response<Subscription> ceJobResponse = service.updateSubscription(updateCEJobSubscriptionOptions).execute();
      // Validate response
      assertNotNull(ceJobResponse);
      assertEquals(ceJobResponse.getStatusCode(), 200);

      Subscription subscriptionCEJobResult = ceJobResponse.getResult();

      assertNotNull(subscriptionCEJobResult);
      assertEquals(subscriptionCEJobResult.getName(), ceName);
      assertEquals(subscriptionCEJobResult.getDescription(), ceDescription);
      assertEquals(subscriptionCEJobResult.getId(), subscriptionId18);


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
  public void test1UGetEnabledCountries() throws Exception {
    try {
      // begin-enabled_countries

      GetEnabledCountriesOptions getEnabledCountriesOptions = new GetEnabledCountriesOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId17)
              .build();

      // Invoke operation
      Response<EnabledCountriesResponse> response = service.getEnabledCountries(getEnabledCountriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      EnabledCountriesResponse enabledCountriesResult = response.getResult();
      assertNotNull(enabledCountriesResult);

      // end-enabled_countries
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }

  @Test
  public void test1VCreateSMTPConfiguration() throws Exception {
    try {
      // begin-create-smtp-configuration
      String name = "SMTP Configuration";
      String description = "description for SMTP Configuration";
      String domain = "mailx.event-notifications.test.cloud.ibm.com";

      CreateSmtpConfigurationOptions createSMTPConfigurationOptions = new CreateSmtpConfigurationOptions.Builder()
              .instanceId(instanceId)
              .domain(domain)
              .name(name)
              .description(description)
              .build();

      // Invoke operation
      Response<SMTPCreateResponse> response = service.createSmtpConfiguration(createSMTPConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);
      SMTPCreateResponse smtpCreateResponse = response.getResult();
      assertNotNull(smtpCreateResponse);
      assertEquals(smtpCreateResponse.getName(), name);
      assertEquals(smtpCreateResponse.getDescription(), description);
      assertEquals(smtpCreateResponse.getDomain(), domain);
      smtpConfigID = smtpCreateResponse.getId();
      // end-create-smtp-configuration
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
  @Test
  public void test1WVerifySMTP() throws Exception {
    try {
      // begin-verify-smtp
      UpdateVerifySmtpOptions updateVerifySmtpOptions = new UpdateVerifySmtpOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .type("dkim,spf,en_authorization")
              .build();

      // Invoke operation
      Response<SMTPVerificationUpdateResponse> response = service.updateVerifySmtp(updateVerifySmtpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      SMTPVerificationUpdateResponse updateVerifySmtpResponse = response.getResult();
      assertNotNull(updateVerifySmtpResponse);
      // end-verify-smtp
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
  @Test
  public void test1XUpdateSmtpAllowedIps() throws Exception {
    try {
      // begin-update-smtp-allowed-ips
      UpdateSmtpAllowedIpsOptions updateSmtpAllowedIpsOptionsModel = new UpdateSmtpAllowedIpsOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .subnets(java.util.Arrays.asList("192.168.1.64"))
              .build();

      Response<SMTPAllowedIPs> response = service.updateSmtpAllowedIps(updateSmtpAllowedIpsOptionsModel).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      SMTPAllowedIPs responseObj = response.getResult();
      assertNotNull(responseObj);
      // end-update-smtp-allowed-ips
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
  @Test
  public void test1YCreateSMTPUser() throws Exception {
    try {
      // begin-create-smtp-user
      String description = "description for SMTP user";
      CreateSmtpUserOptions createSmtpUserOptionsModel = new CreateSmtpUserOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .description(description)
              .build();

      Response<SMTPUserResponse> response = service.createSmtpUser(createSmtpUserOptionsModel).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);
      SMTPUserResponse responseObj = response.getResult();
      assertEquals(responseObj.getDescription(), description);
      assertEquals(responseObj.getSmtpConfigId(), smtpConfigID);
      assertNotNull(responseObj.getId());
      smtpUserID = responseObj.getId();
      assertNotNull(responseObj.getUsername());
      assertNotNull(responseObj.getPassword());
      // end-create-smtp-user
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
  @Test
  public void test1ZListSmtpConfigurations() throws Exception {
    try {
      // begin-list-smtp-configurations
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListSmtpConfigurationsOptions listSmtpConfigurationsOptionsModel = new ListSmtpConfigurationsOptions.Builder()
                .instanceId(instanceId)
                .limit(limit)
                .offset(offset)
                .search(search)
                .build();

        // Invoke listSmtpConfigurations() with a valid options model and verify the result
        Response<SMTPConfigurationsList> response = service.listSmtpConfigurations(listSmtpConfigurationsOptionsModel).execute();
        assertNotNull(response);
        SMTPConfigurationsList smtpConfigurationList = response.getResult();
        assertNotNull(smtpConfigurationList);
        if (smtpConfigurationList.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
      // end-list-smtp-configurations
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }

  @Test
  public void test2AListSmtpUsers() throws Exception {
    try {
      // begin-list-smtp-users
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        ListSmtpUsersOptions listSmtpUsersOptionsModel = new ListSmtpUsersOptions.Builder()
                .instanceId(instanceId)
                .id(smtpConfigID)
                .limit(limit)
                .offset(offset)
                .search(search)
                .build();

        // Invoke listSmtpUsers() with a valid options model and verify the result
        Response<SMTPUsersList> response = service.listSmtpUsers(listSmtpUsersOptionsModel).execute();
        assertNotNull(response);
        SMTPUsersList smtpUsersList = response.getResult();
        assertNotNull(smtpUsersList);
        if (smtpUsersList.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
      // end-list-smtp-users
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }

  @Test
  public void test2BGetSmtpConfiguration() throws Exception {
    try {
      // begin-get-smtp-configuration
      GetSmtpConfigurationOptions getSmtpConfigurationOptionsModel = new GetSmtpConfigurationOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .build();

      Response<SMTPConfiguration> response = service.getSmtpConfiguration(getSmtpConfigurationOptionsModel).execute();
      assertNotNull(response);
      SMTPConfiguration responseObj = response.getResult();
      assertNotNull(responseObj.getConfig().getDkim());
      assertNotNull(responseObj.getConfig().getSpf());
      assertNotNull(responseObj.getConfig().getEnAuthorization());
      assertNotNull(responseObj);
      // end-get-smtp-configuration
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
  @Test
  public void test2CGetSmtpAllowedIps() throws Exception {
    try {
      // begin-get-smtp-allowed-ips
      GetSmtpAllowedIpsOptions getSmtpAllowedIpsOptionsModel = new GetSmtpAllowedIpsOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .build();

      Response<SMTPAllowedIPs> response = service.getSmtpAllowedIps(getSmtpAllowedIpsOptionsModel).execute();
      assertNotNull(response);
      SMTPAllowedIPs responseObj = response.getResult();
      assertNotNull(responseObj);
      // end-get-smtp-allowed-ips
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
  @Test
  public void test2DGetSmtpUser() throws Exception {
    try {
      // begin-get-smtp-user
      GetSmtpUserOptions getSmtpUserOptionsModel = new GetSmtpUserOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .userId(smtpUserID)
              .build();

      Response<SMTPUser> response = service.getSmtpUser(getSmtpUserOptionsModel).execute();
      assertNotNull(response);
      SMTPUser responseObj = response.getResult();
      assertNotNull(responseObj);
      // end-get-smtp-user
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
  @Test
  public void test2EUpdateSmtpConfiguration() throws Exception {
    try {
      // begin-update-smtp-configuration
      String name = "SMTP Configuration update";
      String description = "description for SMTP Configuration update";

      UpdateSmtpConfigurationOptions updateSmtpConfigurationOptionsModel = new UpdateSmtpConfigurationOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .name(name)
              .description(description)
              .build();

      Response<SMTPConfiguration> response = service.updateSmtpConfiguration(updateSmtpConfigurationOptionsModel).execute();
      assertNotNull(response);
      SMTPConfiguration responseObj = response.getResult();
      assertNotNull(responseObj);
      assertEquals(responseObj.getName(), name);
      assertEquals(responseObj.getDescription(), description);

      // end-update-smtp-configuration
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }

  @Test
  public void test2FUpdateSmtpUser() throws Exception {
    try {
      // begin-update-smtp-user
      String description = "description for SMTP user update";

      UpdateSmtpUserOptions updateSmtpUserOptionsModel = new UpdateSmtpUserOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .userId(smtpUserID)
              .description(description)
              .build();

      Response<SMTPUser> response = service.updateSmtpUser(updateSmtpUserOptionsModel).execute();
      assertNotNull(response);
      SMTPUser responseObj = response.getResult();
      assertNotNull(responseObj);
      assertEquals(responseObj.getDescription(), description);
      // end-update-smtp-user
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }

  @Test
  public void test2GSendNotifications() throws Exception {
    try {
      // begin-send_notifications
      String notificationDevices = "{\"platforms\":[\"push_ios\",\"push_android\",\"push_chrome\",\"push_firefox\", \"push_huawei\"]}";
      String fcmJsonString = "{\"message\": {\"android\": {\"notification\": {\"title\": \"Alert message\",\"body\": \"Bob wants to play Poker\"},\"data\": {\"name\": \"Willie Greenholt\",\"description\": \"notification for the Poker\"}}}}";
      String apnsJsonString = "{\"aps\":{\"alert\":{\"title\":\"Hello!! GameRequest\",\"body\":\"Bob wants to play poker\",\"action-loc-key\":\"PLAY\"},\"badge\":5}}";
      String safariJsonString = "{\"aps\":{\"alert\":{\"title\":\"FlightA998NowBoarding\",\"body\":\"BoardinghasbegunforFlightA998.\",\"action\":\"View\"},\"url-args\":[\"boarding\",\"A998\"]}}";
      String huaweiJsonString = "{\"message\":{\"android\":{\"notification\":{\"title\":\"New Message\",\"body\":\"Hello World\",\"click_action\":{\"type\":3}}}}}";
      String mailTo = "[\"abc@ibm.com\", \"def@us.ibm.com\"]";
      String templates = String.format("[\"%s\"]", slackTemplateID);
      String smsTo = "[\"+911234567890\", \"+911224567890\"]";
      String htmlBody = "\"Hi  ,<br/>Certificate expiring in 90 days.<br/><br/>Please login to <a href=\"https: //cloud.ibm.com/security-compliance/dashboard\">Security and Complaince dashboard</a> to find more information<br/>\"";

      NotificationCreate body = new NotificationCreate.Builder()
              .id(instanceId)
              .ibmenseverity("MEDIUM")
              .id("FCM ID")
              .source(sourceId)
              .ibmensourceid(sourceId)
              .type("com.acme.offer:new")
              .time(new java.util.Date())
              .ibmenpushto(notificationDevices)
              .ibmensubject("certificate expire")
              .ibmenmailto(mailTo)
              .ibmensmsto(smsTo)
              .ibmenhtmlbody(htmlBody)
              .ibmentemplates(templates)
              .ibmenfcmbody(fcmJsonString)
              .ibmenapnsbody(apnsJsonString)
              .ibmenhuaweibody(huaweiJsonString)
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
  public void test2HTestDestination() {
    try {
      List<String> destinations = new ArrayList<>();
      destinations.add(destinationId4);
      destinations.add(destinationId6);
      destinations.add(destinationId10);
      destinations.add(destinationId14);

      for (String destination :
              destinations) {
        TestDestinationOptions testDestinationOptionsModel = new TestDestinationOptions.Builder()
                .instanceId(instanceId)
                .id(destination)
                .build();

        Response<TestDestinationResponse> response = service.testDestination(testDestinationOptionsModel).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
      }
    }
    catch(ServiceResponseException e){
        fail(String.format("Service returned status code %d: %s%nError details: %s",
                e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
  }

  @Test
  public void test2IDeleteSubscription() throws Exception {
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
      subscriptions.add(subscriptionId11);
      subscriptions.add(subscriptionId12);
      subscriptions.add(subscriptionId13);
      subscriptions.add(subscriptionId14);
      subscriptions.add(subscriptionId15);
      subscriptions.add(subscriptionId16);
      subscriptions.add(subscriptionId17);
      subscriptions.add(subscriptionId18);

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
  public void test2JDeleteTopic() throws Exception {
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
  public void test2KDeleteDestination() throws Exception {
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
      destinations.add(destinationId11);
      destinations.add(destinationId12);
      destinations.add(destinationId13);
      destinations.add(destinationId14);
      destinations.add(destinationId15);
      destinations.add(destinationId16);
      destinations.add(destinationId17);
      destinations.add(destinationId18);

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
  public void test2LDeleteSource() throws Exception {
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
  public void test2MCreateIntegration() throws Exception {
    try {
      IntegrationCreateMetadata metadata = new IntegrationCreateMetadata.Builder()
              .endpoint(cosEndPoint)
              .crn(cosInstanceCRN)
              .bucketName(cosBucketName)
              .build();

      CreateIntegrationOptions integrationsOptions = new CreateIntegrationOptions.Builder()
              .instanceId(instanceId)
              .type("collect_failed_events")
              .metadata(metadata)
              .build();

      // Invoke operation
      Response<IntegrationCreateResponse> response = service.createIntegration(integrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      cosIntegrationID = response.getResult().getId();
      assertEquals(response.getStatusCode(), 201);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void test2NListIntegrations() throws Exception {
    try {
      int limit = 1;
      int offset = 0;
      ListIntegrationsOptions integrationsOptions = new ListIntegrationsOptions.Builder()
              .instanceId(instanceId)
              .limit(limit)
              .offset(offset)
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
  public void test2OGetIntegration() throws Exception {
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
  public void test2PUpdateIntegration() throws Exception {
    try {
      IntegrationMetadata metadata = new IntegrationMetadata.Builder()
              .endpoint(cosEndPoint)
              .crn(cosInstanceCRN)
              .bucketName(cosBucketName)
              .build();

      ReplaceIntegrationOptions integrationsOptions = new ReplaceIntegrationOptions.Builder()
              .instanceId(instanceId)
              .id(cosIntegrationID)
              .type("collect_failed_events")
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

  @Test
  public void test2QDeleteTemplate() throws Exception {
    try {
     List<String> templates = new ArrayList<>();
     templates.add(templateInvitationID);
     templates.add(templateNotificationID);
     templates.add(slackTemplateID);

      for (String template : templates) {
        DeleteTemplateOptions deleteTemplateOptions = new DeleteTemplateOptions.Builder()
                .instanceId(instanceId)
                .id(template)
                .build();

        // Invoke operation
        Response<Void> response = service.deleteTemplate(deleteTemplateOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
      }
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test
  public void test2RDeleteSMTPUser() throws Exception {
    try {
      List<String> users = new ArrayList<>();
      users.add(smtpUserID);

      for (String user : users) {
        DeleteSmtpUserOptions deleteSmtpUserOptionsModel = new DeleteSmtpUserOptions.Builder()
                .instanceId(instanceId)
                .id(smtpConfigID)
                .userId(user)
                .build();

        Response<Void> response = service.deleteSmtpUser(deleteSmtpUserOptionsModel).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
      }
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test
  public void test2SDeleteSMTPConfiguration() throws Exception {
    try {
      List<String> smtpConfigIDs = new ArrayList<>();
      smtpConfigIDs.add(smtpConfigID);

      for (String smtpConfigID : smtpConfigIDs) {
        DeleteSmtpConfigurationOptions deleteSmtpConfigurationOptionsModel = new DeleteSmtpConfigurationOptions.Builder()
                .instanceId(instanceId)
                .id(smtpConfigID)
                .build();

        Response<Void> response = service.deleteSmtpConfiguration(deleteSmtpConfigurationOptionsModel).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
      }
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
