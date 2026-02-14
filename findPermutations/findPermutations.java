public class findPermutations {

    public static String[] findPermutations1(String str) {

        String[] result = new String[6];
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);

        result[0] = "" + a + b + c;
        result[1] = "" + a + c + b;
        result[2] = "" + b + a + c;
        result[3] = "" + b + c + a;
        result[4] = "" + c + a + b;
        result[5] = "" + c + b + a;

        return result;
    }

    public static void main(String[] args) {

        String input = "abc";
        String[] perms = findPermutations1(input);

        for (String s : perms)
            System.out.println(s);
    }
}
