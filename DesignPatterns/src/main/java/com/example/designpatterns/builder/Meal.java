package main.java.com.example.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    /**
     * A description of the entire Java function.
     *
     * @param item	description of parameter
     * @return description of return value
     */

    public void addItem(Item item) {
        items.add(item);
    }


    /**
     * Calculates the total cost of all items in the meal.
     *
     * @return the total cost of the meal as a float value
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * Prints the details of each item in the meal to the console.
     *
     * This method iterates over the list of items in the meal and prints the
     * name, packing, and price of each item. The output is formatted to display
     * the item name, packing, and price on separate lines.
     *
     * @return void
     */

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
