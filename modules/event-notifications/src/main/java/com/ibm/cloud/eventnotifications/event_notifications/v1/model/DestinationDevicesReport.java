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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Payload describing a destination devices report.
 */
public class DestinationDevicesReport extends GenericModel {

  protected Long android;
  protected Long ios;
  protected Long chrome;
  protected Long firefox;
  protected Long safari;
  protected Long chromeAppExt;
  protected Long all;

  /**
   * Gets the android.
   *
   * Android Devices Registered.
   *
   * @return the android
   */
  public Long getAndroid() {
    return android;
  }

  /**
   * Gets the ios.
   *
   * ios Devices Registered.
   *
   * @return the ios
   */
  public Long getIos() {
    return ios;
  }

  /**
   * Gets the chrome.
   *
   * chrome web Devices Registered.
   *
   * @return the chrome
   */
  public Long getChrome() {
    return chrome;
  }

  /**
   * Gets the firefox.
   *
   * firefox web Devices Registered.
   *
   * @return the firefox
   */
  public Long getFirefox() {
    return firefox;
  }

  /**
   * Gets the safari.
   *
   * safari web Devices Registered.
   *
   * @return the safari
   */
  public Long getSafari() {
    return safari;
  }

  /**
   * Gets the chromeAppExt.
   *
   * chromeAppExt Devices Registered.
   *
   * @return the chromeAppExt
   */
  public Long getChromeAppExt() {
    return chromeAppExt;
  }

  /**
   * Gets the all.
   *
   * Total Devices Registered.
   *
   * @return the all
   */
  public Long getAll() {
    return all;
  }
}

