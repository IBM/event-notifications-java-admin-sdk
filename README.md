[![Build Status](https://app.travis-ci.com/IBM/event-notifications-java-admin-sdk.svg?branch=main)](https://travis-ci.com/IBM/event-notifications-java-admin-sdk)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# Java server SDK for IBM Cloud Event Notifications service Version 0.2.3
Java client library to interact with various [IBM Cloud Event Notifications Service](https://cloud.ibm.com/apidocs?category=event-notifications).

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
  * [Maven](#maven)
  * [Gradle](#gradle)
- [Using the SDK](#using-the-sdk)
- [Questions](#questions)
- [Issues](#issues)
- [Open source @ IBM](#open-source--ibm)
- [Contributing](#contributing)
- [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud Event Notifications Service Java SDK allows developers to programmatically interact with Event Notifications service in IBM cloud.

Service Name | Artifact Coordinates
--- | ---
[Event Notifications Service](https://cloud.ibm.com/apidocs/event-notifications) | com.ibm.cloud:event-notifications:0.2.3

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An Event Notifications Instance
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* Java 11 or above.

## Installation
The current version of this SDK is: 0.2.3

Each service's artifact coordinates are listed in the table above.

The project artifacts are published on the public [Maven Central](https://repo1.maven.org/maven2/)
artifact repository.  This is the default public repository used by maven when searching for dependencies.
To use this repository within a gradle build, please see
[this link](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use the Event Notifications Java SDK, define a dependency that contains the artifact coordinates (group id, artifact id and version) for the service, like this:


### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>event-notifications</artifactId>
    <version>0.2.3</version>
</dependency>
```

### Gradle
```gradle
compile 'com.ibm.cloud:event-notifications:0.2.3'
```

## Using the SDK
For general SDK usage information, please see [this link](https://github.com/IBM/ibm-cloud-sdk-common/blob/main/README.md)


## Initialize SDK
Initialize the sdk to connect with your Event Notifications service instance.

```java
import com.ibm.cloud.eventnotifications.event_notifications.v1.EventNotifications;

EventNotifications eventNotificationsService = EventNotifications.newInstance();
eventNotificationsService.setServiceUrl("https://" + region + ".event-notifications.cloud.ibm.com/event-notifications");

```
**To configure service URL for Private Endpoint**

If you enabled service endpoints in your account, you can send API requests over the IBM Cloud private network. In the initialisation, the base endpoint URLs of the IAM(authenticator) & Event Notification(service) should be modified to point to private endpoints.
1) Setting client options programmatically
```java
Authenticator authenticator = new IamAuthenticator.Builder()
        .apikey("<iam-api-key>")
        .url("https://private.iam.cloud.ibm.com")
        .build();

EventNotifications eventNotificationsService = EventNotifications.newInstance();
eventNotificationsService.setServiceUrl("https://private." + region + ".event-notifications.cloud.ibm.com/event-notifications");
```
2) Using external configuration properties
```java
   EVENT_NOTIFICATIONS_AUTH_URL = https://private.iam.cloud.ibm.com/identity/token
```        
- region : Region of the Event Notifications Instance

## Using the SDK

SDK Methods to consume

- [Source](#source)
  - [Create Source](#create-source)
  - [List Sources](#list-sources)
  - [Get Source](#get-source)
  - [Update Source](#update-source)
  - [Delete Source](#delete-source)
- [Topics](#topics)
  - [Create Topics](#create-topic)
  - [List Topics](#list-topics)
  - [Get Topic](#get-topic)
  - [Update Topics](#update-topic)
  - [Delete Topics](#delete-topic)
- [Destinations](#destinations)
  - [Create Destination](#create-destination)
  - [List Destinations](#list-destinations)
  - [Get Destination](#get-destination)
  - [Update Destination](#update-destination)
  - [Delete Destination](#delete-destination)
  - [Custom Domain_Name_verification](#custom-domain-name-verification)
- [Templates](#templates)
  - [Create Template](#create-template)
  - [List Templates](#list-templates)
  - [Get Template](#get-template)
  - [Update Template](#update-template)
  - [Delete Template](#delete-template)
- [Push Destination APIs](#push-destination-apis)
  - [Create Destination tag subscription](#create-destination-tag-subscription)
  - [List Destination tag subscription](#list-destination-tag-subscription)
  - [Delete Destination device tag subscription](#delete-destination-device-tag-subscription)
- [Subscriptions](#subscriptions)
  - [Create Subscription](#create-subscription)
  - [List Subscriptions](#list-subscriptions)
  - [Get Subscription](#get-subscription)
  - [Update Subscription](#update-subscription)
  - [Delete Subscription](#delete-subscription)
- [Integration](#integration)
  - [List Integrations](#list-integrations)
  - [Get Integrations](#get-integration)
  - [Update Integration](#update-integration)
- [Send Notifications](#send-notifications)

## Source

### Create Source

```java
CreateSourcesOptions createSourcesOptions = new CreateSourcesOptions.Builder()
              .instanceId(<instanceId>)
              .name(<source-name>)
              .description(<source-description>)
              .enabled(true)
              .build();

Response<SourceResponse> response = eventNotificationsService.createSources(createSourcesOptions).execute();
SourceResponse sourceResponse = response.getResult();
```

### List Sources

```java
ListSourcesOptions listSourcesOptions = new ListSourcesOptions.Builder()
        .instanceId(<instanceId>)
        .build();

Response<SourceList> response = eventNotificationsService.listSources(listSourcesOptions).execute();
SourceList sourceList = response.getResult();
System.out.println(sourceList);
```

### Get Source

```java

GetSourceOptions getSourceOptions = new GetSourceOptions.Builder()
        .instanceId(<instanceId>)
        .id(<sourceId>)
        .build();

Response<Source> response = eventNotificationsService.getSource(getSourceOptions).execute();
Source source = response.getResult();
System.out.println(source);

```

### Update Source

```java
UpdateSourceOptions updateSourceOptions = new UpdateSourceOptions.Builder()
        .instanceId(<instanceId>)
        .id(<sourceId>)
        .name(<source-name>)
        .description(<source-description>)
        .enabled(true)
        .build();

Response<Source> response = eventNotificationsService.updateSource(updateSourceOptions).execute();
Source source = response.getResult();
```

### Delete Source

```java
 DeleteSourceOptions deleteSourceOptions = new DeleteSourceOptions.Builder()
        .instanceId(<instanceId>)
        .id(<sourceId>)
        .build();
Response<Void> response = eventNotificationsService.deleteSource(deleteSourceOptions).execute();
```

## Topics

### Create Topic

```java

Rules rulesModel = new Rules.Builder()
        .enabled(true)
        .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
        .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
        .build();

TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
        .id(<sourceId>)
        .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
        .build();

CreateTopicOptions createTopicOptions = new CreateTopicOptions.Builder()
        .instanceId(<instanceId>)
        .name(<topicName>)
        .description("This topic is used for routing all compliance related notifications to the appropriate destinations")
        .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
        .build();

Response<TopicResponse> response = eventNotificationsService.createTopic(createTopicOptions).execute();
TopicResponse topicResponse = response.getResult();

System.out.println(topicResponse);
```

### List Topics

```java
ListTopicsOptions listTopicsOptions = new ListTopicsOptions.Builder()
        .instanceId(<instanceId>)
        .build();

Response<TopicList> response = eventNotificationsService.listTopics(listTopicsOptions).execute();
TopicList topicList = response.getResult();
System.out.println(topicList);
```

### Get Topic

```java
GetTopicOptions getTopicOptions = new GetTopicOptions.Builder()
        .instanceId(<instanceId>)
        .id(<topicId>)
        .build();

Response<Topic> response = eventNotificationsService.getTopic(getTopicOptions).execute();
Topic topic = response.getResult();
System.out.println(topic);
```

### Update Topic
```java

Rules rulesModel = new Rules.Builder()
        .enabled(true)
        .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
        .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
        .build();

TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
        .id(<sourceId>)
        .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
        .build();

String description = "Updated Topic for GCM notifications";
String name = "Updated Admin Topic Compliance";

ReplaceTopicOptions replaceTopicOptions = new ReplaceTopicOptions.Builder()
        .instanceId(<instanceId>)
        .id(<topicId>)
        .name(<name>)
        .description(<description>)
        .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
        .build();

Response<Topic> response = eventNotificationsService.replaceTopic(replaceTopicOptions).execute();
Topic topic = response.getResult();
System.out.println(topic);
```
### Delete Topic
```java
DeleteTopicOptions deleteTopicOptions = new DeleteTopicOptions.Builder()
        .instanceId(<instanceId>)
        .id(<topicId>)
        .build();

Response<Void> response = eventNotificationsService.deleteTopic(deleteTopicOptions).execute();

```
## Destinations

### Create Destination

```java

DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
        .url(<destination-config-url>)
        .verb(<destination-config-verb>)
        .customHeaders(new java.util.HashMap<String, String>() { { put(<header-key>, <header-value>); } })
        .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList(<header-key>)))
        .build();

DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
        .params(destinationConfigParamsModel)
        .build();

CreateDestinationOptions createDestinationOptions = new CreateDestinationOptions.Builder()
        .instanceId(<instanceId>)
        .name(<name>)
        .type(<typeVal>)
        .description(<description>)
        .config(destinationConfigModel)
        .build();

Response<DestinationResponse> response = eventNotificationsService.createDestination(createDestinationOptions).execute();
DestinationResponse destinationResponse = response.getResult();
System.out.println(destinationResponse);
```

Among the supported destinations, if you need to create Push Notification destinations, you have the additional option of choosing a destination of production type or pre-production type.
Set `pre_prod` boolean parameter to *true* to configure destination as pre-production destination else set the value as *false*.
Supported destinations are Android, iOS, Chrome, Firefox and Safari.

### List Destinations

```java
ListDestinationsOptions listDestinationsOptions = new ListDestinationsOptions.Builder()
        .instanceId(<instanceId>)
        .build();

Response<DestinationList> response = eventNotificationsService.listDestinations(listDestinationsOptions).execute();
DestinationList destinationList = response.getResult();
System.out.println(destinationList);
```

### Get Destination

```java
GetDestinationOptions getDestinationOptions = new GetDestinationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<destinationId>)
        .build();

Response<Destination> response = eventNotificationsService.getDestination(getDestinationOptions).execute();
Destination destination = response.getResult();
System.out.println(destination);
```

### Update Destination
```java
DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
        .url(<destination-config-update-url>)
        .verb(<destination-config-update-verb>)
        .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList(<header-key>)))
        .build();

DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
        .params(destinationConfigParamsModel)
        .build();

UpdateDestinationOptions updateDestinationOptions = new UpdateDestinationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<destinationId>)
        .name(<name>)
        .description(<description>)
        .config(destinationConfigModel)
        .build();

Response<Destination> response = eventNotificationsService.updateDestination(updateDestinationOptions).execute();
Destination destination = response.getResult();
System.out.println(destination);

```
### Delete Destination

```java
DeleteDestinationOptions deleteDestinationOptions = new DeleteDestinationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<destinationId>)
        .build();

Response<Void> response = eventNotificationsService.deleteDestination(deleteDestinationOptions).execute();
```
### Custom Domain Name Verification

After creation of the custom email destination with your domain name, make sure its validated for the right ownership.
This can be done with SPF and DKIM verification.
* Sender Policy Framework (SPF), which is used to authenticate the sender of an email. SPF specifies the mail servers that are allowed to send email for your domain.
* DomainKeys Identified Mail (DKIM), which allows an organization to take responsibility for transmitting a message by signing it. DKIM allows
  the receiver to check the email that claimed to have come from a specific domain, is authorized by the owner of that domain.

```java
UpdateVerifyDestinationOptions updateVerifyDestinationOptionsModel = new UpdateVerifyDestinationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<destinationId>)
        .type(<verificationType>)
        .build();

Response<VerificationResponse> verificationResponse = service.updateVerifyDestination(updateVerifyDestinationOptionsModel).execute();
VerificationResponse responseObj = verificationResponse.getResult();

```

## Templates

Template is a pre-defined layout, that may include content like images, text and dynamic content based on event. Rather than creating a new content from scratch each time, you can use a template as a base and configure them in subscription. 
supports the following templates:

- Custom Email notification
- Custom Email invitation

### Create Template
```java
TemplateConfig templateConfig = new TemplateConfig.Builder()
        .body("<!DOCTYPE html><html><head><title>IBM Event Notifications</title></head><body><p>Hello! Invitation template</p><table><tr><td>Hello invitation link:{{ ibmen_invitation }} </td></tr></table></body></html>")
        .subject("Hi this is invitation for invitation message")
        .build();

CreateTemplateOptions createTemplateInvitationOptions = new CreateTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(templateConfig)
        .build();

Response<TemplateResponse> invitationResponse = eventNotificationsService.createTemplate(createTemplateInvitationOptions).execute();
```
### List Templates
```java
ListTemplatesOptions listTemplatesOptions = new ListTemplatesOptions.Builder()
        .instanceId(<instanceId>)
        .limit(<limit>)
        .offset(<offset>)
        .search(<search>)
        .build();

Response<TemplateList> response = eventNotificationsService.listTemplates(listTemplatesOptions).execute();
```

### Get Template
```java
GetTemplateOptions getTemplateOptions = new GetTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .id(<templateId>)
        .build();

Response<Template> response = eventNotificationsService.getTemplate(getTemplateOptions).execute();
```

### Update Template
```java
TemplateConfig templateConfig = new TemplateConfig.Builder()
              .body("<!DOCTYPE html><html><head><title>IBM Event Notifications</title></head><body><p>Hello! Invitation template</p><table><tr><td>Hello invitation link:{{ ibmen_invitation }} </td></tr></table></body></html>")
              .subject("Hi this is invitation for invitation message")
              .build();

UpdateTemplateOptions updateTemplateInvitationOptions = new UpdateTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .id(<templateId>)
        .name(<name>)
        .description(<description>)
        .type(<templateType>)
        .params(templateConfig)
        .build();

Response<Template> invitationResponse = eventNotificationsService.updateTemplate(updateTemplateInvitationOptions).execute();
```

### Delete Template
```java
DeleteTemplateOptions deleteTemplateOptions = new DeleteTemplateOptions.Builder()
                .instanceId(<instanceId>)
                .id(<templateId>)
                .build();

Response<Void> response = eventNotificationsService.deleteTemplate(deleteTemplateOptions).execute();
```

## Push Destination APIs

### Create Destination tag subscription
```java
CreateTagsSubscriptionOptions createTagsSubscriptionOptionsModel = new CreateTagsSubscriptionOptions.Builder()
        .instanceId(<instanceId>) // Event notifications service instance GUID
        .id(<destination-id>)     // Event notifications service instance Destination ID
        .deviceId(<device-id>)    // Event notifications service device ID
        .tagName(<tag-name>)      // Event notifications service tag name
        .build();

// Invoke createTagsSubscription() with a valid options model and verify the result
Response<DestinationTagsSubscriptionResponse> response = eventNotificationsService.createTagsSubscription(createTagsSubscriptionOptionsModel).execute();
DestinationTagsSubscriptionResponse destinationTagsSubscription = response.getResult();
System.out.println(destinationTagsSubscription);
```
### List Destination tag subscription
```java
ListTagsSubscriptionOptions listTagsSubscriptionOptionsModel = new ListTagsSubscriptionOptions.Builder()
        .instanceId(<instanceId>)  // Event notifications service instance GUID
        .id(<destination-id>)      // Event notifications service instance Destination ID// Event notifications service user ID
        .build();

// Invoke listTagsSubscription() with a valid options model and verify the result
Response<TagsSubscriptionList> response = eventNotificationsService.listTagsSubscription(listTagsSubscriptionOptionsModel).execute();
TagsSubscriptionList tagsSubscriptionList = response.getResult();
System.out.println(tagsSubscriptionList);
```
### Delete Destination device tag subscription
```java
DeleteTagsSubscriptionOptions deleteTagsSubscriptionOptionsModel = new DeleteTagsSubscriptionOptions.Builder()
        .instanceId(<instanceId>)  // Event notifications service instance GUID
        .id(<destination-id>)      // Event notifications service instance Destination ID
        .deviceId(<device-id>)     // Event notifications service device ID
        .tagName(<tag-name>)       // Event notifications service tag name
        .build();

// Invoke deleteTagsSubscription() with a valid options model and verify the result
Response<Void> response = eventNotificationsService.deleteTagsSubscription(deleteTagsSubscriptionOptionsModel).execute();
System.out.println(response);
```
## Subscriptions

### Create Subscription

```java
SubscriptionCreateAttributesWebhookAttributes subscriptionCreateWebAttributesModel = new SubscriptionCreateAttributesWebhookAttributes.Builder()
    .signingEnabled(false).build();

CreateSubscriptionOptions createSubscriptionOptions = new CreateSubscriptionOptions.Builder()
    .instanceId(<instanceId>)
    .name(<name>)
    .destinationId(<destinationId>)
    .topicId(<topicId>)
    .attributes(subscriptionCreateWebAttributesModel)
    .description(<description>)
    .build();

Response<Subscription> response = eventNotificationsService.createSubscription(createSubscriptionOptions).execute();
Subscription subscription = response.getResult();
System.out.println(subscription);
```

### List Subscriptions

```java
ListSubscriptionsOptions listSubscriptionsOptions = new ListSubscriptionsOptions.Builder()
    .instanceId(<instanceId>)
    .build();

Response<SubscriptionList> response = eventNotificationsService.listSubscriptions(listSubscriptionsOptions).execute();
SubscriptionList subscriptionList = response.getResult();
System.out.println(subscriptionList);

```

### Get Subscription

```java
 GetSubscriptionOptions getSubscriptionOptions = new GetSubscriptionOptions.Builder()
        .instanceId(<instanceId>)
        .id(<subscriptionId>)
        .build();

Response<Subscription> response = eventNotificationsService.getSubscription(getSubscriptionOptions).execute();
Subscription subscription = response.getResult();
System.out.println(subscription);
```

### Update Subscription
```java
SubscriptionUpdateAttributesWebhookAttributes subscriptionUpdateWebAttributesModel = new SubscriptionUpdateAttributesWebhookAttributes.Builder()
        .signingEnabled(true)
        .build();

UpdateSubscriptionOptions updateSubscriptionOptions = new UpdateSubscriptionOptions.Builder()
        .instanceId(<instanceId>)
        .id(<subscriptionId>)
        .name(<name>)
        .description(<description>)
        .attributes(subscriptionUpdateWebAttributesModel)
        .build();

Response<Subscription> response = eventNotificationsService.updateSubscription(updateSubscriptionOptions).execute();
Subscription subscription = response.getResult();
System.out.println(subscription);
```
### Delete Subscription
```java
DeleteSubscriptionOptions deleteSubscriptionOptions = new DeleteSubscriptionOptions.Builder()
    .instanceId(<instanceId>)
    .id(<subscriptionId>)
    .build();

Response<Void> response = eventNotificationsService.deleteSubscription(deleteSubscriptionOptions).execute();
```
## Integration

### Get Integration
```java
GetIntegrationOptions integrationsOptions = new GetIntegrationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<integrationId>)
        .build();

Response<IntegrationGetResponse> response = eventNotificationsService.getIntegration(integrationsOptions).execute();
```
### List Integrations
```java
ListIntegrationsOptions integrationsOptions = new ListIntegrationsOptions.Builder()
        .instanceId(<instanceId>)
        .limit(<limit>)
        .offset(<offset>)
        .search(<search>)
        .build();

Response<IntegrationList> response = eventNotificationsService.listIntegrations(integrationsOptions).execute();
```
### Update Integration
```java
IntegrationMetadata metadata = new IntegrationMetadata.Builder()
        .endpoint("<end-point>")
        .crn("<crn>")
        .rootKeyId(<rootKeyId>)
        .build();

ReplaceIntegrationOptions integrationsOptions = new ReplaceIntegrationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<integrationId>)
        .type(<integrationType>)
        .metadata(metadata)
        .build();
        
Response<IntegrationGetResponse> response = eventNotificationsService.replaceIntegration(integrationsOptions).execute();
```
### Send Notifications
```java
      List<String> fcmDevices = new ArrayList<String>();
      fcmDevices.add(<fcm-device-ids>);

      List<String> apnsDevices = new ArrayList<String>();
      apnsDevices.add(<apns-device-ids>);

      List<String> tagNames = new ArrayList<String>();
      tagNames.add(<tag-names>);

      List<String> devicePlatforms = new ArrayList<String>();
      devicePlatforms.add(<device-platforms>);

        String notificationDevices = "{\"user_ids\": [\"userId\"]}";
        String fcmJsonString = "{\"message\": {\"android\": {\"notification\": {\"title\": \"Alert message\",\"body\": \"Bob wants to play Poker\"},\"data\": {\"name\": \"Willie Greenholt\",\"description\": \"notification for the Poker\"}}}}";
        String apnsJsonString = "{\"alert\": \"Game Request\", \"badge\": 5 }";
        String safariJsonString = "{\"aps\":{\"alert\":{\"title\":\"FlightA998NowBoarding\",\"body\":\"BoardinghasbegunforFlightA998.\",\"action\":\"View\"},\"url-args\":[\"boarding\",\"A998\"]}}";
        String huaweiJsonString = "{\"message\":{\"android\":{\"notification\":{\"title\":\"New Message\",\"body\":\"Hello World\",\"click_action\":{\"type\":3}}}}}";
        String mailTo = "[\"abc@ibm.com\", \"def@us.ibm.com\"]";
        String htmlBody = "\"Hi  ,<br/>Certificate expiring in 90 days.<br/><br/>Please login to <a href=\"https: //cloud.ibm.com/security-compliance/dashboard\">Security and Complaince dashboard</a> to find more information<br/>\"";
        
        NotificationCreate body = new NotificationCreate.Builder()
        .id(InstanceID)
        .ibmenseverity("<notification-severity>")
        .id("<notification-id>")
        .source("<source-id>")
        .ibmensourceid("<source-id>")
        .type("<notification-type>")
        .time(new java.util.Date())
        .ibmensubject("<subject>")
        .ibmenmailto(mailTo)
        .ibmenhtmlbody(htmlBody)
        .ibmenpushto(notificationDevices)
        .ibmenfcmbody(fcmJsonString)
        .ibmenhuaweibody(huaweiJsonString)
        .ibmenapnsbody(apnsJsonString)
        .ibmensafaribody(safariJsonString)
        .ibmendefaultshort("<short-Info>")
        .ibmendefaultlong("<long-Info>")
        .specversion("1.0")
        .build();

        SendNotificationsOptions sendNotificationsOptions = new SendNotificationsOptions.Builder()
        .instanceId(instanceId)
        .body(body)
        .build();

        Response<NotificationResponse> response = service.sendNotifications(sendNotificationsOptions).execute();
        NotificationResponse notificationResponse = response.getResult();
      
```
<details open>
<summary>Send Notifications Variables</summary>
<br>

- **ibmenpushto** - Set up the push notifications targets.
  - *fcm_devices* (Array of **String**) - Send notification to the list of specified Android devices.
  - *fcm_devices* (Array of **String**) - Send notification to the list of specified iOS devices.
  - *_devices* (Array of **String**) - Send notification to the list of specified Chrome devices.
  - *firefox_devices* (Array of **String**) - Send notification to the list of specified Firefox devices.
  - *tags* (Array of **String**) - Send notification to the devices that have subscribed to any of these tags.
  - *platforms* (Array of **String**) - Send notification to the devices of the specified platforms.
    - Pass 'G' for google (Android) devices.
    - Pass 'A' for iOS devices.
    - Pass 'WEB_FIREFOX' for Firefox browser.
    - Pass 'WEB_CHROME' for Chrome browser.
**Event Notifications SendNotificationsOptions** - Event Notifications Send Notifications method.
  - *InstanceID* (**String**) - Event Notifications instance AppGUID.
  - *ibmenseverity* (**String**) - Severity for the notifications. Some sources can have the concept of an Event severity. Hence a handy way is provided to specify a severity of the event.
  - *id* (**String**) - A unique identifier that identifies each event. source+id must be unique. The backend should be able to uniquely track this id in logs and other records. Send unique ID for each send notification. Same ID can be sent in case of failure of send notification. source+id will be logged in IBM Cloud Logging service. Using this combination we will be able to trace the event movement from one system to another and will aid in debugging and tracing.
  - *source* (**String**) - This is the identifier of the event producer. A way to uniquely identify the source of the event. For IBM Cloud services this is the crn of the service instance producing the events. For API sources this can be something the event producer backend can uniquely identify itself with.
  - *ibmensourceid* (**String**) - This is the ID of the source created in EN. This is available in the EN UI in the "Sources" section.
  - *type* (**String**) - This describes the type of event. It is of the form <event-type-name>:<sub-type> This type is defined by the producer. The event type name has to be prefixed with the reverse DNS names so the event type is uniquely identified. The same event type can be produced by 2 different sources. It is highly recommended to use hyphen - as a separator instead of _.
  - *time* (**String**) - Time of the notifications. UTC time stamp when the event occurred. Must be in the RFC 3339 format.
  - *ibmenpushto* (**string**) - Targets for the FCM notifications. This contains details about the destination where you want to send push notification. This attribute is mandatory for successful delivery from an Android FCM or APNS destination
  - *ibmenfcmbody* (**string**) - Set payload string specific to Android platform [Refer this FCM official [link](https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support)].
  - *ibmenapnsbody* (**string**) - Set payload string specific to iOS platform [Refer this APNs official doc [link](https://developer.apple.com/library/archive/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html)].
  - *ibmenapnsheaders* (**string**) - Set headers required for the APNs message [Refer this APNs official [link](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/sending_notification_requests_to_apns)(Table 1 Header fields for a POST request)]
  - *ibmenchromebody* (**string**) - Message body for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ibmenfirefoxbody* (**string**) - Message body for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ibmensafaribody* (**string**) - Set payload string specific to safari notifications [Refer this Safari official doc [link](https://developer.apple.com/library/archive/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html)].
  - *ibmenchromeheaders* (**string**) - Headers for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ibmenfirefoxheaders* (**string**) - Headers for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ibmendefaultshort* (**string**) - Default short text for the message.
  - *ibmendefaultlong* (**string**) - Default long text for the message.
  - *specversion* (**String**) - Spec version of the Event Notifications. Default value is `1.0`.

</details>

## Set Environment

Find `event_notifications.env.hide` in the repo and rename it to `event_notifications.env`. After that add the values for,

- `EVENT_NOTIFICATIONS_URL` - Add the Event Notifications service instance Url.
- `EVENT_NOTIFICATIONS_APIKEY` - Add the Event Notifications service instance apikey.
- `EVENT_NOTIFICATIONS_GUID` - Add the Event Notifications service instance GUID.

Optional
- `EVENT_NOTIFICATIONS_AUTH_URL` - Add the IAM url if you are using IBM test cloud.
- `EVENT_NOTIFICATIONS_FCM_KEY` - Add firebase server key for Android FCM destination.
- `EVENT_NOTIFICATIONS_FCM_ID` - Add firebase sender Id for Android FCM destination.



## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Issues
If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/event-notifications-java-admin-sdk/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

## Open source @ IBM
Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing
See [CONTRIBUTING](CONTRIBUTING.md).

## License

The IBM Cloud Event Notifications Service Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](LICENSE).
