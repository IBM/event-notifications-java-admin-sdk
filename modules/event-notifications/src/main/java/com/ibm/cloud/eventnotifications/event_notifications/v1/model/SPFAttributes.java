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
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The SPF attributes.
 */
public class SPFAttributes extends GenericModel {

  @SerializedName("txt_name")
  protected String txtName;
  @SerializedName("txt_value")
  protected String txtValue;
  protected String verification;

  /**
   * Builder.
   */
  public static class Builder {
    private String txtName;
    private String txtValue;
    private String verification;

    /**
     * Instantiates a new Builder from an existing SPFAttributes instance.
     *
     * @param spfAttributes the instance to initialize the Builder with
     */
    private Builder(SPFAttributes spfAttributes) {
      this.txtName = spfAttributes.txtName;
      this.txtValue = spfAttributes.txtValue;
      this.verification = spfAttributes.verification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SPFAttributes.
     *
     * @return the new SPFAttributes instance
     */
    public SPFAttributes build() {
      return new SPFAttributes(this);
    }

    /**
     * Set the txtName.
     *
     * @param txtName the txtName
     * @return the SPFAttributes builder
     */
    public Builder txtName(String txtName) {
      this.txtName = txtName;
      return this;
    }

    /**
     * Set the txtValue.
     *
     * @param txtValue the txtValue
     * @return the SPFAttributes builder
     */
    public Builder txtValue(String txtValue) {
      this.txtValue = txtValue;
      return this;
    }

    /**
     * Set the verification.
     *
     * @param verification the verification
     * @return the SPFAttributes builder
     */
    public Builder verification(String verification) {
      this.verification = verification;
      return this;
    }
  }

  protected SPFAttributes() { }

  protected SPFAttributes(Builder builder) {
    txtName = builder.txtName;
    txtValue = builder.txtValue;
    verification = builder.verification;
  }

  /**
   * New builder.
   *
   * @return a SPFAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the txtName.
   *
   * spf text name.
   *
   * @return the txtName
   */
  public String txtName() {
    return txtName;
  }

  /**
   * Gets the txtValue.
   *
   * spf text value.
   *
   * @return the txtValue
   */
  public String txtValue() {
    return txtValue;
  }

  /**
   * Gets the verification.
   *
   * spf verification.
   *
   * @return the verification
   */
  public String verification() {
    return verification;
  }
}

