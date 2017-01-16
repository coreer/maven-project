package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   *
   * @param someone the name of the person who we are going to greet
   * @return greeting message for the person
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
