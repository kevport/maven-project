package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";
    String greetResult = greeter.greet(someone);
    assertThat(greetResult, containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";
    String greeterResult = greeter.greet(someone);
    assertThat(greeterResult.length(), is(greaterThan(someone.length())));
  }

}
