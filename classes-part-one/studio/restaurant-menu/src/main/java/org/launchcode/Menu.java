package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {

    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
