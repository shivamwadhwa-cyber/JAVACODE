public class Temperature {
    double celsius;
    double fahrenheit;
    static String unit = "Celsius";

    void display() {
        double tempCelsius = celsius;
        double tempFahrenheit = fahrenheit;

        System.out.println("Temperature in Celsius: " + tempCelsius);
        System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);
        System.out.println("Unit: " + unit);
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.celsius = 25.0;
        t.fahrenheit = (t.celsius * 9/5) + 32; // Convert Celsius to Fahrenheit
        t.display();
    }
}
