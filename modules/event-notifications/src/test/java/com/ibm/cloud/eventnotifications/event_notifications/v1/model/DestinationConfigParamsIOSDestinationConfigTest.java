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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsIOSDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigParamsIOSDestinationConfig model.
 */
public class DestinationConfigParamsIOSDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigParamsIOSDestinationConfig() throws Throwable {
    DestinationConfigParamsIOSDestinationConfig destinationConfigParamsIosDestinationConfigModel = new DestinationConfigParamsIOSDestinationConfig.Builder()
      .certType("p8")
      .isSandbox(false)
      .password("testString")
      .keyId("testString")
      .teamId("testString")
      .bundleId("testString")
      .preProd(false)
      .build();
    assertEquals(destinationConfigParamsIosDestinationConfigModel.certType(), "p8");
    assertEquals(destinationConfigParamsIosDestinationConfigModel.isSandbox(), Boolean.valueOf(false));
    assertEquals(destinationConfigParamsIosDestinationConfigModel.password(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModel.keyId(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModel.teamId(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModel.bundleId(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModel.preProd(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(destinationConfigParamsIosDestinationConfigModel);

    DestinationConfigParamsIOSDestinationConfig destinationConfigParamsIosDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigParamsIOSDestinationConfig.class);
    assertTrue(destinationConfigParamsIosDestinationConfigModelNew instanceof DestinationConfigParamsIOSDestinationConfig);
    assertEquals(destinationConfigParamsIosDestinationConfigModelNew.certType(), "p8");
    assertEquals(destinationConfigParamsIosDestinationConfigModelNew.isSandbox(), Boolean.valueOf(false));
    assertEquals(destinationConfigParamsIosDestinationConfigModelNew.password(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModelNew.keyId(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModelNew.teamId(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModelNew.bundleId(), "testString");
    assertEquals(destinationConfigParamsIosDestinationConfigModelNew.preProd(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigParamsIOSDestinationConfigError() throws Throwable {
    new DestinationConfigParamsIOSDestinationConfig.Builder().build();
  }

}