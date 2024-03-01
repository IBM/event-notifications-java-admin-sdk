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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesServiceNowAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubscriptionCreateAttributesServiceNowAttributes model.
 */
public class SubscriptionCreateAttributesServiceNowAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionCreateAttributesServiceNowAttributes() throws Throwable {
    SubscriptionCreateAttributesServiceNowAttributes subscriptionCreateAttributesServiceNowAttributesModel = new SubscriptionCreateAttributesServiceNowAttributes.Builder()
      .assignedTo("testString")
      .assignmentGroup("testString")
      .build();
    assertEquals(subscriptionCreateAttributesServiceNowAttributesModel.assignedTo(), "testString");
    assertEquals(subscriptionCreateAttributesServiceNowAttributesModel.assignmentGroup(), "testString");

    String json = TestUtilities.serialize(subscriptionCreateAttributesServiceNowAttributesModel);

    SubscriptionCreateAttributesServiceNowAttributes subscriptionCreateAttributesServiceNowAttributesModelNew = TestUtilities.deserialize(json, SubscriptionCreateAttributesServiceNowAttributes.class);
    assertTrue(subscriptionCreateAttributesServiceNowAttributesModelNew instanceof SubscriptionCreateAttributesServiceNowAttributes);
    assertEquals(subscriptionCreateAttributesServiceNowAttributesModelNew.assignedTo(), "testString");
    assertEquals(subscriptionCreateAttributesServiceNowAttributesModelNew.assignmentGroup(), "testString");
  }
}