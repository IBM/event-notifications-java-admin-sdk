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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Destination;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationConfigOneOfWebhookDestinationConfig;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Destination model.
 */
public class DestinationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestination() throws Throwable {
    Destination destinationModel = new Destination();
    assertNull(destinationModel.getId());
    assertNull(destinationModel.getName());
    assertNull(destinationModel.getDescription());
    assertNull(destinationModel.getType());
    assertNull(destinationModel.isCollectFailedEvents());
    assertNull(destinationModel.getConfig());
    assertNull(destinationModel.getUpdatedAt());
    assertNull(destinationModel.getSubscriptionCount());
    assertNull(destinationModel.getSubscriptionNames());
  }
}