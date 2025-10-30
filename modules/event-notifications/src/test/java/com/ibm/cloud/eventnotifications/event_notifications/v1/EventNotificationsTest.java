/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Buckets;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ChannelCreateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ChannelUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DKIMAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DeleteTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Destination;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOf;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfAppConfigurationDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfChromeDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfCodeEngineDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfCustomDomainEmailDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfEventStreamsDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfFCMDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfFirefoxDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfHuaweiDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfIOSDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfMSTeamsDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfPagerDutyDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfSafariDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfServiceNowDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfSlackDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfSlackDirectMessageDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfWebhookDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationTagsSubscriptionResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ENAuthAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailAttributesResponseInvitedItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailAttributesResponseSubscribedUnsubscribedItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EnabledCountriesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EventScheduleFilterAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetEnabledCountriesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetMetricsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetNotificationStatusResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetNotificationStatusResponseDetails;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetNotificationsStatusOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetPreDefinedTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetPredefinedTemplate;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSmtpAllowedIpsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Histrogram;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationCreateMetadata;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationCreateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationGetResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationMetadata;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListDestinationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListIntegrationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListPreDefinedTemplatesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSmtpConfigurationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSmtpUsersOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSourcesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListSubscriptionsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTagsSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTemplatesOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ListTopicsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Metric;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Metrics;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationCreate;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PageHrefResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PreDefinedTemplatesPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PredefinedTemplate;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PredefinedTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PredefinedTemplatesList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceIntegrationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTemplateOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Rules;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.RulesGet;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMSAttributesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMSCountryConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMSInviteAttributesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPAllowedIPs;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfiguration;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfigurationsList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPCreateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPDKIMAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPUser;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPUserResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPUsersList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPVerificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPVerificationUpdateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SPFAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SmtpConfigurationsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SmtpUsersPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Source;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourceResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesListItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Subscription;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesAppConfigurationAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesCodeEngineAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesCustomEmailAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesCustomSMSAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesEmailAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesEventStreamsAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesPagerDutyAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesSMSAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesServiceNowAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesSlackAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesSlackDirectMessageAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionAttributesWebhookAttributesResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesAppConfigurationAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesCodeEngineAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesCustomEmailAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesCustomSMSAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesEmailAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesEventstreamsAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesFCMAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesPagerDutyAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesSMSAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesServiceNowAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesSlackAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesSlackDirectMessageAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesWebhookAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesAppConfigurationAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesCodeEngineAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesCustomEmailUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesCustomSMSUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesEmailUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesEventstreamsAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesPagerDutyAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSMSUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesServiceNowAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSlackAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesWebhookAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TagsSubscriptionPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Template;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOf;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfAppConfigurationTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfCodeEngineApplicationTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfCodeEngineJobTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfEmailTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfEventStreamsTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfPagerdutyTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfSlackTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfigOneOfWebhookTemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplatesPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TestDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TestDestinationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TestDestinationResponseDestinationTestResponseConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TestDestinationResponseWebhookDestinationTestResponseConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Topic;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicsListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicsPager;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesInvited;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesSubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesUnsubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSmtpConfigurationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSmtpUserOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSourceOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateVerifyDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateVerifySmtpOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.VerificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EventNotifications service.
 */
public class EventNotificationsTest {

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

  // Test the getMetrics operation with a valid options model parameter
  @Test
  public void testGetMetricsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"metrics\": [{\"key\": \"bounced\", \"doc_count\": 8, \"histogram\": {\"buckets\": [{\"doc_count\": 8, \"key_as_string\": \"2019-01-01T12:00:00.000Z\"}]}}]}";
    String getMetricsPath = "/v1/instances/testString/metrics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMetricsOptions model
    GetMetricsOptions getMetricsOptionsModel = new GetMetricsOptions.Builder()
      .instanceId("testString")
      .destinationType("smtp_custom")
      .gte("testString")
      .lte("testString")
      .destinationId("testString")
      .sourceId("testString")
      .emailTo("testString")
      .notificationId("testString")
      .subject("testString")
      .build();

