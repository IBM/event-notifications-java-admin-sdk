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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFirefoxBodyMessageData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationFirefoxBodyMessageENData;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NotificationFirefoxBodyMessageENData model.
 */
public class NotificationFirefoxBodyMessageENDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNotificationFirefoxBodyMessageENData() throws Throwable {
    NotificationFirefoxBodyMessageData notificationFirefoxBodyMessageDataModel = new NotificationFirefoxBodyMessageData.Builder()
      .alert("Mario")
      .title("testString")
      .iconUrl("testString")
      .timeToLive(Long.valueOf("100"))
      .payload(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(notificationFirefoxBodyMessageDataModel.alert(), "Mario");
    assertEquals(notificationFirefoxBodyMessageDataModel.title(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModel.iconUrl(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModel.timeToLive(), Long.valueOf("100"));
    assertEquals(notificationFirefoxBodyMessageDataModel.payload(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    NotificationFirefoxBodyMessageENData notificationFirefoxBodyMessageEnDataModel = new NotificationFirefoxBodyMessageENData.Builder()
      .enData(notificationFirefoxBodyMessageDataModel)
      .add("foo", "testString")
      .build();
    assertEquals(notificationFirefoxBodyMessageEnDataModel.getEnData(), notificationFirefoxBodyMessageDataModel);
    assertEquals(notificationFirefoxBodyMessageEnDataModel.get("foo"), "testString");

    String json = TestUtilities.serialize(notificationFirefoxBodyMessageEnDataModel);

    NotificationFirefoxBodyMessageENData notificationFirefoxBodyMessageEnDataModelNew = TestUtilities.deserialize(json, NotificationFirefoxBodyMessageENData.class);
    assertTrue(notificationFirefoxBodyMessageEnDataModelNew instanceof NotificationFirefoxBodyMessageENData);
    assertEquals(notificationFirefoxBodyMessageEnDataModelNew.getEnData().toString(), notificationFirefoxBodyMessageDataModel.toString());
    assertEquals(notificationFirefoxBodyMessageEnDataModelNew.get("foo"), "testString");
  }
}