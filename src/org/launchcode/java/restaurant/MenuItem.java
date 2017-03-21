package org.launchcode.java.restaurant;

import java.time.LocalDateTime;

/**
 * Here's some words so this warning goes away.
 */
public class MenuItem {

    private Double price;
    private String description;
    private String category;
    private final LocalDateTime created = LocalDateTime.now();

    public static final String MAIN_COURSE = "Main Course";
    public static final String APPETIZER = "Appetizers";
    public static final String DESSERT = "Dessert";

    public Double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public void setPrice(Double aPrice){
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory){
        category = aCategory;
    }

    public LocalDateTime getCreated(){
        return created;
    }

    //Need a constructor for menu items
    public MenuItem(String aDescription, String aCategory, Double aPrice){
        description = aDescription;
        category = aCategory;
        price = aPrice;

    }

    @Override
    public String toString(){
        return "Item: " + description + "\nCategory: " + category + "\nPrice: " + price + "\nAdded: " + created;
    }


}
