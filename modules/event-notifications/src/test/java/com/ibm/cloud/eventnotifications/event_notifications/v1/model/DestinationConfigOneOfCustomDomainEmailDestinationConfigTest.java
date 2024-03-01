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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DKIMAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfCustomDomainEmailDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SPFAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationConfigOneOfCustomDomainEmailDestinationConfig model.
 */
public class DestinationConfigOneOfCustomDomainEmailDestinationConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationConfigOneOfCustomDomainEmailDestinationConfig() throws Throwable {
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

    DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationConfigOneOfCustomDomainEmailDestinationConfigModel = new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder()
      .domain("testString")
      .dkim(dkimAttributesModel)
      .spf(spfAttributesModel)
      .build();
    assertEquals(destinationConfigOneOfCustomDomainEmailDestinationConfigModel.domain(), "testString");
    assertEquals(destinationConfigOneOfCustomDomainEmailDestinationConfigModel.dkim(), dkimAttributesModel);
    assertEquals(destinationConfigOneOfCustomDomainEmailDestinationConfigModel.spf(), spfAttributesModel);

    String json = TestUtilities.serialize(destinationConfigOneOfCustomDomainEmailDestinationConfigModel);

    DestinationConfigOneOfCustomDomainEmailDestinationConfig destinationConfigOneOfCustomDomainEmailDestinationConfigModelNew = TestUtilities.deserialize(json, DestinationConfigOneOfCustomDomainEmailDestinationConfig.class);
    assertTrue(destinationConfigOneOfCustomDomainEmailDestinationConfigModelNew instanceof DestinationConfigOneOfCustomDomainEmailDestinationConfig);
    assertEquals(destinationConfigOneOfCustomDomainEmailDestinationConfigModelNew.domain(), "testString");
    assertEquals(destinationConfigOneOfCustomDomainEmailDestinationConfigModelNew.dkim().toString(), dkimAttributesModel.toString());
    assertEquals(destinationConfigOneOfCustomDomainEmailDestinationConfigModelNew.spf().toString(), spfAttributesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestinationConfigOneOfCustomDomainEmailDestinationConfigError() throws Throwable {
    new DestinationConfigOneOfCustomDomainEmailDestinationConfig.Builder().build();
  }

}