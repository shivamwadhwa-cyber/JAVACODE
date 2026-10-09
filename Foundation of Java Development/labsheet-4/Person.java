public class Person {
    String name;
    int age;
    static String species = "Homo sapiens";

    void display() {
        String personName = name;
        int personAge = age;

        System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);
        System.out.println("Species: " + species);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John Doe";
        p.age = 30;
        p.display();
    }
}
