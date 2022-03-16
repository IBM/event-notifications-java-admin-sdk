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

import com.ibm.cloud.eventnotifications.event_notifications.v1.model.Style;
import com.ibm.cloud.eventnotifications.event_notifications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Style model.
 */
public class StyleTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStyle() throws Throwable {
    Style styleModel = new Style.Builder()
      .type("testString")
      .title("testString")
      .url("testString")
      .text("testString")
      .lines(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();
    assertEquals(styleModel.getType(), "testString");
    assertEquals(styleModel.getTitle(), "testString");
    assertEquals(styleModel.getUrl(), "testString");
    assertEquals(styleModel.getText(), "testString");
    assertEquals(styleModel.getLines(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(styleModel.get("foo"), "testString");

    String json = TestUtilities.serialize(styleModel);

    Style styleModelNew = TestUtilities.deserialize(json, Style.class);
    assertTrue(styleModelNew instanceof Style);
    assertEquals(styleModelNew.getType(), "testString");
    assertEquals(styleModelNew.getTitle(), "testString");
    assertEquals(styleModelNew.getUrl(), "testString");
    assertEquals(styleModelNew.getText(), "testString");
    assertEquals(styleModelNew.get("foo"), "testString");
  }
}