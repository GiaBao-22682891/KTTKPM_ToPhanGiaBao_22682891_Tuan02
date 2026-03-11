package org.example;

public class Main {
    public static void main(String[] args) {
        //Lazy Init Singleton
//        Singleton logger1 = Singleton.getInstance();
//        logger1.log("First message");
//
//        Singleton logger2 = Singleton.getInstance();
//        logger2.log("Second message");
//
//        System.out.println(logger1 == logger2);

        //Lazy thread-safe singleton
        Runnable task = () -> {
            SingletonThreadLock instance = SingletonThreadLock.getInstance();
            System.out.println(Thread.currentThread().getName() + " got instance: " + instance);
        };

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}