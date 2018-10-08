package pl.dabek.jakub.tpl1;

import org.junit.Assert;
import org.junit.Test;

public final class HelloGreetingTest {

    @Test
    public void testNullNameShouldPrintDefaultName() {
        Greeting objectUnderTest = new HelloGreeting();
        String expectedString = HelloGreeting.GREETING + Greeting.DEFAULT_NAME + "!";
        Assert.assertEquals(expectedString, objectUnderTest.sayGreeting(null));
    }

    @Test
    public void testShouldPrintCorrectGreeting() {
        Greeting objectUnderTest = new HelloGreeting();
        String expectedString = HelloGreeting.GREETING + "Bob!";
        Assert.assertEquals(expectedString, objectUnderTest.sayGreeting("Bob"));
    }

}