import java.util.Scanner;

public class ConsecutiveCounter {

    public static String encodeConsecutive(String inStr) {
        if (inStr == null || inStr.isEmpty()) {
            return "";
        }

        String outStr = "";
        int n = inStr.length();
        int i = 0;

        while (i < n) {
            char currentChar = inStr.charAt(i);
            int count = 0;

            // Count every occurrence of the current character
            while (i < n && inStr.charAt(i) == currentChar) {
                count++;
                i++;
            }

            // Always add the character AND the count
            outStr = outStr + currentChar + count;
        }

        return outStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        if (sc.hasNextLine()) {
            String inStr = sc.nextLine();
            System.out.println("Encoded: " + encodeConsecutive(inStr));
        }

        sc.close();
    }
}