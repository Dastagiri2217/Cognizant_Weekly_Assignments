import java.util.Arrays;
import java.util.Comparator;
public class LibrarySystem {
    public static void main(String[] args) {
        Book[] library = {
            new Book(1, "Java Basics", "James Gosling"),
            new Book(2, "Data Structures", "Alan Turing"),
            new Book(3, "Algorithms", "Charles Babbage"),
            new Book(4, "Operating Systems", "Donald trumph")
        };

        String titleToSearch = "Algorithms";

        // Linear Search
        System.out.println("Searching using Linear Search...");
        Book foundLinear = Search.linearSearch(library, titleToSearch);
        System.out.println(foundLinear != null ? foundLinear : "Book not found");

        // Sort books for Binary Search
        Arrays.sort(library, Comparator.comparing(Book::getTitle));

        // Binary Search
        System.out.println("\nSearching using Binary Search...");
        Book foundBinary = Search.binarySearch(library, titleToSearch);
        System.out.println(foundBinary != null ? foundBinary : "Book not found");
    }
}

