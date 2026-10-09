public class Rectangle {
    int length;
    int breadth;

    void area() {
        length = 5;
        breadth = 10;
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}