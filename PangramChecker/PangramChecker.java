import java.util.Scanner;

public class PangramChecker {

    public static String checkPangram(String inStr) {
        boolean[] alphabet = new boolean[26]; // Track presence of each letter
        inStr = inStr.toLowerCase(); // ensure lowercase

        // Mark letters present in the string
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Build outStr
        StringBuilder outStr = new StringBuilder();
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                outStr.append((char) ('a' + i));
                isPangram = false;
            }
        }

        // If pangram, return input string
        if (isPangram) {
            return inStr;
        } else {
            return outStr.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inStr = sc.nextLine();

        String outStr = checkPangram(inStr);
        System.out.println("Output: " + outStr);

        sc.close();
    }
}
