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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Options to specify for Android expandable notifications. The types of expandable notifications are
 * picture_notification, bigtext_notification, inbox_notification.
 */
public class Style extends DynamicModel<Object> {

  @SerializedName("type")
  protected String type;
  @SerializedName("title")
  protected String title;
  @SerializedName("url")
  protected String url;
  @SerializedName("text")
  protected String text;
  @SerializedName("lines")
  protected List<String> lines;

  public Style() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String title;
    private String url;
    private String text;
    private List<String> lines;
    private Map<String, Object> dynamicProperties;

    private Builder(Style style) {
      this.type = style.type;
      this.title = style.title;
      this.url = style.url;
      this.text = style.text;
      this.lines = style.lines;
      this.dynamicProperties = style.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Style.
     *
     * @return the new Style instance
     */
    public Style build() {
      return new Style(this);
    }

    /**
     * Adds an lines to lines.
     *
     * @param lines the new lines
     * @return the Style builder
     */
    public Builder addLines(String lines) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(lines,
        "lines cannot be null");
      if (this.lines == null) {
        this.lines = new ArrayList<String>();
      }
      this.lines.add(lines);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Style builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the title.
     *
     * @param title the title
     * @return the Style builder
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the Style builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the text.
     *
     * @param text the text
     * @return the Style builder
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }

    /**
     * Set the lines.
     * Existing lines will be replaced.
     *
     * @param lines the lines
     * @return the Style builder
     */
    public Builder lines(List<String> lines) {
      this.lines = lines;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the Style builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected Style(Builder builder) {
    super(new TypeToken<Object>() { });
    type = builder.type;
    title = builder.title;
    url = builder.url;
    text = builder.text;
    lines = builder.lines;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a Style builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Specifies the type of expandable notifications.  The possible values are bigtext_notification,
   * picture_notification, inbox_notification.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets the title.
   *
   * Specifies the title of the notification.  The title is displayed when the notification is expanded.  Title must be
   * specified for all three expandable notification.
   *
   * @return the title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Sets the title.
   *
   * @param title the new title
   */
  public void setTitle(final String title) {
    this.title = title;
  }

  /**
   * Gets the url.
   *
   * An URL from which the picture has to be obtained for the notification.  Must be specified for picture_notification.
   *
   * @return the url
   */
  public String getUrl() {
    return this.url;
  }

  /**
   * Sets the url.
   *
   * @param url the new url
   */
  public void setUrl(final String url) {
    this.url = url;
  }

  /**
   * Gets the text.
   *
   * The big text that needs to be displayed on expanding a bigtext_notification.  Must be specified for
   * bigtext_notification.
   *
   * @return the text
   */
  public String getText() {
    return this.text;
  }

  /**
   * Sets the text.
   *
   * @param text the new text
   */
  public void setText(final String text) {
    this.text = text;
  }

  /**
   * Gets the lines.
   *
   * An array of strings that is to be displayed in inbox style for inbox_notification.  Must be specified for
   * inbox_notification.
   *
   * @return the lines
   */
  public List<String> getLines() {
    return this.lines;
  }

  /**
   * Sets the lines.
   *
   * @param lines the new lines
   */
  public void setLines(final List<String> lines) {
    this.lines = lines;
  }
}
