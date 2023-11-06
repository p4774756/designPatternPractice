package org.example.color;

import org.example.AbstractFactory;
import org.example.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        Color color1;
        switch (color) {
            case "Red" :
                color1 = new Red();
                break;
            case "Green" :
                color1 = new Green();
                break;
            case "Blue" :
                color1 = new Blue();
                break;
            default :
                color1 = null;
        }

        return color1;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
