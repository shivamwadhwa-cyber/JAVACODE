public class Pen {
    String color;
    double price;
    static String brand = "Parker";

    void display() {
        String penColor = color;
        double penPrice = price;

        System.out.println("Color: " + penColor);
        System.out.println("Price: " + penPrice);
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "Blue";
        p.price = 50;
        p.display();
    }
}