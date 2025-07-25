[![Build Status](https://app.travis-ci.com/IBM/event-notifications-java-admin-sdk.svg?branch=main)](https://travis-ci.com/IBM/event-notifications-java-admin-sdk)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# Java server SDK for IBM Cloud Event Notifications service Version 0.14.0

Java client library to interact with various [IBM Cloud Event Notifications Service](https://cloud.ibm.com/apidocs?category=event-notifications).

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
  - [Maven](#maven)
  - [Gradle](#gradle)
- [Using the SDK](#using-the-sdk)
- [Questions](#questions)
- [Issues](#issues)
- [Open source @ IBM](#open-source--ibm)
- [Contributing](#contributing)
- [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud Event Notifications Service Java SDK allows developers to programmatically interact with Event Notifications service in IBM cloud.

| Service Name                                                                     | Artifact Coordinates                     |
| -------------------------------------------------------------------------------- | ---------------------------------------- |
| [Event Notifications Service](https://cloud.ibm.com/apidocs/event-notifications) | com.ibm.cloud:event-notifications:0.14.0 |

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

- An [IBM Cloud][ibm-cloud-onboarding] account.
- An Event Notifications Instance
- An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
- Java 11 or above.

## Installation

The current version of this SDK is: 0.14.0

Each service's artifact coordinates are listed in the table above.

The project artifacts are published on the public [Maven Central](https://repo1.maven.org/maven2/)
artifact repository. This is the default public repository used by maven when searching for dependencies.
To use this repository within a gradle build, please see
[this link](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use the Event Notifications Java SDK, define a dependency that contains the artifact coordinates (group id, artifact id and version) for the service, like this:

### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>event-notifications</artifactId>
    <version>0.14.0</version>
</dependency>
```

### Gradle

```gradle
compile 'com.ibm.cloud:event-notifications:0.14.0'
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

1. Setting client options programmatically

```java
Authenticator authenticator = new IamAuthenticator.Builder()
        .apikey("<iam-api-key>")
        .url("https://private.iam.cloud.ibm.com")
        .build();

EventNotifications eventNotificationsService = EventNotifications.newInstance();
eventNotificationsService.setServiceUrl("https://private." + region + ".event-notifications.cloud.ibm.com/event-notifications");
```

2. Using external configuration properties

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
  - [Test Destination](#test-destination)
- [Templates](#templates)
  - [Create Template](#create-template)
  - [List Templates](#list-templates)
  - [Get Template](#get-template)
  - [Update Template](#update-template)
  - [Delete Template](#delete-template)
  - [List Predefined Templates](#list-predefined-templates)
  - [Get Predefined Template](#get-predefined-template)
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
  - [Create Integration](#create-integration)
  - [List Integrations](#list-integrations)
  - [Get Integrations](#get-integration)
  - [Update Integration](#update-integration)
- [SMTP Configurations](#SMTPConfigurations)
  - [Create SMTP Configuration](#create-smtp-configuration)
  - [Create SMTP User](#create-smtp-user)
  - [Get SMTP Configuration](#get-smtp-configuration)
  - [Get SMTP User](#get-smtp-user)
  - [Get SMTP Allowed Ips](#get-smtp-allowed-ips)
  - [List SMTP Configurations](#list-smtp-configurations)
  - [List SMTP Users](#list-smtp-users)
  - [Update SMTP Configuration](#update-smtp-configuration)
  - [Update SMTP User](#update-smtp-user)
  - [Delete SMTP User](#delete-smtp-user)
  - [Delete SMTP Configuration](#delete-smtp-user)
  - [Verify SMTP](#verify-smtp)
- [Metrics](#Metrics)
  - [Get Metrics](#get-metrics)
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

Filters applied in case of periodic-timer as source. EventTypeFilter, NotificationFilter are mutually exclusive with EventScheduleFilter

```java

EventScheduleFilterAttributes eventScheduleFilterAttributes = new EventScheduleFilterAttributes.Builder()
        .startsAt(startDate)
        .endsAt(endDate)
        .expression("* * * * *")
        .build();

Rules rulesCronModel = new Rules.Builder()
        .enabled(true)
        .eventScheduleFilter(eventScheduleFilterAttributes)
        .build();
```

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
Set `pre_prod` boolean parameter to _true_ to configure destination as pre-production destination else set the value as _false_.
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

### Test Destination

This functionality allows you to test a destination. The feature simplifies the process of verifying whether a destination is functioning correctly.
Currently, this functionality supports following destinations:

1. Slack
2. PagerDuty
3. ServiceNow
4. Microsoft&reg; Teams
5. IBM Cloud Code Engine
6. IBM Cloud Object Storage

```java
TestDestinationOptions testDestinationOptionsModel = new TestDestinationOptions.Builder()
        .instanceId(<instaceID>) // Event notifications service instance GUID
        .id(<destinationId>) // Event notifications service instance Destination ID
        .build();

Response<TestDestinationResponse> response = eventNotificationsService.testDestination(testDestinationOptionsModel).execute();
```

Once the test is completed, you will be presented with the results. These results will typically include:

- **Status**: Whether the test is successful or failed
- **Response Code**: If test fails, then the response code sent from the end destination client is returned
- **Response Message**: If test fails, then the response message sent from the end destination client is returned

### Custom Domain Name Verification

After creation of the custom email destination with your domain name, make sure its validated for the right ownership.
This can be done with SPF and DKIM verification.

- Sender Policy Framework (SPF), which is used to authenticate the sender of an email. SPF specifies the mail servers that are allowed to send email for your domain.
- DomainKeys Identified Mail (DKIM), which allows an organization to take responsibility for transmitting a message by signing it. DKIM allows
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
- slack template
- webhook template

### Create Template

#### Custom Email Template

```java
TemplateConfigOneOfEmailTemplateConfig templateConfig = new TemplateConfigOneOfEmailTemplateConfig.Builder()
        .body("base 64 encoded html content")
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

For custom email supported template type values: smtp_custom.invitation, smtp_custom.notification

#### Slack Template

```java
TemplateConfigOneOfSlackTemplateConfig slackTemplateConfig = new TemplateConfigOneOfSlackTemplateConfig.Builder()
        .body("base 64 encoded json content")
        .build();

CreateTemplateOptions createTemplateInvitationOptions = new CreateTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(slackTemplateConfig)
        .build();

Response<TemplateResponse> invitationResponse = eventNotificationsService.createTemplate(createTemplateInvitationOptions).execute();
```

For slack supported template type values: slack.notification

#### Webhook Template

```java
TemplateConfigOneOfWebhookTemplateConfig webhookTemplateConfig = new TemplateConfigOneOfWebhookTemplateConfig.Builder()
        .body("base 64 encoded json content")
        .build();

CreateTemplateOptions createWebhookTemplateNotificationOptions = new CreateTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(webhookTemplateConfig)
        .build();

Response<TemplateResponse> webhookTemplateResponse = eventNotificationsService.createTemplate(createWebhookTemplateNotificationOptions).execute();
```

For Webhook template supported template type value: webhook.notification

#### PagerDuty Template

```java
TemplateConfigOneOfPagerdutyTemplateConfig pagerdutyTemplateConfig = new TemplateConfigOneOfPagerdutyTemplateConfig.Builder()
        .body("base 64 encoded json content")
        .build();

CreateTemplateOptions createPagerDutyTemplateNotificationOptions = new CreateTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(pagerdutyTemplateConfig)
        .build();

Response<TemplateResponse> pagerdutyTemplateResponse = eventNotificationsService.createTemplate(createPagerDutyTemplateNotificationOptions).execute();
```

For PagerDuty template supported template type value: pagerduty.notification

#### EventStreams Template

```java
TemplateConfigOneOfEventStreamsTemplateConfig eventStreamsTemplateConfig = new TemplateConfigOneOfEventStreamsTemplateConfig.Builder()
        .body("base 64 encoded html content")
        .build();

CreateTemplateOptions createEventStreamsTemplateNotificationOptions = new CreateTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(eventStreamsTemplateConfig)
        .build();

Response<TemplateResponse> eventStreamsTemplateResponse = eventNotificationsService.createTemplate(createEventStreamsTemplateNotificationOptions).execute();
```

For EventStreams template supported template type value: event_streams.notification

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
### List predefined Templates

```java
ListPreDefinedTemplatesOptions listPreDefinedTemplatesOptionsModel = new ListPreDefinedTemplatesOptions.Builder()
        .instanceId(<instanceId>)
        .source(<source-type>)
        .type(<destination-type>)
        .limit(<limit>)
        .offset(<offset>)
        .search(<search>)
        .build();

// Invoke getMetrics() with a valid options model and verify the result
Response<PredefinedTemplatesList> response = eventNotificationsService.listPreDefinedTemplates(listPreDefinedTemplatesOptionsModel).execute();
```
### Get predefined Template

```java
GetPreDefinedTemplateOptions getPreDefinedTemplateOptionsModel = new GetPreDefinedTemplateOptions.Builder()
        .instanceId(instanceId)
        .id(<template-id>)
        .build();

Response<GetPredefinedTemplate> response = eventNotificationsService.getPreDefinedTemplate(getPreDefinedTemplateOptionsModel).execute();
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

#### Custom Email Template

```java
TemplateConfig templateConfig = new TemplateConfig.Builder()
        .body("base 64 encoded html content")
        .subject("Hi this is invitation for invitation message")
        .build();

        ReplaceTemplateOptions updateTemplateInvitationOptions = new ReplaceTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .id(<templateId>)
        .name(<name>)
        .description(<description>)
        .type(<templateType>)
        .params(templateConfig)
        .build();

        Response<Template> invitationResponse = eventNotificationsService.replaceTemplate(replaceTemplateInvitationOptions).execute();
```

For custom email supported template type values: smtp_custom.invitation, smtp_custom.notification

#### Slack Template

```java
TemplateConfigOneOfSlackTemplateConfig slackTemplateConfig = new TemplateConfigOneOfSlackTemplateConfig.Builder()
        .body("base 64 encoded json content")
        .build();

ReplaceTemplateOptions updateSlackTemplateOptions = new ReplaceTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .id(<slackTemplateID>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(slackTemplateConfig)
        .build();

Response<Template> slackTemplateResponse = eventNotificationsService.replaceTemplate(updateSlackTemplateOptions).execute();
```

For slack supported template type values: slack.notification

#### Webhook Template

```java
TemplateConfigOneOfWebhookTemplateConfig webhookTemplateConfig = new TemplateConfigOneOfWebhookTemplateConfig.Builder()
        .body("base 64 encoded json content")
        .build();

ReplaceTemplateOptions updateWebhookTemplateOptions = new ReplaceTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .id(<webhookTemplateID>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(webhookTemplateConfig)
        .build();

Response<Template> webhookTemplateResponse = service.replaceTemplate(updateWebhookTemplateOptions).execute();
```

For webhook supported template type values: webhook.notification

#### PagerDuty Template

```java
TemplateConfigOneOfPagerdutyTemplateConfig pagerdutyTemplateConfig = new TemplateConfigOneOfPagerdutyTemplateConfig.Builder()
        .body("base 64 encoded json content")
        .build();

ReplaceTemplateOptions updatePagerDutyTemplateOptions = new ReplaceTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .id(<pagerdutyTemplateID>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(pagerdutyTemplateConfig)
        .build();

Response<Template> pagerdutyTemplateResponse = service.replaceTemplate(updatePagerDutyTemplateOptions).execute();
```

For pagerduty supported template type values: pagerduty.notification

#### EventStreams Template

```java
TemplateConfigOneOfEventStreamsTemplateConfig eventStreamsTemplateConfig = new TemplateConfigOneOfEventStreamsTemplateConfig.Builder()
        .body("base 64 encoded json content")
        .build();

ReplaceTemplateOptions updateEventStreamsTemplateOptions = new ReplaceTemplateOptions.Builder()
        .instanceId(<instanceId>)
        .id(<pagerdutyTemplateID>)
        .name(<name>)
        .description(<description>)
        .type(<template-type>)
        .params(eventStreamsTemplateConfig)
        .build();

Response<Template> eventStreamsTemplateResponse = service.replaceTemplate(updateEventStreamsTemplateOptions).execute();
```

For EventStreams supported template type values: event_streams.notification

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
    .signingEnabled(false)
    .templateIdNotification(<webhookTemplateID>)
    .build();

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
        .templateIdNotification(<webhookTemplateID>)
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

### Create Integration

```java
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
Response<IntegrationCreateResponse> response = service.createIntegration(integrationsOptions).execute();
```

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

For kms/hs-crypto-

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

For Cloud Object Storage-

```java
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
```

## SMTPConfigurations

### Create SMTP Configuration

```java

CreateSmtpConfigurationOptions createSMTPConfigurationOptions = new CreateSmtpConfigurationOptions.Builder()
        .instanceId(<instanceId>)
        .domain(<smtpDomain>)
        .name(<smtpName>)
        .description(<smtpDescription>)
        .build();

Response<SMTPCreateResponse> response = eventNotificationsService.createSmtpConfiguration(createSMTPConfigurationOptions).execute();
SMTPCreateResponse smtpCreateResponse = response.getResult();

```

### Create SMTP User

```java

CreateSmtpUserOptions createSmtpUserOptionsModel = new CreateSmtpUserOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .description(<smtpDescription>)
        .build();

Response<SMTPUserResponse> response = eventNotificationsService.createSmtpUser(createSmtpUserOptionsModel).execute();
SMTPUserResponse responseObj = response.getResult();

```

### Get SMTP Configuration

```java

GetSmtpConfigurationOptions getSmtpConfigurationOptionsModel = new GetSmtpConfigurationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .build();

Response<SMTPConfiguration> response = eventNotificationsService.getSmtpConfiguration(getSmtpConfigurationOptionsModel).execute();
SMTPConfiguration responseObj = response.getResult();
```

### Get SMTP User

```java

GetSmtpConfigurationOptions getSmtpConfigurationOptionsModel = new GetSmtpConfigurationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .build();

Response<SMTPConfiguration> response = eventNotificationsService.getSmtpConfiguration(getSmtpConfigurationOptionsModel).execute();
SMTPConfiguration responseObj = response.getResult();
```

### Get SMTP Allowed Ips

```java

GetSmtpAllowedIpsOptions getSmtpAllowedIpsOptionsModel = new GetSmtpAllowedIpsOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .build();

Response<SMTPAllowedIPs> response = eventNotificationsService.getSmtpAllowedIps(getSmtpAllowedIpsOptionsModel).execute();
SMTPAllowedIPs responseObj = response.getResult();
```

### List SMTP Configurations

```java

GetSmtpAllowedIpsOptions getSmtpAllowedIpsOptionsModel = new GetSmtpAllowedIpsOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .build();

Response<SMTPAllowedIPs> response = eventNotificationsService.getSmtpAllowedIps(getSmtpAllowedIpsOptionsModel).execute();
SMTPAllowedIPs responseObj = response.getResult();
```

### List SMTP Users

```java
ListSmtpUsersOptions listSmtpUsersOptionsModel = new ListSmtpUsersOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .limit(limit)
        .offset(offset)
        .search(search)
        .build();

// Invoke listSmtpUsers() with a valid options model and verify the result
Response<SMTPUsersList> response = eventNotificationsService.listSmtpUsers(listSmtpUsersOptionsModel).execute();
SMTPUsersList smtpUsersList = response.getResult();
```

### Update SMTP Configuration

```java
UpdateSmtpConfigurationOptions updateSmtpConfigurationOptionsModel = new UpdateSmtpConfigurationOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .name(<smtpName>)
        .description(<smtpDescription>)
        .build();

Response<SMTPConfiguration> response = eventNotificationsService.updateSmtpConfiguration(updateSmtpConfigurationOptionsModel).execute();
SMTPConfiguration responseObj = response.getResult();
```

### Update SMTP User

```java
UpdateSmtpUserOptions updateSmtpUserOptionsModel = new UpdateSmtpUserOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .userId(<smtpUserID>)
        .description(<userDescription>)
        .build();

Response<SMTPUser> response = eventNotificationsService.updateSmtpUser(updateSmtpUserOptionsModel).execute();
SMTPUser responseObj = response.getResult();
```

### Delete SMTP User

```java
DeleteSmtpUserOptions deleteSmtpUserOptionsModel = new DeleteSmtpUserOptions.Builder()
        .instanceId(<instanceId>)
        .id(<smtpConfigID>)
        .userId(<smtpUserID>)
        .build();

Response<Void> response = eventNotificationsService.deleteSmtpUser(deleteSmtpUserOptionsModel).execute();
System.out.println(response);
```

### Delete SMTP Configuration

```java
DeleteSmtpConfigurationOptions deleteSmtpConfigurationOptionsModel = new DeleteSmtpConfigurationOptions.Builder()
        .instanceId(instanceId)
        .id(smtpConfigID)
        .build();

Response<Void> response = eventNotificationsService.deleteSmtpConfiguration(deleteSmtpConfigurationOptionsModel).execute();
System.out.println(response);
```

### Verify SMTP

```java
UpdateVerifySmtpOptions updateVerifySmtpOptions = new UpdateVerifySmtpOptions.Builder()
        .instanceId(instanceId)
        .id(smtpConfigID)
        .type("dkim,spf,en_authorization")
        .build();

Response<SMTPVerificationUpdateResponse> response = eventNotificationsService.updateVerifySmtp(updateVerifySmtpOptions).execute();
SMTPVerificationUpdateResponse updateVerifySmtpResponse = response.getResult();
```

## Metrics

### Get Metrics

```java
GetMetricsOptions getMetricsOptionsModel = new GetMetricsOptions.Builder()
        .instanceId(instanceId)
        .destinationType("smtp_custom")
        .gte(<gte-timestamp>)
        .lte(<lte-timestamp>)
        .destinationId(<destination-id>)
        .emailTo(<email-to>)
        .notificationId(<notification-id>)
        .subject(<subject>)
        .build();

        // Invoke getMetrics() with a valid options model and verify the result
Response<Metrics> response = eventNotificationsService.getMetrics(getMetricsOptionsModel).execute();
Metrics responseObj = response.getResult();
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
        String smsTo = "[\"+911234567890\", \"+911224567890\"]";
        String slackTo = "[\"C07FALXBH4G\",\"C07FALXBU4G\"]";
        String mms = "{\"content\": \"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\", \"content_type\": \"image/png\"}";
        String templates = "[\"149b0e11-8a7c-4fda-a847-5d79e01b71dc\"]";
        String htmlBody = "\"Hi  ,<br/>Certificate expiring in 90 days.<br/><br/>Please login to <a href=\"https: //cloud.ibm.com/security-compliance/dashboard\">Security and Complaince dashboard</a> to find more information<br/>\"";
        String markDown = "**Event Summary** \n\n**Toolchain ID:** `4414af34-a5c7-47d3-8f05-add4af6d78a6`  \n**Content Type:** `application/json`\n\n---\n\n *Pipeline Run Details*\n\n- **Namespace:** `PR`\n- **Trigger Name:** `manual`\n- **Triggered By:** `nitish.kulkarni3@ibm.com`\n- **Build Number:** `343`\n- **Pipeline Link:** [View Pipeline Run](https://cloud.ibm.com/devops/pipelines/tekton/e9cd5aa3-a3f2-4776-8acc-26a35922386e/runs/f29ac6f5-bd2f-4a26-abb8-4249be8dbab7?env_id=ibm:yp:us-south)";

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
              .ibmensmsto(smsTo)
              .ibmenslackto(slackTo)
              .ibmenmms(mms)
              .ibmentemplates(templates)
              .ibmenhtmlbody(htmlBody)
              .ibmenmarkdown(markDown)   
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
  - **user_ids** (_Array of String_) - Send notification to the specified userIds.
  - **fcm_devices** (_Array of String_) - Send notification to the list of specified Android devices.
  - **apns_devices** (_Array of String_) - Send notification to the list of specified iOS devices.
  - **chrome_devices** (_Array of String_) - Send notification to the list of specified Chrome devices.
  - **firefox_devices** (_Array of string_) - Send notification to the list of specified Firefox devices.
  - **tags** (_Array of string_) - Send notification to the devices that have subscribed to any of these tags.
  - **platforms** (_Array of string_) - Send notification to the devices of the specified platforms.
    - Pass 'G' for google (Android) devices.
    - Pass 'A' for iOS devices.
    - Pass 'WEB_FIREFOX' for Firefox browser.
    - Pass 'WEB_CHROME' for Chrome browser.
- **Event Notifications SendNotificationsOptions** - Event Notifications Send Notifications method.
  - **instance_id\*** (_string_) - Unique identifier for IBM Cloud Event Notifications instance.
  - **ibmenseverity** (_string_) - Severity for the notifications. Some sources can have the concept of an Event severity. Hence a handy way is provided to specify a severity of the event. example: LOW, HIGH, MEDIUM
  - **id\*** (_string_) - A unique identifier that identifies each event. source+id must be unique. The backend should be able to uniquely track this id in logs and other records. Send unique ID for each send notification. Same ID can be sent in case of failure of send notification. source+id will be logged in IBM Cloud Logging service. Using this combination we will be able to trace the event movement from one system to another and will aid in debugging and tracing.
  - **source\*** (_string_) - Source of the notifications. This is the identifier of the event producer. A way to uniquely identify the source of the event. For IBM Cloud services this is the crn of the service instance producing the events. For API sources this can be something the event producer backend can uniquely identify itself with.
  - **ibmensourceid\*** (_string_) - This is the ID of the source created in EN. This is available in the EN UI in the "Sources" section.
  - **type** (_string_) - This describes the type of event. It is of the form <event-type-name>:<sub-type> This type is defined by the producer. The event type name has to be prefixed with the reverse DNS names so the event type is uniquely identified. The same event type can be produced by 2 different sources. It is highly recommended to use hyphen - as a separator instead of \_.
  - **data** (_string_) - The payload for webhook notification. If data is added as part of payload then its mandatory to add **datacontenttype**.
  - **datacontenttype** - The notification content type. example: application/json
  - **time** (_string_) - Time of the notifications. UTC time stamp when the event occurred. Must be in the RFC 3339 format.
  - **ibmenpushto** (_string_) - Targets for the FCM notifications. This contains details about the destination where you want to send push notification. This attribute is mandatory for successful delivery from an Android FCM or APNS destination.
  - **ibmenfcmbody** (_string_) - Set payload string specific to Android platform [Refer this FCM official [link](https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support)].
  - **ibmenhuaweibody** (_string_) - Set payload string specific to Android platform [Refer this FCM official [link](https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support)].
  - **ibmenapnsbody** (_string_) - Set payload string specific to iOS platform [Refer this APNs official doc [link](https://developer.apple.com/library/archive/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html)].
  - **ibmensafaribody** (_string_) - Set payload string specific to safari platform [Refer this Safari official doc [link](https://developer.huawei.com/consumer/en/hms/huawei-pushkit)].
  - **ibmenapnsheaders** (_string_) - Set headers required for the APNs message [Refer this APNs official [link](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/sending_notification_requests_to_apns)(Table 1 Header fields for a POST request)]
  - **ibmenchromebody** (_string_) - Message body for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - **ibmenfirefoxbody** (_string_) - Message body for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - **ibmenchromeheaders** (_string_) - Headers for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - **ibmenfirefoxheaders** (_string_) - Headers for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - **ibmendefaultshort\*** (_string_) - Default short text for the message.
  - **ibmendefaultlong\*** (_string_) - Default long text for the message.
  - **specversion\*** (_string_) - Spec version of the Event Notifications. Default value is `1.0`.
  - **ibmenhtmlbody** (_string_) - The html body of notification for email.
  - **ibmenmailto** (_Array of string_) - Array of email ids to which the notification to be sent.
  - **ibmensmsto** (_Array of string_) - Array of SMS numbers to which the notification to be sent.
  - **ibmensmstext** (_string_) - SMS text to be sent.
  - **ibmenslackto** (_Array of string_) - Array of Slack channel/member ids to which the notification to be sent.
  - **ibmentemplates** (_Array of string_) - Array of template IDs that needs to be applied while sending notification for custom domain email and slack destination.
  - **ibmenmarkdown** (_string_) - The markdown content of pretty formatting.

Note: variable with \* represents the mandatory attribute.

</details>

## Set Environment

Find `event_notifications.env.hide` in the repo and rename it to `event_notifications.env`. After that add the values for,

- `EVENT_NOTIFICATIONS_URL` - Add the Event Notifications service instance Url.
- `EVENT_NOTIFICATIONS_APIKEY` - Add the Event Notifications service instance apikey.
- `EVENT_NOTIFICATIONS_GUID` - Add the Event Notifications service instance GUID.

**Optional**

- `EVENT_NOTIFICATIONS_AUTH_URL` - Add the IAM url if you are using IBM test cloud.
- `EVENT_NOTIFICATIONS_FCM_KEY` - Add firebase server key for Android FCM destination.
- `EVENT_NOTIFICATIONS_FCM_ID` - Add firebase sender Id for Android FCM destination.
- `EVENT_NOTIFICATIONS_FCM_PROJECT_ID` - fcm project id
- `EVENT_NOTIFICATIONS_FCM_CLIENT_EMAIL` - fcm client email
- `EVENT_NOTIFICATIONS_FCM_PRIVATE_KEY` - fcm private key
- `EVENT_NOTIFICATIONS_SAFARI_CERTIFICATE` - safari certificate path

- `EVENT_NOTIFICATIONS_SNOW_CLIENT_ID` - service now client id
- `EVENT_NOTIFICATIONS_SNOW_CLIENT_SECRET` - service now client secret
- `EVENT_NOTIFICATIONS_SNOW_USER_NAME` - service now user name
- `EVENT_NOTIFICATIONS_SNOW_PASSWORD` - service now password
- `EVENT_NOTIFICATIONS_SNOW_INSTANCE_NAME` - service now instance name

- `EVENT_NOTIFICATIONS_COS_BUCKET_NAME` - cloud object storage bucket name
- `EVENT_NOTIFICATIONS_COS_INSTANCE` - cloud object storage instance id
- `EVENT_NOTIFICATIONS_COS_INSTANCE_CRN` - cloud object storage instance crn
- `EVENT_NOTIFICATIONS_COS_ENDPOINT` - cloud object storage end point

- `EVENT_NOTIFICATIONS_CODE_ENGINE_URL` - code engine app url
- `EVENT_NOTIFICATIONS_CODE_ENGINE_PROJECT_CRN` - code engine project crn
- `EVENT_NOTIFICATIONS_HUAWEI_CLIENT_SECRET` - huawei client secret
- `EVENT_NOTIFICATIONS_HUAWEI_CLIENT_ID` - huawei client id

- `EVENT_NOTIFICATIONS_SLACK_URL` - slack webhook url
- `EVENT_NOTIFICATIONS_MS_TEAMS_URL` - msteams webhook url
- `EVENT_NOTIFICATIONS_PD_ROUTING_KEY` - pagerduty routing key
- `EVENT_NOTIFICATIONS_PD_API_KEY` - pagerduty api key
- `EVENT_NOTIFICATIONS_TEMPLATE_BODY` - base 64 encoded html content for Email
- `EVENT_NOTIFICATIONS_SLACK_TEMPLATE_BODY` - base 64 encoded json body for slack destination
- `EVENT_NOTIFICATIONS_WEBHOOK_TEMPLATE_BODY` - base 64 encoded json body for webhook destination
- `EVENT_NOTIFICATIONS_SCHEDULER_SOURCE_ID` - periodic timer source id
- `EVENT_NOTIFICATIONS_PAGERDUTY_TEMPLATE_BODY` - base 64 encoded json body for pagerduty destination
- `EVENT_NOTIFICATIONS_EVENT_STREAMS_TEMPLATE_BODY` - base 64 encoded json body for event streams destination
- `EVENT_NOTIFICATIONS_EVENT_STREAMS_CRN` - Event Streams instance CRN
- `EVENT_NOTIFICATIONS_EVENT_STREAMS_TOPIC` - Event Streams instance Topic name
- `EVENT_NOTIFICATIONS_EVENT_STREAMS_ENDPOINT` - Event streams end point

## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Issues

If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/event-notifications-java-admin-sdk/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

## ⚠️ Deprecation Notice (Attributes)

### Pagerduty Destination Configuration

> The following attribute from DestinationConfigOneOfPagerDutyDestinationConfig.java
is **deprecated** and will be removed in a future release:

- `apikey`

This attribute no longer recommended for use and may not be supported in upcoming versions of the SDK. Only `routingKey` is expected to be passed.

## Open source @ IBM

Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing

See [CONTRIBUTING](CONTRIBUTING.md).

## License

The IBM Cloud Event Notifications Service Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](LICENSE).
