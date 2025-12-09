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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Bounce metric object.
 */
public class BounceMetricItem extends GenericModel {

  @SerializedName("email_address")
  protected String emailAddress;
  protected String subject;
  @SerializedName("error_message")
  protected String errorMessage;
  @SerializedName("ip_address")
  protected String ipAddress;
  @SerializedName("subscription_id")
  protected String subscriptionId;
  protected Date timestamp;

  protected BounceMetricItem() { }

  /**
   * Gets the emailAddress.
   *
   * Email address.
   *
   * @return the emailAddress
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Gets the subject.
   *
   * Subject.
   *
   * @return the subject
   */
  public String getSubject() {
    return subject;
  }

  /**
   * Gets the errorMessage.
   *
   * Error message.
   *
   * @return the errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Gets the ipAddress.
   *
   * IP address.
   *
   * @return the ipAddress
   */
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * Gets the subscriptionId.
   *
   * Subscription ID.
   *
   * @return the subscriptionId
   */
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Gets the timestamp.
   *
   * Bounced at.
   *
   * @return the timestamp
   */
  public Date getTimestamp() {
    return timestamp;
  }
}

