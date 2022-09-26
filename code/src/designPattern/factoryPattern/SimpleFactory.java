package designPattern.factoryPattern;

interface Shape {
    public void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draws a circle!");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draws a triangle!");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draws a rectangle!");
    }
}

public class SimpleFactory {
    public Shape getShape(String type) {
        Shape shape = null;
        if(type.equalsIgnoreCase("circle")) {
            shape = new Circle();
        } else if(type.equalsIgnoreCase("triangle")) {
            shape = new Triangle();
        } else if(type.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle();
        } else {
            System.out.println("shape is not supported!");
        }

        return shape;
    }
}
