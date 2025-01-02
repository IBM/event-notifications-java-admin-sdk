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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfCodeEngineDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfCodeEngineDestinationConfig model.
 */
public class DestinationConfigOneOfCodeEngineDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfCodeEngineDestinationConfig() throws Throwable {
    DestinationConfigOneOfCodeEngineDestinationConfig destinationConfigOneOfCodeEngineDestinationConfigModel = new DestinationConfigOneOfCodeEngineDestinationConfig.Builder()
      .url("testString")
      .verb("get")
      .type("job")
      .projectCrn("testString")
      .jobName("testString")
      .customHeaders(java.util.Collections.singletonMap("foo", "testString"))
      .sensitiveHeaders(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModel.url(), "testString");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModel.verb(), "get");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModel.type(), "job");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModel.projectCrn(), "testString");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModel.jobName(), "testString");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModel.customHeaders(), java.util.Collections.singletonMap("foo", "testString"));
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModel.sensitiveHeaders(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(destinationConfigOneOfCodeEngineDestinationConfigModel);

    DestinationConfigOneOfCodeEngineDestinationConfig destinationConfigOneOfCodeEngineDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfCodeEngineDestinationConfig.class);
    assertTrue(destinationConfigOneOfCodeEngineDestinationConfigModelNew instanceof DestinationConfigOneOfCodeEngineDestinationConfig);
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModelNew.url(), "testString");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModelNew.verb(), "get");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModelNew.type(), "job");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModelNew.projectCrn(), "testString");
    assertEquals(destinationConfigOneOfCodeEngineDestinationConfigModelNew.jobName(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfCodeEngineDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfCodeEngineDestinationConfig.Builder().build();
  }

}