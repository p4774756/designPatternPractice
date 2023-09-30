package org.example.burger;

import org.example.pack.Bottle;
import org.example.Item;
import org.example.Packing;

public abstract class Bugger implements Item {
    @Override
    public Packing pack() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
