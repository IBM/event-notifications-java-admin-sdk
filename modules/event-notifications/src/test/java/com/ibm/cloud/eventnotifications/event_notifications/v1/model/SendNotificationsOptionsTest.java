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

package com.ibm.cloud.eventnotifications.event_notifications.v1.model;

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Lights;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationChromeBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationChromeBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationDevices;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFirefoxBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFirefoxBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsRequestNotificationCreate;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Style;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SendNotificationsOptions model.
 */
public class SendNotificationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSendNotificationsOptions() throws Throwable {
    Lights lightsModel = new Lights.Builder()
      .ledArgb("testString")
      .ledOnMs(Long.valueOf("0"))
      .ledOffMs("testString")
      .build();
    assertEquals(lightsModel.ledArgb(), "testString");
    assertEquals(lightsModel.ledOnMs(), Long.valueOf("0"));
    assertEquals(lightsModel.ledOffMs(), "testString");

    Style styleModel = new Style.Builder()
      .type("testString")
      .title("testString")
      .url("testString")
      .text("testString")
      .lines(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();
    assertEquals(styleModel.getType(), "testString");
    assertEquals(styleModel.getTitle(), "testString");
    assertEquals(styleModel.getUrl(), "testString");
    assertEquals(styleModel.getText(), "testString");
    assertEquals(styleModel.getLines(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(styleModel.get("foo"), "testString");

    NotificationFCMBodyMessageData notificationFcmBodyMessageDataModel = new NotificationFCMBodyMessageData.Builder()
      .alert("testString")
      .collapseKey("testString")
      .interactiveCategory("testString")
      .icon("testString")
      .delayWhileIdle(true)
      .sync(true)
      .visibility("testString")
      .redact("testString")
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .priority("testString")
      .sound("testString")
      .timeToLive(Long.valueOf("0"))
      .lights(lightsModel)
      .androidTitle("testString")
      .groupId("testString")
      .style(styleModel)
      .type("DEFAULT")
      .build();
    assertEquals(notificationFcmBodyMessageDataModel.alert(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.collapseKey(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.interactiveCategory(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.icon(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.delayWhileIdle(), Boolean.valueOf(true));
    assertEquals(notificationFcmBodyMessageDataModel.sync(), Boolean.valueOf(true));
    assertEquals(notificationFcmBodyMessageDataModel.visibility(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.redact(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.payload(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(notificationFcmBodyMessageDataModel.priority(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.sound(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.timeToLive(), Long.valueOf("0"));
    assertEquals(notificationFcmBodyMessageDataModel.lights(), lightsModel);
    assertEquals(notificationFcmBodyMessageDataModel.androidTitle(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.groupId(), "testString");
    assertEquals(notificationFcmBodyMessageDataModel.style(), styleModel);
    assertEquals(notificationFcmBodyMessageDataModel.type(), "DEFAULT");

    NotificationFCMBodyMessageENData notificationFcmBodyModel = new NotificationFCMBodyMessageENData.Builder()
      .enData(notificationFcmBodyMessageDataModel)
      .add("foo", "testString")
      .build();
    assertEquals(notificationFcmBodyModel.getEnData(), notificationFcmBodyMessageDataModel);
    assertEquals(notificationFcmBodyModel.get("foo"), "testString");

    NotificationAPNSBodyMessageData notificationApnsBodyMessageDataModel = new NotificationAPNSBodyMessageData.Builder()
      .alert("testString")
      .badge(Long.valueOf("26"))
      .interactiveCategory("testString")
      .iosActionKey("testString")
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .sound("testString")
      .titleLocKey("testString")
      .locKey("testString")
      .launchImage("testString")
      .titleLocArgs(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .locArgs(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .title("testString")
      .subtitle("testString")
      .attachmentUrl("testString")
      .type("DEFAULT")
      .apnsCollapseId("testString")
      .apnsThreadId("testString")
      .apnsGroupSummaryArg("testString")
      .apnsGroupSummaryArgCount(Long.valueOf("26"))
      .build();
    assertEquals(notificationApnsBodyMessageDataModel.alert(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.badge(), Long.valueOf("26"));
    assertEquals(notificationApnsBodyMessageDataModel.interactiveCategory(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.iosActionKey(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.payload(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(notificationApnsBodyMessageDataModel.sound(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.titleLocKey(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.locKey(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.launchImage(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.titleLocArgs(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(notificationApnsBodyMessageDataModel.locArgs(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(notificationApnsBodyMessageDataModel.title(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.subtitle(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.attachmentUrl(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.type(), "DEFAULT");
    assertEquals(notificationApnsBodyMessageDataModel.apnsCollapseId(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.apnsThreadId(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.apnsGroupSummaryArg(), "testString");
    assertEquals(notificationApnsBodyMessageDataModel.apnsGroupSummaryArgCount(), Long.valueOf("26"));

    NotificationAPNSBodyMessageENData notificationApnsBodyModel = new NotificationAPNSBodyMessageENData.Builder()
      .enData(notificationApnsBodyMessageDataModel)
      .add("foo", "testString")
      .build();
    assertEquals(notificationApnsBodyModel.getEnData(), notificationApnsBodyMessageDataModel);
    assertEquals(notificationApnsBodyModel.get("foo"), "testString");

    NotificationDevices notificationDevicesModel = new NotificationDevices.Builder()
      .fcmDevices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .apnsDevices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .userIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .platforms(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(notificationDevicesModel.fcmDevices(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(notificationDevicesModel.apnsDevices(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(notificationDevicesModel.userIds(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(notificationDevicesModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(notificationDevicesModel.platforms(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    NotificationChromeBodyMessageData notificationChromeBodyMessageDataModel = new NotificationChromeBodyMessageData.Builder()
      .alert("testString")
      .title("testString")
      .iconUrl("testString")
      .timeToLive(Long.valueOf("0"))
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(notificationChromeBodyMessageDataModel.alert(), "testString");
    assertEquals(notificationChromeBodyMessageDataModel.title(), "testString");
    assertEquals(notificationChromeBodyMessageDataModel.iconUrl(), "testString");
    assertEquals(notificationChromeBodyMessageDataModel.timeToLive(), Long.valueOf("0"));
    assertEquals(notificationChromeBodyMessageDataModel.payload(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    NotificationChromeBodyMessageENData notificationChromeBodyModel = new NotificationChromeBodyMessageENData.Builder()
      .enData(notificationChromeBodyMessageDataModel)
      .add("foo", "testString")
      .build();
    assertEquals(notificationChromeBodyModel.getEnData(), notificationChromeBodyMessageDataModel);
    assertEquals(notificationChromeBodyModel.get("foo"), "testString");

    NotificationFirefoxBodyMessageData notificationFirefoxBodyMessageDataModel = new NotificationFirefoxBodyMessageData.Builder()
      .alert("testString")
      .title("testString")
      .iconUrl("testString")
      .timeToLive(Long.valueOf("0"))
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(notificationFirefoxBodyMessageDataModel.alert(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModel.title(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModel.iconUrl(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModel.timeToLive(), Long.valueOf("0"));
    assertEquals(notificationFirefoxBodyMessageDataModel.payload(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    NotificationFirefoxBodyMessageENData notificationFirefoxBodyModel = new NotificationFirefoxBodyMessageENData.Builder()
      .enData(notificationFirefoxBodyMessageDataModel)
      .add("foo", "testString")
      .build();
    assertEquals(notificationFirefoxBodyModel.getEnData(), notificationFirefoxBodyMessageDataModel);
    assertEquals(notificationFirefoxBodyModel.get("foo"), "testString");

    SendNotificationsRequestNotificationCreate sendNotificationsRequestModel = new SendNotificationsRequestNotificationCreate.Builder()
      .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ibmenseverity("testString")
      .ibmenfcmbody(notificationFcmBodyModel)
      .ibmenapnsbody(notificationApnsBodyModel)
      .ibmenpushto(notificationDevicesModel)
      .ibmenapnsheaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ibmendefaultshort("testString")
      .ibmendefaultlong("testString")
      .ibmenchromebody(notificationChromeBodyModel)
      .ibmenfirefoxbody(notificationFirefoxBodyModel)
      .ibmenchromeheaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ibmenfirefoxheaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ibmensourceid("testString")
      .datacontenttype("application/json")
      .subject("testString")
      .id("testString")
      .source("testString")
      .type("testString")
      .specversion("1.0")
      .time(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .add("foo", "testString")
      .build();
    assertEquals(sendNotificationsRequestModel.getData(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsRequestModel.getIbmenseverity(), "testString");
    assertEquals(sendNotificationsRequestModel.getIbmenfcmbody(), notificationFcmBodyModel);
    assertEquals(sendNotificationsRequestModel.getIbmenapnsbody(), notificationApnsBodyModel);
    assertEquals(sendNotificationsRequestModel.getIbmenpushto(), notificationDevicesModel);
    assertEquals(sendNotificationsRequestModel.getIbmenapnsheaders(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsRequestModel.getIbmendefaultshort(), "testString");
    assertEquals(sendNotificationsRequestModel.getIbmendefaultlong(), "testString");
    assertEquals(sendNotificationsRequestModel.getIbmenchromebody(), notificationChromeBodyModel);
    assertEquals(sendNotificationsRequestModel.getIbmenfirefoxbody(), notificationFirefoxBodyModel);
    assertEquals(sendNotificationsRequestModel.getIbmenchromeheaders(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsRequestModel.getIbmenfirefoxheaders(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsRequestModel.getIbmensourceid(), "testString");
    assertEquals(sendNotificationsRequestModel.getDatacontenttype(), "application/json");
    assertEquals(sendNotificationsRequestModel.getSubject(), "testString");
    assertEquals(sendNotificationsRequestModel.getId(), "testString");
    assertEquals(sendNotificationsRequestModel.getSource(), "testString");
    assertEquals(sendNotificationsRequestModel.getType(), "testString");
    assertEquals(sendNotificationsRequestModel.getSpecversion(), "1.0");
    assertEquals(sendNotificationsRequestModel.getTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(sendNotificationsRequestModel.get("foo"), "testString");

    SendNotificationsOptions sendNotificationsOptionsModel = new SendNotificationsOptions.Builder()
      .instanceId("testString")
      .body(sendNotificationsRequestModel)
      .ceIbmenseverity("testString")
      .ceIbmendefaultshort("testString")
      .ceIbmendefaultlong("testString")
      .ceIbmenfcmbody(notificationFcmBodyModel)
      .ceIbmenapnsbody(notificationApnsBodyModel)
      .ceIbmenpushto(notificationDevicesModel)
      .ceIbmenapnsheaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ceIbmenchromebody(notificationChromeBodyModel)
      .ceIbmenfirefoxbody(notificationFirefoxBodyModel)
      .ceIbmenchromeheaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ceIbmenfirefoxheaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ceIbmensourceid("testString")
      .ceId("testString")
      .ceSource("testString")
      .ceType("testString")
      .ceSpecversion("1.0")
      .ceTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(sendNotificationsOptionsModel.instanceId(), "testString");
    assertEquals(sendNotificationsOptionsModel.body(), sendNotificationsRequestModel);
    assertEquals(sendNotificationsOptionsModel.ceIbmenseverity(), "testString");
    assertEquals(sendNotificationsOptionsModel.ceIbmendefaultshort(), "testString");
    assertEquals(sendNotificationsOptionsModel.ceIbmendefaultlong(), "testString");
    assertEquals(sendNotificationsOptionsModel.ceIbmenfcmbody(), notificationFcmBodyModel);
    assertEquals(sendNotificationsOptionsModel.ceIbmenapnsbody(), notificationApnsBodyModel);
    assertEquals(sendNotificationsOptionsModel.ceIbmenpushto(), notificationDevicesModel);
    assertEquals(sendNotificationsOptionsModel.ceIbmenapnsheaders(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsOptionsModel.ceIbmenchromebody(), notificationChromeBodyModel);
    assertEquals(sendNotificationsOptionsModel.ceIbmenfirefoxbody(), notificationFirefoxBodyModel);
    assertEquals(sendNotificationsOptionsModel.ceIbmenchromeheaders(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsOptionsModel.ceIbmenfirefoxheaders(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsOptionsModel.ceIbmensourceid(), "testString");
    assertEquals(sendNotificationsOptionsModel.ceId(), "testString");
    assertEquals(sendNotificationsOptionsModel.ceSource(), "testString");
    assertEquals(sendNotificationsOptionsModel.ceType(), "testString");
    assertEquals(sendNotificationsOptionsModel.ceSpecversion(), "1.0");
    assertEquals(sendNotificationsOptionsModel.ceTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSendNotificationsOptionsError() throws Throwable {
    new SendNotificationsOptions.Builder().build();
  }

}