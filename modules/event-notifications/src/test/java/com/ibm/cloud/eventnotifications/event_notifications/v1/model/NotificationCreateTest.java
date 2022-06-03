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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationCreate;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NotificationCreate model.
 */
public class NotificationCreateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNotificationCreate() throws Throwable {
    NotificationCreate notificationCreateModel = new NotificationCreate.Builder()
      .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .ibmenseverity("testString")
      .ibmenfcmbody("testString")
      .ibmenapnsbody("testString")
      .ibmensafaribody("testString")
      .ibmenpushto("{\"fcm_devices\":[\"9c75975a-37d0-3898-905d-3b5ee0d7c172\",\"C9CACDF5-6EBF-49E1-AD60-E25BA23E954C\"],\"apns_devices\":[\"3423-37d0-3898-905d-42342\",\"432423-6EBF-49E1-AD60-4234\"],\"user_ids\":[\"user-1\",\"user-2\"],\"tags\":[\"tag-1\",\"tag-2\"],\"platforms\":[\"push_android\",\"push_ios\",\"push_chrome\",\"push_firefox\"]}")
      .ibmenapnsheaders("testString")
      .ibmendefaultshort("testString")
      .ibmendefaultlong("testString")
      .ibmenchromebody("testString")
      .ibmenfirefoxbody("testString")
      .ibmenchromeheaders("testString")
      .ibmenfirefoxheaders("testString")
      .ibmensourceid("testString")
      .datacontenttype("application/json")
      .subject("testString")
      .id("testString")
      .source("testString")
      .type("testString")
      .specversion("1.0")
      .time("testString")
      .add("foo", "testString")
      .build();
    assertEquals(notificationCreateModel.getData(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(notificationCreateModel.getIbmenseverity(), "testString");
    assertEquals(notificationCreateModel.getIbmenfcmbody(), "testString");
    assertEquals(notificationCreateModel.getIbmenapnsbody(), "testString");
    assertEquals(notificationCreateModel.getIbmensafaribody(), "testString");
    assertEquals(notificationCreateModel.getIbmenpushto(), "{\"fcm_devices\":[\"9c75975a-37d0-3898-905d-3b5ee0d7c172\",\"C9CACDF5-6EBF-49E1-AD60-E25BA23E954C\"],\"apns_devices\":[\"3423-37d0-3898-905d-42342\",\"432423-6EBF-49E1-AD60-4234\"],\"user_ids\":[\"user-1\",\"user-2\"],\"tags\":[\"tag-1\",\"tag-2\"],\"platforms\":[\"push_android\",\"push_ios\",\"push_chrome\",\"push_firefox\"]}");
    assertEquals(notificationCreateModel.getIbmenapnsheaders(), "testString");
    assertEquals(notificationCreateModel.getIbmendefaultshort(), "testString");
    assertEquals(notificationCreateModel.getIbmendefaultlong(), "testString");
    assertEquals(notificationCreateModel.getIbmenchromebody(), "testString");
    assertEquals(notificationCreateModel.getIbmenfirefoxbody(), "testString");
    assertEquals(notificationCreateModel.getIbmenchromeheaders(), "testString");
    assertEquals(notificationCreateModel.getIbmenfirefoxheaders(), "testString");
    assertEquals(notificationCreateModel.getIbmensourceid(), "testString");
    assertEquals(notificationCreateModel.getDatacontenttype(), "application/json");
    assertEquals(notificationCreateModel.getSubject(), "testString");
    assertEquals(notificationCreateModel.getId(), "testString");
    assertEquals(notificationCreateModel.getSource(), "testString");
    assertEquals(notificationCreateModel.getType(), "testString");
    assertEquals(notificationCreateModel.getSpecversion(), "1.0");
    assertEquals(notificationCreateModel.getTime(), "testString");
    assertEquals(notificationCreateModel.get("foo"), "testString");

    String json = TestUtilities.serialize(notificationCreateModel);

    NotificationCreate notificationCreateModelNew = TestUtilities.deserialize(json, NotificationCreate.class);
    assertTrue(notificationCreateModelNew instanceof NotificationCreate);
    assertEquals(notificationCreateModelNew.getIbmenseverity(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenfcmbody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenapnsbody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmensafaribody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenpushto(), "{\"fcm_devices\":[\"9c75975a-37d0-3898-905d-3b5ee0d7c172\",\"C9CACDF5-6EBF-49E1-AD60-E25BA23E954C\"],\"apns_devices\":[\"3423-37d0-3898-905d-42342\",\"432423-6EBF-49E1-AD60-4234\"],\"user_ids\":[\"user-1\",\"user-2\"],\"tags\":[\"tag-1\",\"tag-2\"],\"platforms\":[\"push_android\",\"push_ios\",\"push_chrome\",\"push_firefox\"]}");
    assertEquals(notificationCreateModelNew.getIbmenapnsheaders(), "testString");
    assertEquals(notificationCreateModelNew.getIbmendefaultshort(), "testString");
    assertEquals(notificationCreateModelNew.getIbmendefaultlong(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenchromebody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenfirefoxbody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenchromeheaders(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenfirefoxheaders(), "testString");
    assertEquals(notificationCreateModelNew.getIbmensourceid(), "testString");
    assertEquals(notificationCreateModelNew.getDatacontenttype(), "application/json");
    assertEquals(notificationCreateModelNew.getSubject(), "testString");
    assertEquals(notificationCreateModelNew.getId(), "testString");
    assertEquals(notificationCreateModelNew.getSource(), "testString");
    assertEquals(notificationCreateModelNew.getType(), "testString");
    assertEquals(notificationCreateModelNew.getSpecversion(), "1.0");
    assertEquals(notificationCreateModelNew.getTime(), "testString");
    assertEquals(notificationCreateModelNew.get("foo"), "testString");
  }
}