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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.IntegrationCreateMetadata;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IntegrationCreateMetadata model.
 */
public class IntegrationCreateMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIntegrationCreateMetadata() throws Throwable {
    IntegrationCreateMetadata integrationCreateMetadataModel = new IntegrationCreateMetadata.Builder()
      .endpoint("testString")
      .crn("testString")
      .bucketName("testString")
      .build();
    assertEquals(integrationCreateMetadataModel.endpoint(), "testString");
    assertEquals(integrationCreateMetadataModel.crn(), "testString");
    assertEquals(integrationCreateMetadataModel.bucketName(), "testString");

    String json = TestUtilities.serialize(integrationCreateMetadataModel);

    IntegrationCreateMetadata integrationCreateMetadataModelNew = TestUtilities.deserialize(json, IntegrationCreateMetadata.class);
    assertTrue(integrationCreateMetadataModelNew instanceof IntegrationCreateMetadata);
    assertEquals(integrationCreateMetadataModelNew.endpoint(), "testString");
    assertEquals(integrationCreateMetadataModelNew.crn(), "testString");
    assertEquals(integrationCreateMetadataModelNew.bucketName(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIntegrationCreateMetadataError() throws Throwable {
    new IntegrationCreateMetadata.Builder().build();
  }

}