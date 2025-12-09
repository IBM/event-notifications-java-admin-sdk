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
 * The getBounceMetrics options.
 */
public class GetBounceMetricsOptions extends GenericModel {

  /**
   * Destination type. Allowed values are [smtp_custom].
   */
  public interface DestinationType {
    /** smtp_custom. */
    String SMTP_CUSTOM = "smtp_custom";
  }

  protected String instanceId;
  protected String destinationType;
  protected String gte;
  protected String lte;
  protected String destinationId;
  protected String subscriptionId;
  protected String sourceId;
  protected String emailTo;
  protected String notificationId;
  protected String subject;
  protected Long limit;
  protected Long offset;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationType;
    private String gte;
    private String lte;
    private String destinationId;
    private String subscriptionId;
    private String sourceId;
    private String emailTo;
    private String notificationId;
    private String subject;
    private Long limit;
    private Long offset;

    /**
     * Instantiates a new Builder from an existing GetBounceMetricsOptions instance.
     *
     * @param getBounceMetricsOptions the instance to initialize the Builder with
     */
    private Builder(GetBounceMetricsOptions getBounceMetricsOptions) {
      this.instanceId = getBounceMetricsOptions.instanceId;
      this.destinationType = getBounceMetricsOptions.destinationType;
      this.gte = getBounceMetricsOptions.gte;
      this.lte = getBounceMetricsOptions.lte;
      this.destinationId = getBounceMetricsOptions.destinationId;
      this.subscriptionId = getBounceMetricsOptions.subscriptionId;
      this.sourceId = getBounceMetricsOptions.sourceId;
      this.emailTo = getBounceMetricsOptions.emailTo;
      this.notificationId = getBounceMetricsOptions.notificationId;
      this.subject = getBounceMetricsOptions.subject;
      this.limit = getBounceMetricsOptions.limit;
      this.offset = getBounceMetricsOptions.offset;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param destinationType the destinationType
     * @param gte the gte
     * @param lte the lte
     */
    public Builder(String instanceId, String destinationType, String gte, String lte) {
      this.instanceId = instanceId;
      this.destinationType = destinationType;
      this.gte = gte;
      this.lte = lte;
    }

    /**
     * Builds a GetBounceMetricsOptions.
     *
     * @return the new GetBounceMetricsOptions instance
     */
    public GetBounceMetricsOptions build() {
      return new GetBounceMetricsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetBounceMetricsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationType.
     *
     * @param destinationType the destinationType
     * @return the GetBounceMetricsOptions builder
     */
    public Builder destinationType(String destinationType) {
      this.destinationType = destinationType;
      return this;
    }

    /**
     * Set the gte.
     *
     * @param gte the gte
     * @return the GetBounceMetricsOptions builder
     */
    public Builder gte(String gte) {
      this.gte = gte;
      return this;
    }

    /**
     * Set the lte.
     *
     * @param lte the lte
     * @return the GetBounceMetricsOptions builder
     */
    public Builder lte(String lte) {
      this.lte = lte;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the GetBounceMetricsOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the subscriptionId.
     *
     * @param subscriptionId the subscriptionId
     * @return the GetBounceMetricsOptions builder
     */
    public Builder subscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
      return this;
    }

    /**
     * Set the sourceId.
     *
     * @param sourceId the sourceId
     * @return the GetBounceMetricsOptions builder
     */
    public Builder sourceId(String sourceId) {
      this.sourceId = sourceId;
      return this;
    }

    /**
     * Set the emailTo.
     *
     * @param emailTo the emailTo
     * @return the GetBounceMetricsOptions builder
     */
    public Builder emailTo(String emailTo) {
      this.emailTo = emailTo;
      return this;
    }

    /**
     * Set the notificationId.
     *
     * @param notificationId the notificationId
     * @return the GetBounceMetricsOptions builder
     */
    public Builder notificationId(String notificationId) {
      this.notificationId = notificationId;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the GetBounceMetricsOptions builder
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetBounceMetricsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetBounceMetricsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }
  }

  protected GetBounceMetricsOptions() { }

  protected GetBounceMetricsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destinationType,
      "destinationType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.gte,
      "gte cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.lte,
      "lte cannot be null");
    instanceId = builder.instanceId;
    destinationType = builder.destinationType;
    gte = builder.gte;
    lte = builder.lte;
    destinationId = builder.destinationId;
    subscriptionId = builder.subscriptionId;
    sourceId = builder.sourceId;
    emailTo = builder.emailTo;
    notificationId = builder.notificationId;
    subject = builder.subject;
    limit = builder.limit;
    offset = builder.offset;
  }

  /**
   * New builder.
   *
   * @return a GetBounceMetricsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * Unique identifier for IBM Cloud Event Notifications instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the destinationType.
   *
   * Destination type. Allowed values are [smtp_custom].
   *
   * @return the destinationType
   */
  public String destinationType() {
    return destinationType;
  }

  /**
   * Gets the gte.
   *
   * GTE (greater than equal), start timestamp in UTC.
   *
   * @return the gte
   */
  public String gte() {
    return gte;
  }

  /**
   * Gets the lte.
   *
   * LTE (less than equal), end timestamp in UTC.
   *
   * @return the lte
   */
  public String lte() {
    return lte;
  }

  /**
   * Gets the destinationId.
   *
   * Unique identifier for Destination.
   *
   * @return the destinationId
   */
  public String destinationId() {
    return destinationId;
  }

  /**
   * Gets the subscriptionId.
   *
   * Unique identifier for Subscription.
   *
   * @return the subscriptionId
   */
  public String subscriptionId() {
    return subscriptionId;
  }

  /**
   * Gets the sourceId.
   *
   * Unique identifier for Source.
   *
   * @return the sourceId
   */
  public String sourceId() {
    return sourceId;
  }

  /**
   * Gets the emailTo.
   *
   * Receiver email id.
   *
   * @return the emailTo
   */
  public String emailTo() {
    return emailTo;
  }

  /**
   * Gets the notificationId.
   *
   * Notification Id.
   *
   * @return the notificationId
   */
  public String notificationId() {
    return notificationId;
  }

  /**
   * Gets the subject.
   *
   * Email subject.
   *
   * @return the subject
   */
  public String subject() {
    return subject;
  }

  /**
   * Gets the limit.
   *
   * Page limit for paginated results.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * offset for paginated results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }
}

