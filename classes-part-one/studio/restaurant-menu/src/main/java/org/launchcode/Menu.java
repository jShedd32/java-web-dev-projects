package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
private ArrayList<MenuItems> menuItems = new ArrayList<>();
private LocalDate lastUpdated;


    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }
}
