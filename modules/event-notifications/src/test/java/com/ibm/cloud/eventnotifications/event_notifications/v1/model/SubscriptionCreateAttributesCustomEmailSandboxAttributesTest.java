/*
 * (C) Copyright IBM Corp. 2026.
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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionCreateAttributesCustomEmailSandboxAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubscriptionCreateAttributesCustomEmailSandboxAttributes model.
 */
public class SubscriptionCreateAttributesCustomEmailSandboxAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionCreateAttributesCustomEmailSandboxAttributes() throws Throwable {
    SubscriptionCreateAttributesCustomEmailSandboxAttributes subscriptionCreateAttributesCustomEmailSandboxAttributesModel = new SubscriptionCreateAttributesCustomEmailSandboxAttributes.Builder()
      .invited(java.util.Arrays.asList("testString"))
      .addNotificationPayload(false)
      .replyToMail("testString")
      .replyToName("testString")
      .templateIdNotification("testString")
      .templateIdInvitation("testString")
      .build();
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModel.invited(), java.util.Arrays.asList("testString"));
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModel.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModel.replyToMail(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModel.replyToName(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModel.templateIdNotification(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModel.templateIdInvitation(), "testString");

    String json = TestUtilities.serialize(subscriptionCreateAttributesCustomEmailSandboxAttributesModel);

    SubscriptionCreateAttributesCustomEmailSandboxAttributes subscriptionCreateAttributesCustomEmailSandboxAttributesModelNew = TestUtilities.deserialize(json, SubscriptionCreateAttributesCustomEmailSandboxAttributes.class);
    assertTrue(subscriptionCreateAttributesCustomEmailSandboxAttributesModelNew instanceof SubscriptionCreateAttributesCustomEmailSandboxAttributes);
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModelNew.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModelNew.replyToMail(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModelNew.replyToName(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModelNew.templateIdNotification(), "testString");
    assertEquals(subscriptionCreateAttributesCustomEmailSandboxAttributesModelNew.templateIdInvitation(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubscriptionCreateAttributesCustomEmailSandboxAttributesError() throws Throwable {
    new SubscriptionCreateAttributesCustomEmailSandboxAttributes.Builder().build();
  }

}