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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * verification object.
 */
public class SMTPVerificationResponse extends GenericModel {

  protected String type;
  protected String verification;

  protected SMTPVerificationResponse() { }

  /**
   * Gets the type.
   *
   * verification type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the verification.
   *
   * verification status.
   *
   * @return the verification
   */
  public String getVerification() {
    return verification;
  }
}

