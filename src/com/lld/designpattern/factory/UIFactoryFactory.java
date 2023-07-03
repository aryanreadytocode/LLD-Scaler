package com.lld.designpattern.factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform) {
       if (supportedPlatform == SupportedPlatform.ANDROID)
           return new AndroidUIFactory();
       else if (supportedPlatform == SupportedPlatform.IOS)
           return new IosUIFactory();
       return null;
    }
}
