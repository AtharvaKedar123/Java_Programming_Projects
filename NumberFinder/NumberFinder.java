/*ement the method findNumbers accepting two numbers num1 and num2 based on the conditions given below:

    Validate that num1 should be less than num2

    If the validations are successful

        populate all the 2 digit positive numbers between num1 and num2 into the provided numbers array if

            sum of the digits of the number is a multiple of 3

            number is a multiple of 5
    Return the numbers array

Test the functionalities using the main method of the Tester class. */

public class NumberFinder {

    public static int[] findNumbers(int num1, int num2) {
        // Validate input
        if (num1 >= num2) {
            System.out.println("Invalid input: num1 should be less than num2");
            return new int[6]; // Return array of 6 zeros
        }

        int[] numbers = new int[6]; // Fixed size array
        int index = 0;

        // Loop through numbers between num1 and num2 (inclusive)
        for (int i = num1; i <= num2; i++) {
            if (i < 10 || i > 99) continue; // Skip non 2-digit numbers

            int sumOfDigits = (i / 10) + (i % 10);

            if (sumOfDigits % 3 == 0 || i % 5 == 0) {
                numbers[index] = i;
                index++;
                if (index == 6) break; // Stop after filling 6 elements
            }
        }

        // Remaining elements are already 0
        return numbers;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int[] result = findNumbers(num1, num2);

        System.out.println("Numbers array:");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
