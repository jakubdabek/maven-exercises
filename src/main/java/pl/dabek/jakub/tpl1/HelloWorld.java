package pl.dabek.jakub.tpl1;

public final class HelloWorld {

    public static void main(final String[] args) {
        Greeting greeting = new HelloGreeting();
        String name = args.length > 0 ? args[0] : null;
        System.out.println(greeting.sayGreeting(name));
    }

    private HelloWorld() {
        throw new UnsupportedOperationException();
    }

}
