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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Subscription list item.
 */
public class SubscriptionListItem extends GenericModel {

  /**
   * The type of destination.
   */
  public interface DestinationType {
    /** sms_ibm. */
    String SMS_IBM = "sms_ibm";
    /** smtp_ibm. */
    String SMTP_IBM = "smtp_ibm";
    /** webhook. */
    String WEBHOOK = "webhook";
    /** slack. */
    String SLACK = "slack";
  }

  protected String id;
  protected String name;
  protected String description;
  @SerializedName("destination_id")
  protected String destinationId;
  @SerializedName("destination_name")
  protected String destinationName;
  @SerializedName("destination_type")
  protected String destinationType;
  @SerializedName("topic_id")
  protected String topicId;
  @SerializedName("topic_name")
  protected String topicName;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Gets the id.
   *
   * ID of the subscription.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the subscription.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the subscription.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the destinationId.
   *
   * ID of the destination.
   *
   * @return the destinationId
   */
  public String getDestinationId() {
    return destinationId;
  }

  /**
   * Gets the destinationName.
   *
   * Name of the destination.
   *
   * @return the destinationName
   */
  public String getDestinationName() {
    return destinationName;
  }

  /**
   * Gets the destinationType.
   *
   * The type of destination.
   *
   * @return the destinationType
   */
  public String getDestinationType() {
    return destinationType;
  }

  /**
   * Gets the topicId.
   *
   * ID of the topic.
   *
   * @return the topicId
   */
  public String getTopicId() {
    return topicId;
  }

  /**
   * Gets the topicName.
   *
   * Name of the topic.
   *
   * @return the topicName
   */
  public String getTopicName() {
    return topicName;
  }

  /**
   * Gets the updatedAt.
   *
   * Last updated time of the subscription.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

