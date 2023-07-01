package com.lld.singleton;

import java.util.Date;

public class Client extends Thread{

    @Override
    public void run() {
//        Singleton singleton0 = Singleton.getInstance();
//        System.out.println(singleton0);

//        InstantiateAtClassLoadingSingleton singleton1 = InstantiateAtClassLoadingSingleton.getInstance();
//        System.out.println(singleton1);

        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        System.out.println(singleton2);

//        DoubleLockCheckingSingleton singleton3 = DoubleLockCheckingSingleton.getInstance();
//        System.out.println(singleton3);
     }

    public static void main(String[] args) {
        /*Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1+" "+s2+" "+s3);*/

        // for multithreaded environment

        for (int i = 0; i<10; i++) {
            new Client().start();
        }

    }
}
