package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    // Empty constructor
  }

  /**
   *
   * @param someone the name of the person
   * @return greeting string
   */
  public final String greet(final String someone) {
    String myGreeting = String.format("Hello, %s!", someone);
    return myGreeting;
  }
}
