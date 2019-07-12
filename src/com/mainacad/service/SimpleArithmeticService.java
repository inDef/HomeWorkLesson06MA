package com.mainacad.service;

import com.mainacad.util.TextLineFormatter;
import org.apache.commons.lang3.StringUtils;

public class SimpleArithmeticService {

  public static String multiplyViaColumn(long number, long multiplier) {
    StringBuilder output = new StringBuilder();
    Long result = number * multiplier;
    char separatorChar = '_';

    int maxStringWidth = String.valueOf(result).length();
    if (String.valueOf(number).length() > maxStringWidth) {
      maxStringWidth = String.valueOf(number).length();
    }
    if (String.valueOf(multiplier).length() > maxStringWidth) {
      maxStringWidth = String.valueOf(multiplier).length();
    }

    output.append(TextLineFormatter.alignLeft(String.valueOf(number), maxStringWidth)).append("\n");
    output.append(TextLineFormatter.alignLeft(String.valueOf(multiplier), maxStringWidth))
        .append("\n");
    if (result != 0) {
      int spacesAfter = 0;
      while (Math.abs(multiplier) > 0) {
        long intermediateResult = number * (multiplier % 10);

        if (spacesAfter == 0) {
          String firstSeparator = StringUtils
              .repeat(separatorChar, String.valueOf(intermediateResult).length());
          String formattedFirstSeparator = TextLineFormatter
              .alignLeft(firstSeparator, maxStringWidth);
          output.append(formattedFirstSeparator).append("\n");
        }

        String line = intermediateResult + StringUtils.repeat(" ", spacesAfter);
        output.append(TextLineFormatter.alignLeft(line, maxStringWidth)).append("\n");
        multiplier = multiplier / 10;
        spacesAfter++;
      }
    }

    String secondSeparator = StringUtils.repeat(separatorChar, String.valueOf(result).length());
    String formattedSecondSeparator = TextLineFormatter.alignLeft(secondSeparator, maxStringWidth);
    output.append(formattedSecondSeparator).append("\n");

    output.append(TextLineFormatter.alignLeft(String.valueOf(result), maxStringWidth)).append("\n");

    return output.toString();
  }
}
