import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static String findFirstNonRepeating(String inStr) {
        int[] count = new int[256]; // Array to count occurrences of each character

        // Count each character
        for (int i = 0; i < inStr.length(); i++) {
            count[inStr.charAt(i)]++;
        }

        // Find first character with count 1
        for (int i = 0; i < inStr.length(); i++) {
            if (count[inStr.charAt(i)] == 1) {
                return "" + inStr.charAt(i); // return as string
            }
        }

        // If no non-repeating character found
        return "$";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inStr = sc.nextLine();

        String outStr = findFirstNonRepeating(inStr);
        System.out.println("Output: " + outStr);

        sc.close();
    }
}
