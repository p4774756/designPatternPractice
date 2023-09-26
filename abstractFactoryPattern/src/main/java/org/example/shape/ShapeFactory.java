package org.example.shape;

import org.example.AbstractFactory;
import org.example.color.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }

        return switch (type) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
