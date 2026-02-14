import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;

    // Constructor
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
        System.out.println("----------------------------");
    }
}

public class LibraryManagementSystem {

    static Book[] books = new Book[100];
    static int count = 0;

    public static Book findBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id) {
                return books[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books[count] = new Book(id, title, author);
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Book ID to Issue: ");
                    id = sc.nextInt();

                    Book bookToIssue = findBook(id);

                    if (bookToIssue != null) {
                        if (!bookToIssue.isIssued) {
                            bookToIssue.isIssued = true;
                            System.out.println("Book Issued Successfully!");
                        } else {
                            System.out.println("Book is already issued!");
                        }
                    } else {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Return: ");
                    id = sc.nextInt();

                    Book bookToReturn = findBook(id);

                    if (bookToReturn != null) {
                        if (bookToReturn.isIssued) {
                            bookToReturn.isIssued = false;
                            System.out.println("Book Returned Successfully!");
                        } else {
                            System.out.println("Book was not issued!");
                        }
                    } else {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            books[i].displayBook();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
