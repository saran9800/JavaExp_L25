```java
class Library {
    int bookId;
    String bookName;
    String author;
    boolean isIssued;

    // Constructor
    Library(int id, String name, String authorName) {
        bookId = id;
        bookName = name;
        author = authorName;
        isIssued = false;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Status: " +
                (isIssued ? "Issued" : "Available"));
    }

    // Method to issue a book
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(bookName + " issued successfully.");
        } else {
            System.out.println(bookName + " is already issued.");
        }
    }

    // Method to return a book
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(bookName + " returned successfully.");
        } else {
            System.out.println(bookName + " was not issued.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects
        Library book1 = new Library(
                101, "Java Programming", "James Gosling");

        Library book2 = new Library(
                102, "Python Basics", "Guido van Rossum");

        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        System.out.println("-------------------------");

        System.out.println("\nBook 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();

        System.out.println("\nIssuing Book 1:");
        book1.issueBook();

        System.out.println("\nBook 1 Details After Issue:");
        book1.displayDetails();

        System.out.println("\nReturning Book 1:");
        book1.returnBook();

        System.out.println("\nBook 1 Details After Return:");
        book1.displayDetails();
    }
}
```
