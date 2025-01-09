// class shape method area()
abstract class Shape {
    abstract double area();
}

// sub class  Square
class Square extends Shape {
    private double side;

    Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Variable values not found");
        }
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

// Sub class  Cylinder
class Cylinder extends Shape {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Variable values not found");
        }
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// final varaible  
class Constants {
    public static final double PI = 3.14159;

    public void printPi() {
        System.out.println("PI value is: " + PI);
    }
}

// Static level
class Utility {
    public static void printMessage(String message) {
        System.out.println(message);
    }
}

//  compile time polymorphism 
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Square square = new Square(5);
        Cylinder cylinder = new Cylinder(7, 10);

        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Cylinder: " + cylinder.area());

        Constants constants = new Constants();
        constants.printPi();

        Utility.printMessage("This is a static method!");

        System.out.println("Sum of two numbers: " + Calculator.add(10, 20));
        System.out.println("Sum of three numbers: " + Calculator.add(10, 20, 30));
    }
}
