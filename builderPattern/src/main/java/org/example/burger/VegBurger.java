package org.example.burger;

public class VegBurger extends Bugger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25f;
    }
}
