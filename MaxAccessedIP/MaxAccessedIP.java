import java.util.Scanner;

public class MaxAccessedIP {

    public static String findMaxAccessedIP(String[] inStr) {
        String maxIP = "";
        int maxCount = 0;

        for (int i = 0; i < inStr.length; i++) {
            // Extract IP (before first space)
            String ip = inStr[i].split(" ")[0];
            int count = 0;

            // Count how many times this IP appears
            for (int j = 0; j < inStr.length; j++) {
                String tempIP = inStr[j].split(" ")[0];
                if (ip.equals(tempIP)) {
                    count++;
                }
            }

            // Update maxIP if this IP appears more times
            if (count > maxCount) {
                maxCount = count;
                maxIP = ip;
            }
        }

        return maxIP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] inStr = new String[n];
        for (int i = 0; i < n; i++) {
            inStr[i] = sc.nextLine();
        }

        String outStr = findMaxAccessedIP(inStr);
        System.out.println(outStr);

        sc.close();
    }
}
