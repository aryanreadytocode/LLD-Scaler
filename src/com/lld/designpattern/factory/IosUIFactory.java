package com.lld.designpattern.factory;

import com.lld.designpattern.factory.components.button.Button;
import com.lld.designpattern.factory.components.button.IosButton;
import com.lld.designpattern.factory.components.dropdown.Dropdown;
import com.lld.designpattern.factory.components.dropdown.IosDropdown;
import com.lld.designpattern.factory.components.menu.IosMenu;
import com.lld.designpattern.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
