package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book> {
    int bookId;
    String title;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public int compareTo(Book other) {
        return Integer.compare(other.bookId, this.bookId);
    }

    public String toString() {
        return bookId + " - " + title;
    }
}

public class Q4 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
        books.add(new Book(10, "OOPS"));
        books.add(new Book(15, "Python"));
        books.add(new Book(5, "C++"));
        books.add(new Book(8, "TOC"));

        Collections.sort(books);

        for (Book b : books) {
            System.out.println(b);
        }

	}

}
