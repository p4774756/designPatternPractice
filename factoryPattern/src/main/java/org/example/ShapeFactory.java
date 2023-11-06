package org.example;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        Shape shape;
        switch (shapeType) {
            case "Circle" :
                shape = new Circle();
                break;
            case "Rectangle" :
                shape = new Rectangle();
                break;
            case "Square" :
                shape = new Square();
                break;
            default :
                shape = null;
        }

        return shape;
    }
}
