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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfAppConfigurationDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfAppConfigurationDestinationConfig model.
 */
public class DestinationConfigOneOfAppConfigurationDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfAppConfigurationDestinationConfig() throws Throwable {
    DestinationConfigOneOfAppConfigurationDestinationConfig destinationConfigOneOfAppConfigurationDestinationConfigModel = new DestinationConfigOneOfAppConfigurationDestinationConfig.Builder()
      .type("features")
      .crn("testString")
      .environmentId("testString")
      .featureId("testString")
      .build();
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModel.type(), "features");
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModel.crn(), "testString");
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModel.environmentId(), "testString");
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModel.featureId(), "testString");

    String json = TestUtilities.serialize(destinationConfigOneOfAppConfigurationDestinationConfigModel);

    DestinationConfigOneOfAppConfigurationDestinationConfig destinationConfigOneOfAppConfigurationDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfAppConfigurationDestinationConfig.class);
    assertTrue(destinationConfigOneOfAppConfigurationDestinationConfigModelNew instanceof DestinationConfigOneOfAppConfigurationDestinationConfig);
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModelNew.type(), "features");
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModelNew.crn(), "testString");
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModelNew.environmentId(), "testString");
    assertEquals(destinationConfigOneOfAppConfigurationDestinationConfigModelNew.featureId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfAppConfigurationDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfAppConfigurationDestinationConfig.Builder().build();
  }

}