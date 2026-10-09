public class ElectricBill {
    int units;
    static double fixedCharge = 100;

    void calculateBill() {
        double bill;

        if (units <= 100)
            bill = units * 2;
        else if (units <= 200)
            bill = units * 3;
        else
            bill = units * 5;

        double totalBill = bill + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();
        e.units = 250;
        e.calculateBill();
    }
}