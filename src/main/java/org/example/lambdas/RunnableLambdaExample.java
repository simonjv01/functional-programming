package org.example.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
    }
}
