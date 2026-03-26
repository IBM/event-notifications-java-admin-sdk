/*
 * (C) Copyright IBM Corp. 2026.
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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailAttachment;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EmailAttachment model.
 */
public class EmailAttachmentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEmailAttachment() throws Throwable {
    EmailAttachment emailAttachmentModel = new EmailAttachment.Builder()
      .content("testString")
      .filename("testString")
      .contentType("testString")
      .disposition("attachment")
      .build();
    assertEquals(emailAttachmentModel.content(), "testString");
    assertEquals(emailAttachmentModel.filename(), "testString");
    assertEquals(emailAttachmentModel.contentType(), "testString");
    assertEquals(emailAttachmentModel.disposition(), "attachment");

    String json = TestUtilities.serialize(emailAttachmentModel);

    EmailAttachment emailAttachmentModelNew = TestUtilities.deserialize(json, EmailAttachment.class);
    assertTrue(emailAttachmentModelNew instanceof EmailAttachment);
    assertEquals(emailAttachmentModelNew.content(), "testString");
    assertEquals(emailAttachmentModelNew.filename(), "testString");
    assertEquals(emailAttachmentModelNew.contentType(), "testString");
    assertEquals(emailAttachmentModelNew.disposition(), "attachment");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEmailAttachmentError() throws Throwable {
    new EmailAttachment.Builder().build();
  }

}