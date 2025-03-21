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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a SMTP allowed Ips.
 */
public class SMTPAllowedIPs extends GenericModel {

  protected List<String> subnets;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected SMTPAllowedIPs() { }

  /**
   * Gets the subnets.
   *
   * The SMTP allowed Ips.
   *
   * @return the subnets
   */
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Gets the updatedAt.
   *
   * Updated at.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

