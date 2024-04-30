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
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.ENAuthAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PageHrefResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfiguration;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SMTPConfigurationsList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SPFAttributes;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SMTPConfigurationsList model.
 */
public class SMTPConfigurationsListTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSMTPConfigurationsList() throws Throwable {
    SMTPConfigurationsList smtpConfigurationsListModel = new SMTPConfigurationsList();
    assertNull(smtpConfigurationsListModel.getTotalCount());
    assertNull(smtpConfigurationsListModel.getOffset());
    assertNull(smtpConfigurationsListModel.getLimit());
    assertNull(smtpConfigurationsListModel.getSmtpConfigurations());
    assertNull(smtpConfigurationsListModel.getFirst());
    assertNull(smtpConfigurationsListModel.getPrevious());
    assertNull(smtpConfigurationsListModel.getNext());
  }
}