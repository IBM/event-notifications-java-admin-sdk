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
 * Payload describing a destination get request.
 */
public class Destination extends GenericModel {

  /**
   * Destination type
   * Email/SMS/Webhook/FCM/Slack/MSTeams/PagerDuty/IBMCodeEngine/ServiceNow/IBMCloudObjectStorage/Huawei/CustomEmail/CustomSMS/EventStreams.
   */
  public interface Type {
    /** webhook. */
    String WEBHOOK = "webhook";
    /** smtp_ibm. */
    String SMTP_IBM = "smtp_ibm";
    /** sms_ibm. */
    String SMS_IBM = "sms_ibm";
    /** push_android. */
    String PUSH_ANDROID = "push_android";
    /** push_ios. */
    String PUSH_IOS = "push_ios";
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
    /** event_streams. */
    String EVENT_STREAMS = "event_streams";
  }

  protected String id;
  protected String name;
  protected String description;
  protected String type;
  @SerializedName("collect_failed_events")
  protected Boolean collectFailedEvents;
  protected DestinationConfig config;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("subscription_count")
  protected Long subscriptionCount;
  @SerializedName("subscription_names")
  protected List<String> subscriptionNames;

  protected Destination() { }

  /**
   * Gets the id.
   *
   * Destination ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Destination name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Destination description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * Destination type
   * Email/SMS/Webhook/FCM/Slack/MSTeams/PagerDuty/IBMCodeEngine/ServiceNow/IBMCloudObjectStorage/Huawei/CustomEmail/CustomSMS/EventStreams.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the collectFailedEvents.
   *
   * Whether to collect the failed event in Cloud Object Storage bucket.
   *
   * @return the collectFailedEvents
   */
  public Boolean isCollectFailedEvents() {
    return collectFailedEvents;
  }

  /**
   * Gets the config.
   *
   * Payload describing a destination configuration.
   *
   * @return the config
   */
  public DestinationConfig getConfig() {
    return config;
  }

  /**
   * Gets the updatedAt.
   *
   * Last updated time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the subscriptionCount.
   *
   * Number of subscriptions.
   *
   * @return the subscriptionCount
   */
  public Long getSubscriptionCount() {
    return subscriptionCount;
  }

  /**
   * Gets the subscriptionNames.
   *
   * List of subscriptions.
   *
   * @return the subscriptionNames
   */
  public List<String> getSubscriptionNames() {
    return subscriptionNames;
  }
}

