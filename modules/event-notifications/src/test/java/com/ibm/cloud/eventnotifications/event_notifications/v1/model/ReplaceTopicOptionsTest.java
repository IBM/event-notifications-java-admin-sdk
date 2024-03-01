/*
 * (C) Copyright IBM Corp. 2024.
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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ReplaceTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Rules;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceTopicOptions model.
 */
public class ReplaceTopicOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceTopicOptions() throws Throwable {
    Rules rulesModel = new Rules.Builder()
      .enabled(true)
      .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
      .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
      .build();
    assertEquals(rulesModel.enabled(), Boolean.valueOf(true));
    assertEquals(rulesModel.eventTypeFilter(), "$.notification_event_info.event_type == 'cert_manager'");
    assertEquals(rulesModel.notificationFilter(), "$.notification.findings[0].severity == 'MODERATE'");

    SourcesItems sourcesItemsModel = new SourcesItems.Builder()
      .id("e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api")
      .rules(java.util.Arrays.asList(rulesModel))
      .build();
    assertEquals(sourcesItemsModel.id(), "e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api");
    assertEquals(sourcesItemsModel.rules(), java.util.Arrays.asList(rulesModel));

    ReplaceTopicOptions replaceTopicOptionsModel = new ReplaceTopicOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .sources(java.util.Arrays.asList(sourcesItemsModel))
      .build();
    assertEquals(replaceTopicOptionsModel.instanceId(), "testString");
    assertEquals(replaceTopicOptionsModel.id(), "testString");
    assertEquals(replaceTopicOptionsModel.name(), "testString");
    assertEquals(replaceTopicOptionsModel.description(), "testString");
    assertEquals(replaceTopicOptionsModel.sources(), java.util.Arrays.asList(sourcesItemsModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTopicOptionsError() throws Throwable {
    new ReplaceTopicOptions.Builder().build();
  }

}