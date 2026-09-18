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

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import org.testng.annotations.Test;

import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

/**
 * Unit test class for the ListPreDefinedTemplatesOptions model.
 */
public class ListPreDefinedTemplatesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListPreDefinedTemplatesOptions() throws Throwable {
    ListPreDefinedTemplatesOptions listPreDefinedTemplatesOptionsModel = new ListPreDefinedTemplatesOptions.Builder()
      .instanceId("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .search("testString")
      .build();
    assertEquals(listPreDefinedTemplatesOptionsModel.instanceId(), "testString");
    assertNull(listPreDefinedTemplatesOptionsModel.source());
    assertNull(listPreDefinedTemplatesOptionsModel.type());
    assertEquals(listPreDefinedTemplatesOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(listPreDefinedTemplatesOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(listPreDefinedTemplatesOptionsModel.search(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPreDefinedTemplatesOptionsError() throws Throwable {
    new ListPreDefinedTemplatesOptions.Builder().build();
  }

}
