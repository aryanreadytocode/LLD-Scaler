package com.lld.designpattern.factory;

import com.lld.designpattern.factory.components.button.Button;
import com.lld.designpattern.factory.components.dropdown.Dropdown;
import com.lld.designpattern.factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Dropdown createDropdown();
    Button createButton();
}
