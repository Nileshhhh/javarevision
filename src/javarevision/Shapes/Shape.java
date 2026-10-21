package javarevision.Shapes;

public abstract class Shape {

    abstract public double area();

    public void printArea()
    {
        System.out.println("Area is " + area());
    }
}
