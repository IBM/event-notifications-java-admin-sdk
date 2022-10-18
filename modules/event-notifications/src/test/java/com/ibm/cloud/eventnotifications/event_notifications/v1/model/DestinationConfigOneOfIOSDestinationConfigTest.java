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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfIOSDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfIOSDestinationConfig model.
 */
public class DestinationConfigOneOfIOSDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfIOSDestinationConfig() throws Throwable {
    DestinationConfigOneOfIOSDestinationConfig destinationConfigOneOfIosDestinationConfigModel = new DestinationConfigOneOfIOSDestinationConfig.Builder()
      .certType("p8")
      .isSandbox(false)
      .password("testString")
      .keyId("testString")
      .teamId("testString")
      .bundleId("testString")
      .preProd(false)
      .build();
    assertEquals(destinationConfigOneOfIosDestinationConfigModel.certType(), "p8");
    assertEquals(destinationConfigOneOfIosDestinationConfigModel.isSandbox(), Boolean.valueOf(false));
    assertEquals(destinationConfigOneOfIosDestinationConfigModel.password(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModel.keyId(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModel.teamId(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModel.bundleId(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModel.preProd(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(destinationConfigOneOfIosDestinationConfigModel);

    DestinationConfigOneOfIOSDestinationConfig destinationConfigOneOfIosDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfIOSDestinationConfig.class);
    assertTrue(destinationConfigOneOfIosDestinationConfigModelNew instanceof DestinationConfigOneOfIOSDestinationConfig);
    assertEquals(destinationConfigOneOfIosDestinationConfigModelNew.certType(), "p8");
    assertEquals(destinationConfigOneOfIosDestinationConfigModelNew.isSandbox(), Boolean.valueOf(false));
    assertEquals(destinationConfigOneOfIosDestinationConfigModelNew.password(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModelNew.keyId(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModelNew.teamId(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModelNew.bundleId(), "testString");
    assertEquals(destinationConfigOneOfIosDestinationConfigModelNew.preProd(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfIOSDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfIOSDestinationConfig.Builder().build();
  }

}