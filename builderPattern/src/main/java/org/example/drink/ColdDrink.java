package org.example.drink;

import org.example.pack.Bottle;
import org.example.Item;
import org.example.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing pack() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
