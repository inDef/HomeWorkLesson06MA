package com.mainacad.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TextLineFormatterTest {

  @Test
  void testAlignLeft() {
    assertEquals(10, TextLineFormatter.alignLeft("", 10).length());
    assertEquals("     10689", TextLineFormatter.alignLeft("10689", 10));
    assertEquals(" ", TextLineFormatter.alignLeft("123", 1));
  }
}