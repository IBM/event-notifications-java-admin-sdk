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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfMSTeamsDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfMSTeamsDestinationConfig model.
 */
public class DestinationConfigOneOfMSTeamsDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfMSTeamsDestinationConfig() throws Throwable {
    DestinationConfigOneOfMSTeamsDestinationConfig destinationConfigOneOfMsTeamsDestinationConfigModel = new DestinationConfigOneOfMSTeamsDestinationConfig.Builder()
      .url("testString")
      .build();
    assertEquals(destinationConfigOneOfMsTeamsDestinationConfigModel.url(), "testString");

    String json = TestUtilities.serialize(destinationConfigOneOfMsTeamsDestinationConfigModel);

    DestinationConfigOneOfMSTeamsDestinationConfig destinationConfigOneOfMsTeamsDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfMSTeamsDestinationConfig.class);
    assertTrue(destinationConfigOneOfMsTeamsDestinationConfigModelNew instanceof DestinationConfigOneOfMSTeamsDestinationConfig);
    assertEquals(destinationConfigOneOfMsTeamsDestinationConfigModelNew.url(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfMSTeamsDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfMSTeamsDestinationConfig.Builder().build();
  }

}