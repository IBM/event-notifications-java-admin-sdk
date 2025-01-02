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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfChromeDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfChromeDestinationConfig model.
 */
public class DestinationConfigOneOfChromeDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfChromeDestinationConfig() throws Throwable {
    DestinationConfigOneOfChromeDestinationConfig destinationConfigOneOfChromeDestinationConfigModel = new DestinationConfigOneOfChromeDestinationConfig.Builder()
      .apiKey("testString")
      .websiteUrl("testString")
      .publicKey("testString")
      .preProd(false)
      .build();
    assertEquals(destinationConfigOneOfChromeDestinationConfigModel.apiKey(), "testString");
    assertEquals(destinationConfigOneOfChromeDestinationConfigModel.websiteUrl(), "testString");
    assertEquals(destinationConfigOneOfChromeDestinationConfigModel.publicKey(), "testString");
    assertEquals(destinationConfigOneOfChromeDestinationConfigModel.preProd(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(destinationConfigOneOfChromeDestinationConfigModel);

    DestinationConfigOneOfChromeDestinationConfig destinationConfigOneOfChromeDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfChromeDestinationConfig.class);
    assertTrue(destinationConfigOneOfChromeDestinationConfigModelNew instanceof DestinationConfigOneOfChromeDestinationConfig);
    assertEquals(destinationConfigOneOfChromeDestinationConfigModelNew.apiKey(), "testString");
    assertEquals(destinationConfigOneOfChromeDestinationConfigModelNew.websiteUrl(), "testString");
    assertEquals(destinationConfigOneOfChromeDestinationConfigModelNew.publicKey(), "testString");
    assertEquals(destinationConfigOneOfChromeDestinationConfigModelNew.preProd(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfChromeDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfChromeDestinationConfig.Builder().build();
  }

}