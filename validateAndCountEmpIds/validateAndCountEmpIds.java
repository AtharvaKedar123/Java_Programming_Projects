import java.util.Scanner;

public class validateAndCountEmpIds {

    // Method to count valid employee IDs
    public static int validateAndCountEmpIds1(String[] empNames, String[] empIds) {
        int count = 0;

        for (int i = 0; i < empNames.length; i++) {
            // Check if the employee ID starts with the first letter of the name (case-insensitive)
            if (!empIds[i].isEmpty() && 
                Character.toLowerCase(empIds[i].charAt(0)) == Character.toLowerCase(empNames[i].charAt(0))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] empNames = new String[n];
        String[] empIds = new String[n];

        System.out.println("Enter employee names:");
        for (int i = 0; i < n; i++) {
            empNames[i] = sc.nextLine();
        }

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empIds[i] = sc.nextLine();
        }

        int result = validateAndCountEmpIds1(empNames, empIds);
        System.out.println("Valid employee IDs count: " + result);

        sc.close();
    }
}
