/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes.models;

/**
 * Interface for themes serializable from xml
 */
public interface MTSerializedTheme {
  /**
   * Get the hex code for the background color
   */
  String getBackgroundColorString();

  /**
   * Get the hex code for the foreground color
   */
  String getForegroundColorString();

  /**
   * Get the hex code for the text color
   */
  String getTextColorString();

  /**
   * Get the hex code for the selection background color
   */
  String getSelectionBackgroundColorString();

  /**
   * Get the hex code for the selection foreground color
   */
  String getSelectionForegroundColorString();

  /**
   * Get the hex code for the button color
   */
  String getButtonColorString();

  /**
   * Get the hex code for the secondary background color
   */
  String getSecondaryBackgroundColorString();

  /**
   * Get the hex code for the disabled color
   */
  String getDisabledColorString();

  /**
   * Get the hex code for the contrast color
   */
  String getContrastColorString();

  /**
   * Get the hex code for the table selected color
   */
  String getTableSelectedColorString();

  /**
   * Get the hex code for the second border color
   */
  String getSecondBorderColorString();

  /**
   * Get the hex code for the highlight color
   */
  String getHighlightColorString();

  /**
   * Get the hex code for the tree selection color
   */
  String getTreeSelectionColorString();

  /**
   * Get the hex code for the notifications color
   */
  String getNotificationsColorString();

  /**
   * The accent color string
   */
  String getAccentColorString();

  /**
   * The excluded files color string
   */
  String getExcludedColorString();
}