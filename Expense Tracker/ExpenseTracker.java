import java.util.Scanner;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    void displayExpense() {
        System.out.println("Category: " + category + " | Amount: ₹" + amount);
    }
}

public class ExpenseTracker {

    static Expense[] expenses = new Expense[100];
    static int count = 0;

    public static void addExpense(Scanner sc) {
        if (count >= 100) {
            System.out.println("Expense limit reached!");
            return;
        }

        System.out.print("Enter Category (Food, Travel, Bills, etc.): ");
        String category = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        expenses[count] = new Expense(category, amount);
        count++;

        System.out.println("Expense Added Successfully!");
    }

    public static void viewAllExpenses() {
        if (count == 0) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("\n------ All Expenses ------");
        for (int i = 0; i < count; i++) {
            expenses[i].displayExpense();
        }
    }

    public static void viewTotalExpense() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += expenses[i].amount;
        }

        System.out.println("Total Expense: ₹" + total);
    }

    public static void viewCategoryTotal(Scanner sc) {
        System.out.print("Enter Category to Calculate Total: ");
        String category = sc.nextLine();

        double total = 0;

        for (int i = 0; i < count; i++) {
            if (expenses[i].category.equalsIgnoreCase(category)) {
                total += expenses[i].amount;
            }
        }

        System.out.println("Total Expense for " + category + ": ₹" + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total Expense");
            System.out.println("4. View Category-wise Total");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    addExpense(sc);
                    break;

                case 2:
                    viewAllExpenses();
                    break;

                case 3:
                    viewTotalExpense();
                    break;

                case 4:
                    viewCategoryTotal(sc);
                    break;

                case 5:
                    System.out.println("Exiting Expense Tracker...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
