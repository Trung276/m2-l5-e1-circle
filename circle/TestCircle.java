package circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
        System.out.println("Enter the new radius: ");
        double radius = sc.nextDouble();
        Circle circle1 = new Circle(radius);
        System.out.println("New radius = " + circle1.getRadius());
        System.out.println("New area = " + circle1.getArea());
    }
}
