package com.mainacad;

import com.mainacad.service.SimpleArithmeticService;
import java.util.logging.Logger;

public class AppRunner {

  private static Logger logger = Logger.getLogger(AppRunner.class.getName());

  public static void main(String[] args) {
    logger.info("\n" + SimpleArithmeticService.multiplyViaColumn(12347, 123123));
  }

}
