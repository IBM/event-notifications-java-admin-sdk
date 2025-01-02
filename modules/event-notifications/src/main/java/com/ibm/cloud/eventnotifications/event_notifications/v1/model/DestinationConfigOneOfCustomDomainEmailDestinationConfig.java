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

/**
 * Payload describing a custom Domain Email destination configuration.
 */
public class DestinationConfigOneOfCustomDomainEmailDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String domain;
    private DKIMAttributes dkim;
    private SPFAttributes spf;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfCustomDomainEmailDestinationConfig instance.
     *
     * @param destinationConfigOneOfCustomDomainEmailDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfCustomDomainEmailDestinationConfig) {
      this.domain = destinationConfigOneOfCustomDomainEmailDestinationConfig.domain;
      this.dkim = destinationConfigOneOfCustomDomainEmailDestinationConfig.dkim;
      this.spf = destinationConfigOneOfCustomDomainEmailDestinationConfig.spf;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param domain the domain
     */
    public Builder(String domain) {
      this.domain = domain;
    }

    /**
     * Builds a DestinationConfigOneOfCustomDomainEmailDestinationConfig.
     *
     * @return the new DestinationConfigOneOfCustomDomainEmailDestinationConfig instance
     */
    public DestinationConfigOneOfCustomDomainEmailDestinationConfig build() {
      return new DestinationConfigOneOfCustomDomainEmailDestinationConfig(this);
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the DestinationConfigOneOfCustomDomainEmailDestinationConfig builder
     */
    public Builder domain(String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Set the dkim.
     *
     * @param dkim the dkim
     * @return the DestinationConfigOneOfCustomDomainEmailDestinationConfig builder
     */
    public Builder dkim(DKIMAttributes dkim) {
      this.dkim = dkim;
      return this;
    }

    /**
     * Set the spf.
     *
     * @param spf the spf
     * @return the DestinationConfigOneOfCustomDomainEmailDestinationConfig builder
     */
    public Builder spf(SPFAttributes spf) {
      this.spf = spf;
      return this;
    }
  }

  protected DestinationConfigOneOfCustomDomainEmailDestinationConfig() { }

  protected DestinationConfigOneOfCustomDomainEmailDestinationConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.domain,
      "domain cannot be null");
    domain = builder.domain;
    dkim = builder.dkim;
    spf = builder.spf;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfCustomDomainEmailDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

