package com.yk.utils.pmdjava14.app;

import com.yk.utils.pmdjava14.app.core.SomeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// UnusedImports
// import java.util.ArrayList;

public class DemoApp {

  private static final Logger LOGGER = LoggerFactory.getLogger(DemoApp.class);

  public static void main(final String[] args) {
    // a - ShortVariable
    final int aVariable = 5;

    @SuppressWarnings("PMD.ShortVariable") // Here PMD ignores short name.
    final int b = 6;

    final int cResult = aVariable + b;
    LOGGER.info("c: {}", cResult);

    // SystemPrintln
    // System.out.println("susing system out println");

    // SomeClass someClass = new SomeClass(); - LocalVariableCouldBeFinal
    final SomeClass someClass = new SomeClass();
    LOGGER.info("someClass: {}", someClass);
  }
}
