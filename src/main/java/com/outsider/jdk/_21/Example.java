package com.outsider.jdk._21;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        // virtual thread
        Thread thread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello, virtual thread!");
        });
        thread.join();
    }
}