    // Invoke getMetrics() with a valid options model and verify the result
    Response<Metrics> response = eventNotificationsService.getMetrics(getMetricsOptionsModel).execute();
    assertNotNull(response);
    Metrics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMetricsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("destination_type"), "smtp_custom");
    assertEquals(query.get("gte"), "testString");
    assertEquals(query.get("lte"), "testString");
    assertEquals(query.get("destination_id"), "testString");
    assertEquals(query.get("source_id"), "testString");
    assertEquals(query.get("email_to"), "testString");
    assertEquals(query.get("notification_id"), "testString");
    assertEquals(query.get("subject"), "testString");
  }

  // Test the getMetrics operation with and without retries enabled
  @Test
  public void testGetMetricsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetMetricsWOptions();

    eventNotificationsService.disableRetries();
    testGetMetricsWOptions();
  }

  // Test the getMetrics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMetricsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getMetrics(null).execute();
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
      .ibmensubject("testString")
      .ibmentemplates("testString")
      .ibmenmailto("testString")
      .ibmenslackto("testString")
      .ibmensmstext("testString")
      .ibmensmsto("testString")
      .ibmenhtmlbody("testString")
      .subject("testString")
      .ibmenmms("testString")
      .ibmenmarkdown("testString")
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .datacontenttype("application/json")
      .ibmenpushto("{\"platforms\":[\"push_android\", \"push_ios\", \"push_firefox\", \"push_chrome\", \"push_safari\", \"push_huawei\"]}")
      .ibmenfcmbody("testString")
      .ibmenapnsbody("testString")
      .ibmenapnsheaders("testString")
      .ibmenchromebody("testString")
      .ibmenchromeheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmenfirefoxbody("testString")
      .ibmenfirefoxheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmenhuaweibody("testString")
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

    // Construct an instance of the EventScheduleFilterAttributes model
    EventScheduleFilterAttributes eventScheduleFilterAttributesModel = new EventScheduleFilterAttributes.Builder()
      .startsAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .endsAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .expression("testString")
      .build();

    // Construct an instance of the Rules model
    Rules rulesModel = new Rules.Builder()
      .enabled(true)
      .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
      .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
      .eventScheduleFilter(eventScheduleFilterAttributesModel)
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
    String mockResponseBody = "{\"id\": \"id\", \"description\": \"description\", \"name\": \"name\", \"updated_at\": \"updatedAt\", \"source_count\": 11, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"rules\": [{\"enabled\": false, \"event_type_filter\": \"$.*\", \"notification_filter\": \"notificationFilter\", \"event_schedule_filter\": {\"starts_at\": \"2019-01-01T12:00:00.000Z\", \"ends_at\": \"2019-01-01T12:00:00.000Z\", \"expression\": \"expression\"}, \"updated_at\": \"updatedAt\", \"id\": \"id\"}]}], \"subscription_count\": 17, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
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
    String mockResponseBody = "{\"id\": \"id\", \"description\": \"description\", \"name\": \"name\", \"updated_at\": \"updatedAt\", \"source_count\": 11, \"sources\": [{\"id\": \"id\", \"name\": \"name\", \"rules\": [{\"enabled\": false, \"event_type_filter\": \"$.*\", \"notification_filter\": \"notificationFilter\", \"event_schedule_filter\": {\"starts_at\": \"2019-01-01T12:00:00.000Z\", \"ends_at\": \"2019-01-01T12:00:00.000Z\", \"expression\": \"expression\"}, \"updated_at\": \"updatedAt\", \"id\": \"id\"}]}], \"subscription_count\": 17, \"subscriptions\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"destination_id\": \"destinationId\", \"destination_name\": \"destinationName\", \"destination_type\": \"sms_ibm\", \"topic_id\": \"topicId\", \"topic_name\": \"topicName\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String replaceTopicPath = "/v1/instances/testString/topics/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EventScheduleFilterAttributes model
    EventScheduleFilterAttributes eventScheduleFilterAttributesModel = new EventScheduleFilterAttributes.Builder()
      .startsAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .endsAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .expression("testString")
      .build();

    // Construct an instance of the Rules model
    Rules rulesModel = new Rules.Builder()
      .enabled(true)
      .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
      .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
      .eventScheduleFilter(eventScheduleFilterAttributesModel)
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

  // Test the createTemplate operation with a valid options model parameter
  @Test
  public void testCreateTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"params\": {\"body\": \"body\", \"subject\": \"subject\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTemplatePath = "/v1/instances/testString/templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the TemplateConfigOneOfEmailTemplateConfig model
    TemplateConfigOneOfEmailTemplateConfig templateConfigOneOfModel = new TemplateConfigOneOfEmailTemplateConfig.Builder()
      .body("testString")
      .subject("testString")
      .build();

    // Construct an instance of the CreateTemplateOptions model
    CreateTemplateOptions createTemplateOptionsModel = new CreateTemplateOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .type("testString")
      .params(templateConfigOneOfModel)
      .description("testString")
      .build();

    // Invoke createTemplate() with a valid options model and verify the result
    Response<TemplateResponse> response = eventNotificationsService.createTemplate(createTemplateOptionsModel).execute();
    assertNotNull(response);
    TemplateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createTemplate operation with and without retries enabled
  @Test
  public void testCreateTemplateWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateTemplateWOptions();

    eventNotificationsService.disableRetries();
    testCreateTemplateWOptions();
  }

  // Test the createTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createTemplate(null).execute();
  }

  // Test the listTemplates operation with a valid options model parameter
  @Test
  public void testListTemplatesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"templates\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"subscription_count\": 17, \"subscription_names\": [\"subscriptionNames\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listTemplatesPath = "/v1/instances/testString/templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTemplatesOptions model
    ListTemplatesOptions listTemplatesOptionsModel = new ListTemplatesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listTemplates() with a valid options model and verify the result
    Response<TemplateList> response = eventNotificationsService.listTemplates(listTemplatesOptionsModel).execute();
    assertNotNull(response);
    TemplateList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTemplatesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listTemplates operation with and without retries enabled
  @Test
  public void testListTemplatesWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListTemplatesWOptions();

    eventNotificationsService.disableRetries();
    testListTemplatesWOptions();
  }

  // Test the listTemplates operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTemplatesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listTemplates(null).execute();
  }

  // Test the listTemplates operation using the TemplatesPager.getNext() method
  @Test
  public void testListTemplatesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
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

    ListTemplatesOptions listTemplatesOptions = new ListTemplatesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<Template> allResults = new ArrayList<>();
    TemplatesPager pager = new TemplatesPager(eventNotificationsService, listTemplatesOptions);
    while (pager.hasNext()) {
      List<Template> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listTemplates operation using the TemplatesPager.getAll() method
  @Test
  public void testListTemplatesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"type\",\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
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

    ListTemplatesOptions listTemplatesOptions = new ListTemplatesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    TemplatesPager pager = new TemplatesPager(eventNotificationsService, listTemplatesOptions);
    List<Template> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getTemplate operation with a valid options model parameter
  @Test
  public void testGetTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"subscription_count\": 17, \"subscription_names\": [\"subscriptionNames\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTemplatePath = "/v1/instances/testString/templates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTemplateOptions model
    GetTemplateOptions getTemplateOptionsModel = new GetTemplateOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getTemplate() with a valid options model and verify the result
    Response<Template> response = eventNotificationsService.getTemplate(getTemplateOptionsModel).execute();
    assertNotNull(response);
    Template responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getTemplate operation with and without retries enabled
  @Test
  public void testGetTemplateWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetTemplateWOptions();

    eventNotificationsService.disableRetries();
    testGetTemplateWOptions();
  }

  // Test the getTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getTemplate(null).execute();
  }

  // Test the replaceTemplate operation with a valid options model parameter
  @Test
  public void testReplaceTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"subscription_count\": 17, \"subscription_names\": [\"subscriptionNames\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String replaceTemplatePath = "/v1/instances/testString/templates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TemplateConfigOneOfEmailTemplateConfig model
    TemplateConfigOneOfEmailTemplateConfig templateConfigOneOfModel = new TemplateConfigOneOfEmailTemplateConfig.Builder()
      .body("testString")
      .subject("testString")
      .build();

    // Construct an instance of the ReplaceTemplateOptions model
    ReplaceTemplateOptions replaceTemplateOptionsModel = new ReplaceTemplateOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .type("testString")
      .params(templateConfigOneOfModel)
      .build();

    // Invoke replaceTemplate() with a valid options model and verify the result
    Response<Template> response = eventNotificationsService.replaceTemplate(replaceTemplateOptionsModel).execute();
    assertNotNull(response);
    Template responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceTemplate operation with and without retries enabled
  @Test
  public void testReplaceTemplateWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testReplaceTemplateWOptions();

    eventNotificationsService.disableRetries();
    testReplaceTemplateWOptions();
  }

  // Test the replaceTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.replaceTemplate(null).execute();
  }

  // Test the deleteTemplate operation with a valid options model parameter
  @Test
  public void testDeleteTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTemplatePath = "/v1/instances/testString/templates/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTemplateOptions model
    DeleteTemplateOptions deleteTemplateOptionsModel = new DeleteTemplateOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke deleteTemplate() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteTemplate(deleteTemplateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteTemplate operation with and without retries enabled
  @Test
  public void testDeleteTemplateWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteTemplateWOptions();

    eventNotificationsService.disableRetries();
    testDeleteTemplateWOptions();
  }

  // Test the deleteTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteTemplate(null).execute();
  }

  // Test the listPreDefinedTemplates operation with a valid options model parameter
  @Test
  public void testListPreDefinedTemplatesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"templates\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"source\": \"source\", \"type\": \"type\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listPreDefinedTemplatesPath = "/v1/instances/testString/pre_defined_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPreDefinedTemplatesOptions model
    ListPreDefinedTemplatesOptions listPreDefinedTemplatesOptionsModel = new ListPreDefinedTemplatesOptions.Builder()
      .instanceId("testString")
      .source("testString")
      .type("testString")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listPreDefinedTemplates() with a valid options model and verify the result
    Response<PredefinedTemplatesList> response = eventNotificationsService.listPreDefinedTemplates(listPreDefinedTemplatesOptionsModel).execute();
    assertNotNull(response);
    PredefinedTemplatesList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPreDefinedTemplatesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("source"), "testString");
    assertEquals(query.get("type"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listPreDefinedTemplates operation with and without retries enabled
  @Test
  public void testListPreDefinedTemplatesWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListPreDefinedTemplatesWOptions();

    eventNotificationsService.disableRetries();
    testListPreDefinedTemplatesWOptions();
  }

  // Test the listPreDefinedTemplates operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPreDefinedTemplatesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listPreDefinedTemplates(null).execute();
  }

  // Test the listPreDefinedTemplates operation using the PreDefinedTemplatesPager.getNext() method
  @Test
  public void testListPreDefinedTemplatesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source\":\"source\",\"type\":\"type\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source\":\"source\",\"type\":\"type\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
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

    ListPreDefinedTemplatesOptions listPreDefinedTemplatesOptions = new ListPreDefinedTemplatesOptions.Builder()
      .instanceId("testString")
      .source("testString")
      .type("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<PredefinedTemplate> allResults = new ArrayList<>();
    PreDefinedTemplatesPager pager = new PreDefinedTemplatesPager(eventNotificationsService, listPreDefinedTemplatesOptions);
    while (pager.hasNext()) {
      List<PredefinedTemplate> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listPreDefinedTemplates operation using the PreDefinedTemplatesPager.getAll() method
  @Test
  public void testListPreDefinedTemplatesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source\":\"source\",\"type\":\"type\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"templates\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"source\":\"source\",\"type\":\"type\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
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

    ListPreDefinedTemplatesOptions listPreDefinedTemplatesOptions = new ListPreDefinedTemplatesOptions.Builder()
      .instanceId("testString")
      .source("testString")
      .type("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    PreDefinedTemplatesPager pager = new PreDefinedTemplatesPager(eventNotificationsService, listPreDefinedTemplatesOptions);
    List<PredefinedTemplate> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getPreDefinedTemplate operation with a valid options model parameter
  @Test
  public void testGetPreDefinedTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"source\": \"source\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"params\": {\"body\": \"body\"}}";
    String getPreDefinedTemplatePath = "/v1/instances/testString/pre_defined_templates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPreDefinedTemplateOptions model
    GetPreDefinedTemplateOptions getPreDefinedTemplateOptionsModel = new GetPreDefinedTemplateOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getPreDefinedTemplate() with a valid options model and verify the result
    Response<GetPredefinedTemplate> response = eventNotificationsService.getPreDefinedTemplate(getPreDefinedTemplateOptionsModel).execute();
    assertNotNull(response);
    GetPredefinedTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPreDefinedTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPreDefinedTemplate operation with and without retries enabled
  @Test
  public void testGetPreDefinedTemplateWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetPreDefinedTemplateWOptions();

    eventNotificationsService.disableRetries();
    testGetPreDefinedTemplateWOptions();
  }

  // Test the getPreDefinedTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPreDefinedTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getPreDefinedTemplate(null).execute();
  }

  // Test the createDestination operation with a valid options model parameter
  @Test
  public void testCreateDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"collect_failed_events\": false, \"config\": {\"params\": {\"domain\": \"domain\", \"dkim\": {\"public_key\": \"publicKey\", \"selector\": \"selector\", \"verification\": \"verification\"}, \"spf\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}}}, \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createDestinationPath = "/v1/instances/testString/destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DKIMAttributes model
    DKIMAttributes dkimAttributesModel = new DKIMAttributes.Builder()
      .publicKey("testString")
      .selector("testString")
      .verification("testString")
      .build();

    // Construct an instance of the SPFAttributes model
    SPFAttributes spfAttributesModel = new SPFAttributes.Builder()
      .txtName("testString")
      .txtValue("testString")
      .verification("testString")
      .build();

    // Construct an instance of the DestinationConfigOneOfCustomDomainEmailDestinationConfig model
    DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationConfigOneOfModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
      .domain("testString")
      .dkim(dkimAttributesModel)
      .spf(spfAttributesModel)
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
      .collectFailedEvents(false)
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
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"destinations\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"collect_failed_events\": false, \"subscription_count\": 17, \"subscription_names\": [\"subscriptionNames\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
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
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"collect_failed_events\":false,\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"collect_failed_events\":false,\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
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
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"collect_failed_events\":false,\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"destinations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"type\":\"webhook\",\"collect_failed_events\":false,\"subscription_count\":17,\"subscription_names\":[\"subscriptionNames\"],\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"limit\":1}";
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
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"collect_failed_events\": false, \"config\": {\"params\": {\"domain\": \"domain\", \"dkim\": {\"public_key\": \"publicKey\", \"selector\": \"selector\", \"verification\": \"verification\"}, \"spf\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"subscription_count\": 0, \"subscription_names\": [\"subscriptionNames\"]}";
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
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"type\": \"webhook\", \"collect_failed_events\": false, \"config\": {\"params\": {\"domain\": \"domain\", \"dkim\": {\"public_key\": \"publicKey\", \"selector\": \"selector\", \"verification\": \"verification\"}, \"spf\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"subscription_count\": 0, \"subscription_names\": [\"subscriptionNames\"]}";
    String updateDestinationPath = "/v1/instances/testString/destinations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DKIMAttributes model
    DKIMAttributes dkimAttributesModel = new DKIMAttributes.Builder()
      .publicKey("testString")
      .selector("testString")
      .verification("testString")
      .build();

    // Construct an instance of the SPFAttributes model
    SPFAttributes spfAttributesModel = new SPFAttributes.Builder()
      .txtName("testString")
      .txtValue("testString")
      .verification("testString")
      .build();

    // Construct an instance of the DestinationConfigOneOfCustomDomainEmailDestinationConfig model
    DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationConfigOneOfModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
      .domain("testString")
      .dkim(dkimAttributesModel)
      .spf(spfAttributesModel)
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
      .collectFailedEvents(false)
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

  // Test the getEnabledCountries operation with a valid options model parameter
  @Test
  public void testGetEnabledCountriesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"status\", \"enabled_countries\": [{\"number\": \"number\", \"country\": [\"country\"]}]}";
    String getEnabledCountriesPath = "/v1/instances/testString/destinations/testString/enabled_countries";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEnabledCountriesOptions model
    GetEnabledCountriesOptions getEnabledCountriesOptionsModel = new GetEnabledCountriesOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getEnabledCountries() with a valid options model and verify the result
    Response<EnabledCountriesResponse> response = eventNotificationsService.getEnabledCountries(getEnabledCountriesOptionsModel).execute();
    assertNotNull(response);
    EnabledCountriesResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEnabledCountriesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getEnabledCountries operation with and without retries enabled
  @Test
  public void testGetEnabledCountriesWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetEnabledCountriesWOptions();

    eventNotificationsService.disableRetries();
    testGetEnabledCountriesWOptions();
  }

  // Test the getEnabledCountries operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEnabledCountriesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getEnabledCountries(null).execute();
  }

  // Test the testDestination operation with a valid options model parameter
  @Test
  public void testTestDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"accepted\", \"notification_id\": \"notificationId\", \"destination_type\": \"webhook\"}";
    String testDestinationPath = "/v1/instances/testString/destinations/testString/test";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the TestDestinationOptions model
    TestDestinationOptions testDestinationOptionsModel = new TestDestinationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke testDestination() with a valid options model and verify the result
    Response<TestDestinationResponse> response = eventNotificationsService.testDestination(testDestinationOptionsModel).execute();
    assertNotNull(response);
    TestDestinationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, testDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the testDestination operation with and without retries enabled
  @Test
  public void testTestDestinationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testTestDestinationWOptions();

    eventNotificationsService.disableRetries();
    testTestDestinationWOptions();
  }

  // Test the testDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTestDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.testDestination(null).execute();
  }

  // Test the updateVerifyDestination operation with a valid options model parameter
  @Test
  public void testUpdateVerifyDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"type\", \"verification\": \"verification\"}";
    String updateVerifyDestinationPath = "/v1/instances/testString/destinations/testString/verify";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateVerifyDestinationOptions model
    UpdateVerifyDestinationOptions updateVerifyDestinationOptionsModel = new UpdateVerifyDestinationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .type("testString")
      .build();

    // Invoke updateVerifyDestination() with a valid options model and verify the result
    Response<VerificationResponse> response = eventNotificationsService.updateVerifyDestination(updateVerifyDestinationOptionsModel).execute();
    assertNotNull(response);
    VerificationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVerifyDestinationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("type"), "testString");
  }

  // Test the updateVerifyDestination operation with and without retries enabled
  @Test
  public void testUpdateVerifyDestinationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testUpdateVerifyDestinationWOptions();

    eventNotificationsService.disableRetries();
    testUpdateVerifyDestinationWOptions();
  }

  // Test the updateVerifyDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVerifyDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.updateVerifyDestination(null).execute();
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

  // Test the createIntegration operation with a valid options model parameter
  @Test
  public void testCreateIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"type\": \"type\", \"metadata\": {\"endpoint\": \"endpoint\", \"crn\": \"crn\", \"bucket_name\": \"bucketName\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createIntegrationPath = "/v1/instances/testString/integrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the IntegrationCreateMetadata model
    IntegrationCreateMetadata integrationCreateMetadataModel = new IntegrationCreateMetadata.Builder()
      .endpoint("testString")
      .crn("testString")
      .bucketName("testString")
      .build();

    // Construct an instance of the CreateIntegrationOptions model
    CreateIntegrationOptions createIntegrationOptionsModel = new CreateIntegrationOptions.Builder()
      .instanceId("testString")
      .type("collect_failed_events")
      .metadata(integrationCreateMetadataModel)
      .build();

    // Invoke createIntegration() with a valid options model and verify the result
    Response<IntegrationCreateResponse> response = eventNotificationsService.createIntegration(createIntegrationOptionsModel).execute();
    assertNotNull(response);
    IntegrationCreateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createIntegration operation with and without retries enabled
  @Test
  public void testCreateIntegrationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateIntegrationWOptions();

    eventNotificationsService.disableRetries();
    testCreateIntegrationWOptions();
  }

  // Test the createIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createIntegration(null).execute();
  }

  // Test the listIntegrations operation with a valid options model parameter
  @Test
  public void testListIntegrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 0, \"offset\": 6, \"limit\": 5, \"integrations\": [{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"type\": \"type\", \"metadata\": {\"endpoint\": \"endpoint\", \"crn\": \"crn\", \"root_key_id\": \"rootKeyId\", \"bucket_name\": \"bucketName\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
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
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\",\"bucket_name\":\"bucketName\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\",\"bucket_name\":\"bucketName\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
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
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\",\"bucket_name\":\"bucketName\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"integrations\":[{\"id\":\"9fab83da-98cb-4f18-a7ba-b6f0435c9673\",\"type\":\"type\",\"metadata\":{\"endpoint\":\"endpoint\",\"crn\":\"crn\",\"root_key_id\":\"rootKeyId\",\"bucket_name\":\"bucketName\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
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
    String mockResponseBody = "{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"type\": \"type\", \"metadata\": {\"endpoint\": \"endpoint\", \"crn\": \"crn\", \"root_key_id\": \"rootKeyId\", \"bucket_name\": \"bucketName\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
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
    String mockResponseBody = "{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"type\": \"type\", \"metadata\": {\"endpoint\": \"endpoint\", \"crn\": \"crn\", \"root_key_id\": \"rootKeyId\", \"bucket_name\": \"bucketName\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
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
      .bucketName("testString")
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

  // Test the createSmtpConfiguration operation with a valid options model parameter
  @Test
  public void testCreateSmtpConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"domain\": \"domain\", \"config\": {\"dkim\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}, \"en_authorization\": {\"verification\": \"verification\"}, \"spf\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}}, \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createSmtpConfigurationPath = "/v1/instances/testString/smtp/config";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSmtpConfigurationOptions model
    CreateSmtpConfigurationOptions createSmtpConfigurationOptionsModel = new CreateSmtpConfigurationOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .domain("testString")
      .description("testString")
      .build();

    // Invoke createSmtpConfiguration() with a valid options model and verify the result
    Response<SMTPCreateResponse> response = eventNotificationsService.createSmtpConfiguration(createSmtpConfigurationOptionsModel).execute();
    assertNotNull(response);
    SMTPCreateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSmtpConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSmtpConfiguration operation with and without retries enabled
  @Test
  public void testCreateSmtpConfigurationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateSmtpConfigurationWOptions();

    eventNotificationsService.disableRetries();
    testCreateSmtpConfigurationWOptions();
  }

  // Test the createSmtpConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSmtpConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createSmtpConfiguration(null).execute();
  }

  // Test the listSmtpConfigurations operation with a valid options model parameter
  @Test
  public void testListSmtpConfigurationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"smtp_configurations\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"domain\": \"domain\", \"config\": {\"dkim\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}, \"en_authorization\": {\"verification\": \"verification\"}, \"spf\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listSmtpConfigurationsPath = "/v1/instances/testString/smtp/config";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSmtpConfigurationsOptions model
    ListSmtpConfigurationsOptions listSmtpConfigurationsOptionsModel = new ListSmtpConfigurationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listSmtpConfigurations() with a valid options model and verify the result
    Response<SMTPConfigurationsList> response = eventNotificationsService.listSmtpConfigurations(listSmtpConfigurationsOptionsModel).execute();
    assertNotNull(response);
    SMTPConfigurationsList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSmtpConfigurationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listSmtpConfigurations operation with and without retries enabled
  @Test
  public void testListSmtpConfigurationsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListSmtpConfigurationsWOptions();

    eventNotificationsService.disableRetries();
    testListSmtpConfigurationsWOptions();
  }

  // Test the listSmtpConfigurations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSmtpConfigurationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listSmtpConfigurations(null).execute();
  }

  // Test the listSmtpConfigurations operation using the SmtpConfigurationsPager.getNext() method
  @Test
  public void testListSmtpConfigurationsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"smtp_configurations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"domain\":\"domain\",\"config\":{\"dkim\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"},\"en_authorization\":{\"verification\":\"verification\"},\"spf\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"}},\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"smtp_configurations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"domain\":\"domain\",\"config\":{\"dkim\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"},\"en_authorization\":{\"verification\":\"verification\"},\"spf\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"}},\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
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

    ListSmtpConfigurationsOptions listSmtpConfigurationsOptions = new ListSmtpConfigurationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<SMTPConfiguration> allResults = new ArrayList<>();
    SmtpConfigurationsPager pager = new SmtpConfigurationsPager(eventNotificationsService, listSmtpConfigurationsOptions);
    while (pager.hasNext()) {
      List<SMTPConfiguration> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSmtpConfigurations operation using the SmtpConfigurationsPager.getAll() method
  @Test
  public void testListSmtpConfigurationsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"smtp_configurations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"domain\":\"domain\",\"config\":{\"dkim\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"},\"en_authorization\":{\"verification\":\"verification\"},\"spf\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"}},\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"smtp_configurations\":[{\"id\":\"id\",\"name\":\"name\",\"description\":\"description\",\"domain\":\"domain\",\"config\":{\"dkim\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"},\"en_authorization\":{\"verification\":\"verification\"},\"spf\":{\"txt_name\":\"txtName\",\"txt_value\":\"txtValue\",\"verification\":\"verification\"}},\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
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

    ListSmtpConfigurationsOptions listSmtpConfigurationsOptions = new ListSmtpConfigurationsOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    SmtpConfigurationsPager pager = new SmtpConfigurationsPager(eventNotificationsService, listSmtpConfigurationsOptions);
    List<SMTPConfiguration> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createSmtpUser operation with a valid options model parameter
  @Test
  public void testCreateSmtpUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"description\": \"description\", \"domain\": \"domain\", \"smtp_config_id\": \"smtpConfigId\", \"username\": \"username\", \"password\": \"password\", \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createSmtpUserPath = "/v1/instances/testString/smtp/config/testString/users";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSmtpUserOptions model
    CreateSmtpUserOptions createSmtpUserOptionsModel = new CreateSmtpUserOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .description("testString")
      .usernameToClone("testString")
      .build();

    // Invoke createSmtpUser() with a valid options model and verify the result
    Response<SMTPUserResponse> response = eventNotificationsService.createSmtpUser(createSmtpUserOptionsModel).execute();
    assertNotNull(response);
    SMTPUserResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSmtpUserPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("username_to_clone"), "testString");
  }

  // Test the createSmtpUser operation with and without retries enabled
  @Test
  public void testCreateSmtpUserWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testCreateSmtpUserWOptions();

    eventNotificationsService.disableRetries();
    testCreateSmtpUserWOptions();
  }

  // Test the createSmtpUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSmtpUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.createSmtpUser(null).execute();
  }

  // Test the listSmtpUsers operation with a valid options model parameter
  @Test
  public void testListSmtpUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"offset\": 6, \"limit\": 5, \"users\": [{\"id\": \"id\", \"smtp_config_id\": \"smtpConfigId\", \"description\": \"description\", \"domain\": \"domain\", \"username\": \"username\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"first\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listSmtpUsersPath = "/v1/instances/testString/smtp/config/testString/users";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSmtpUsersOptions model
    ListSmtpUsersOptions listSmtpUsersOptionsModel = new ListSmtpUsersOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();

    // Invoke listSmtpUsers() with a valid options model and verify the result
    Response<SMTPUsersList> response = eventNotificationsService.listSmtpUsers(listSmtpUsersOptionsModel).execute();
    assertNotNull(response);
    SMTPUsersList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSmtpUsersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the listSmtpUsers operation with and without retries enabled
  @Test
  public void testListSmtpUsersWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testListSmtpUsersWOptions();

    eventNotificationsService.disableRetries();
    testListSmtpUsersWOptions();
  }

  // Test the listSmtpUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSmtpUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.listSmtpUsers(null).execute();
  }

  // Test the listSmtpUsers operation using the SmtpUsersPager.getNext() method
  @Test
  public void testListSmtpUsersWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"users\":[{\"id\":\"id\",\"smtp_config_id\":\"smtpConfigId\",\"description\":\"description\",\"domain\":\"domain\",\"username\":\"username\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"users\":[{\"id\":\"id\",\"smtp_config_id\":\"smtpConfigId\",\"description\":\"description\",\"domain\":\"domain\",\"username\":\"username\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
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

    ListSmtpUsersOptions listSmtpUsersOptions = new ListSmtpUsersOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    List<SMTPUser> allResults = new ArrayList<>();
    SmtpUsersPager pager = new SmtpUsersPager(eventNotificationsService, listSmtpUsersOptions);
    while (pager.hasNext()) {
      List<SMTPUser> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSmtpUsers operation using the SmtpUsersPager.getAll() method
  @Test
  public void testListSmtpUsersWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"users\":[{\"id\":\"id\",\"smtp_config_id\":\"smtpConfigId\",\"description\":\"description\",\"domain\":\"domain\",\"username\":\"username\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"users\":[{\"id\":\"id\",\"smtp_config_id\":\"smtpConfigId\",\"description\":\"description\",\"domain\":\"domain\",\"username\":\"username\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}]}";
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

    ListSmtpUsersOptions listSmtpUsersOptions = new ListSmtpUsersOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .limit(Long.valueOf("10"))
      .search("testString")
      .build();

    SmtpUsersPager pager = new SmtpUsersPager(eventNotificationsService, listSmtpUsersOptions);
    List<SMTPUser> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getSmtpConfiguration operation with a valid options model parameter
  @Test
  public void testGetSmtpConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"domain\": \"domain\", \"config\": {\"dkim\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}, \"en_authorization\": {\"verification\": \"verification\"}, \"spf\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getSmtpConfigurationPath = "/v1/instances/testString/smtp/config/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSmtpConfigurationOptions model
    GetSmtpConfigurationOptions getSmtpConfigurationOptionsModel = new GetSmtpConfigurationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getSmtpConfiguration() with a valid options model and verify the result
    Response<SMTPConfiguration> response = eventNotificationsService.getSmtpConfiguration(getSmtpConfigurationOptionsModel).execute();
    assertNotNull(response);
    SMTPConfiguration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSmtpConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSmtpConfiguration operation with and without retries enabled
  @Test
  public void testGetSmtpConfigurationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetSmtpConfigurationWOptions();

    eventNotificationsService.disableRetries();
    testGetSmtpConfigurationWOptions();
  }

  // Test the getSmtpConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSmtpConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getSmtpConfiguration(null).execute();
  }

  // Test the updateSmtpConfiguration operation with a valid options model parameter
  @Test
  public void testUpdateSmtpConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"domain\": \"domain\", \"config\": {\"dkim\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}, \"en_authorization\": {\"verification\": \"verification\"}, \"spf\": {\"txt_name\": \"txtName\", \"txt_value\": \"txtValue\", \"verification\": \"verification\"}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateSmtpConfigurationPath = "/v1/instances/testString/smtp/config/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateSmtpConfigurationOptions model
    UpdateSmtpConfigurationOptions updateSmtpConfigurationOptionsModel = new UpdateSmtpConfigurationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .build();

    // Invoke updateSmtpConfiguration() with a valid options model and verify the result
    Response<SMTPConfiguration> response = eventNotificationsService.updateSmtpConfiguration(updateSmtpConfigurationOptionsModel).execute();
    assertNotNull(response);
    SMTPConfiguration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSmtpConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSmtpConfiguration operation with and without retries enabled
  @Test
  public void testUpdateSmtpConfigurationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testUpdateSmtpConfigurationWOptions();

    eventNotificationsService.disableRetries();
    testUpdateSmtpConfigurationWOptions();
  }

  // Test the updateSmtpConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSmtpConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.updateSmtpConfiguration(null).execute();
  }

  // Test the deleteSmtpConfiguration operation with a valid options model parameter
  @Test
  public void testDeleteSmtpConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSmtpConfigurationPath = "/v1/instances/testString/smtp/config/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSmtpConfigurationOptions model
    DeleteSmtpConfigurationOptions deleteSmtpConfigurationOptionsModel = new DeleteSmtpConfigurationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke deleteSmtpConfiguration() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteSmtpConfiguration(deleteSmtpConfigurationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSmtpConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSmtpConfiguration operation with and without retries enabled
  @Test
  public void testDeleteSmtpConfigurationWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteSmtpConfigurationWOptions();

    eventNotificationsService.disableRetries();
    testDeleteSmtpConfigurationWOptions();
  }

  // Test the deleteSmtpConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSmtpConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteSmtpConfiguration(null).execute();
  }

  // Test the getSmtpUser operation with a valid options model parameter
  @Test
  public void testGetSmtpUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"smtp_config_id\": \"smtpConfigId\", \"description\": \"description\", \"domain\": \"domain\", \"username\": \"username\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getSmtpUserPath = "/v1/instances/testString/smtp/config/testString/users/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSmtpUserOptions model
    GetSmtpUserOptions getSmtpUserOptionsModel = new GetSmtpUserOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .userId("testString")
      .build();

    // Invoke getSmtpUser() with a valid options model and verify the result
    Response<SMTPUser> response = eventNotificationsService.getSmtpUser(getSmtpUserOptionsModel).execute();
    assertNotNull(response);
    SMTPUser responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSmtpUserPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSmtpUser operation with and without retries enabled
  @Test
  public void testGetSmtpUserWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetSmtpUserWOptions();

    eventNotificationsService.disableRetries();
    testGetSmtpUserWOptions();
  }

  // Test the getSmtpUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSmtpUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getSmtpUser(null).execute();
  }

  // Test the updateSmtpUser operation with a valid options model parameter
  @Test
  public void testUpdateSmtpUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"smtp_config_id\": \"smtpConfigId\", \"description\": \"description\", \"domain\": \"domain\", \"username\": \"username\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateSmtpUserPath = "/v1/instances/testString/smtp/config/testString/users/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateSmtpUserOptions model
    UpdateSmtpUserOptions updateSmtpUserOptionsModel = new UpdateSmtpUserOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .userId("testString")
      .description("testString")
      .build();

    // Invoke updateSmtpUser() with a valid options model and verify the result
    Response<SMTPUser> response = eventNotificationsService.updateSmtpUser(updateSmtpUserOptionsModel).execute();
    assertNotNull(response);
    SMTPUser responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSmtpUserPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSmtpUser operation with and without retries enabled
  @Test
  public void testUpdateSmtpUserWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testUpdateSmtpUserWOptions();

    eventNotificationsService.disableRetries();
    testUpdateSmtpUserWOptions();
  }

  // Test the updateSmtpUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSmtpUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.updateSmtpUser(null).execute();
  }

  // Test the deleteSmtpUser operation with a valid options model parameter
  @Test
  public void testDeleteSmtpUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSmtpUserPath = "/v1/instances/testString/smtp/config/testString/users/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSmtpUserOptions model
    DeleteSmtpUserOptions deleteSmtpUserOptionsModel = new DeleteSmtpUserOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .userId("testString")
      .build();

    // Invoke deleteSmtpUser() with a valid options model and verify the result
    Response<Void> response = eventNotificationsService.deleteSmtpUser(deleteSmtpUserOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSmtpUserPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSmtpUser operation with and without retries enabled
  @Test
  public void testDeleteSmtpUserWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testDeleteSmtpUserWOptions();

    eventNotificationsService.disableRetries();
    testDeleteSmtpUserWOptions();
  }

  // Test the deleteSmtpUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSmtpUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.deleteSmtpUser(null).execute();
  }

  // Test the getSmtpAllowedIps operation with a valid options model parameter
  @Test
  public void testGetSmtpAllowedIpsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"subnets\": [\"subnets\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getSmtpAllowedIpsPath = "/v1/instances/testString/smtp/config/testString/allowed_ips";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSmtpAllowedIpsOptions model
    GetSmtpAllowedIpsOptions getSmtpAllowedIpsOptionsModel = new GetSmtpAllowedIpsOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getSmtpAllowedIps() with a valid options model and verify the result
    Response<SMTPAllowedIPs> response = eventNotificationsService.getSmtpAllowedIps(getSmtpAllowedIpsOptionsModel).execute();
    assertNotNull(response);
    SMTPAllowedIPs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSmtpAllowedIpsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSmtpAllowedIps operation with and without retries enabled
  @Test
  public void testGetSmtpAllowedIpsWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetSmtpAllowedIpsWOptions();

    eventNotificationsService.disableRetries();
    testGetSmtpAllowedIpsWOptions();
  }

  // Test the getSmtpAllowedIps operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSmtpAllowedIpsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getSmtpAllowedIps(null).execute();
  }

  // Test the updateVerifySmtp operation with a valid options model parameter
  @Test
  public void testUpdateVerifySmtpWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": [{\"type\": \"type\", \"verification\": \"verification\"}]}";
    String updateVerifySmtpPath = "/v1/instances/testString/smtp/config/testString/verify";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateVerifySmtpOptions model
    UpdateVerifySmtpOptions updateVerifySmtpOptionsModel = new UpdateVerifySmtpOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .type("testString")
      .build();

    // Invoke updateVerifySmtp() with a valid options model and verify the result
    Response<SMTPVerificationUpdateResponse> response = eventNotificationsService.updateVerifySmtp(updateVerifySmtpOptionsModel).execute();
    assertNotNull(response);
    SMTPVerificationUpdateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVerifySmtpPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("type"), "testString");
  }

  // Test the updateVerifySmtp operation with and without retries enabled
  @Test
  public void testUpdateVerifySmtpWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testUpdateVerifySmtpWOptions();

    eventNotificationsService.disableRetries();
    testUpdateVerifySmtpWOptions();
  }

  // Test the updateVerifySmtp operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVerifySmtpNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.updateVerifySmtp(null).execute();
  }

  // Test the getNotificationsStatus operation with a valid options model parameter
  @Test
  public void testGetNotificationsStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"success\", \"details\": {\"status_code\": 10, \"status_message\": \"statusMessage\"}}";
    String getNotificationsStatusPath = "/v1/instances/testString/notifications/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetNotificationsStatusOptions model
    GetNotificationsStatusOptions getNotificationsStatusOptionsModel = new GetNotificationsStatusOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .build();

    // Invoke getNotificationsStatus() with a valid options model and verify the result
    Response<GetNotificationStatusResponse> response = eventNotificationsService.getNotificationsStatus(getNotificationsStatusOptionsModel).execute();
    assertNotNull(response);
    GetNotificationStatusResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getNotificationsStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getNotificationsStatus operation with and without retries enabled
  @Test
  public void testGetNotificationsStatusWRetries() throws Throwable {
    eventNotificationsService.enableRetries(4, 30);
    testGetNotificationsStatusWOptions();

    eventNotificationsService.disableRetries();
    testGetNotificationsStatusWOptions();
  }

  // Test the getNotificationsStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetNotificationsStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    eventNotificationsService.getNotificationsStatus(null).execute();
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

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    eventNotificationsService = EventNotifications.newInstance(serviceName);
    String url = server.url("/").toString();
    eventNotificationsService.setServiceUrl(url);
  }
}