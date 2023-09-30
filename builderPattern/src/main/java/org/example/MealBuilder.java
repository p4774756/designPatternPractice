package org.example;

import org.example.burger.ChickenBurger;
import org.example.burger.VegBurger;
import org.example.drink.Coke;
import org.example.drink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return  meal;
    }
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return  meal;
    }
}
