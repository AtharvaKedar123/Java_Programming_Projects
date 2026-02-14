import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BasicLogAnalyzer {

    public static void main(String[] args) {

        String fileName = "sample_log.txt";

        int infoCount = 0;
        int warningCount = 0;
        int errorCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {

                if (line.contains("INFO")) {
                    infoCount++;
                }

                if (line.contains("WARNING")) {
                    warningCount++;
                }

                if (line.contains("ERROR")) {
                    errorCount++;
                }
            }

            reader.close();

            System.out.println("===== Log Summary =====");
            System.out.println("INFO count: " + infoCount);
            System.out.println("WARNING count: " + warningCount);
            System.out.println("ERROR count: " + errorCount);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
