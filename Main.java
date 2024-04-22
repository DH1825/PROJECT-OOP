import java.lang.Math;

// Base class Shape
abstract class Shape {

  public abstract double area();

  public abstract double perimeter();
}

// Circle class, inherits from Shape
class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }
}

// Rectangle class, inherits from Shape
class Rectangle extends Shape {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }

  @Override
  public double perimeter() {
    return 2 * (length + width);
  }
}

// Triangle class, inherits from Shape
class Triangle extends Shape {

  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  @Override
  public double area() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  @Override
  public double perimeter() {
    return side1 + side2 + side3;
  }
}

// Main class
public class Main {

  public static void main(String[] args) {
    // Create instances of different shapes
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(4, 6);
    Triangle triangle = new Triangle(3, 4, 5);

    // Calculate and display area and perimeter for each shape
    System.out.println(
      "Circle - Area: " + circle.area() + ", Perimeter: " + circle.perimeter()
    );
    System.out.println(
      "Rectangle - Area: " +
      rectangle.area() +
      ", Perimeter: " +
      rectangle.perimeter()
    );
    System.out.println(
      "Triangle - Area: " +
      triangle.area() +
      ", Perimeter: " +
      triangle.perimeter()
    );
  }
}
