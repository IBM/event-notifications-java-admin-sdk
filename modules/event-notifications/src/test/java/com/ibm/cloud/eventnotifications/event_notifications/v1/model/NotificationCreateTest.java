/*
 * (C) Copyright IBM Corp. 2023.
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
import com.ibm.cloud.sdk.core.util.DateUtils;
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
      .specversion("1.0")
      .time(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .id("testString")
      .source("testString")
      .type("testString")
      .ibmenseverity("testString")
      .ibmensourceid("testString")
      .ibmendefaultshort("testString")
      .ibmendefaultlong("testString")
      .ibmensubject("testString")
      .ibmensmsto("testString")
      .ibmenmailto("testString")
      .ibmenhtmlbody("testString")
      .subject("testString")
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .datacontenttype("application/json")
      .ibmenpushto("{\"platforms\":[\"push_android\"]}")
      .ibmenfcmbody("testString")
      .ibmenapnsbody("testString")
      .ibmenapnsheaders("testString")
      .ibmenchromebody("testString")
      .ibmenchromeheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmenfirefoxbody("testString")
      .ibmenfirefoxheaders("{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}")
      .ibmenhuaweibody("testString")
      .ibmensafaribody("testString")
      .add("foo", "testString")
      .build();
    assertEquals(notificationCreateModel.getSpecversion(), "1.0");
    assertEquals(notificationCreateModel.getTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(notificationCreateModel.getId(), "testString");
    assertEquals(notificationCreateModel.getSource(), "testString");
    assertEquals(notificationCreateModel.getType(), "testString");
    assertEquals(notificationCreateModel.getIbmenseverity(), "testString");
    assertEquals(notificationCreateModel.getIbmensourceid(), "testString");
    assertEquals(notificationCreateModel.getIbmendefaultshort(), "testString");
    assertEquals(notificationCreateModel.getIbmendefaultlong(), "testString");
    assertEquals(notificationCreateModel.getIbmensubject(), "testString");
    assertEquals(notificationCreateModel.getIbmensmsto(), "testString");
    assertEquals(notificationCreateModel.getIbmenmailto(), "testString");
    assertEquals(notificationCreateModel.getIbmenhtmlbody(), "testString");
    assertEquals(notificationCreateModel.getSubject(), "testString");
    assertEquals(notificationCreateModel.getData(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(notificationCreateModel.getDatacontenttype(), "application/json");
    assertEquals(notificationCreateModel.getIbmenpushto(), "{\"platforms\":[\"push_android\"]}");
    assertEquals(notificationCreateModel.getIbmenfcmbody(), "testString");
    assertEquals(notificationCreateModel.getIbmenapnsbody(), "testString");
    assertEquals(notificationCreateModel.getIbmenapnsheaders(), "testString");
    assertEquals(notificationCreateModel.getIbmenchromebody(), "testString");
    assertEquals(notificationCreateModel.getIbmenchromeheaders(), "{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}");
    assertEquals(notificationCreateModel.getIbmenfirefoxbody(), "testString");
    assertEquals(notificationCreateModel.getIbmenfirefoxheaders(), "{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}");
    assertEquals(notificationCreateModel.getIbmenhuaweibody(), "testString");
    assertEquals(notificationCreateModel.getIbmensafaribody(), "testString");
    assertEquals(notificationCreateModel.get("foo"), "testString");

    String json = TestUtilities.serialize(notificationCreateModel);

    NotificationCreate notificationCreateModelNew = TestUtilities.deserialize(json, NotificationCreate.class);
    assertTrue(notificationCreateModelNew instanceof NotificationCreate);
    assertEquals(notificationCreateModelNew.getSpecversion(), "1.0");
    assertEquals(notificationCreateModelNew.getTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(notificationCreateModelNew.getId(), "testString");
    assertEquals(notificationCreateModelNew.getSource(), "testString");
    assertEquals(notificationCreateModelNew.getType(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenseverity(), "testString");
    assertEquals(notificationCreateModelNew.getIbmensourceid(), "testString");
    assertEquals(notificationCreateModelNew.getIbmendefaultshort(), "testString");
    assertEquals(notificationCreateModelNew.getIbmendefaultlong(), "testString");
    assertEquals(notificationCreateModelNew.getIbmensubject(), "testString");
    assertEquals(notificationCreateModelNew.getIbmensmsto(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenmailto(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenhtmlbody(), "testString");
    assertEquals(notificationCreateModelNew.getSubject(), "testString");
    assertEquals(notificationCreateModelNew.getData().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(notificationCreateModelNew.getDatacontenttype(), "application/json");
    assertEquals(notificationCreateModelNew.getIbmenpushto(), "{\"platforms\":[\"push_android\"]}");
    assertEquals(notificationCreateModelNew.getIbmenfcmbody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenapnsbody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenapnsheaders(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenchromebody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenchromeheaders(), "{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}");
    assertEquals(notificationCreateModelNew.getIbmenfirefoxbody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmenfirefoxheaders(), "{\"TTL\":3600,\"Topic\":\"test\",\"Urgency\":\"high\"}");
    assertEquals(notificationCreateModelNew.getIbmenhuaweibody(), "testString");
    assertEquals(notificationCreateModelNew.getIbmensafaribody(), "testString");
    assertEquals(notificationCreateModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNotificationCreateError() throws Throwable {
    new NotificationCreate.Builder().build();
  }

}