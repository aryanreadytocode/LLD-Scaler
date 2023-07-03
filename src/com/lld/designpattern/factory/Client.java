package com.lld.designpattern.factory;

import com.lld.designpattern.factory.components.button.Button;
import com.lld.designpattern.factory.components.dropdown.Dropdown;
import com.lld.designpattern.factory.components.menu.Menu;

public class Client {
    public static void main(String... args) {
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Button button = uiFactory.createButton();
        Dropdown dropdown = uiFactory.createDropdown();
    }
}
