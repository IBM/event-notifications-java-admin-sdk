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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationChromeBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationChromeBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NotificationChromeBodyMessageENData model.
 */
public class NotificationChromeBodyMessageENDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNotificationChromeBodyMessageENData() throws Throwable {
    NotificationChromeBodyMessageData notificationChromeBodyMessageDataModel = new NotificationChromeBodyMessageData.Builder()
      .alert("Mario")
      .title("testString")
      .iconUrl("testString")
      .timeToLive(Long.valueOf("100"))
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(notificationChromeBodyMessageDataModel.alert(), "Mario");
    assertEquals(notificationChromeBodyMessageDataModel.title(), "testString");
    assertEquals(notificationChromeBodyMessageDataModel.iconUrl(), "testString");
    assertEquals(notificationChromeBodyMessageDataModel.timeToLive(), Long.valueOf("100"));
    assertEquals(notificationChromeBodyMessageDataModel.payload(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    NotificationChromeBodyMessageENData notificationChromeBodyMessageEnDataModel = new NotificationChromeBodyMessageENData.Builder()
      .enData(notificationChromeBodyMessageDataModel)
      .add("foo", "testString")
      .build();
    assertEquals(notificationChromeBodyMessageEnDataModel.getEnData(), notificationChromeBodyMessageDataModel);
    assertEquals(notificationChromeBodyMessageEnDataModel.get("foo"), "testString");

    String json = TestUtilities.serialize(notificationChromeBodyMessageEnDataModel);

    NotificationChromeBodyMessageENData notificationChromeBodyMessageEnDataModelNew = TestUtilities.deserialize(json, NotificationChromeBodyMessageENData.class);
    assertTrue(notificationChromeBodyMessageEnDataModelNew instanceof NotificationChromeBodyMessageENData);
    assertEquals(notificationChromeBodyMessageEnDataModelNew.getEnData().toString(), notificationChromeBodyMessageDataModel.toString());
    assertEquals(notificationChromeBodyMessageEnDataModelNew.get("foo"), "testString");
  }
}