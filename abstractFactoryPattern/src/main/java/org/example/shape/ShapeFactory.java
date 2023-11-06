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

        Shape shape;

        switch (type) {
            case "Circle" :
                shape =  new Circle();
                break;
            case "Rectangle" :
                shape = new Rectangle();
                break;
            case "Square" :
                shape =  new Square();
                break;
            default :
                shape = null;
        }

        return shape;
    }
}
