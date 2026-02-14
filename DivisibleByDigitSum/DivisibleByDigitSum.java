/*check if the numebr is divisible by sum of its digits */

import java.util.Scanner;

public class DivisibleByDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Find sum of digits
        while (number > 0) {
            sum += number % 10;   // Extract last digit
            number /= 10;         // Remove last digit
        }

        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + 
                " is divisible by sum of its digits");
        } else {
            System.out.println(originalNumber + 
                " is not divisible by sum of its digits");
        }

        sc.close();
    }
}
