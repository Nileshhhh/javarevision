package javarevision.Shapes;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return  length * width;

    }
}
