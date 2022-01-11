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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateTopicOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Rules;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TopicUpdateSourcesItem;
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
 * Unit test class for the CreateTopicOptions model.
 */
public class CreateTopicOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateTopicOptions() throws Throwable {
    Rules rulesModel = new Rules.Builder()
      .enabled(true)
      .eventTypeFilter("$.notification_event_info.event_type == 'cert_manager'")
      .notificationFilter("$.notification.findings[0].severity == 'MODERATE'")
      .build();
    assertEquals(rulesModel.enabled(), Boolean.valueOf(true));
    assertEquals(rulesModel.eventTypeFilter(), "$.notification_event_info.event_type == 'cert_manager'");
    assertEquals(rulesModel.notificationFilter(), "$.notification.findings[0].severity == 'MODERATE'");

    TopicUpdateSourcesItem topicUpdateSourcesItemModel = new TopicUpdateSourcesItem.Builder()
      .id("e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api")
      .rules(new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)))
      .build();
    assertEquals(topicUpdateSourcesItemModel.id(), "e7c3b3ee-78d9-4e02-95c3-c001a05e6ea5:api");
    assertEquals(topicUpdateSourcesItemModel.rules(), new java.util.ArrayList<Rules>(java.util.Arrays.asList(rulesModel)));

    CreateTopicOptions createTopicOptionsModel = new CreateTopicOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .description("testString")
      .sources(new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)))
      .build();
    assertEquals(createTopicOptionsModel.instanceId(), "testString");
    assertEquals(createTopicOptionsModel.name(), "testString");
    assertEquals(createTopicOptionsModel.description(), "testString");
    assertEquals(createTopicOptionsModel.sources(), new java.util.ArrayList<TopicUpdateSourcesItem>(java.util.Arrays.asList(topicUpdateSourcesItemModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTopicOptionsError() throws Throwable {
    new CreateTopicOptions.Builder().build();
  }

}