/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
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
      .ibmentemplates("testString")
      .ibmenmailto("testString")
      .ibmenslackto("testString")
      .ibmensmstext("testString")
      .ibmensmsto("testString")
      .ibmenhtmlbody("testString")
      .subject("testString")
      .ibmenmms("testString")
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .datacontenttype("application/json")
      .ibmenpushto("{\"platforms\":[\"push_android\", \"push_ios\", \"push_firefox\", \"push_chrome\", \"push_safari\", \"push_huawei\"]}")
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
    assertEquals(notificationCreateModel.getIbmentemplates(), "testString");
    assertEquals(notificationCreateModel.getIbmenmailto(), "testString");
    assertEquals(notificationCreateModel.getIbmenslackto(), "testString");
    assertEquals(notificationCreateModel.getIbmensmstext(), "testString");
    assertEquals(notificationCreateModel.getIbmensmsto(), "testString");
    assertEquals(notificationCreateModel.getIbmenhtmlbody(), "testString");
    assertEquals(notificationCreateModel.getSubject(), "testString");
    assertEquals(notificationCreateModel.getIbmenmms(), "testString");
    assertEquals(notificationCreateModel.getData(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(notificationCreateModel.getDatacontenttype(), "application/json");
    assertEquals(notificationCreateModel.getIbmenpushto(), "{\"platforms\":[\"push_android\", \"push_ios\", \"push_firefox\", \"push_chrome\", \"push_safari\", \"push_huawei\"]}");
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

    SendNotificationsOptions sendNotificationsOptionsModel = new SendNotificationsOptions.Builder()
      .instanceId("testString")
      .body(notificationCreateModel)
      .build();
    assertEquals(sendNotificationsOptionsModel.instanceId(), "testString");
    assertEquals(sendNotificationsOptionsModel.body(), notificationCreateModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSendNotificationsOptionsError() throws Throwable {
    new SendNotificationsOptions.Builder().build();
  }

}