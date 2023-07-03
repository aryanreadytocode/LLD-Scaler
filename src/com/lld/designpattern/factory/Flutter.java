package com.lld.designpattern.factory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme() {
        System.out.println("Setting a theme for the app");
    }

    public void setRefreshRate() {
        System.out.println("Setting a refresh rate for the app");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.createUIFactory(this.supportedPlatform);
    }
}
