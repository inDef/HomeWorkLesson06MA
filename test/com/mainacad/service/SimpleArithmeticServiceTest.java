package com.mainacad.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SimpleArithmeticServiceTest {

  @Test
  void testMultiplyViaColumn() {
    assertTrue(SimpleArithmeticService.multiplyViaColumn(1234, 123).matches(
        "(\\s*.*\\d+\\n){2}"
            + "(\\s*_+\\n){1}"
            + "(\\s*.{1}\\d+\\s*\\n){3}"
            + "(\\s*_+\\n){1}"
            + "(\\d+\\n){1}"));

    assertTrue(
        SimpleArithmeticService.multiplyViaColumn(0, 123).matches(
            ".+0\\n"
                + "123\\n"
                + "\\s+_\\n"
                + "\\s+0\\n"));
  }

}