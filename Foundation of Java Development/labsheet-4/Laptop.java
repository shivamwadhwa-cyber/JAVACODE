public class Laptop {
    String brand;
    double price;
    static String operatingSystem = "Windows";

    void display() {
        String laptopBrand = brand;
        double laptopPrice = price;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("Price: " + laptopPrice);
        System.out.println("Operating System: " + operatingSystem);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand = "Dell";
        l.price = 80000;
        l.display();
    }
}
