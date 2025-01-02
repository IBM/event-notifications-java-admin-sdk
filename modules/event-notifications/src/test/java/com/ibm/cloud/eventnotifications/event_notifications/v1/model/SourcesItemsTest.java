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
 * Unit test class for the SourcesItems model.
 */
public class SourcesItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSourcesItems() throws Throwable {
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
      .eventTypeFilter("$.*")
      .notificationFilter("testString")
      .eventScheduleFilter(eventScheduleFilterAttributesModel)
      .build();
    assertEquals(rulesModel.enabled(), Boolean.valueOf(true));
    assertEquals(rulesModel.eventTypeFilter(), "$.*");
    assertEquals(rulesModel.notificationFilter(), "testString");
    assertEquals(rulesModel.eventScheduleFilter(), eventScheduleFilterAttributesModel);

    SourcesItems sourcesItemsModel = new SourcesItems.Builder()
      .id("testString")
      .rules(java.util.Arrays.asList(rulesModel))
      .build();
    assertEquals(sourcesItemsModel.id(), "testString");
    assertEquals(sourcesItemsModel.rules(), java.util.Arrays.asList(rulesModel));

    String json = TestUtilities.serialize(sourcesItemsModel);

    SourcesItems sourcesItemsModelNew = TestUtilities.deserialize(json, SourcesItems.class);
    assertTrue(sourcesItemsModelNew instanceof SourcesItems);
    assertEquals(sourcesItemsModelNew.id(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSourcesItemsError() throws Throwable {
    new SourcesItems.Builder().build();
  }

}