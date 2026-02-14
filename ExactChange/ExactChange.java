import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of $5 notes: ");
        int x = sc.nextInt();

        System.out.print("Enter number of $1 notes: ");
        int y = sc.nextInt();

        System.out.print("Enter amount to be paid: ");
        int z = sc.nextInt();

        int fiveNotesUsed = Math.min(x, z / 5);
        int remainingAmount = z - (fiveNotesUsed * 5);

        if (remainingAmount <= y) {
            int oneNotesUsed = remainingAmount;
            System.out.println("$5 notes used: " + fiveNotesUsed);
            System.out.println("$1 notes used: " + oneNotesUsed);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
