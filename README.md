[![Build Status](https://app.travis-ci.com/IBM/event-notifications-java-admin-sdk.svg?branch=main)](https://travis-ci.com/IBM/event-notifications-java-admin-sdk)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# Java server SDK for IBM Cloud Event Notifications service Version 0.1.0
Java client library to interact with various [IBM Cloud Event Notifications Service](https://cloud.ibm.com/apidocs?category=event-notifications).

Disclaimer: this SDK is being released initially as a **pre-release** version.
Changes might occur which impact applications that use this SDK.

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
[Event Notifications Service](https://cloud.ibm.com/apidocs/event-notifications) | com.ibm.cloud:event-notifications:0.1.0

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An Event Notifications Instance
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* Java 8 or above.

## Installation
The current version of this SDK is: 0.1.0

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
    <version>0.1.0</version>
</dependency>
```

### Gradle
```gradle
compile 'com.ibm.cloud:event-notifications:0.1.0'
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
- [Subscriptions](#subscriptions)
  - [Create Subscription](#create-subscription)
  - [List Subscriptions](#list-subscriptions)
  - [Get Subscription](#get-subscription)
  - [Update Subscription](#update-subscription)
  - [Delete Subscription](#delete-subscription)
- [Send Notifications](#send-notifications)
- [Send Bulk Notifications](#send-bulk-notifications)

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

      String notificationDevices =  "{\"user_ids\": [\"userId\"]}";
      String fcmJsonString = "{ 'title' : '<notification-title>', 'badge': '<notification-message>' }";
      String apnsJsonString = "{'alert': '<notification-message>', 'badge': 5 }";
      JsonObject apnsJsonObject = JsonParser.parseString(apnsJsonString).getAsJsonObject();

      Map<String, Object> messageApnsHeader = new java.util.HashMap<String, Object>() { { put("apns-collapse-id", "<apns-apns-collapse-id-value>"); } };

      SendNotificationsOptions sendNotificationsOptions = new SendNotificationsOptions.Builder()
              .instanceId(instanceId)
              .ceIbmenseverity("<notification-severity>")
              .ceId("<notification-id>")
              .ceSource(sourceId)
              .ceIbmensourceid(sourceId)
              .ceType("<notification-type>")
              .ceTime(new java.util.Date())
              .ceIbmenpushto(notificationDevices)
              .ceIbmenfcmbody(fcmBodyNotificationPayload)
              .ceIbmenapnsbody(apnsBodyNotificationPayload)
              .ceIbmenapnsheaders(messageApnsHeader)
              .ceSpecversion("1.0")
              .build();
      
        Response<NotificationResponse> response = eventNotificationsService.sendNotifications(sendNotificationsOptions).execute();
      NotificationResponse notificationResponse = response.getResult();```
```
<details open>
<summary>Send Notifications Variables</summary>
<br>

- **CeIbmenpushto** - Set up the push notifications targets.
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
  - *ceIbmenseverity* (**String**) - Severity for the notifications.
  - *ceID* (**String**) - ID for the notifications.
  - *ceSource* (**String**) - Source of the notifications.
  - *ceIbmensourceid* (**String**) - Event Notifications instance Source ID.
  - *ceType* (**String**) - Type for the notifications.
  - *ceTime* (**String**) - Time of the notifications.
  - *ceIbmenpushto* (**string**) - Targets for the FCM notifications.
  - *ceIbmenfcmbody* (**string**) - Set payload string specific to Android platform [Refer this FCM official [link](https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support)].
  - *ceIbmenapnsbody* (**string**) - Set payload string specific to iOS platform [Refer this APNs official doc [link](https://developer.apple.com/library/archive/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html)].
  - *ceIbmenapnsheaders* (**string**) - Set headers required for the APNs message [Refer this APNs official [link](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/sending_notification_requests_to_apns)(Table 1 Header fields for a POST request)]
  - *ceIbmenchromebody* (**string**) - Message body for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ceIbmenfirefoxbody* (**string**) - Message body for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ceIbmenchromeheaders* (**string**) - Headers for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ceIbmenfirefoxheaders* (**string**) - Headers for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *ceSpecversion* (**String**) - Spec version of the Event Notifications. Default value is `1.0`.

</details>

### Send Bulk Notifications
```java
      String notificationDevices = "{\"user_ids\": [\"userId\"]}";
      String fcmJsonString = "{ \"title\" : \"Portugal vs. Denmark\", \"badge\": \"great match\" }";
      String apnsJsonString = "{\"alert\": \"Game Request\", \"badge\": 5 }";

        NotificationCreate notificationCreateModel = new NotificationCreate.Builder()
              .ibmenseverity("<notification-severity>")
              .ibmenfcmbody(fcmJsonString)
              .ibmenapnsbody(apnsJsonString)
              .ibmenpushto(notificationDevices)
              .ibmensourceid(sourceId)
              .id("<notification-id>")
              .source(sourceId)
              .type("<notification-type>")
              .specversion("1.0")
              .time(new java.util.Date().toString())
              .build();

        SendBulkNotificationsOptions sendBulkNotificationsOptions = new SendBulkNotificationsOptions.Builder()
        .instanceId(instanceId)
        .bulkMessages(new java.util.ArrayList<NotificationCreate>(java.util.Arrays.asList(notificationCreateModel)))
        .build();

        Response<BulkNotificationResponse> response = service.sendBulkNotifications(sendBulkNotificationsOptions).execute();
      NotificationResponse notificationResponse = response.getResult();```
```
<details open>
<summary>Send Bulk Notifications Variables</summary>
<br>

- **Ibmenpushto** - Set up the push notifications targets.
  - *user_ids* (Array of **String**) - Send notification to the specified userIds.
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
  - *Ibmenseverity* (**String**) - Severity for the notifications.
  - *ID* (**String**) - ID for the notifications.
  - *Source* (**String**) - Source of the notifications.
  - *Ibmensourceid* (**String**) - Event Notifications instance Source ID.
  - *Type* (**String**) - Type for the notifications.
  - *Time* (**String**) - Time of the notifications.
  - *Ibmenpushto* (**string**) - Targets for the FCM notifications.
  - *Ibmenfcmbody* (**string**) - Set payload string specific to Android platform [Refer this FCM official [link](https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support)].
  - *Ibmenapnsbody* (**string**) - Set payload string specific to iOS platform [Refer this APNs official doc [link](https://developer.apple.com/library/archive/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html)].
  - *Ibmenapnsheaders* (**string**) - Set headers required for the APNs message [Refer this APNs official [link](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/sending_notification_requests_to_apns)(Table 1 Header fields for a POST request)]
  - *Ibmenchromebody* (**string**) - Message body for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *Ibmenfirefoxbody* (**string**) - Message body for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *Ibmenchromeheaders* (**string**) - Headers for the Chrome notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *Ibmenfirefoxheaders* (**string**) - Headers for the Firefox notifications. Refer [this official documentation](https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification) for more.
  - *Specversion* (**String**) - Spec version of the Event Notifications. Default value is `1.0`.

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
