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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationAPNSBodyMessageENData;
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
 * Unit test class for the NotificationAPNSBodyMessageENData model.
 */
public class NotificationAPNSBodyMessageENDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNotificationAPNSBodyMessageENData() throws Throwable {
    NotificationAPNSBodyMessageData notificationApnsBodyMessageDataModel = new NotificationAPNSBodyMessageData.Builder()
      .alert("Mario")
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
    assertEquals(notificationApnsBodyMessageDataModel.alert(), "Mario");
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

    NotificationAPNSBodyMessageENData notificationApnsBodyMessageEnDataModel = new NotificationAPNSBodyMessageENData.Builder()
      .enData(notificationApnsBodyMessageDataModel)
      .add("foo", "testString")
      .build();
    assertEquals(notificationApnsBodyMessageEnDataModel.getEnData(), notificationApnsBodyMessageDataModel);
    assertEquals(notificationApnsBodyMessageEnDataModel.get("foo"), "testString");

    String json = TestUtilities.serialize(notificationApnsBodyMessageEnDataModel);

    NotificationAPNSBodyMessageENData notificationApnsBodyMessageEnDataModelNew = TestUtilities.deserialize(json, NotificationAPNSBodyMessageENData.class);
    assertTrue(notificationApnsBodyMessageEnDataModelNew instanceof NotificationAPNSBodyMessageENData);
    assertEquals(notificationApnsBodyMessageEnDataModelNew.getEnData().toString(), notificationApnsBodyMessageDataModel.toString());
    assertEquals(notificationApnsBodyMessageEnDataModelNew.get("foo"), "testString");
  }
}