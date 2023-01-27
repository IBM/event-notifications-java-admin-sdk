/*
 * (C) Copyright IBM Corp. 2023.
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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesSMSAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSubscriptionOptions model.
 */
public class CreateSubscriptionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSubscriptionOptions() throws Throwable {
    SubscriptionCreateAttributesSMSAttributes subscriptionCreateAttributesModel = new SubscriptionCreateAttributesSMSAttributes.Builder()
      .invited(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(subscriptionCreateAttributesModel.invited(), java.util.Arrays.asList("testString"));

    CreateSubscriptionOptions createSubscriptionOptionsModel = new CreateSubscriptionOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .destinationId("testString")
      .topicId("testString")
      .description("testString")
      .attributes(subscriptionCreateAttributesModel)
      .build();
    assertEquals(createSubscriptionOptionsModel.instanceId(), "testString");
    assertEquals(createSubscriptionOptionsModel.name(), "testString");
    assertEquals(createSubscriptionOptionsModel.destinationId(), "testString");
    assertEquals(createSubscriptionOptionsModel.topicId(), "testString");
    assertEquals(createSubscriptionOptionsModel.description(), "testString");
    assertEquals(createSubscriptionOptionsModel.attributes(), subscriptionCreateAttributesModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSubscriptionOptionsError() throws Throwable {
    new CreateSubscriptionOptions.Builder().build();
  }

}