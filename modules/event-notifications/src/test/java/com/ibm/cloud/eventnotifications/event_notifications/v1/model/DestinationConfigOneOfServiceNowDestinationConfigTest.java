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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfServiceNowDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfServiceNowDestinationConfig model.
 */
public class DestinationConfigOneOfServiceNowDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfServiceNowDestinationConfig() throws Throwable {
    DestinationConfigOneOfServiceNowDestinationConfig destinationConfigOneOfServiceNowDestinationConfigModel = new DestinationConfigOneOfServiceNowDestinationConfig.Builder()
      .clientId("testString")
      .clientSecret("testString")
      .username("testString")
      .password("testString")
      .instanceName("testString")
      .build();
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModel.clientId(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModel.clientSecret(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModel.username(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModel.password(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModel.instanceName(), "testString");

    String json = TestUtilities.serialize(destinationConfigOneOfServiceNowDestinationConfigModel);

    DestinationConfigOneOfServiceNowDestinationConfig destinationConfigOneOfServiceNowDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfServiceNowDestinationConfig.class);
    assertTrue(destinationConfigOneOfServiceNowDestinationConfigModelNew instanceof DestinationConfigOneOfServiceNowDestinationConfig);
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModelNew.clientId(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModelNew.clientSecret(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModelNew.username(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModelNew.password(), "testString");
    assertEquals(destinationConfigOneOfServiceNowDestinationConfigModelNew.instanceName(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfServiceNowDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfServiceNowDestinationConfig.Builder().build();
  }

}