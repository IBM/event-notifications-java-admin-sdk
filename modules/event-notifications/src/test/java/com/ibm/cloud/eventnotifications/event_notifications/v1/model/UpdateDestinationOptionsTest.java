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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DKIMAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfCustomDomainEmailDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SPFAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.UpdateDestinationOptions;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateDestinationOptions model.
 */
public class UpdateDestinationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateDestinationOptions() throws Throwable {
    DKIMAttributes dkimAttributesModel = new DKIMAttributes.Builder()
      .publicKey("testString")
      .selector("testString")
      .verification("testString")
      .build();
    assertEquals(dkimAttributesModel.publicKey(), "testString");
    assertEquals(dkimAttributesModel.selector(), "testString");
    assertEquals(dkimAttributesModel.verification(), "testString");

    SPFAttributes spfAttributesModel = new SPFAttributes.Builder()
      .txtName("testString")
      .txtValue("testString")
      .verification("testString")
      .build();
    assertEquals(spfAttributesModel.txtName(), "testString");
    assertEquals(spfAttributesModel.txtValue(), "testString");
    assertEquals(spfAttributesModel.verification(), "testString");

    DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationConfigOneOfModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
      .domain("testString")
      .dkim(dkimAttributesModel)
      .spf(spfAttributesModel)
      .build();
    assertEquals(destinationConfigOneOfModel.domain(), "testString");
    assertEquals(destinationConfigOneOfModel.dkim(), dkimAttributesModel);
    assertEquals(destinationConfigOneOfModel.spf(), spfAttributesModel);

    DestinationConfig destinationConfigModel = new DestinationConfig.Builder()
      .params(destinationConfigOneOfModel)
      .build();
    assertEquals(destinationConfigModel.params(), destinationConfigOneOfModel);

    UpdateDestinationOptions updateDestinationOptionsModel = new UpdateDestinationOptions.Builder()
      .instanceId("testString")
      .id("testString")
      .name("testString")
      .description("testString")
      .collectFailedEvents(false)
      .config(destinationConfigModel)
      .certificate(TestUtilities.createMockStream("This is a mock file."))
      .certificateContentType("testString")
      .icon16x16(TestUtilities.createMockStream("This is a mock file."))
      .icon16x16ContentType("testString")
      .icon16x162x(TestUtilities.createMockStream("This is a mock file."))
      .icon16x162xContentType("testString")
      .icon32x32(TestUtilities.createMockStream("This is a mock file."))
      .icon32x32ContentType("testString")
      .icon32x322x(TestUtilities.createMockStream("This is a mock file."))
      .icon32x322xContentType("testString")
      .icon128x128(TestUtilities.createMockStream("This is a mock file."))
      .icon128x128ContentType("testString")
      .icon128x1282x(TestUtilities.createMockStream("This is a mock file."))
      .icon128x1282xContentType("testString")
      .build();
    assertEquals(updateDestinationOptionsModel.instanceId(), "testString");
    assertEquals(updateDestinationOptionsModel.id(), "testString");
    assertEquals(updateDestinationOptionsModel.name(), "testString");
    assertEquals(updateDestinationOptionsModel.description(), "testString");
    assertEquals(updateDestinationOptionsModel.collectFailedEvents(), Boolean.valueOf(false));
    assertEquals(updateDestinationOptionsModel.config(), destinationConfigModel);
    assertEquals(IOUtils.toString(updateDestinationOptionsModel.certificate()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(updateDestinationOptionsModel.certificateContentType(), "testString");
    assertEquals(IOUtils.toString(updateDestinationOptionsModel.icon16x16()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(updateDestinationOptionsModel.icon16x16ContentType(), "testString");
    assertEquals(IOUtils.toString(updateDestinationOptionsModel.icon16x162x()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(updateDestinationOptionsModel.icon16x162xContentType(), "testString");
    assertEquals(IOUtils.toString(updateDestinationOptionsModel.icon32x32()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(updateDestinationOptionsModel.icon32x32ContentType(), "testString");
    assertEquals(IOUtils.toString(updateDestinationOptionsModel.icon32x322x()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(updateDestinationOptionsModel.icon32x322xContentType(), "testString");
    assertEquals(IOUtils.toString(updateDestinationOptionsModel.icon128x128()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(updateDestinationOptionsModel.icon128x128ContentType(), "testString");
    assertEquals(IOUtils.toString(updateDestinationOptionsModel.icon128x1282x()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(updateDestinationOptionsModel.icon128x1282xContentType(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDestinationOptionsError() throws Throwable {
    new UpdateDestinationOptions.Builder().build();
  }

}