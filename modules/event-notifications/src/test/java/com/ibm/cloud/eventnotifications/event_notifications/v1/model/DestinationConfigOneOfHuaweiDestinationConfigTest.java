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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfHuaweiDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfHuaweiDestinationConfig model.
 */
public class DestinationConfigOneOfHuaweiDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfHuaweiDestinationConfig() throws Throwable {
    DestinationConfigOneOfHuaweiDestinationConfig destinationConfigOneOfHuaweiDestinationConfigModel = new DestinationConfigOneOfHuaweiDestinationConfig.Builder()
      .clientId("testString")
      .clientSecret("testString")
      .preProd(false)
      .build();
    assertEquals(destinationConfigOneOfHuaweiDestinationConfigModel.clientId(), "testString");
    assertEquals(destinationConfigOneOfHuaweiDestinationConfigModel.clientSecret(), "testString");
    assertEquals(destinationConfigOneOfHuaweiDestinationConfigModel.preProd(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(destinationConfigOneOfHuaweiDestinationConfigModel);

    DestinationConfigOneOfHuaweiDestinationConfig destinationConfigOneOfHuaweiDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfHuaweiDestinationConfig.class);
    assertTrue(destinationConfigOneOfHuaweiDestinationConfigModelNew instanceof DestinationConfigOneOfHuaweiDestinationConfig);
    assertEquals(destinationConfigOneOfHuaweiDestinationConfigModelNew.clientId(), "testString");
    assertEquals(destinationConfigOneOfHuaweiDestinationConfigModelNew.clientSecret(), "testString");
    assertEquals(destinationConfigOneOfHuaweiDestinationConfigModelNew.preProd(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfHuaweiDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfHuaweiDestinationConfig.Builder().build();
  }

}