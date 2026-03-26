/*
 * (C) Copyright IBM Corp. 2026.
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
 * Payload describing a custom Email Sandbox destination configuration.
 */
public class DestinationConfigOneOfCustomEmailSandboxDestinationConfig extends DestinationConfigOneOf {


  /**
   * Builder.
   */
  public static class Builder {
    private String domain;
    private DKIMAttributes dkim;
    private SPFAttributes spf;

    /**
     * Instantiates a new Builder from an existing DestinationConfigOneOfCustomEmailSandboxDestinationConfig instance.
     *
     * @param destinationConfigOneOfCustomEmailSandboxDestinationConfig the instance to initialize the Builder with
     */
    public Builder(DestinationConfigOneOf destinationConfigOneOfCustomEmailSandboxDestinationConfig) {
      this.domain = destinationConfigOneOfCustomEmailSandboxDestinationConfig.domain;
      this.dkim = destinationConfigOneOfCustomEmailSandboxDestinationConfig.dkim;
      this.spf = destinationConfigOneOfCustomEmailSandboxDestinationConfig.spf;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DestinationConfigOneOfCustomEmailSandboxDestinationConfig.
     *
     * @return the new DestinationConfigOneOfCustomEmailSandboxDestinationConfig instance
     */
    public DestinationConfigOneOfCustomEmailSandboxDestinationConfig build() {
      return new DestinationConfigOneOfCustomEmailSandboxDestinationConfig(this);
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the DestinationConfigOneOfCustomEmailSandboxDestinationConfig builder
     */
    public Builder domain(String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Set the dkim.
     *
     * @param dkim the dkim
     * @return the DestinationConfigOneOfCustomEmailSandboxDestinationConfig builder
     */
    public Builder dkim(DKIMAttributes dkim) {
      this.dkim = dkim;
      return this;
    }

    /**
     * Set the spf.
     *
     * @param spf the spf
     * @return the DestinationConfigOneOfCustomEmailSandboxDestinationConfig builder
     */
    public Builder spf(SPFAttributes spf) {
      this.spf = spf;
      return this;
    }
  }

  protected DestinationConfigOneOfCustomEmailSandboxDestinationConfig() { }

  protected DestinationConfigOneOfCustomEmailSandboxDestinationConfig(Builder builder) {
    domain = builder.domain;
    dkim = builder.dkim;
    spf = builder.spf;
  }

  /**
   * New builder.
   *
   * @return a DestinationConfigOneOfCustomEmailSandboxDestinationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

