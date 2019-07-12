package com.mainacad.util;

import org.apache.commons.lang3.StringUtils;

public class TextLineFormatter {

  public static String alignLeft(String string, int stringWidth) {
    String emptyString = StringUtils.repeat(" ", stringWidth);
    try {
      if (string.length() > stringWidth) {
        throw new IllegalArgumentException("string.length() must be < stringWidth");
      }
      return StringUtils
          .overlay(emptyString, string, emptyString.length() - string.length(),
              emptyString.length());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return emptyString;
  }
}
