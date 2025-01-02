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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The SMTP DKIM attributes.
 */
public class SMTPDKIMAttributes extends GenericModel {

  @SerializedName("txt_name")
  protected String txtName;
  @SerializedName("txt_value")
  protected String txtValue;
  protected String verification;

  protected SMTPDKIMAttributes() { }

  /**
   * Gets the txtName.
   *
   * DKIM text name.
   *
   * @return the txtName
   */
  public String getTxtName() {
    return txtName;
  }

  /**
   * Gets the txtValue.
   *
   * DKIM text value.
   *
   * @return the txtValue
   */
  public String getTxtValue() {
    return txtValue;
  }

  /**
   * Gets the verification.
   *
   * DKIM verification.
   *
   * @return the verification
   */
  public String getVerification() {
    return verification;
  }
}

