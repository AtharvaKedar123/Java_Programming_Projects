import java.util.Scanner;

public class findTotalCount {

    // Method to count adjacent occurrences
    public static int findTotalCount1(int[] numbers, int target) {
        int count = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == target && numbers[i + 1] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter number to count adjacent occurrences: ");
        int target = sc.nextInt();

        int result = findTotalCount1(numbers, target);
        System.out.println("Total adjacent occurrences: " + result);

        sc.close();
    }
}
