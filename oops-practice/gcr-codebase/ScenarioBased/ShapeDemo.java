abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private final double radius; // immutable

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    double area() {
        double s = perimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(7),
            new Rectangle(10, 5),
            new Triangle(3, 4, 5)
        };

        System.out.println("===== Shape Report =====");

        for (Shape shape : shapes) {
            System.out.println("\nShape: " +
                    shape.getClass().getSimpleName());
            System.out.printf("Area      : %.2f%n", shape.area());
            System.out.printf("Perimeter : %.2f%n", shape.perimeter());
        }
    }
}