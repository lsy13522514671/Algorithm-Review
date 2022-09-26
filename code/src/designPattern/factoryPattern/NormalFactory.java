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

public interface NormalFactory {
    public Shape getShape();
}

class CircleFactory implements NormalFactory {

    @Override
    public Shape getShape() {
        return new Circle();
    }
}

class TriangleFactory implements NormalFactory {

    @Override
    public Shape getShape() {
        return new Triangle();
    }
}

class RectangleFactory implements NormalFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
