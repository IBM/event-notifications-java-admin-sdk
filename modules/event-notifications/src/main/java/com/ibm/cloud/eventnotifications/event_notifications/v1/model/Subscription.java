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

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Subscription object.
 */
public class Subscription extends DynamicModel<Object> {

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
    /** push_android. */
    String PUSH_ANDROID = "push_android";
    /** push_ios. */
    String PUSH_IOS = "push_ios";
    /** push_chrome. */
    String PUSH_CHROME = "push_chrome";
    /** push_firefox. */
    String PUSH_FIREFOX = "push_firefox";
    /** slack. */
    String SLACK = "slack";
    /** ibmce. */
    String IBMCE = "ibmce";
    /** pagerduty. */
    String PAGERDUTY = "pagerduty";
    /** push_safari. */
    String PUSH_SAFARI = "push_safari";
    /** msteams. */
    String MSTEAMS = "msteams";
    /** servicenow. */
    String SERVICENOW = "servicenow";
    /** ibmcos. */
    String IBMCOS = "ibmcos";
    /** push_huawei. */
    String PUSH_HUAWEI = "push_huawei";
    /** smtp_custom. */
    String SMTP_CUSTOM = "smtp_custom";
    /** sms_custom. */
    String SMS_CUSTOM = "sms_custom";
  }

  @SerializedName("id")
  protected String id;
  @SerializedName("name")
  protected String name;
  @SerializedName("description")
  protected String description;
  @SerializedName("updated_at")
  protected String updatedAt;
  @SerializedName("from")
  protected String from;
  @SerializedName("destination_type")
  protected String destinationType;
  @SerializedName("destination_id")
  protected String destinationId;
  @SerializedName("destination_name")
  protected String destinationName;
  @SerializedName("topic_id")
  protected String topicId;
  @SerializedName("topic_name")
  protected String topicName;
  @SerializedName("attributes")
  protected SubscriptionAttributes attributes;

  public Subscription() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the id.
   *
   * Subscription ID.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the name.
   *
   * Subscription name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the description.
   *
   * Subscription description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Gets the updatedAt.
   *
   * Last updated time.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * Gets the from.
   *
   * From Email ID (it will be displayed only in case of smtp_ibm destination type).
   *
   * @return the from
   */
  public String getFrom() {
    return this.from;
  }

  /**
   * Gets the destinationType.
   *
   * The type of destination.
   *
   * @return the destinationType
   */
  public String getDestinationType() {
    return this.destinationType;
  }

  /**
   * Gets the destinationId.
   *
   * The destination ID.
   *
   * @return the destinationId
   */
  public String getDestinationId() {
    return this.destinationId;
  }

  /**
   * Gets the destinationName.
   *
   * The destination name.
   *
   * @return the destinationName
   */
  public String getDestinationName() {
    return this.destinationName;
  }

  /**
   * Gets the topicId.
   *
   * Topic ID.
   *
   * @return the topicId
   */
  public String getTopicId() {
    return this.topicId;
  }

  /**
   * Gets the topicName.
   *
   * Topic name.
   *
   * @return the topicName
   */
  public String getTopicName() {
    return this.topicName;
  }

  /**
   * Gets the attributes.
   *
   * @return the attributes
   */
  public SubscriptionAttributes getAttributes() {
    return this.attributes;
  }
}
