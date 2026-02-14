import java.util.Scanner;

public class SeedNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of X: ");
        int X = sc.nextInt();

        System.out.print("Enter value of Y: ");
        int Y = sc.nextInt();

        int originalX = X;
        int digitProduct = 1;

        // Calculate product of digits
        while (X > 0) {
            int digit = X % 10;
            digitProduct *= digit;
            X /= 10;
        }

        int result = originalX * digitProduct;

        if (result == Y) {
            System.out.println(originalX + " is a seed of " + Y);
        } else {
            System.out.println(originalX + " is not a seed of " + Y);
        }

        sc.close();
    }
}
