package com.lld.designpattern.singleton;

/*cons with this design is it increase the waiting time for multithreaded environment*/
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }
}
