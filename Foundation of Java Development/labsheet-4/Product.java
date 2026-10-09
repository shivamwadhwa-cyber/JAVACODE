public class Product {
    String name;
    double price;
    static String category = "Electronics";

    void display() {
        String productName = name;
        double productPrice = price;

        System.out.println("Name: " + productName);
        System.out.println("Price: " + productPrice);
        System.out.println("Category: " + category);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.name = "Smartphone";
        p.price = 15000;
        p.display();
    }
}
