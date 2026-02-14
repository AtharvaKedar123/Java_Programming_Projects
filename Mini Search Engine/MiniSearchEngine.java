import java.io.*;
import java.util.*;

public class MiniSearchEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        // Read file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        // Ask user for search word
        System.out.print("Enter word to search: ");
        String keyword = sc.nextLine().toLowerCase();

        int totalMatches = 0;

        System.out.println("\nSearch Results:");

        for (String line : lines) {

            if (line.toLowerCase().contains(keyword)) {
                System.out.println(line);

                // Count occurrences in that line
                String[] words = line.toLowerCase().split(" ");
                for (String word : words) {
                    if (word.equals(keyword)) {
                        totalMatches++;
                    }
                }
            }
        }

        System.out.println("\nTotal occurrences: " + totalMatches);

        sc.close();
    }
}
