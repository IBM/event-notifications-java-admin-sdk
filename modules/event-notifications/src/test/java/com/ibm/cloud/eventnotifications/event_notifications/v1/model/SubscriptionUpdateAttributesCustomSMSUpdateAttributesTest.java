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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesCustomSMSUpdateAttributes;
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
 * Unit test class for the SubscriptionUpdateAttributesCustomSMSUpdateAttributes model.
 */
public class SubscriptionUpdateAttributesCustomSMSUpdateAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionUpdateAttributesCustomSMSUpdateAttributes() throws Throwable {
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

    SubscriptionUpdateAttributesCustomSMSUpdateAttributes subscriptionUpdateAttributesCustomSmsUpdateAttributesModel = new SubscriptionUpdateAttributesCustomSMSUpdateAttributes.Builder()
      .invited(updateAttributesInvitedModel)
      .subscribed(updateAttributesSubscribedModel)
      .unsubscribed(updateAttributesUnsubscribedModel)
      .build();
    assertEquals(subscriptionUpdateAttributesCustomSmsUpdateAttributesModel.invited(), updateAttributesInvitedModel);
    assertEquals(subscriptionUpdateAttributesCustomSmsUpdateAttributesModel.subscribed(), updateAttributesSubscribedModel);
    assertEquals(subscriptionUpdateAttributesCustomSmsUpdateAttributesModel.unsubscribed(), updateAttributesUnsubscribedModel);

    String json = TestUtilities.serialize(subscriptionUpdateAttributesCustomSmsUpdateAttributesModel);

    SubscriptionUpdateAttributesCustomSMSUpdateAttributes subscriptionUpdateAttributesCustomSmsUpdateAttributesModelNew = TestUtilities.deserialize(json, SubscriptionUpdateAttributesCustomSMSUpdateAttributes.class);
    assertTrue(subscriptionUpdateAttributesCustomSmsUpdateAttributesModelNew instanceof SubscriptionUpdateAttributesCustomSMSUpdateAttributes);
    assertEquals(subscriptionUpdateAttributesCustomSmsUpdateAttributesModelNew.invited().toString(), updateAttributesInvitedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomSmsUpdateAttributesModelNew.subscribed().toString(), updateAttributesSubscribedModel.toString());
    assertEquals(subscriptionUpdateAttributesCustomSmsUpdateAttributesModelNew.unsubscribed().toString(), updateAttributesUnsubscribedModel.toString());
  }
}