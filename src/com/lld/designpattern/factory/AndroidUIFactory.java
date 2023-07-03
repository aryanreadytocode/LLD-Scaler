package com.lld.designpattern.factory;

import com.lld.designpattern.factory.components.button.AndroidButton;
import com.lld.designpattern.factory.components.button.Button;
import com.lld.designpattern.factory.components.dropdown.AndroidDropdown;
import com.lld.designpattern.factory.components.dropdown.Dropdown;
import com.lld.designpattern.factory.components.menu.AndroidMenu;
import com.lld.designpattern.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
