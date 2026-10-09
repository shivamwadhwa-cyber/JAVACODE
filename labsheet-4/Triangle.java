public class Triangle {
    double base;
    double height;
    static String shapeType = "Triangle";

    void display() {
        double triangleBase = base;
        double triangleHeight = height;

        System.out.println("Base: " + triangleBase);
        System.out.println("Height: " + triangleHeight);
        System.out.println("Shape Type: " + shapeType);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.base = 5.0;
        t.height = 10.0;
        t.display();
    }
}
