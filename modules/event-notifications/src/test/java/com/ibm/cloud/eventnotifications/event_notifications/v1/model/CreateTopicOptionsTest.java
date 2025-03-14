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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EventScheduleFilterAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Rules;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SourcesItems;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateTopicOptions model.
 */
public class CreateTopicOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateTopicOptions() throws Throwable {
    EventScheduleFilterAttributes eventScheduleFilterAttributesModel = new EventScheduleFilterAttributes.Builder()
      .startsAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .endsAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .expression("testString")
      .build();
    assertEquals(eventScheduleFilterAttributesModel.startsAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(eventScheduleFilterAttributesModel.endsAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(eventScheduleFilterAttributesModel.expression(), "testString");

    Rules rulesModel = new Rules.Builder()
      .enabled(true)
      .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
      .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
      .eventScheduleFilter(eventScheduleFilterAttributesModel)
      .build();
    assertEquals(rulesModel.enabled(), Boolean.valueOf(true));
    assertEquals(rulesModel.eventTypeFilter(), "$.notification_event_info.event_type == 'cert_manager'");
    assertEquals(rulesModel.notificationFilter(), "$.notification.findings[0].severity == 'MODERATE'");
    assertEquals(rulesModel.eventScheduleFilter(), eventScheduleFilterAttributesModel);

    SourcesItems sourcesItemsModel = new SourcesItems.Builder()
      .id("e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api")
      .rules(java.util.Arrays.asList(rulesModel))
      .build();
    assertEquals(sourcesItemsModel.id(), "e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api");
    assertEquals(sourcesItemsModel.rules(), java.util.Arrays.asList(rulesModel));

    CreateTopicOptions createTopicOptionsModel = new CreateTopicOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .description("testString")
      .sources(java.util.Arrays.asList(sourcesItemsModel))
      .build();
    assertEquals(createTopicOptionsModel.instanceId(), "testString");
    assertEquals(createTopicOptionsModel.name(), "testString");
    assertEquals(createTopicOptionsModel.description(), "testString");
    assertEquals(createTopicOptionsModel.sources(), java.util.Arrays.asList(sourcesItemsModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTopicOptionsError() throws Throwable {
    new CreateTopicOptions.Builder().build();
  }

}