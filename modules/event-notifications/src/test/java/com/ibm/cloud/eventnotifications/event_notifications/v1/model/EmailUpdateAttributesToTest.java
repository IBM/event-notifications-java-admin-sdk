/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailUpdateAttributesTo;
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
 * Unit test class for the EmailUpdateAttributesTo model.
 */
public class EmailUpdateAttributesToTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEmailUpdateAttributesTo() throws Throwable {
    EmailUpdateAttributesTo emailUpdateAttributesToModel = new EmailUpdateAttributesTo.Builder()
      .add(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .remove(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(emailUpdateAttributesToModel.add(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(emailUpdateAttributesToModel.remove(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    String json = TestUtilities.serialize(emailUpdateAttributesToModel);

    EmailUpdateAttributesTo emailUpdateAttributesToModelNew = TestUtilities.deserialize(json, EmailUpdateAttributesTo.class);
    assertTrue(emailUpdateAttributesToModelNew instanceof EmailUpdateAttributesTo);
  }
}