package org.example;

import java.util.Hashtable;

public class ShapeCache {
    public static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeHashtable.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeHashtable.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeHashtable.put(square.getId(), square);
    }
}
