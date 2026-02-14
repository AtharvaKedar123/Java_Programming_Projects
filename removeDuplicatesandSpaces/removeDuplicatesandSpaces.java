import java.util.Scanner;

public class removeDuplicatesandSpaces {

    public static String removeDuplicatesandSpaces1(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip spaces and duplicates
            if (ch != ' ' && result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String output = removeDuplicatesandSpaces1(input);
        System.out.println("Modified string: " + output);

        sc.close();
    }
}
