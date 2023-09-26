package org.example;

import org.example.color.ColorFactory;
import org.example.shape.ShapeFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String type) {
        if (type == null) {
            return null;
        }
        if (type.equals("Color")) {
            return new ColorFactory();
        } else if (type.equals("Shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
