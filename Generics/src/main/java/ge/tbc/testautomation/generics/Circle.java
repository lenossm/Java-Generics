package ge.tbc.testautomation.generics;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
