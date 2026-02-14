import java.util.Scanner;

public class EmailGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter pass key: ");
        String passKey = sc.nextLine();

        String outStr;

        // Validation
        if (firstName != null && lastName != null && passKey != null &&
            firstName.length() != lastName.length() &&
            firstName.length() > 4 &&
            lastName.length() > 4) {

            String part1 = firstName.substring(0, 4).toLowerCase();
            String part2 = lastName.substring(lastName.length() - 3).toLowerCase();

            outStr = part1 + "." + part2 + passKey + "@swiftfood.com";
        } 
        else {
            outStr = "Invalid";
        }

        System.out.println(outStr);

        sc.close();
    }
}
