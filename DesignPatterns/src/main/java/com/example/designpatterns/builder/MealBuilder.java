package main.java.com.example.designpatterns.builder;

public class MealBuilder {


    /**
     * A description of the entire Java function.
     *
     * @return description of return value
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * Prepares a non-vegetarian meal.
     *
     * @return the prepared non-vegetarian meal
     */

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
