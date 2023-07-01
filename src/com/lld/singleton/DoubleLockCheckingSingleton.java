package com.lld.singleton;
/*for multithreaded environment waiting time for thread has decreased*/
public class DoubleLockCheckingSingleton {

    private static DoubleLockCheckingSingleton instacne = null;

    private DoubleLockCheckingSingleton() {

    }

    public static DoubleLockCheckingSingleton getInstance() {
        if (instacne == null) {
            synchronized (DoubleLockCheckingSingleton.class) {
                if (instacne == null)
                    instacne = new DoubleLockCheckingSingleton();
            }
        }
        return instacne;
    }
}
