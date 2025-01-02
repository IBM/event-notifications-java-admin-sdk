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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationList;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.DestinationListItem;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.PageHrefResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationList model.
 */
public class DestinationListTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationList() throws Throwable {
    DestinationList destinationListModel = new DestinationList();
    assertNull(destinationListModel.getTotalCount());
    assertNull(destinationListModel.getOffset());
    assertNull(destinationListModel.getLimit());
    assertNull(destinationListModel.getDestinations());
    assertNull(destinationListModel.getFirst());
    assertNull(destinationListModel.getPrevious());
    assertNull(destinationListModel.getNext());
  }
}