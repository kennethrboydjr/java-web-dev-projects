package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    default void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    default void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    default void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    default void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
