import java.util.Scanner;

public class FractionAdder {

    // Method to calculate GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to add fractions and return simplified fraction
    public static String addFractions(int numero1, int denomi1, int numero2, int denomi2) {
        // Add fractions using formula
        int numerator = numero1 * denomi2 + numero2 * denomi1;
        int denominator = denomi1 * denomi2;

        // Simplify fraction
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator1: ");
        int numero1 = sc.nextInt();

        System.out.print("Enter denominator1: ");
        int denomi1 = sc.nextInt();

        System.out.print("Enter numerator2: ");
        int numero2 = sc.nextInt();

        System.out.print("Enter denominator2: ");
        int denomi2 = sc.nextInt();

        String result = addFractions(numero1, denomi1, numero2, denomi2);

        System.out.println("Simplified sum of fractions: " + result);

        sc.close();
    }
}
