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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig model.
 */
public class DestinationConfigOneOfIBMCloudObjectStorageDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfIBMCloudObjectStorageDestinationConfig() throws Throwable {
    DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModel = new DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig.Builder()
      .bucketName("testString")
      .instanceId("testString")
      .endpoint("testString")
      .build();
    assertEquals(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModel.bucketName(), "testString");
    assertEquals(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModel.instanceId(), "testString");
    assertEquals(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModel.endpoint(), "testString");

    String json = TestUtilities.serialize(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModel);

    DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig.class);
    assertTrue(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModelNew instanceof DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig);
    assertEquals(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModelNew.bucketName(), "testString");
    assertEquals(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModelNew.instanceId(), "testString");
    assertEquals(destinationConfigOneOfIbmCloudObjectStorageDestinationConfigModelNew.endpoint(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfIBMCloudObjectStorageDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfIBMCloudObjectStorageDestinationConfig.Builder().build();
  }

}