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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfWebhookDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfig model.
 */
public class DestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfig() throws Throwable {
    DestinationConfigOneOfWebhookDestinationConfig destinationConfigOneOfModel = new DestinationConfigOneOfWebhookDestinationConfig.Builder()
      .url("https://1ea472c0.us-south.apigw.appdomain.cloud/nhwebhook/sendwebhook")
      .verb("post")
      .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .sensitiveHeaders(java.util.Arrays.asList("authorization"))
      .build();
    assertEquals(destinationConfigOneOfModel.url(), "https://1ea472c0.us-south.apigw.appdomain.cloud/nhwebhook/sendwebhook");
    assertEquals(destinationConfigOneOfModel.verb(), "post");
    assertEquals(destinationConfigOneOfModel.customHeaders(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(destinationConfigOneOfModel.sensitiveHeaders(), java.util.Arrays.asList("authorization"));

    DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
      .params(destinationConfigOneOfModel)
      .build();
    assertEquals(destinationConfigModel.params(), destinationConfigOneOfModel);

    String json = TestUtilities.serialize(destinationConfigModel);

    DestinationConfig destinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfig.class);
    assertTrue(destinationConfigModelNew instanceof DestinationConfig);
    assertEquals(destinationConfigModelNew.params().toString(), destinationConfigOneOfModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigError() throws Throwable {
    new DestinationConfig.Builder().build();
  }

}