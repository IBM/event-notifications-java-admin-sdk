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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFCMBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Style;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NotificationFCMBodyMessageData model.
 */
public class NotificationFCMBodyMessageDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNotificationFCMBodyMessageData() throws Throwable {
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

    String json = TestUtilities.serialize(notificationFcmBodyMessageDataModel);

    NotificationFCMBodyMessageData notificationFcmBodyMessageDataModelNew = TestUtilities.deserialize(json, NotificationFCMBodyMessageData.class);
    assertTrue(notificationFcmBodyMessageDataModelNew instanceof NotificationFCMBodyMessageData);
    assertEquals(notificationFcmBodyMessageDataModelNew.alert(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.collapseKey(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.interactiveCategory(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.icon(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.delayWhileIdle(), Boolean.valueOf(true));
    assertEquals(notificationFcmBodyMessageDataModelNew.sync(), Boolean.valueOf(true));
    assertEquals(notificationFcmBodyMessageDataModelNew.visibility(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.redact(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.priority(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.sound(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.timeToLive(), Long.valueOf("0"));
    assertEquals(notificationFcmBodyMessageDataModelNew.lights().toString(), lightsModel.toString());
    assertEquals(notificationFcmBodyMessageDataModelNew.androidTitle(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.groupId(), "testString");
    assertEquals(notificationFcmBodyMessageDataModelNew.style().toString(), styleModel.toString());
    assertEquals(notificationFcmBodyMessageDataModelNew.type(), "DEFAULT");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNotificationFCMBodyMessageDataError() throws Throwable {
    new NotificationFCMBodyMessageData.Builder().build();
  }

}