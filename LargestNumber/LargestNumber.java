import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class LargestNumber {

    public static String formLargestNumber(String[] inArr) {
        // Sort array using custom comparator to form largest number
        Arrays.sort(inArr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated strings in reverse order
                return (b + a).compareTo(a + b);
            }
        });

        // Concatenate sorted array elements
        StringBuilder sb = new StringBuilder();
        for (String num : inArr) {
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] inArr = new String[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            inArr[i] = sc.nextLine(); // store as string for easy concatenation
        }

        String largestNumber = formLargestNumber(inArr);
        System.out.println("Largest number formed: " + largestNumber);

        sc.close();
    }
}
