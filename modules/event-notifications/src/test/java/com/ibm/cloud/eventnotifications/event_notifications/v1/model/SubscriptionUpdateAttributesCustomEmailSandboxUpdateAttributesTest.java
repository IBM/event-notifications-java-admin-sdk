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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesInvited;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesSubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateAttributesUnsubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes model.
 */
public class SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes() throws Throwable {
    UpdateAttributesInvited updateAttributesInvitedModel = new UpdateAttributesInvited.Builder()
      .add(java.util.Arrays.asList("testString"))
      .remove(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(updateAttributesInvitedModel.add(), java.util.Arrays.asList("testString"));
    assertEquals(updateAttributesInvitedModel.remove(), java.util.Arrays.asList("testString"));

    UpdateAttributesSubscribed updateAttributesSubscribedModel = new UpdateAttributesSubscribed.Builder()
      .remove(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(updateAttributesSubscribedModel.remove(), java.util.Arrays.asList("testString"));

    UpdateAttributesUnsubscribed updateAttributesUnsubscribedModel = new UpdateAttributesUnsubscribed.Builder()
      .remove(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(updateAttributesUnsubscribedModel.remove(), java.util.Arrays.asList("testString"));

    SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel = new SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.Builder()
      .invited(updateAttributesInvitedModel)
      .addNotificationPayload(false)
      .replyToMail("testString")
      .replyToName("testString")
      .subscribed(updateAttributesSubscribedModel)
      .unsubscribed(updateAttributesUnsubscribedModel)
      .templateIdNotification("testString")
      .templateIdInvitation("testString")
      .build();
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.invited(), updateAttributesInvitedModel);
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.subscribed(), updateAttributesSubscribedModel);
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.unsubscribed(), updateAttributesUnsubscribedModel);
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.templateIdNotification(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel.templateIdInvitation(), "testString");

    String json = TestUtilities.serialize(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModel);

    SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew = TestUtilities.deserialize(json, SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.class);
    assertTrue(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew instanceof SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes);
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.invited().toString(), updateAttributesInvitedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.subscribed().toString(), updateAttributesSubscribedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.unsubscribed().toString(), updateAttributesUnsubscribedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.templateIdNotification(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesModelNew.templateIdInvitation(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributesError() throws Throwable {
    new SubscriptionUpdateAttributesCustomEmailSandboxUpdateAttributes.Builder().build();
  }

}