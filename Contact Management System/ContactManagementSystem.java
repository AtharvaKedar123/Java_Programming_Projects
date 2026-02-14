import java.util.Scanner;

class Contact {
    int id;
    String name;
    String phone;
    String email;

    Contact(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void displayContact() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }
}

public class ContactManagementSystem {

    static Contact[] contacts = new Contact[100];
    static int count = 0;

    public static Contact findContactById(int id) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].id == id) {
                return contacts[i];
            }
        }
        return null;
    }

    public static void addContact(Scanner sc) {
        if (count >= 100) {
            System.out.println("Contact list is full!");
            return;
        }

        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts[count] = new Contact(id, name, phone, email);
        count++;

        System.out.println("Contact Added Successfully!");
    }

    public static void viewAllContacts() {
        if (count == 0) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("\n------ Contact List ------");
        for (int i = 0; i < count; i++) {
            contacts[i].displayContact();
        }
    }

    public static void searchContact(Scanner sc) {
        System.out.print("Enter Contact ID to Search: ");
        int id = sc.nextInt();

        Contact contact = findContactById(id);

        if (contact != null) {
            contact.displayContact();
        } else {
            System.out.println("Contact Not Found!");
        }
    }

    public static void deleteContact(Scanner sc) {
        System.out.print("Enter Contact ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (contacts[i].id == id) {

                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }

                contacts[count - 1] = null;
                count--;

                System.out.println("Contact Deleted Successfully!");
                return;
            }
        }

        System.out.println("Contact Not Found!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addContact(sc);
                    break;

                case 2:
                    viewAllContacts();
                    break;

                case 3:
                    searchContact(sc);
                    break;

                case 4:
                    deleteContact(sc);
                    break;

                case 5:
                    System.out.println("Exiting Contact Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
