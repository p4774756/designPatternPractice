package org.example;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Meal vegMeal = new MealBuilder().prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVegMeal = new MealBuilder().prepareNonVegMeal();
        System.out.println("Non veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
