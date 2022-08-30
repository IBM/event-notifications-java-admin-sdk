/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMSupdateAttributesTo;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesSMSUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateSubscriptionOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateSubscriptionOptions model.
 */
public class UpdateSubscriptionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateSubscriptionOptions() throws Throwable {
    SMSupdateAttributesTo smSupdateAttributesToModel = new SMSupdateAttributesTo.Builder()
      .add(java.util.Arrays.asList("testString"))
      .remove(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(smSupdateAttributesToModel.add(), java.util.Arrays.asList("testString"));
    assertEquals(smSupdateAttributesToModel.remove(), java.util.Arrays.asList("testString"));

    SubscriptionUpdateAttributesSMSUpdateAttributes subscriptionUpdateAttributesModel = new SubscriptionUpdateAttributesSMSUpdateAttributes.Builder()
      .to(smSupdateAttributesToModel)
      .build();
    assertEquals(subscriptionUpdateAttributesModel.to(), smSupdateAttributesToModel);

    UpdateSubscriptionOptions updateSubscriptionOptionsModel = new UpdateSubscriptionOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .attributes(subscriptionUpdateAttributesModel)
      .build();
    assertEquals(updateSubscriptionOptionsModel.instanceId(), "testString");
    assertEquals(updateSubscriptionOptionsModel.id(), "testString");
    assertEquals(updateSubscriptionOptionsModel.name(), "testString");
    assertEquals(updateSubscriptionOptionsModel.description(), "testString");
    assertEquals(updateSubscriptionOptionsModel.attributes(), subscriptionUpdateAttributesModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSubscriptionOptionsError() throws Throwable {
    new UpdateSubscriptionOptions.Builder().build();
  }

}