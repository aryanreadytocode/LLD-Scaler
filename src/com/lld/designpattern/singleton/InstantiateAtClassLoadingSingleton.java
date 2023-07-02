package com.lld.designpattern.singleton;

/*Object creation is heavy work,
* if it might not needed, still creating object at class loading time*/
public class InstantiateAtClassLoadingSingleton {

    private static InstantiateAtClassLoadingSingleton instance = new InstantiateAtClassLoadingSingleton();

    private InstantiateAtClassLoadingSingleton() {

    }

    public static InstantiateAtClassLoadingSingleton getInstance() {
        return instance;
    }
}
