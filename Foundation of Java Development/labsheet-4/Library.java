public class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    void issueBook() {
        int books = booksAvailable;

        if (books > 0) {
            books--;
            booksAvailable = books;
            System.out.println("Book Issued Successfully");
        } else {
            System.out.println("No Books Available");
        }

        System.out.println("Books Available: " + booksAvailable);
    }

    void returnBook() {
        int books = booksAvailable;
        books++;
        booksAvailable = books;

        System.out.println("Book Returned Successfully");
        System.out.println("Books Available: " + booksAvailable);
    }

    public static void main(String[] args) {
        Library l = new Library();

        l.booksAvailable = 5;

        System.out.println("Library: " + libraryName);

        l.issueBook();
        l.returnBook();
    }
}