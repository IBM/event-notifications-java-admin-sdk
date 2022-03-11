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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailUpdateAttributesTo;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.EmailUpdateAttributesUnsubscribed;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SubscriptionUpdateAttributesEmailUpdateAttributes;
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
 * Unit test class for the SubscriptionUpdateAttributesEmailUpdateAttributes model.
 */
public class SubscriptionUpdateAttributesEmailUpdateAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubscriptionUpdateAttributesEmailUpdateAttributes() throws Throwable {
    EmailUpdateAttributesTo emailUpdateAttributesToModel = new EmailUpdateAttributesTo.Builder()
      .add(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .remove(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(emailUpdateAttributesToModel.add(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(emailUpdateAttributesToModel.remove(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    EmailUpdateAttributesUnsubscribed emailUpdateAttributesUnsubscribedModel = new EmailUpdateAttributesUnsubscribed.Builder()
      .remove(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(emailUpdateAttributesUnsubscribedModel.remove(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    SubscriptionUpdateAttributesEmailUpdateAttributes subscriptionUpdateAttributesEmailUpdateAttributesModel = new SubscriptionUpdateAttributesEmailUpdateAttributes.Builder()
      .to(emailUpdateAttributesToModel)
      .addNotificationPayload(false)
      .replyToMail("testString")
      .replyToName("testString")
      .fromName("testString")
      .invited(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .unsubscribed(emailUpdateAttributesUnsubscribedModel)
      .build();
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.to(), emailUpdateAttributesToModel);
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.fromName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.invited(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModel.unsubscribed(), emailUpdateAttributesUnsubscribedModel);

    String json = TestUtilities.serialize(subscriptionUpdateAttributesEmailUpdateAttributesModel);

    SubscriptionUpdateAttributesEmailUpdateAttributes subscriptionUpdateAttributesEmailUpdateAttributesModelNew = TestUtilities.deserialize(json, SubscriptionUpdateAttributesEmailUpdateAttributes.class);
    assertTrue(subscriptionUpdateAttributesEmailUpdateAttributesModelNew instanceof SubscriptionUpdateAttributesEmailUpdateAttributes);
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.to().toString(), emailUpdateAttributesToModel.toString());
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.addNotificationPayload(), Boolean.valueOf(false));
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.replyToMail(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.replyToName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.fromName(), "testString");
    assertEquals(subscriptionUpdateAttributesEmailUpdateAttributesModelNew.unsubscribed().toString(), emailUpdateAttributesUnsubscribedModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubscriptionUpdateAttributesEmailUpdateAttributesError() throws Throwable {
    new SubscriptionUpdateAttributesEmailUpdateAttributes.Builder().build();
  }

}