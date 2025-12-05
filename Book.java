package OOP_Seatwork1;

public class Book {
	String title;
	String author;
	int year;
	int pages;

	void bookDetails() {
		System.out.println("Here are some details of the book I'm currently reading...");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Year Released: " + year);
		System.out.println("Pages: " + pages);
	}
}
