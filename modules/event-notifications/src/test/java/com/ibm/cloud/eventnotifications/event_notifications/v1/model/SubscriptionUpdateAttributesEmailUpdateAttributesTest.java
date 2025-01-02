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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesEmailUpdateAttributes;
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
 * Unit test class for the SubscriptionUpdateAttributesEmailUpdateAttributes model.
 */
public class SubscriptionUpdateAttributesEmailUpdateAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionUpdateAttributesEmailUpdateAttributes() throws Throwable {
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

    SubscriptionUpdateAttributesEmailUpdateAttributes subscriptionUpdateAttributesEmailUpdateAttributesModel = new SubscriptionUpdateAttributesEmailUpdateAttributes.Builder()
      .invited(updateAttributesInvitedModel)
      .addNotificationPayload(false)
      .replyToMail("testString")
      .replyToName("testString")
      .fromName("testString")
      .subscribed(updateAttributesSubscribedModel)
      .unsubscribed(updateAttributesUnsubscribedModel)
      .build();
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.invited(), updateAttributesInvitedModel);
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.fromName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.subscribed(), updateAttributesSubscribedModel);
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.unsubscribed(), updateAttributesUnsubscribedModel);

    String json = TestUtilities.serialize(subscriptionUpdateAttributesEmailUpdateAttributesModel);

    SubscriptionUpdateAttributesEmailUpdateAttributes subscriptionUpdateAttributesEmailUpdateAttributesModelNew = TestUtilities.deserialize(json, SubscriptionUpdateAttributesEmailUpdateAttributes.class);
    assertTrue(subscriptionUpdateAttributesEmailUpdateAttributesModelNew instanceof SubscriptionUpdateAttributesEmailUpdateAttributes);
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.invited().toString(), updateAttributesInvitedModel.toString());
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.fromName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.subscribed().toString(), updateAttributesSubscribedModel.toString());
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.unsubscribed().toString(), updateAttributesUnsubscribedModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubscriptionUpdateAttributesEmailUpdateAttributesError() throws Throwable {
    new SubscriptionUpdateAttributesEmailUpdateAttributes.Builder().build();
  }

}