package org.example;

import java.util.ArrayList;

public class Meal {
    private final ArrayList<Item> itemArrayList = new ArrayList<>();

    public void addItem(Item item) {
        itemArrayList.add(item);
    }

    public float getCost() {
        float totalCost = 0.0f;
        for (Item item: itemArrayList) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems() {
        for (Item item: itemArrayList) {
            System.out.println("Name: " + item.name());
            System.out.println("Price: " + item.price());
            System.out.println("Pack: " + item.pack());
        }
    }
}
