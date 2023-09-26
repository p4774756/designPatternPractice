package org.example.color;

import org.example.AbstractFactory;
import org.example.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        return switch (color) {
            case "Red" -> new Red();
            case "Green" -> new Green();
            case "Blue" -> new Blue();
            default -> null;
        };
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
