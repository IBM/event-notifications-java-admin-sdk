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
 * The DKIM attributes.
 */
public class DKIMAttributes extends GenericModel {

  @SerializedName("public_key")
  protected String publicKey;
  protected String selector;
  protected String verification;

  /**
   * Builder.
   */
  public static class Builder {
    private String publicKey;
    private String selector;
    private String verification;

    /**
     * Instantiates a new Builder from an existing DKIMAttributes instance.
     *
     * @param dkimAttributes the instance to initialize the Builder with
     */
    private Builder(DKIMAttributes dkimAttributes) {
      this.publicKey = dkimAttributes.publicKey;
      this.selector = dkimAttributes.selector;
      this.verification = dkimAttributes.verification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DKIMAttributes.
     *
     * @return the new DKIMAttributes instance
     */
    public DKIMAttributes build() {
      return new DKIMAttributes(this);
    }

    /**
     * Set the publicKey.
     *
     * @param publicKey the publicKey
     * @return the DKIMAttributes builder
     */
    public Builder publicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    /**
     * Set the selector.
     *
     * @param selector the selector
     * @return the DKIMAttributes builder
     */
    public Builder selector(String selector) {
      this.selector = selector;
      return this;
    }

    /**
     * Set the verification.
     *
     * @param verification the verification
     * @return the DKIMAttributes builder
     */
    public Builder verification(String verification) {
      this.verification = verification;
      return this;
    }
  }

  protected DKIMAttributes() { }

  protected DKIMAttributes(Builder builder) {
    publicKey = builder.publicKey;
    selector = builder.selector;
    verification = builder.verification;
  }

  /**
   * New builder.
   *
   * @return a DKIMAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the publicKey.
   *
   * dkim public key.
   *
   * @return the publicKey
   */
  public String publicKey() {
    return publicKey;
  }

  /**
   * Gets the selector.
   *
   * dkim selector.
   *
   * @return the selector
   */
  public String selector() {
    return selector;
  }

  /**
   * Gets the verification.
   *
   * dkim verification.
   *
   * @return the verification
   */
  public String verification() {
    return verification;
  }
}

