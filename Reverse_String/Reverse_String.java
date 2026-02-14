package Reverse_String;

public class Reverse_String {
    public static void main(String[] args) {
        String name = "Atharva";
        String reverse = "";

        for (int i = 0; i <= name.length() - 1; i++) {
            reverse = name.charAt(i) + reverse;
        }

        System.out.println(reverse);
    }
}
