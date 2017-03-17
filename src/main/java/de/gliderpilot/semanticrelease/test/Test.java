package de.gliderpilot.semanticrelease.test;

public class Test {

    public static void main(String[] args) {
        System.out.println(greet("Hello", "World"));
    }

    /**
     * @deprecated Use greet("Hello", "World") instead.
     */
    @Deprecated
    public static String helloWorld() {
        return hello("World");
    }

    /**
     * @deprecated Use greet("Hello", who) instead.
     */
    @Deprecated
    public static String hello(String who) {
        return greet("Hello", who);
    }

    public static String greet(String greeting, String who) {
        return greeting + " " + who;
    }

}
