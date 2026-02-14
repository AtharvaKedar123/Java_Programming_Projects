public class checkPalindrome {

    public static boolean checkPalindrome1(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "mada";

        if (checkPalindrome1(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
