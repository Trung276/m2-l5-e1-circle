package circle;

public class Circle {
    private static final double pi = 3.14;
    private double radius = 1.0;
    private String color = "red";
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return  pi * radius * radius;
    }
}
