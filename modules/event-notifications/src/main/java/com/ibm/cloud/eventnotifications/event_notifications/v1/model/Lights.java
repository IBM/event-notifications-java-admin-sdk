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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Allows setting the notification LED color on receiving push notification .
 */
public class Lights extends GenericModel {

  @SerializedName("led_argb")
  protected String ledArgb;
  @SerializedName("led_on_ms")
  protected Long ledOnMs;
  @SerializedName("led_off_ms")
  protected String ledOffMs;

  /**
   * Builder.
   */
  public static class Builder {
    private String ledArgb;
    private Long ledOnMs;
    private String ledOffMs;

    private Builder(Lights lights) {
      this.ledArgb = lights.ledArgb;
      this.ledOnMs = lights.ledOnMs;
      this.ledOffMs = lights.ledOffMs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Lights.
     *
     * @return the new Lights instance
     */
    public Lights build() {
      return new Lights(this);
    }

    /**
     * Set the ledArgb.
     *
     * @param ledArgb the ledArgb
     * @return the Lights builder
     */
    public Builder ledArgb(String ledArgb) {
      this.ledArgb = ledArgb;
      return this;
    }

    /**
     * Set the ledOnMs.
     *
     * @param ledOnMs the ledOnMs
     * @return the Lights builder
     */
    public Builder ledOnMs(long ledOnMs) {
      this.ledOnMs = ledOnMs;
      return this;
    }

    /**
     * Set the ledOffMs.
     *
     * @param ledOffMs the ledOffMs
     * @return the Lights builder
     */
    public Builder ledOffMs(String ledOffMs) {
      this.ledOffMs = ledOffMs;
      return this;
    }
  }

  protected Lights(Builder builder) {
    ledArgb = builder.ledArgb;
    ledOnMs = builder.ledOnMs;
    ledOffMs = builder.ledOffMs;
  }

  /**
   * New builder.
   *
   * @return a Lights builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ledArgb.
   *
   * The color of the led. The hardware will do its best approximation.
   *
   * @return the ledArgb
   */
  public String ledArgb() {
    return ledArgb;
  }

  /**
   * Gets the ledOnMs.
   *
   * The number of milliseconds for the LED to be on while it's flashing. The hardware will do its best approximation.
   *
   * @return the ledOnMs
   */
  public Long ledOnMs() {
    return ledOnMs;
  }

  /**
   * Gets the ledOffMs.
   *
   * The number of milliseconds for the LED to be off while it's flashing. The hardware will do its best approximation.
   *
   * @return the ledOffMs
   */
  public String ledOffMs() {
    return ledOffMs;
  }
}

