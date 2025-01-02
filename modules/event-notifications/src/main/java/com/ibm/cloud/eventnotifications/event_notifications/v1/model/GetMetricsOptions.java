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
 * The getMetrics options.
 */
public class GetMetricsOptions extends GenericModel {

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
  protected String sourceId;
  protected String emailTo;
  protected String notificationId;
  protected String subject;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationType;
    private String gte;
    private String lte;
    private String destinationId;
    private String sourceId;
    private String emailTo;
    private String notificationId;
    private String subject;

    /**
     * Instantiates a new Builder from an existing GetMetricsOptions instance.
     *
     * @param getMetricsOptions the instance to initialize the Builder with
     */
    private Builder(GetMetricsOptions getMetricsOptions) {
      this.instanceId = getMetricsOptions.instanceId;
      this.destinationType = getMetricsOptions.destinationType;
      this.gte = getMetricsOptions.gte;
      this.lte = getMetricsOptions.lte;
      this.destinationId = getMetricsOptions.destinationId;
      this.sourceId = getMetricsOptions.sourceId;
      this.emailTo = getMetricsOptions.emailTo;
      this.notificationId = getMetricsOptions.notificationId;
      this.subject = getMetricsOptions.subject;
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
     * Builds a GetMetricsOptions.
     *
     * @return the new GetMetricsOptions instance
     */
    public GetMetricsOptions build() {
      return new GetMetricsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetMetricsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationType.
     *
     * @param destinationType the destinationType
     * @return the GetMetricsOptions builder
     */
    public Builder destinationType(String destinationType) {
      this.destinationType = destinationType;
      return this;
    }

    /**
     * Set the gte.
     *
     * @param gte the gte
     * @return the GetMetricsOptions builder
     */
    public Builder gte(String gte) {
      this.gte = gte;
      return this;
    }

    /**
     * Set the lte.
     *
     * @param lte the lte
     * @return the GetMetricsOptions builder
     */
    public Builder lte(String lte) {
      this.lte = lte;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the GetMetricsOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the sourceId.
     *
     * @param sourceId the sourceId
     * @return the GetMetricsOptions builder
     */
    public Builder sourceId(String sourceId) {
      this.sourceId = sourceId;
      return this;
    }

    /**
     * Set the emailTo.
     *
     * @param emailTo the emailTo
     * @return the GetMetricsOptions builder
     */
    public Builder emailTo(String emailTo) {
      this.emailTo = emailTo;
      return this;
    }

    /**
     * Set the notificationId.
     *
     * @param notificationId the notificationId
     * @return the GetMetricsOptions builder
     */
    public Builder notificationId(String notificationId) {
      this.notificationId = notificationId;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the GetMetricsOptions builder
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }
  }

  protected GetMetricsOptions() { }

  protected GetMetricsOptions(Builder builder) {
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
    sourceId = builder.sourceId;
    emailTo = builder.emailTo;
    notificationId = builder.notificationId;
    subject = builder.subject;
  }

  /**
   * New builder.
   *
   * @return a GetMetricsOptions builder
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
}

