package Assignment8;

import java.util.LinkedList;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class Q19 {

	public static void main(String[] args) {
		LinkedList<Book> books = new LinkedList<>();

        books.add(new Book(101, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(102, "1984", "George Orwell"));
        books.add(new Book(103, "To Kill a Mockingbird", "Harper Lee"));

        for (Book b : books) {
            System.out.println("ID: " + b.id + ", Title: " + b.title + ", Author: " + b.author);
        }

	}

}
