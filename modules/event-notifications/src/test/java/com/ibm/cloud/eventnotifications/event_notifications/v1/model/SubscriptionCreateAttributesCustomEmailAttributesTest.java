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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesCustomEmailAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubscriptionCreateAttributesCustomEmailAttributes model.
 */
public class SubscriptionCreateAttributesCustomEmailAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionCreateAttributesCustomEmailAttributes() throws Throwable {
    SubscriptionCreateAttributesCustomEmailAttributes subscriptionCreateAttributesCustomEmailAttributesModel = new SubscriptionCreateAttributesCustomEmailAttributes.Builder()
      .invited(java.util.Arrays.asList("testString"))
      .addNotificationPayload(false)
      .replyToMail("testString")
      .replyToName("testString")
      .fromName("testString")
      .fromEmail("testString")
      .templateIdNotification("testString")
      .templateIdInvitation("testString")
      .build();
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.invited(), java.util.Arrays.asList("testString"));
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.replyToMail(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.replyToName(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.fromName(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.fromEmail(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.templateIdNotification(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModel.templateIdInvitation(), "testString");

    String json = TestUtilities.serialize(subscriptionCreateAttributesCustomEmailAttributesModel);

    SubscriptionCreateAttributesCustomEmailAttributes subscriptionCreateAttributesCustomEmailAttributesModelNew = TestUtilities.deserialize(json, SubscriptionCreateAttributesCustomEmailAttributes.class);
    assertTrue(subscriptionCreateAttributesCustomEmailAttributesModelNew instanceof SubscriptionCreateAttributesCustomEmailAttributes);
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModelNew.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModelNew.replyToMail(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModelNew.replyToName(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModelNew.fromName(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModelNew.fromEmail(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModelNew.templateIdNotification(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailAttributesModelNew.templateIdInvitation(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubscriptionCreateAttributesCustomEmailAttributesError() throws Throwable {
    new SubscriptionCreateAttributesCustomEmailAttributes.Builder().build();
  }

}