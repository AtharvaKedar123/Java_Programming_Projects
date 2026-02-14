import java.util.Scanner;

public class LCMProgram {

    // Method to find GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("LCM is 0");
        } else {
            int gcd = findGCD(num1, num2);
            int lcm = (num1 * num2) / gcd;
            System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
        }

        sc.close();
    }
}
