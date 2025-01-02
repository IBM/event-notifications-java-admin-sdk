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
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
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
  public static String destinationId1 = "";
  public static String destinationId2 = "";
  public static String destinationId3 = "";
  public static String destinationId4 = "";
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
  public static String destinationId19 = "";
  public static String safariCertificatePath = "";
  public static String subscriptionId = "";
  public static String subscriptionId1 = "";
  public static String subscriptionId2 = "";
  public static String subscriptionId3 = "";
  public static String subscriptionId4 = "";
  public static String subscriptionId5 = "";
  public static String subscriptionId6 = "";
  public static String subscriptionId7 = "";
  public static String subscriptionId8 = "";
  public static Map<String, String> config = null;
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
  public static String templateBody = "";
  public static String slackTemplateBody = "";
  public static String cosIntegrationID = "";
  public static String cosInstanceCRN = "";
  public static String codeEngineProjectCRN = "";
  public static String smtpConfigID = "";
  public static String smtpUserID = "";
  public static String notificationID = "";
  public static String slackDMToken = "";
  public static String slackChannelID = "";
  public static String webhookTemplateID = "";
  public static String webhookTemplateBody = "";

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
    templateBody = config.get("TEMPLATE_BODY");
    cosInstanceCRN = config.get("COS_INSTANCE_CRN");
    slackTemplateBody = config.get("SLACK_TEMPLATE_BODY");
    slackDMToken = config.get("SLACK_DM_TOKEN");
    slackChannelID = config.get("SLACK_CHANNEL_ID");
    codeEngineProjectCRN = config.get("CODE_ENGINE_PROJECT_CRN");
    webhookTemplateBody = config.get("WEBHOOK_TEMPLATE_BODY");

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

      SourcesItems topicUpdateSourcesItemModel = new SourcesItems.Builder()
              .id(sourceId)
              .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
              .build();


      CreateTopicOptions createTopicOptions = new CreateTopicOptions.Builder()
              .instanceId(instanceId)
              .name(topicName)
              .description("This topic is used for routing all compliance related notifications to the appropriate destinations")
              .sources(new java.util.ArrayList<SourcesItems>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
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

      SourcesItems topicUpdateSourcesItemModel = new SourcesItems.Builder()
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
              .sources(new java.util.ArrayList<SourcesItems>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
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

      DestinationConfigOneOfWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigOneOfWebhookDestinationConfig.Builder()
              .url("https://gcm.com")
              .verb("get")
              .customHeaders(new java.util.HashMap<String, String>() {
                {
                  put("gcm_apikey", "testString");
                }
              })
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
              .certificate(new FileInputStream(new File("/path")))
              .certificateContentType("contentype")
              .build();

      Response<DestinationResponse> response = eventNotificationsService.createDestination(createDestinationOptions).execute();
      DestinationResponse destinationResponseResult = response.getResult();
      System.out.println(destinationResponseResult);
      destinationId3 = destinationResponseResult.getId();

      DestinationConfigOneOfSlackDestinationConfig slackDestinationConfig = new DestinationConfigOneOfSlackDestinationConfig.Builder()
              .url("https://api.slack.com/myslack")
              .type("incoming_webhook")
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

      Response<DestinationResponse> slackResponse = eventNotificationsService.createDestination(createSlackDestinationOptions).execute();
      DestinationResponse slackDestinationResponseResult = slackResponse.getResult();
      System.out.println(slackDestinationResponseResult);
      destinationId4 = slackDestinationResponseResult.getId();

      DestinationConfigOneOfSafariDestinationConfig safariDestinationConfig = new DestinationConfigOneOfSafariDestinationConfig.Builder()
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

      Response<DestinationResponse> safariResponse = eventNotificationsService.createDestination(createSafariDestinationOptions).execute();

      DestinationResponse safariDestinationResponse = safariResponse.getResult();
      System.out.println(safariDestinationResponse);
      destinationId5 = safariDestinationResponse.getId();

      DestinationConfigOneOfMSTeamsDestinationConfig msTeamsDestinationConfig = new DestinationConfigOneOfMSTeamsDestinationConfig.Builder()
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

      Response<DestinationResponse> teamsResponse = eventNotificationsService.createDestination(createMsTeamsDestinationOptions).execute();

      DestinationResponse msTeamsDestinationResponseResult = teamsResponse.getResult();
      System.out.println(msTeamsDestinationResponseResult);
      destinationId6 = msTeamsDestinationResponseResult.getId();

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

      Response<DestinationResponse> chromeResponse = eventNotificationsService.createDestination(createChromeDestinationOptions).execute();
      DestinationResponse chromeDestinationResponseResult = chromeResponse.getResult();
      System.out.println(chromeDestinationResponseResult);
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

      CreateDestinationOptions createFireDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(firefoxName)
              .type(firefoxTypeVal)
              .description(firefoxDescription)
              .config(fireFoxDestinationConfigModel)
              .build();

      Response<DestinationResponse> firefoxResponse = eventNotificationsService.createDestination(createFireDestinationOptions).execute();

      DestinationResponse destinationFirefoxResponseResult = firefoxResponse.getResult();
      System.out.println(destinationFirefoxResponseResult);
      destinationId9 = destinationFirefoxResponseResult.getId();

      DestinationConfigOneOfPagerDutyDestinationConfig pdDestinationConfig = new DestinationConfigOneOfPagerDutyDestinationConfig.Builder()
              .apiKey("insert apikey here")
              .routingKey("insert routing key here")
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
      Response<DestinationResponse> pdResponse = eventNotificationsService.createDestination(createPagerDutyDestinationOptions).execute();
      DestinationResponse destinationPagerDutyResponseResult = pdResponse.getResult();

      System.out.println(destinationPagerDutyResponseResult);
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
      Response<DestinationResponse> serviceNowResponse = eventNotificationsService.createDestination(createServiceNowDestinationOptions).execute();
      // Validate response
      DestinationResponse destinationServiceNowResponseResult = serviceNowResponse.getResult();
      System.out.println(destinationServiceNowResponseResult);
      destinationId11 = destinationServiceNowResponseResult.getId();

      DestinationConfigOneOfFCMDestinationConfig fcmV1Config = new DestinationConfigOneOfFCMDestinationConfig.Builder()
              .clientEmail(fcmClientEmail)
              .privateKey(fcmPrivateKey)
              .projectId(fcmProjectID)
              .preProd(false)
              .build();

      DestinationConfig destinationFCMV1ConfigModel = new DestinationConfig.Builder()
              .params(fcmV1Config)
              .build();

      String fcmV1Name = "FCM_destination_v1";
      String fcmV1TypeVal = "push_android";
      String fcmV1Description = "Fcm Destination_v1";

      CreateDestinationOptions createFCMV1DestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(fcmV1Name)
              .type(fcmV1TypeVal)
              .description(fcmV1Description)
              .config(destinationFCMV1ConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> fcmV1Response = eventNotificationsService.createDestination(createFCMV1DestinationOptions).execute();
      // Validate response
      DestinationResponse destinationV1Response = fcmV1Response.getResult();
      destinationId12 = destinationV1Response.getId();

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
      Response<DestinationResponse> ceResponse = eventNotificationsService.createDestination(createCEDestinationOptions).execute();
      DestinationResponse destinationCEResponseResult = ceResponse.getResult();
      System.out.println(destinationCEResponseResult);
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
      Response<DestinationResponse> cosResponse = eventNotificationsService.createDestination(createCOSDestinationOptions).execute();
      DestinationResponse destinationCOSResponseResult = cosResponse.getResult();
      System.out.println(destinationCOSResponseResult);
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
      Response<DestinationResponse> huaweiResponse = eventNotificationsService.createDestination(createHuaweiDestinationOptions).execute();
      DestinationResponse destinationHuaweiResponseResult = huaweiResponse.getResult();
      System.out.println(destinationHuaweiResponseResult);
      destinationId15 = destinationHuaweiResponseResult.getId();

      DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationCustomConfigParamsModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
              .domain("abc.event-notifications.test.cloud.ibm.com").build();

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
      Response<DestinationResponse> customResponse = eventNotificationsService.createDestination(createCustomEmailDestinationOptions).execute();
      DestinationResponse destinationCustomResponseResult = customResponse.getResult();
      System.out.println(destinationCustomResponseResult);
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

      Response<DestinationResponse> customSMSResponse = eventNotificationsService.createDestination(createCustomSMSDestinationOptions).execute();
      DestinationResponse destinationCustomSMSResponseResult = customSMSResponse.getResult();
      System.out.println(destinationCustomSMSResponseResult);
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
      Response<DestinationResponse> ceJobResponse = eventNotificationsService.createDestination(createCEJobDestinationOptions).execute();
      DestinationResponse destinationCEJobResponseResult = ceJobResponse.getResult();
      destinationId18 = destinationCEJobResponseResult.getId();

      DestinationConfigOneOfSlackDirectMessageDestinationConfig slackDMDestinationConfig = new DestinationConfigOneOfSlackDirectMessageDestinationConfig.Builder()
              .token(slackDMToken)
              .type("direct_message")
              .build();

      DestinationConfig destinationSlackDMConfigModel = new DestinationConfig.Builder()
              .params(slackDMDestinationConfig)
              .build();

      String slackDMName = "Slack_DM_destination";
      String slackDMTypeVal = "slack";
      String slackDMDescription = "Slack DM Destination";

      CreateDestinationOptions createSlackDMDestinationOptions = new CreateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(slackDMName)
              .type(slackDMTypeVal)
              .description(slackDMDescription)
              .config(destinationSlackDMConfigModel)
              .build();

      // Invoke operation
      Response<DestinationResponse> slackDMResponse = eventNotificationsService.createDestination(createSlackDMDestinationOptions).execute();
      DestinationResponse slackDMDestinationResponseResult = slackDMResponse.getResult();
      destinationId19 = slackDMDestinationResponseResult.getId();

      // end-create_destination

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
      // end-list_destinations
      List<DestinationListItem> destinations = destinationList.getDestinations();

      for (int i = 0; i < destinations.size(); i++) {
        DestinationListItem destination = destinations.get(i);
        if (destination.getId() != destinationId && destination.getType().equals("smtp_ibm")) {
          destinationId2 = destination.getId();
          if (destinationId1 != "") {
            break;
          }
        }
        if (destination.getType().equals("sms_ibm")) {
          destinationId1 = destination.getId();
          if (destinationId2 != "") {
            break;
          }
        }
      }

      System.out.println(destinationList);
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
      System.out.println("getTemplate() result:");
      // begin-get_template
      GetTemplateOptions getTemplateOptions = new GetTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(templateInvitationID)
              .build();

      // Invoke operation
      Response<Template> response = eventNotificationsService.getTemplate(getTemplateOptions).execute();
      Template template = response.getResult();

      System.out.println(template);
      // end-get_template
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDestination() result:");
      // begin-update_destination

      DestinationConfigOneOfWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigOneOfWebhookDestinationConfig.Builder()
              .url("https://cloud.ibm.com/nhwebhook/sendwebhook")
              .verb("get")
              .customHeaders(new java.util.HashMap<String, String>() {
                {
                  put("authorization", "testString");
                }
              })
              .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("authorization")))
              .build();

      DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
              .params(destinationConfigParamsModel)
              .build();

      String webName = "Admin GCM Compliance";
      String webDescription = "This destination is for creating admin GCM webhook to receive compliance notifications";

      UpdateDestinationOptions updateWebhookDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId3)
              .name(webName)
              .description(webDescription)
              .config(destinationConfigModel)
              .certificate(new FileInputStream(new File("/path")))
              .certificateContentType("testString")
              .build();

      // Invoke operation
      Response<Destination> webhookResponse = eventNotificationsService.updateDestination(updateWebhookDestinationOptions).execute();

      Destination webhookDestinationResult = webhookResponse.getResult();
      System.out.println(webhookDestinationResult);

      DestinationConfigOneOfSlackDestinationConfig slackDestinationConfig = new DestinationConfigOneOfSlackDestinationConfig.Builder()
              .url("https://api.slack.com/myslack")
              .type("incoming_webhook")
              .build();

      DestinationConfig destinationSlackConfigModel = new DestinationConfig.Builder()
              .params(slackDestinationConfig)
              .build();

      String slackName = "Slack_destination";
      String slackDescription = "Slack Destination";

      UpdateDestinationOptions updateSlackDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId4)
              .name(slackName)
              .description(slackDescription)
              .config(destinationSlackConfigModel)
              .build();

      // Invoke operation
      Response<Destination> slackResponse = eventNotificationsService.updateDestination(updateSlackDestinationOptions).execute();
      Destination slackDestinationResponseResult = slackResponse.getResult();

      System.out.println(slackDestinationResponseResult);

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

      String name = "Safari_dest";
      String description = "This destination is for Safari";

      File file = new File(safariCertificatePath);
      InputStream stream = new FileInputStream(file);

      UpdateDestinationOptions updateSafariDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId5)
              .name(name)
              .description(description)
              .config(destinationsafariConfigModel)
              .certificate(stream)
              .certificateContentType("testString")
              .build();

      // Invoke operation
      Response<Destination> safariResponse = eventNotificationsService.updateDestination(updateSafariDestinationOptions).execute();
      Destination safariDestination = safariResponse.getResult();

      System.out.println(safariDestination);

      DestinationConfigOneOfMSTeamsDestinationConfig msTeamsDestinationConfig = new DestinationConfigOneOfMSTeamsDestinationConfig.Builder()
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
      Response<Destination> teamsResponse = eventNotificationsService.updateDestination(updateMsTeamsDestinationOptions).execute();

      Destination msTeamsDestinationResponseResult = teamsResponse.getResult();
      System.out.println(msTeamsDestinationResponseResult);

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

      Response<Destination> chromeResponse = eventNotificationsService.updateDestination(updateChromeDestinationOptions).execute();

      Destination chromeDestinationResult = chromeResponse.getResult();
      System.out.println(chromeDestinationResult);

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

      Response<Destination> fireFoxResponse = eventNotificationsService.updateDestination(updateFireFoxDestinationOptions).execute();
      Destination firefoxDestinationResult = fireFoxResponse.getResult();
      System.out.println(firefoxDestinationResult);

      DestinationConfigOneOfPagerDutyDestinationConfig pagerDutyDestinationConfig = new DestinationConfigOneOfPagerDutyDestinationConfig.Builder()
              .apiKey("insert apiKey here")
              .routingKey("insert routing key here")
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

      Response<Destination> pdResponse = eventNotificationsService.updateDestination(updatePDDestinationOptions).execute();
      Destination pdDestinationResult = pdResponse.getResult();
      System.out.println(pdDestinationResult);

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

      Response<Destination> sNowResponse = eventNotificationsService.updateDestination(updateServiceNowDestinationOptions).execute();
      Destination sNowDestinationResult = sNowResponse.getResult();
      System.out.println(sNowDestinationResult);

      DestinationConfigOneOfFCMDestinationConfig fcmV1Config = new DestinationConfigOneOfFCMDestinationConfig.Builder()
              .clientEmail(fcmClientEmail)
              .privateKey(fcmPrivateKey)
              .projectId(fcmProjectID)
              .build();

      DestinationConfig destinationFcmV1ConfigModel = new DestinationConfig.Builder()
              .params(fcmV1Config)
              .build();

      String fcmV1Name = "FCM destination v1 update";
      String fcmV1Description = "This is a Destination for FCM V1 update";

      UpdateDestinationOptions updateV1DestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId12)
              .name(fcmV1Name)
              .description(fcmV1Description)
              .config(destinationFcmV1ConfigModel)
              .build();

      Response<Destination> fcmV1Response = eventNotificationsService.updateDestination(updateV1DestinationOptions).execute();
      Destination fcmV1destination = fcmV1Response.getResult();

      System.out.println(fcmV1destination);

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
      Response<Destination> ceResponse = eventNotificationsService.updateDestination(updateCEDestinationOptions).execute();

      Destination ceDestinationResult = ceResponse.getResult();
      System.out.println(ceDestinationResult);

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
      Response<Destination> cosResponse = eventNotificationsService.updateDestination(updateCOSDestinationOptions).execute();
      Destination cosDestinationResult = cosResponse.getResult();
      System.out.println(cosDestinationResult);

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
      Response<Destination> huaweiResponse = eventNotificationsService.updateDestination(updateHuaweiDestinationOptions).execute();
      Destination huaweiDestinationResult = huaweiResponse.getResult();
      System.out.println(huaweiDestinationResult);

      DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationCustomConfigParamsModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
              .domain("apprapp.test.cloud.ibm.com")
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
      Response<Destination> customResponse = eventNotificationsService.updateDestination(updateCustomDestinationOptions).execute();
      Destination destinationCustomResult = customResponse.getResult();
      System.out.println(destinationCustomResult);

      UpdateVerifyDestinationOptions updateSpfVerifyDestinationOptionsModel = new UpdateVerifyDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId16)
              .type("spf")
              .build();

      // Invoke updateVerifyDestination() with a valid options model and verify the result
      Response<VerificationResponse> spfVerificationResponse = eventNotificationsService.updateVerifyDestination(updateSpfVerifyDestinationOptionsModel).execute();
      VerificationResponse spfResponseObj = spfVerificationResponse.getResult();
      System.out.println(spfResponseObj);

      UpdateVerifyDestinationOptions updateDkimVerifyDestinationOptionsModel = new UpdateVerifyDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId16)
              .type("dkim")
              .build();

      // Invoke updateVerifyDestination() with a valid options model and verify the result
      Response<VerificationResponse> dkimVerificationResponse = eventNotificationsService.updateVerifyDestination(updateDkimVerifyDestinationOptionsModel).execute();
      VerificationResponse dkimResponseObj = dkimVerificationResponse.getResult();
      System.out.println(dkimResponseObj);

      String customSMSName = "Custom SMS update";
      String customSMSDescription = "Custom SMS Destination update";

      UpdateDestinationOptions updateCustomSMSDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .name(customSMSName)
              .id(destinationId17)
              .collectFailedEvents(false)
              .description(customSMSDescription)
              .build();

      Response<Destination> customSMSResponse = eventNotificationsService.updateDestination(updateCustomSMSDestinationOptions).execute();
      Destination destinationCustomSMSResponseResult = customSMSResponse.getResult();
      System.out.println(destinationCustomSMSResponseResult);

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
      Response<Destination> ceJobResponse = eventNotificationsService.updateDestination(updateCEJobDestinationOptions).execute();
      Destination destinationCEJobResult = ceJobResponse.getResult();
      System.out.println(destinationCEJobResult);

      DestinationConfigOneOfSlackDirectMessageDestinationConfig slackDMDestinationConfig = new DestinationConfigOneOfSlackDirectMessageDestinationConfig.Builder()
              .token(slackDMToken)
              .type("direct_message")
              .build();

      DestinationConfig destinationSlackDMConfigModel = new DestinationConfig.Builder()
              .params(slackDMDestinationConfig)
              .build();

      String slackDMName = "Slack_DM_destination";
      String slackDMDescription = "Slack DM Destination";

      UpdateDestinationOptions updateSlackDMDestinationOptions = new UpdateDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId19)
              .name(slackDMName)
              .description(slackDMDescription)
              .config(destinationSlackDMConfigModel)
              .build();

      Response<Destination> slackDMResponse = eventNotificationsService.updateDestination(updateSlackDMDestinationOptions).execute();
      Destination slackDMDestinationResponseResult = slackDMResponse.getResult();
      System.out.println(slackDMDestinationResponseResult);

      // end-update_destination
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createTemplate() result:");
      // begin-create_template
      String name = "template name";
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

      Response<TemplateResponse> invitationResponse = eventNotificationsService.createTemplate(createTemplateInvitationOptions).execute();
      TemplateResponse invitationTemplateResult = invitationResponse.getResult();

      templateInvitationID = invitationTemplateResult.getId();

      CreateTemplateOptions createTemplateNotificationOptions = new CreateTemplateOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .description(description)
              .type("smtp_custom.notification")
              .params(templateConfig)
              .build();

      Response<TemplateResponse> notificationResponse = eventNotificationsService.createTemplate(createTemplateNotificationOptions).execute();
      TemplateResponse notificationTemplateResult = notificationResponse.getResult();

      templateNotificationID = notificationTemplateResult.getId();

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

      Response<TemplateResponse> slackTemplatenotificationResponse = eventNotificationsService.createTemplate(createSlackTemplateNotificationOptions).execute();
      TemplateResponse slackTemplateResult = slackTemplatenotificationResponse.getResult();
      slackTemplateID = slackTemplateResult.getId();

      TemplateConfigOneOfWebhookTemplateConfig webhookTemplateConfig = new TemplateConfigOneOfWebhookTemplateConfig.Builder()
              .body(slackTemplateBody)
              .build();

      name = "webhook template notification";
      CreateTemplateOptions createWebhookTemplateNotificationOptions = new CreateTemplateOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .description(description)
              .type("webhook.notification")
              .params(webhookTemplateConfig)
              .build();

      Response<TemplateResponse> webhookTemplatenotificationResponse = eventNotificationsService.createTemplate(createWebhookTemplateNotificationOptions).execute();
      TemplateResponse webhookTemplateResult = webhookTemplatenotificationResponse .getResult();
      webhookTemplateID = webhookTemplateResult.getId();
      // end-create_template
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSubscription() result:");
      // begin-create_subscription

      String name = "Android/IOS/Chrome/Firefox/Safari subscription";
      String description = "Subscription for Android/IOS/Chrome/Firefox/Safari";

      CreateSubscriptionOptions createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .destinationId(destinationId12)
              .topicId(topicId)
              .description(description)
              .build();

      Response<Subscription> response = eventNotificationsService.createSubscription(createSubscriptionOptions).execute();
      Subscription subscription = response.getResult();

      System.out.println(subscription);
      subscriptionId = subscription.getId();

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

      Response<Subscription> smsResponse = eventNotificationsService.createSubscription(createSubscriptionOptions).execute();
      Subscription smsSubscriptionResult = smsResponse.getResult();
      System.out.println(smsSubscriptionResult);
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

      String emailName = "subscription_email_update";
      String emailDescription = "Subscription email update";

      createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(emailName)
              .destinationId(destinationId2)
              .topicId(topicId)
              .attributes(subscriptionCreateEmailAttributesModel)
              .description(emailDescription)
              .build();

      Response<Subscription> emailResponse = eventNotificationsService.createSubscription(createSubscriptionOptions).execute();

      Subscription emailSubscription = emailResponse.getResult();
      System.out.println(emailSubscription);
      subscriptionId2 = emailSubscription.getId();

      SubscriptionCreateAttributesWebhookAttributes subscriptionCreateWebAttributesModel = new SubscriptionCreateAttributesWebhookAttributes.Builder()
              .signingEnabled(true)
              .templateIdNotification(webhookTemplateID)
              .build();
      String webName = "subscription_web";
      String webDescription = "Subscription for web";

      CreateSubscriptionOptions createWebSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(webName)
              .destinationId(destinationId3)
              .topicId(topicId)
              .description(webDescription)
              .attributes(subscriptionCreateWebAttributesModel)
              .build();

      // Invoke operation
      Response<Subscription> webResponse = eventNotificationsService.createSubscription(createWebSubscriptionOptions).execute();
      Subscription subscriptionResult = webResponse.getResult();
      subscriptionId3 = subscriptionResult.getId();

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

      Response<Subscription> sNowResponse = eventNotificationsService.createSubscription(createSNowSubscriptionOptions).execute();
      Subscription sNowSubscriptionResult = sNowResponse.getResult();
      subscriptionId4 = sNowSubscriptionResult.getId();

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

      Response<Subscription> slackResponse = eventNotificationsService.createSubscription(createSlackSubscriptionOptions).execute();

      Subscription slackSubscriptionResult = slackResponse.getResult();
      subscriptionId5 = slackSubscriptionResult.getId();

      ArrayList<String> customToMail = new ArrayList<String>();
      customToMail.add("xyz@ibm.com");
      customToMail.add("tester3@ibm.com");
      SubscriptionCreateAttributesCustomEmailAttributes subscriptionCreateCustomEmailAttributesModel = new SubscriptionCreateAttributesCustomEmailAttributes.Builder()
              .invited(customToMail)
              .addNotificationPayload(true)
              .replyToMail("abc@gmail.com")
              .replyToName("abc")
              .fromName("IBM")
              .templateIdInvitation(templateInvitationID)
              .templateIdNotification(templateNotificationID)
              .fromEmail("test@abc.event-notifications.test.cloud.ibm.com")
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

      Response<Subscription> customResponse = eventNotificationsService.createSubscription(createCustomSubscriptionOptions).execute();
      Subscription customSubscriptionResult = customResponse.getResult();
      subscriptionId6 = customSubscriptionResult.getId();

      ArrayList<String> customToNumber = new ArrayList<String>();
      customToNumber.add("+911234567890");
      customToNumber.add("+12267054625");
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

      Response<Subscription> customSMSResponse = eventNotificationsService.createSubscription(createCustomSMSSubscriptionOptions).execute();
      Subscription customSMSSubscriptionResult = customSMSResponse.getResult();
      subscriptionId7 = customSMSSubscriptionResult.getId();

      String slackDMName = "subscription_slack DM";
      String slackDMDescription = "Subscription for slack DM";

      ChannelCreateAttributes channel = new ChannelCreateAttributes.Builder()
              .id(slackChannelID)
              .build();

      List<ChannelCreateAttributes> channels = new ArrayList<>();
      channels.add(channel);

      SubscriptionCreateAttributesSlackDirectMessageAttributes slackDMCreateAttributes = new SubscriptionCreateAttributesSlackDirectMessageAttributes.Builder()
              .channels(channels)
              .templateIdNotification(slackTemplateID)
              .build();

      CreateSubscriptionOptions createSlackDMSubscriptionOptions = new CreateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(slackDMName)
              .destinationId(destinationId19)
              .topicId(topicId)
              .description(slackDMDescription)
              .attributes(slackDMCreateAttributes)
              .build();

      Response<Subscription> slackDMResponse = eventNotificationsService.createSubscription(createSlackDMSubscriptionOptions).execute();
      Subscription slackDMSubscriptionResult = slackDMResponse.getResult();
      subscriptionId8 = slackDMSubscriptionResult.getId();

      // end-create_subscription

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listTemplates() result:");
      // begin-list_templates
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        // begin-list_templates
        ListTemplatesOptions listTemplatesOptions = new ListTemplatesOptions.Builder()
                .instanceId(instanceId)
                .offset(offset)
                .limit(limit)
                .search(search)
                .build();

        // Invoke operation
        Response<TemplateList> response = eventNotificationsService.listTemplates(listTemplatesOptions).execute();
        // end-list_templates
        // Validate response
        TemplateList templateListResult = response.getResult();
        if (templateListResult.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
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
      System.out.println("updateTemplate() result:");
      // begin-replace_template
      String name = "template name update";
      String description = "template description update";

      TemplateConfigOneOfEmailTemplateConfig templateConfig = new TemplateConfigOneOfEmailTemplateConfig.Builder()
              .body(templateBody)
              .subject("Hi this is invitation for invitation message")
              .build();

      ReplaceTemplateOptions replaceTemplateInvitationOptions = new ReplaceTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(templateInvitationID)
              .name(name)
              .description(description)
              .type("smtp_custom.invitation")
              .params(templateConfig)
              .build();

      Response<Template> invitationResponse = eventNotificationsService.replaceTemplate(replaceTemplateInvitationOptions).execute();

      Template invitationTemplateResult = invitationResponse.getResult();
      System.out.println(invitationTemplateResult);

      ReplaceTemplateOptions replaceTemplateNotificationOptions = new ReplaceTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(templateNotificationID)
              .name(name)
              .description(description)
              .type("smtp_custom.notification")
              .params(templateConfig)
              .build();

      Response<Template> notificationResponse = eventNotificationsService.replaceTemplate(replaceTemplateNotificationOptions).execute();

      Template notificationTemplateResult = notificationResponse.getResult();
      System.out.println(notificationTemplateResult);

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

      Response<Template> slackTemplateResponse = eventNotificationsService.replaceTemplate(updateSlackTemplateOptions).execute();
      Template slackTemplateResult = slackTemplateResponse.getResult();

      TemplateConfigOneOfWebhookTemplateConfig webhookTemplateConfig = new TemplateConfigOneOfWebhookTemplateConfig.Builder()
              .body(webhookTemplateBody)
              .build();

      ReplaceTemplateOptions updateWebhookTemplateOptions = new ReplaceTemplateOptions.Builder()
              .instanceId(instanceId)
              .id(webhookTemplateID)
              .name(name)
              .description(description)
              .type("webhook.notification")
              .params(webhookTemplateConfig)
              .build();

      Response<Template> webhookTemplateResponse = eventNotificationsService.replaceTemplate(updateWebhookTemplateOptions).execute();
      Template webhookTemplateResult = webhookTemplateResponse.getResult();
      System.out.println(webhookTemplateResult);
      // end-replace_template
      System.out.println(slackTemplateResult);
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSubscription() result:");
      // begin-update_subscription

      String name = "Android/IOS/Chrome/Firefox/Safari_sub_updated";
      String description = "Update Android/IOS/Chrome/Firefox/Safari subscription";

      UpdateSubscriptionOptions updateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId)
              .name(name)
              .description(description)
              .build();

      Response<Subscription> response = eventNotificationsService.updateSubscription(updateSubscriptionOptions).execute();
      Subscription subscription = response.getResult();

      System.out.println(subscription);

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

      Response<Subscription> smsResponse = eventNotificationsService.updateSubscription(smsUpdateSubscriptionOptions).execute();
      Subscription smsSubscriptionResult = smsResponse.getResult();
      System.out.println(smsSubscriptionResult);

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

      name = "email subscription";
      description = "subscription_update for email";

      updateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(name)
              .id(subscriptionId2)
              .attributes(subscriptionUpdateEmailAttributesModel)
              .description(description)
              .build();

      response = eventNotificationsService.updateSubscription(updateSubscriptionOptions).execute();
      subscription = response.getResult();

      System.out.println(subscription);

      SubscriptionUpdateAttributesWebhookAttributes subscriptionUpdateWebAttributesModel = new SubscriptionUpdateAttributesWebhookAttributes.Builder()
              .signingEnabled(true)
              .templateIdNotification(webhookTemplateID)
              .build();

      String webName = "web_sub_updated";
      String webDescription = "Update web subscription";

      UpdateSubscriptionOptions webUpdateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId3)
              .name(webName)
              .description(webDescription)
              .attributes(subscriptionUpdateWebAttributesModel)
              .build();

      // Invoke operation
      Response<Subscription> webResponse = eventNotificationsService.updateSubscription(webUpdateSubscriptionOptions).execute();
      Subscription webSubscriptionResult = webResponse.getResult();
      System.out.println(webSubscriptionResult);

      String sNowName = "subscription_Service_Now_update";
      String sNowDescription = "Subscription Service Now update";

      SubscriptionUpdateAttributesServiceNowAttributes sNowAttributes = new SubscriptionUpdateAttributesServiceNowAttributes.Builder()
              .assignedTo("user")
              .assignmentGroup("group")
              .build();

      UpdateSubscriptionOptions updateSNowSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId4)
              .name(sNowName)
              .description(sNowDescription)
              .attributes(sNowAttributes)
              .build();

      // Invoke operation
      Response<Subscription> sNowResponse = eventNotificationsService.updateSubscription(updateSNowSubscriptionOptions).execute();
      Subscription sNowSubscriptionResult = sNowResponse.getResult();
      System.out.println(sNowSubscriptionResult);

      String slackName = "subscription_slack_update";
      String slackDescription = "Subscription slack update";
      SubscriptionUpdateAttributesSlackAttributes slackUpdateAttributes = new SubscriptionUpdateAttributesSlackAttributes.Builder()
              .attachmentColor("#0000FF")
              .templateIdNotification(slackTemplateID)
              .build();

      UpdateSubscriptionOptions updateSlackSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .id(subscriptionId5)
              .name(slackName)
              .description(slackDescription)
              .attributes(slackUpdateAttributes)
              .build();

      // Invoke operation
      Response<Subscription> slackResponse = eventNotificationsService.updateSubscription(updateSlackSubscriptionOptions).execute();
      Subscription slackSubscriptionResult = slackResponse.getResult();
      System.out.println(slackSubscriptionResult);

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
              .fromEmail("test@abc.event-notifications.test.cloud.ibm.com")
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
              .id(subscriptionId6)
              .attributes(subscriptionUpdateCustomEmailAttributesModel)
              .description(customEmailDescription)
              .build();

      Response<Subscription> customEmailResponse = eventNotificationsService.updateSubscription(customEmailUpdateSubscriptionOptions).execute();
      Subscription customEmailSubscriptionResult = customEmailResponse.getResult();
      System.out.println(customEmailSubscriptionResult);

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
              .id(subscriptionId7)
              .attributes(subscriptionUpdateCustomSMSAttributesModel)
              .description(customSMSDescription)
              .build();

      Response<Subscription> customSMSResponse = eventNotificationsService.updateSubscription(customSMSUpdateSubscriptionOptions).execute();
      Subscription customSMSSubscriptionResult = customSMSResponse.getResult();
      System.out.println(customSMSSubscriptionResult);

      String slackDMName = "subscription_slack DM";
      String slackDMDescription = "Subscription for slack DM";

      ChannelUpdateAttributes channel = new ChannelUpdateAttributes.Builder()
              .id(slackChannelID)
              .operation("add")
              .build();

      List<ChannelUpdateAttributes> channels = new ArrayList<>();
      channels.add(channel);

      SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes slackDMUpdateAttributes = new SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes.Builder()
              .channels(channels)
              .templateIdNotification(slackTemplateID)
              .build();

      UpdateSubscriptionOptions updateSlackDMSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
              .instanceId(instanceId)
              .name(slackDMName)
              .id(subscriptionId8)
              .description(slackDMDescription)
              .attributes(slackDMUpdateAttributes)
              .build();

      Response<Subscription> slackDMResponse = eventNotificationsService.updateSubscription(updateSlackDMSubscriptionOptions).execute();
      Subscription slackDMSubscriptionResult = slackDMResponse.getResult();
      System.out.println(slackDMSubscriptionResult);

      // end-update_subscription
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getEnabledCountries() result:");
      // begin-get_enabled_countries
      GetEnabledCountriesOptions getEnabledCountriesOptions = new GetEnabledCountriesOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId17)
              .build();

      // Invoke operation
      Response<EnabledCountriesResponse> response = eventNotificationsService.getEnabledCountries(getEnabledCountriesOptions).execute();
      EnabledCountriesResponse enabledCountriesResult = response.getResult();
      System.out.println(enabledCountriesResult);
      // end-get_enabled_countries
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("sendNotifications() result:");
      // begin-send_notifications
      String notificationDevices = "{\"platforms\":[\"push_ios\",\"push_android\",\"push_chrome\",\"push_firefox\", \"push_huawei\"]}";
      String fcmJsonString = "{\"message\": {\"android\": {\"notification\": {\"title\": \"Alert message\",\"body\": \"Bob wants to play Poker\"},\"data\": {\"name\": \"Willie Greenholt\",\"description\": \"notification for the Poker\"}}}}";
      String apnsJsonString = "{\"alert\": \"Game Request\", \"badge\": 5 }";
      String safariJsonString = "{\"aps\":{\"alert\":{\"title\":\"FlightA998NowBoarding\",\"body\":\"BoardinghasbegunforFlightA998.\",\"action\":\"View\"},\"url-args\":[\"boarding\",\"A998\"]}}";
      String huaweiJsonString = "{\"message\":{\"android\":{\"notification\":{\"title\":\"New Message\",\"body\":\"Hello World\",\"click_action\":{\"type\":3}}}}}";
      String mailTo = "[\"abc@ibm.com\", \"def@us.ibm.com\"]";
      String smsTo = "[\"+911234567890\", \"+911224567890\"]";
      String slackTo = "[\"C07FALXBH4G\"]";
      String mms = "{\"url\": \"https://cloud.ibm.com/avatar/v1/avatar/migrationsegment/logo_ibm.png\"}";
      String templates = "[\"149b0e11-8a7c-4fda-a847-5d79e01b71dc\"]";
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
              .ibmensubject("certificate expires")
              .ibmenmailto(mailTo)
              .ibmensmsto(smsTo)
              .ibmenslackto(slackTo)
              .ibmenmms(mms)
              .ibmentemplates(templates)
              .ibmenhtmlbody(htmlBody)
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

      Response<NotificationResponse> response = eventNotificationsService.sendNotifications(sendNotificationsOptions).execute();
      NotificationResponse notificationResponse = response.getResult();
      notificationID = notificationResponse.getNotificationId();

      System.out.println(notificationResponse);
      // end-send_notifications
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-metrics
      GetMetricsOptions getMetricsOptionsModel = new GetMetricsOptions.Builder()
                .instanceId(instanceId)
                .destinationType("smtp_custom")
                .gte("2024-08-01T17:18:43Z")
                .lte("2024-08-02T11:55:22Z")
                .destinationId(destinationId16)
                .emailTo("mobileb@us.ibm.com")
                .notificationId(notificationID)
                .subject("Metric Test")
                .build();

        // Invoke getMetrics() with a valid options model and verify the result
      Response<Metrics> response = eventNotificationsService.getMetrics(getMetricsOptionsModel).execute();

      Metrics responseObj = response.getResult();
      System.out.println(responseObj);
      // end-metrics
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_smtp_configuration
      String name = "SMTP Configuration";
      String description = "description for SMTP Configuration";
      String domain = "mailx.event-notifications.test.cloud.ibm.com";

      CreateSmtpConfigurationOptions createSMTPConfigurationOptions = new CreateSmtpConfigurationOptions.Builder()
              .instanceId(instanceId)
              .domain(domain)
              .name(name)
              .description(description)
              .build();

      Response<SMTPCreateResponse> response = eventNotificationsService.createSmtpConfiguration(createSMTPConfigurationOptions).execute();
      SMTPCreateResponse smtpCreateResponse = response.getResult();
      smtpConfigID = smtpCreateResponse.getId();
      System.out.println(smtpCreateResponse);
      // end-create_smtp_configuration
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_verify_smtp
      UpdateVerifySmtpOptions updateVerifySmtpOptions = new UpdateVerifySmtpOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .type("dkim,spf,en_authorization")
              .build();

      Response<SMTPVerificationUpdateResponse> response = eventNotificationsService.updateVerifySmtp(updateVerifySmtpOptions).execute();
      SMTPVerificationUpdateResponse updateVerifySmtpResponse = response.getResult();
      System.out.println(updateVerifySmtpResponse);
      // end-update_verify_smtp
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_smtp_user
      String description = "description for SMTP user";
      CreateSmtpUserOptions createSmtpUserOptionsModel = new CreateSmtpUserOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .description(description)
              .build();

      Response<SMTPUserResponse> response = eventNotificationsService.createSmtpUser(createSmtpUserOptionsModel).execute();
      SMTPUserResponse responseObj = response.getResult();
      smtpUserID = responseObj.getId();
      System.out.println(responseObj);
      // end-create_smtp_user
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        // begin-list_smtp_configurations
        ListSmtpConfigurationsOptions listSmtpConfigurationsOptionsModel = new ListSmtpConfigurationsOptions.Builder()
                .instanceId(instanceId)
                .limit(limit)
                .offset(offset)
                .search(search)
                .build();

        // Invoke listSmtpConfigurations() with a valid options model and verify the result
        Response<SMTPConfigurationsList> response = eventNotificationsService.listSmtpConfigurations(listSmtpConfigurationsOptionsModel).execute();

        SMTPConfigurationsList smtpConfigurationList = response.getResult();
        System.out.println(response);
        // end-list_smtp_configurations
        if (smtpConfigurationList.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      boolean moreResults = true;
      int limit = 1;
      int offset = 0;
      while (moreResults) {
        // begin-list_smtp_users
        ListSmtpUsersOptions listSmtpUsersOptionsModel = new ListSmtpUsersOptions.Builder()
                .instanceId(instanceId)
                .id(smtpConfigID)
                .limit(limit)
                .offset(offset)
                .search(search)
                .build();

        // Invoke listSmtpUsers() with a valid options model and verify the result
        Response<SMTPUsersList> response = eventNotificationsService.listSmtpUsers(listSmtpUsersOptionsModel).execute();
        SMTPUsersList smtpUsersList = response.getResult();
        System.out.println(response);
        // end-list_smtp_users
        if (smtpUsersList.getTotalCount() <= offset) {
          moreResults = false;
        }
        offset += 1;
      }
    }  catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_smtp_configuration
      GetSmtpConfigurationOptions getSmtpConfigurationOptionsModel = new GetSmtpConfigurationOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .build();

      Response<SMTPConfiguration> response = eventNotificationsService.getSmtpConfiguration(getSmtpConfigurationOptionsModel).execute();
      SMTPConfiguration responseObj = response.getResult();
      System.out.println(responseObj);
      // end-get_smtp_configuration
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_smtp_allowed_ips
      GetSmtpAllowedIpsOptions getSmtpAllowedIpsOptionsModel = new GetSmtpAllowedIpsOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .build();

      Response<SMTPAllowedIPs> response = eventNotificationsService.getSmtpAllowedIps(getSmtpAllowedIpsOptionsModel).execute();
      SMTPAllowedIPs responseObj = response.getResult();
      System.out.println(responseObj);
      // end-get_smtp_allowed_ips
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_smtp_user
      GetSmtpUserOptions getSmtpUserOptionsModel = new GetSmtpUserOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .userId(smtpUserID)
              .build();

      Response<SMTPUser> response = eventNotificationsService.getSmtpUser(getSmtpUserOptionsModel).execute();
      SMTPUser responseObj = response.getResult();
      System.out.println(responseObj);
      // end-get_smtp_user
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_smtp_configuration
      String name = "SMTP Configuration update";
      String description = "description for SMTP Configuration update";

      UpdateSmtpConfigurationOptions updateSmtpConfigurationOptionsModel = new UpdateSmtpConfigurationOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .name(name)
              .description(description)
              .build();

      Response<SMTPConfiguration> response = eventNotificationsService.updateSmtpConfiguration(updateSmtpConfigurationOptionsModel).execute();
      SMTPConfiguration responseObj = response.getResult();
      System.out.println(responseObj);
      // end-update_smtp_configuration
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_smtp_user
      String description = "description for SMTP user update";

      UpdateSmtpUserOptions updateSmtpUserOptionsModel = new UpdateSmtpUserOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .userId(smtpUserID)
              .description(description)
              .build();

      Response<SMTPUser> response = eventNotificationsService.updateSmtpUser(updateSmtpUserOptionsModel).execute();
      SMTPUser responseObj = response.getResult();
      System.out.println(responseObj);
      // end-update_smtp_user
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-test_destination
      TestDestinationOptions testDestinationOptionsModel = new TestDestinationOptions.Builder()
              .instanceId(instanceId)
              .id(destinationId4)
              .build();

      Response<TestDestinationResponse> response = eventNotificationsService.testDestination(testDestinationOptionsModel).execute();
      TestDestinationResponse testDestinationResponse = response.getResult();
      System.out.println(testDestinationResponse);
      // end-test_destination
      } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_smtp_user
      DeleteSmtpUserOptions deleteSmtpUserOptionsModel = new DeleteSmtpUserOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .userId(smtpUserID)
              .build();

      Response<Void> response = eventNotificationsService.deleteSmtpUser(deleteSmtpUserOptionsModel).execute();
      System.out.println(response);
      // end-delete_smtp_user
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_smtp_configuration
      DeleteSmtpConfigurationOptions deleteSmtpConfigurationOptionsModel = new DeleteSmtpConfigurationOptions.Builder()
              .instanceId(instanceId)
              .id(smtpConfigID)
              .build();

      Response<Void> response = eventNotificationsService.deleteSmtpConfiguration(deleteSmtpConfigurationOptionsModel).execute();
      System.out.println(response);
      // end-delete_smtp_configuration
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

      List<String> subscriptions = new ArrayList<>();
      subscriptions.add(subscriptionId2);
      subscriptions.add(subscriptionId1);
      subscriptions.add(subscriptionId3);
      subscriptions.add(subscriptionId4);
      subscriptions.add(subscriptionId5);
      subscriptions.add(subscriptionId6);
      subscriptions.add(subscriptionId7);
      subscriptions.add(subscriptionId8);

      for (String subscription : subscriptions) {
        deleteSubscriptionOptions = new DeleteSubscriptionOptions.Builder()
                .instanceId(instanceId)
                .id(subscription)
                .build();

        // Invoke operation
        response = eventNotificationsService.deleteSubscription(deleteSubscriptionOptions).execute();
        System.out.printf("deleteSubscription() response status code: %d%n", response.getStatusCode());
      }
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


      List<String> destinations = new ArrayList<>();
      destinations.add(destinationId3);
      destinations.add(destinationId4);
      destinations.add(destinationId5);
      destinations.add(destinationId6);
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
      destinations.add(destinationId19);
      for (String destination : destinations) {
        deleteDestinationOptions = new DeleteDestinationOptions.Builder()
                .instanceId(instanceId)
                .id(destination)
                .build();

        // Invoke operation
        response = eventNotificationsService.deleteDestination(deleteDestinationOptions).execute();
        System.out.printf("deleteDestination() response status code: %d%n", response.getStatusCode());
      }

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

    try {
      // begin-create_integrations
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

      Response<IntegrationCreateResponse> response = eventNotificationsService.createIntegration(integrationsOptions).execute();
      cosIntegrationID = response.getResult().getId();
      // end-create_integrations
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_integrations
      int limit = 1;
      int offset = 0;
      ListIntegrationsOptions integrationsOptions = new ListIntegrationsOptions.Builder()
              .instanceId(instanceId)
              .limit(Long.valueOf(limit))
              .offset(Long.valueOf(offset))
              .search(search)
              .build();

      // Invoke operation
      Response<IntegrationList> response = eventNotificationsService.listIntegrations(integrationsOptions).execute();
      integrationId = response.getResult().getIntegrations().get(0).getId();
      // end-list_integrations
      System.out.printf("listIntegrations() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_integration
      GetIntegrationOptions integrationsOptions = new GetIntegrationOptions.Builder()
              .instanceId(instanceId)
              .id(integrationId)
              .build();

      // Invoke operation
      Response<IntegrationGetResponse> response = eventNotificationsService.getIntegration(integrationsOptions).execute();
      // end-get_integration
      System.out.printf("getIntegrations() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_integration
      IntegrationMetadata metadata = new IntegrationMetadata.Builder()
              .endpoint("https://private.us-south.kms.cloud.ibm.com")
              .crn("insert crn")
              .rootKeyId("insert root key id")
              .build();

      ReplaceIntegrationOptions integrationsOptions = new ReplaceIntegrationOptions.Builder()
              .instanceId(instanceId)
              .id(integrationId)
              .type("kms/hs-crypto")
              .metadata(metadata)
              .build();

      // Invoke operation
      Response<IntegrationGetResponse> response = eventNotificationsService.replaceIntegration(integrationsOptions).execute();

      // COS Integration
      IntegrationMetadata cosMetadata = new IntegrationMetadata.Builder()
              .endpoint(cosEndPoint)
              .crn(cosInstanceCRN)
              .bucketName(cosBucketName)
              .build();

      ReplaceIntegrationOptions cfeIntegrationsOptions = new ReplaceIntegrationOptions.Builder()
              .instanceId(instanceId)
              .id(cosIntegrationID)
              .type("collect_failed_events")
              .metadata(cosMetadata)
              .build();

      // Invoke operation
      Response<IntegrationGetResponse> cfeResponse = eventNotificationsService.replaceIntegration(cfeIntegrationsOptions).execute();
      // end-replace_integration
      System.out.printf("updateIntegration() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      List<String> templates = new ArrayList<>();
      templates.add(templateInvitationID);
      templates.add(templateNotificationID);
      templates.add(slackTemplateID);
      templates.add(webhookTemplateID);

      for (String template : templates) {
        // begin-delete_template
        DeleteTemplateOptions deleteTemplateOptions = new DeleteTemplateOptions.Builder()
                .instanceId(instanceId)
                .id(template)
                .build();

        // Invoke operation
        Response<Void> response = eventNotificationsService.deleteTemplate(deleteTemplateOptions).execute();
        // end-delete_template
        System.out.printf("deleteTemplate() response status code: %d%n", response.getStatusCode());
      }
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);

    }
  }
}
