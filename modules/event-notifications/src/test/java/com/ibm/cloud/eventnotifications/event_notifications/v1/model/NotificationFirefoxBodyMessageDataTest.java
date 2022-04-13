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
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NotificationFirefoxBodyMessageData model.
 */
public class NotificationFirefoxBodyMessageDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNotificationFirefoxBodyMessageData() throws Throwable {
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

    String json = TestUtilities.serialize(notificationFirefoxBodyMessageDataModel);

    NotificationFirefoxBodyMessageData notificationFirefoxBodyMessageDataModelNew = TestUtilities.deserialize(json, NotificationFirefoxBodyMessageData.class);
    assertTrue(notificationFirefoxBodyMessageDataModelNew instanceof NotificationFirefoxBodyMessageData);
    assertEquals(notificationFirefoxBodyMessageDataModelNew.alert(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModelNew.title(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModelNew.iconUrl(), "testString");
    assertEquals(notificationFirefoxBodyMessageDataModelNew.timeToLive(), Long.valueOf("0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNotificationFirefoxBodyMessageDataError() throws Throwable {
    new NotificationFirefoxBodyMessageData.Builder().build();
  }

}