public class Palindrome {
    String word;
    static String type = "Palindrome";

    void display() {
        String palindromeWord = word;

        System.out.println("Word: " + palindromeWord);
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.word = "radar";
        p.display();
    }
}
