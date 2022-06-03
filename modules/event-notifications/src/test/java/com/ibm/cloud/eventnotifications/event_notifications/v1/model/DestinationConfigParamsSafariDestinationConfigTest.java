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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigParamsSafariDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigParamsSafariDestinationConfig model.
 */
public class DestinationConfigParamsSafariDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigParamsSafariDestinationConfig() throws Throwable {
    DestinationConfigParamsSafariDestinationConfig destinationConfigParamsSafariDestinationConfigModel = new DestinationConfigParamsSafariDestinationConfig.Builder()
      .certType("p12")
      .password("testString")
      .websiteUrl("testString")
      .websiteName("testString")
      .urlFormatString("testString")
      .websitePushId("testString")
      .build();
    assertEquals(destinationConfigParamsSafariDestinationConfigModel.certType(), "p12");
    assertEquals(destinationConfigParamsSafariDestinationConfigModel.password(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModel.websiteUrl(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModel.websiteName(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModel.urlFormatString(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModel.websitePushId(), "testString");

    String json = TestUtilities.serialize(destinationConfigParamsSafariDestinationConfigModel);

    DestinationConfigParamsSafariDestinationConfig destinationConfigParamsSafariDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigParamsSafariDestinationConfig.class);
    assertTrue(destinationConfigParamsSafariDestinationConfigModelNew instanceof DestinationConfigParamsSafariDestinationConfig);
    assertEquals(destinationConfigParamsSafariDestinationConfigModelNew.certType(), "p12");
    assertEquals(destinationConfigParamsSafariDestinationConfigModelNew.password(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModelNew.websiteUrl(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModelNew.websiteName(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModelNew.urlFormatString(), "testString");
    assertEquals(destinationConfigParamsSafariDestinationConfigModelNew.websitePushId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigParamsSafariDestinationConfigError() throws Throwable {
    new DestinationConfigParamsSafariDestinationConfig.Builder().build();
  }

}