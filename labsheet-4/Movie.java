public class Movie {
    
String title;
    String director;
    static String genre = "Action";

    void display() {
        String movieTitle = title;
        String movieDirector = director;

        System.out.println("Title: " + movieTitle);
        System.out.println("Director: " + movieDirector);
        System.out.println("Genre: " + genre);
    }

    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "Inception";
        m.director = "Christopher Nolan";
        m.display();
    }
}
