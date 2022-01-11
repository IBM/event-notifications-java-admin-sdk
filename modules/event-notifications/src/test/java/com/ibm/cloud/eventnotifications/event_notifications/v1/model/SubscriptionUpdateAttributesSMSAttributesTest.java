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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSMSAttributes;
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
 * Unit test class for the SubscriptionUpdateAttributesSMSAttributes model.
 */
public class SubscriptionUpdateAttributesSMSAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionUpdateAttributesSMSAttributes() throws Throwable {
    SubscriptionUpdateAttributesSMSAttributes subscriptionUpdateAttributesSmsAttributesModel = new SubscriptionUpdateAttributesSMSAttributes.Builder()
      .to(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(subscriptionUpdateAttributesSmsAttributesModel.to(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    String json = TestUtilities.serialize(subscriptionUpdateAttributesSmsAttributesModel);

    SubscriptionUpdateAttributesSMSAttributes subscriptionUpdateAttributesSmsAttributesModelNew = TestUtilities.deserialize(json, SubscriptionUpdateAttributesSMSAttributes.class);
    assertTrue(subscriptionUpdateAttributesSmsAttributesModelNew instanceof SubscriptionUpdateAttributesSMSAttributes);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubscriptionUpdateAttributesSMSAttributesError() throws Throwable {
    new SubscriptionUpdateAttributesSMSAttributes.Builder().build();
  }

}