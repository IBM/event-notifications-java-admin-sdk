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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesCustomEmailUpdateAttributes;
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
 * Unit test class for the SubscriptionUpdateAttributesCustomEmailUpdateAttributes model.
 */
public class SubscriptionUpdateAttributesCustomEmailUpdateAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionUpdateAttributesCustomEmailUpdateAttributes() throws Throwable {
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

    SubscriptionUpdateAttributesCustomEmailUpdateAttributes subscriptionUpdateAttributesCustomEmailUpdateAttributesModel = new SubscriptionUpdateAttributesCustomEmailUpdateAttributes.Builder()
      .invited(updateAttributesInvitedModel)
      .addNotificationPayload(false)
      .replyToMail("testString")
      .replyToName("testString")
      .fromName("testString")
      .fromEmail("testString")
      .subscribed(updateAttributesSubscribedModel)
      .unsubscribed(updateAttributesUnsubscribedModel)
      .templateIdNotification("testString")
      .templateIdInvitation("testString")
      .build();
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.invited(), updateAttributesInvitedModel);
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.fromName(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.fromEmail(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.subscribed(), updateAttributesSubscribedModel);
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.unsubscribed(), updateAttributesUnsubscribedModel);
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.templateIdNotification(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel.templateIdInvitation(), "testString");

    String json = TestUtilities.serialize(subscriptionUpdateAttributesCustomEmailUpdateAttributesModel);

    SubscriptionUpdateAttributesCustomEmailUpdateAttributes subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew = TestUtilities.deserialize(json, SubscriptionUpdateAttributesCustomEmailUpdateAttributes.class);
    assertTrue(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew instanceof SubscriptionUpdateAttributesCustomEmailUpdateAttributes);
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.invited().toString(), updateAttributesInvitedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.fromName(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.fromEmail(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.subscribed().toString(), updateAttributesSubscribedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.unsubscribed().toString(), updateAttributesUnsubscribedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.templateIdNotification(), "testString");
    assertEquals(subscriptionUpdateAttributesCustomEmailUpdateAttributesModelNew.templateIdInvitation(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubscriptionUpdateAttributesCustomEmailUpdateAttributesError() throws Throwable {
    new SubscriptionUpdateAttributesCustomEmailUpdateAttributes.Builder().build();
  }

}