package pl.dabek.jakub.tpl1;

public final class HelloGreeting implements Greeting {

    public static final String GREETING = "Hello ";

    public String sayGreeting(final String name) {
        return GREETING + (name != null ? name : DEFAULT_NAME) + "!";
    }

}
