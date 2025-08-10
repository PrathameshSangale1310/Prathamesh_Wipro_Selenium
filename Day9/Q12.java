package Assignment9;

import java.util.*;

class Book1 implements Comparable<Book1> {
    int bookId;
    String title;
    String author;

    Book1(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int compareTo(Book1 other) {
        return Integer.compare(this.bookId, other.bookId);
    }

    public String toString() {
        return bookId + " - " + title + " by " + author;
    }
}

public class Q12 {
    public static void main(String[] args) {
        List<Book1> books = new ArrayList<>();
        books.add(new Book1(103, "Java", "Prathamesh"));
        books.add(new Book1(101, "OOPS", "Sagar"));
        books.add(new Book1(104, "TOC", "Krishna"));

        System.out.println("Original List:");
        books.forEach(System.out::println);

        Collections.sort(books);
        System.out.println("\nSorted by Book ID (Using Comparable):");
        books.forEach(System.out::println);

        Collections.sort(books, new Comparator<Book1>() {
            public int compare(Book1 b1, Book1 b2) {
                int titleComp = b1.title.compareTo(b2.title);
                if (titleComp != 0) {
                    return titleComp;
                }
                return b1.author.compareTo(b2.author);
            }
        });

        System.out.println("\nSorted by Title, then Author (Using Comparator):");
        books.forEach(System.out::println);
    }
}
