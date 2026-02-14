import java.util.Scanner;

public class EmployeeSearch {

    // Method to search employee
    public static int search(String[] employees, String empName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(empName)) { // Case-sensitive comparison
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] employees = new String[n];
        System.out.println("Enter employee names:");
        for (int i = 0; i < n; i++) {
            employees[i] = sc.nextLine();
        }

        System.out.print("Enter employee name to search: ");
        String empName = sc.nextLine();

        int index = search(employees, empName);
        System.out.println("Employee index: " + index);

        sc.close();
    }
}
