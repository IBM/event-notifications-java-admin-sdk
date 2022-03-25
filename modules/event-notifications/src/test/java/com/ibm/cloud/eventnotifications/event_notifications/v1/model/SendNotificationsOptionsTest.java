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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationDevices;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
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

    SendNotificationsOptions sendNotificationsOptionsModel = new SendNotificationsOptions.Builder()
      .instanceId("testString")
      .ibmenseverity("testString")
      .ibmensourceid("testString")
      .subject("testString")
      .id("testString")
      .source("testString")
      .type("testString")
      .time(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ibmenfcmbody(notificationFcmBodyModel)
      .ibmenapnsbody(notificationApnsBodyModel)
      .ibmenpushto(notificationDevicesModel)
      .ibmenapnsheaders(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .datacontenttype("application/json")
      .specversion("1.0")
      .build();
    assertEquals(sendNotificationsOptionsModel.instanceId(), "testString");
    assertEquals(sendNotificationsOptionsModel.ibmenseverity(), "testString");
    assertEquals(sendNotificationsOptionsModel.ibmensourceid(), "testString");
    assertEquals(sendNotificationsOptionsModel.subject(), "testString");
    assertEquals(sendNotificationsOptionsModel.id(), "testString");
    assertEquals(sendNotificationsOptionsModel.source(), "testString");
    assertEquals(sendNotificationsOptionsModel.type(), "testString");
    assertEquals(sendNotificationsOptionsModel.time(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(sendNotificationsOptionsModel.data(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsOptionsModel.ibmenfcmbody(), notificationFcmBodyModel);
    assertEquals(sendNotificationsOptionsModel.ibmenapnsbody(), notificationApnsBodyModel);
    assertEquals(sendNotificationsOptionsModel.ibmenpushto(), notificationDevicesModel);
    assertEquals(sendNotificationsOptionsModel.ibmenapnsheaders(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(sendNotificationsOptionsModel.datacontenttype(), "application/json");
    assertEquals(sendNotificationsOptionsModel.specversion(), "1.0");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSendNotificationsOptionsError() throws Throwable {
    new SendNotificationsOptions.Builder().build();
  }

}