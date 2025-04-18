package week2.day1;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println(bookTitle + " " + "Book added successfully");
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library bookOptions = new Library();
		bookOptions.addBook("New");
		bookOptions.issueBook();

	}

}
