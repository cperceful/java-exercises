package org.launchcode.java.restaurant;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Menu class for studios
 */
public class Menu {

    //This should be a list of items. ArrayList.

    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        items.add(item);
    }

    public ArrayList<MenuItem> getItems(){
        return items;
    }

    private static Double roundTwo(Double input){

        return new BigDecimal(input).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

    public Double getAverageMenuPrice(){

        Integer numberOfItems = 0;
        Double sumOfPrices = 0.0;
        for (MenuItem menuItem : getItems()) {

            sumOfPrices += menuItem.getPrice();
            numberOfItems++;

        }

        return roundTwo(sumOfPrices / numberOfItems);
    }


}
