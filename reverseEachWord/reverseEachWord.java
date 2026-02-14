public class reverseEachWord {

    public static String reverseEachWord1(String str) {

        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            result += reversed;

            if (i != words.length - 1)
                result += " ";
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "Hello World Java";
        System.out.println(reverseEachWord1(input));
    }
}
