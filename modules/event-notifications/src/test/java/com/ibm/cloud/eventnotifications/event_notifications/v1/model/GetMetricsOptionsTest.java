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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetMetricsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetMetricsOptions model.
 */
public class GetMetricsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetMetricsOptions() throws Throwable {
    GetMetricsOptions getMetricsOptionsModel = new GetMetricsOptions.Builder()
      .instanceId("testString")
      .destinationType("smtp_custom")
      .gte("testString")
      .lte("testString")
      .destinationId("testString")
      .sourceId("testString")
      .emailTo("testString")
      .notificationId("testString")
      .subject("testString")
      .build();
    assertEquals(getMetricsOptionsModel.instanceId(), "testString");
    assertEquals(getMetricsOptionsModel.destinationType(), "smtp_custom");
    assertEquals(getMetricsOptionsModel.gte(), "testString");
    assertEquals(getMetricsOptionsModel.lte(), "testString");
    assertEquals(getMetricsOptionsModel.destinationId(), "testString");
    assertEquals(getMetricsOptionsModel.sourceId(), "testString");
    assertEquals(getMetricsOptionsModel.emailTo(), "testString");
    assertEquals(getMetricsOptionsModel.notificationId(), "testString");
    assertEquals(getMetricsOptionsModel.subject(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMetricsOptionsError() throws Throwable {
    new GetMetricsOptions.Builder().build();
  }

}