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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.GetBounceMetricsOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetBounceMetricsOptions model.
 */
public class GetBounceMetricsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetBounceMetricsOptions() throws Throwable {
    GetBounceMetricsOptions getBounceMetricsOptionsModel = new GetBounceMetricsOptions.Builder()
      .instanceId("testString")
      .destinationType("smtp_custom")
      .gte("testString")
      .lte("testString")
      .destinationId("testString")
      .subscriptionId("testString")
      .sourceId("testString")
      .emailTo("testString")
      .notificationId("testString")
      .subject("testString")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .build();
    assertEquals(getBounceMetricsOptionsModel.instanceId(), "testString");
    assertEquals(getBounceMetricsOptionsModel.destinationType(), "smtp_custom");
    assertEquals(getBounceMetricsOptionsModel.gte(), "testString");
    assertEquals(getBounceMetricsOptionsModel.lte(), "testString");
    assertEquals(getBounceMetricsOptionsModel.destinationId(), "testString");
    assertEquals(getBounceMetricsOptionsModel.subscriptionId(), "testString");
    assertEquals(getBounceMetricsOptionsModel.sourceId(), "testString");
    assertEquals(getBounceMetricsOptionsModel.emailTo(), "testString");
    assertEquals(getBounceMetricsOptionsModel.notificationId(), "testString");
    assertEquals(getBounceMetricsOptionsModel.subject(), "testString");
    assertEquals(getBounceMetricsOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(getBounceMetricsOptionsModel.offset(), Long.valueOf("0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBounceMetricsOptionsError() throws Throwable {
    new GetBounceMetricsOptions.Builder().build();
  }

}