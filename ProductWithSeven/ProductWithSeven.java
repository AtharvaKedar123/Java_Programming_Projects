/*Problem Statement

Implement a program to display the sum of 
two given numbers if the numbers are same. 
If the numbers are not same, display the double of the sum. */

import java.util.Scanner;

public class ProductWithSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three positive integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result;

        if (a == 7) {
            result = b * c;
        } 
        else if (b == 7) {
            result = c;
        } 
        else if (c == 7) {
            result = -1;
        } 
        else {
            result = a * b * c;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
