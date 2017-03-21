package org.launchcode.java.restaurant;

/**
 * Class for working with Menu and MenuItems.
 */
public class Restaurant {

    public static void main(String[] args){

        Menu menu = loadMenu();
        printMenu(menu);
    }

    private static void printMenu(Menu menu){
        for (MenuItem item : menu.getItems()) {

            System.out.println("\n----Menu Item----");
            System.out.println(item);
        }
        System.out.println("\nAverage Price: " + menu.getAverageMenuPrice());
    }

    private static Menu loadMenu(){

        Menu menu = new Menu();

        MenuItem burrito = new MenuItem("Burrito", MenuItem.MAIN_COURSE, 12.99);
        MenuItem sliceOfCheese = new MenuItem("Slice Of Cheese", MenuItem.APPETIZER, .99);
        MenuItem bucketOfIceCream = new MenuItem("Bucket of Ice Cream", MenuItem.DESSERT, 14.99);

        menu.addItem(burrito);
        menu.addItem(sliceOfCheese);
        menu.addItem(bucketOfIceCream);

        return menu;
    }
}
