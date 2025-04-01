package ge.tbc.testautomation.generics;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height+ '}';
    }
}
