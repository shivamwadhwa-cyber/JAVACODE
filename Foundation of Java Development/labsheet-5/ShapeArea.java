public class ShapeArea {

    static class Shape {
        double calculateArea() {
            return 0;
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return 3.14 * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        double length;
        double breadth;

        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        double calculateArea() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Shape c = new Circle(7);
        Shape r = new Rectangle(10, 5);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}