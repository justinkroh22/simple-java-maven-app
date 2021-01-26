package com.mycompany.app;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        TimeUnit.MINUTES.sleep(2);
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
