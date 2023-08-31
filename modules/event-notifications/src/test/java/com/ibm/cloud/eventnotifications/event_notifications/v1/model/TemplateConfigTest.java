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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.TemplateConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TemplateConfig model.
 */
public class TemplateConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateConfig() throws Throwable {
    TemplateConfig templateConfigModel = new TemplateConfig.Builder()
      .body("testString")
      .subject("testString")
      .build();
    assertEquals(templateConfigModel.body(), "testString");
    assertEquals(templateConfigModel.subject(), "testString");

    String json = TestUtilities.serialize(templateConfigModel);

    TemplateConfig templateConfigModelNew = TestUtilities.deserialize(json, TemplateConfig.class);
    assertTrue(templateConfigModelNew instanceof TemplateConfig);
    assertEquals(templateConfigModelNew.body(), "testString");
    assertEquals(templateConfigModelNew.subject(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTemplateConfigError() throws Throwable {
    new TemplateConfig.Builder().build();
  }

}