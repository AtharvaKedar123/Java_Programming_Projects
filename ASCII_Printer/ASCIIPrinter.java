import java.util.Scanner;

public class ASCIIPrinter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting uppercase character: ");
        char start = sc.next().charAt(0);

        System.out.print("Enter ending uppercase character: ");
        char end = sc.next().charAt(0);

        // Validation
        if (start < 'A' || start > 'Z' || 
            end < 'A' || end > 'Z' || 
            start > end) {
            System.out.println("Invalid input");
        } 
        else {
            for (char ch = start; ch <= end; ch++) {
                System.out.println(ch + " : " + (int) ch);
            }
        }

        sc.close();
    }
}
