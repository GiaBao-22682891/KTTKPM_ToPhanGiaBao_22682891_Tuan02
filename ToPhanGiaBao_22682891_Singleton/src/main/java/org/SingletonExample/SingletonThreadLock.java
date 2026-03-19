package org.SingletonExample;

public class SingletonThreadLock {
    private static volatile SingletonThreadLock instance;

    private SingletonThreadLock() {

    }

    public static SingletonThreadLock getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadLock.class) {
                if (instance == null) {
                    instance = new SingletonThreadLock();
                }
            }
        }
        return instance;
    }
}
