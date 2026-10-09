import java.util.Scanner; 
 
public class Cylinder { 
    static String unit = "cm"; 
    
    double radius; 
    double height; 
 
    Cylinder() { 
        radius = 1; 
        height = 1; 
    } 
 
    Cylinder(double r, double h) { 
        radius = r; 
        height = h; 
    } 
 
    double calculateVolume() { 
        return Math.PI * Math.pow(radius, 2) * height; 
    } 
 
    void display() { 
        System.out.println("Radius = " + radius + " " + unit); 
        System.out.println("Height = " + height + " " + unit); 
        System.out.println("Volume = " + calculateVolume()); 
    } 
 
    public static void main(String[] args) { 
 
        Cylinder c1 = new Cylinder(); 
        System.out.println("Default Constructor:"); 
        c1.display(); 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter radius: "); 
        double r = sc.nextDouble(); 
 
        System.out.print("Enter height: "); 
        double h = sc.nextDouble(); 
 
        Cylinder c2 = new Cylinder(r, h); 
        System.out.println("Parameterized Constructor:"); 
        c2.display(); 
 
        sc.close(); 
    } 
}