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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.CreateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsWebhookDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDestinationOptions model.
 */
public class CreateDestinationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDestinationOptions() throws Throwable {
    DestinationConfigParamsWebhookDestinationConfig destinationConfigParamsModel = new DestinationConfigParamsWebhookDestinationConfig.Builder()
      .url("testString")
      .verb("get")
      .customHeaders(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .sensitiveHeaders(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(destinationConfigParamsModel.url(), "testString");
    assertEquals(destinationConfigParamsModel.verb(), "get");
    assertEquals(destinationConfigParamsModel.customHeaders(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(destinationConfigParamsModel.sensitiveHeaders(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
      .params(destinationConfigParamsModel)
      .build();
    assertEquals(destinationConfigModel.params(), destinationConfigParamsModel);

    CreateDestinationOptions createDestinationOptionsModel = new CreateDestinationOptions.Builder()
      .instanceId("testString")
      .name("testString")
      .type("webhook")
      .description("testString")
      .config(destinationConfigModel)
      .certificate(TestUtilities.createMockStream("This is a mock file."))
      .certificateContentType("testString")
      .build();
    assertEquals(createDestinationOptionsModel.instanceId(), "testString");
    assertEquals(createDestinationOptionsModel.name(), "testString");
    assertEquals(createDestinationOptionsModel.type(), "webhook");
    assertEquals(createDestinationOptionsModel.description(), "testString");
    assertEquals(createDestinationOptionsModel.config(), destinationConfigModel);
    assertEquals(IOUtils.toString(createDestinationOptionsModel.certificate()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(createDestinationOptionsModel.certificateContentType(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDestinationOptionsError() throws Throwable {
    new CreateDestinationOptions.Builder().build();
  }

}