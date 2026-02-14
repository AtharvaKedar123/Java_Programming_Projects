public class moveSpecialCharacters{

    public static String moveSpecialCharacters1(String str) {

        String normal = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch))
                normal += ch;        // keep letters & digits in front
            else
                special += ch;       // move special characters to end
        }

        return normal + special;
    }

    public static void main(String[] args) {

        String input = "He@12llo!";
        System.out.println(moveSpecialCharacters1(input));
    }
}
