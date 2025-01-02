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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfFirefoxDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfFirefoxDestinationConfig model.
 */
public class DestinationConfigOneOfFirefoxDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfFirefoxDestinationConfig() throws Throwable {
    DestinationConfigOneOfFirefoxDestinationConfig destinationConfigOneOfFirefoxDestinationConfigModel = new DestinationConfigOneOfFirefoxDestinationConfig.Builder()
      .websiteUrl("testString")
      .publicKey("testString")
      .preProd(false)
      .build();
    assertEquals(destinationConfigOneOfFirefoxDestinationConfigModel.websiteUrl(), "testString");
    assertEquals(destinationConfigOneOfFirefoxDestinationConfigModel.publicKey(), "testString");
    assertEquals(destinationConfigOneOfFirefoxDestinationConfigModel.preProd(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(destinationConfigOneOfFirefoxDestinationConfigModel);

    DestinationConfigOneOfFirefoxDestinationConfig destinationConfigOneOfFirefoxDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfFirefoxDestinationConfig.class);
    assertTrue(destinationConfigOneOfFirefoxDestinationConfigModelNew instanceof DestinationConfigOneOfFirefoxDestinationConfig);
    assertEquals(destinationConfigOneOfFirefoxDestinationConfigModelNew.websiteUrl(), "testString");
    assertEquals(destinationConfigOneOfFirefoxDestinationConfigModelNew.publicKey(), "testString");
    assertEquals(destinationConfigOneOfFirefoxDestinationConfigModelNew.preProd(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfFirefoxDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfFirefoxDestinationConfig.Builder().build();
  }

}