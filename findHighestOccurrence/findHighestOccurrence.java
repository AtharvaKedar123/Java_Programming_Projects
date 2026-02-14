import java.util.HashMap;
import java.util.Map;

public class findHighestOccurrence {

    public static void findAndPrintHighest(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty.");
            return;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // 1. Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // 2. Find the max count AND the character associated with it
        int maxCount = 0;
        char maxChar = ' ';

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Character '" + maxChar + "' repeats the most: " + maxCount + " times.");
    }

    public static void main(String[] args) {
        String test1 = "hello world";
        String test2 = "aaaaabbbbcccdde";
        String test3 = "atharva";

        System.out.print(test1 + " ");
        findAndPrintHighest(test1);

        System.out.print(test2 + " ");
        findAndPrintHighest(test2);

        System.out.print(test3 + " ");
        findAndPrintHighest(test3);
    }
}