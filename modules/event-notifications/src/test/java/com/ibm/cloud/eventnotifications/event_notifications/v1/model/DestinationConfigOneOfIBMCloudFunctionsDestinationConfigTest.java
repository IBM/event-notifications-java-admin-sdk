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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfIBMCloudFunctionsDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfIBMCloudFunctionsDestinationConfig model.
 */
public class DestinationConfigOneOfIBMCloudFunctionsDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfIBMCloudFunctionsDestinationConfig() throws Throwable {
    DestinationConfigOneOfIBMCloudFunctionsDestinationConfig destinationConfigOneOfIbmCloudFunctionsDestinationConfigModel = new DestinationConfigOneOfIBMCloudFunctionsDestinationConfig.Builder()
      .url("testString")
      .apiKey("testString")
      .build();
    assertEquals(destinationConfigOneOfIbmCloudFunctionsDestinationConfigModel.url(), "testString");
    assertEquals(destinationConfigOneOfIbmCloudFunctionsDestinationConfigModel.apiKey(), "testString");

    String json = TestUtilities.serialize(destinationConfigOneOfIbmCloudFunctionsDestinationConfigModel);

    DestinationConfigOneOfIBMCloudFunctionsDestinationConfig destinationConfigOneOfIbmCloudFunctionsDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfIBMCloudFunctionsDestinationConfig.class);
    assertTrue(destinationConfigOneOfIbmCloudFunctionsDestinationConfigModelNew instanceof DestinationConfigOneOfIBMCloudFunctionsDestinationConfig);
    assertEquals(destinationConfigOneOfIbmCloudFunctionsDestinationConfigModelNew.url(), "testString");
    assertEquals(destinationConfigOneOfIbmCloudFunctionsDestinationConfigModelNew.apiKey(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfIBMCloudFunctionsDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfIBMCloudFunctionsDestinationConfig.Builder().build();
  }

}