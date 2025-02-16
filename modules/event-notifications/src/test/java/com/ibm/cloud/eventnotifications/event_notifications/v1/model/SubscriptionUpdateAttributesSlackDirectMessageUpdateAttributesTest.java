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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ChannelUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes model.
 */
public class SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes() throws Throwable {
    ChannelUpdateAttributes channelUpdateAttributesModel = new ChannelUpdateAttributes.Builder()
      .id("testString")
      .operation("add")
      .build();
    assertEquals(channelUpdateAttributesModel.id(), "testString");
    assertEquals(channelUpdateAttributesModel.operation(), "add");

    SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes subscriptionUpdateAttributesSlackDirectMessageUpdateAttributesModel = new SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes.Builder()
      .channels(java.util.Arrays.asList(channelUpdateAttributesModel))
      .templateIdNotification("testString")
      .build();
    assertEquals(subscriptionUpdateAttributesSlackDirectMessageUpdateAttributesModel.channels(), java.util.Arrays.asList(channelUpdateAttributesModel));
    assertEquals(subscriptionUpdateAttributesSlackDirectMessageUpdateAttributesModel.templateIdNotification(), "testString");

    String json = TestUtilities.serialize(subscriptionUpdateAttributesSlackDirectMessageUpdateAttributesModel);

    SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes subscriptionUpdateAttributesSlackDirectMessageUpdateAttributesModelNew = TestUtilities.deserialize(json, SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes.class);
    assertTrue(subscriptionUpdateAttributesSlackDirectMessageUpdateAttributesModelNew instanceof SubscriptionUpdateAttributesSlackDirectMessageUpdateAttributes);
    assertEquals(subscriptionUpdateAttributesSlackDirectMessageUpdateAttributesModelNew.templateIdNotification(), "testString");
  }
}