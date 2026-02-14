/*Problem Statement

Implement a program to display the sum of two given numbers if the numbers are 
same. If the numbers are not same, display the double of the sum. */

import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        if (num1 == num2) {
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Double of Sum: " + (2 * sum));
        }

        sc.close();
    }
}
