import java.util.Scanner;

public class checkWebAddressValidity {

    public static boolean checkWebAddressValidity1(String webAddress) {
        
        String regex = "^https?://(www\\.)?[a-zA-Z0-9]+\\.(com|org|net)$";
        return webAddress.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter web address: ");
        String webAddress = sc.nextLine();

        if (checkWebAddressValidity1(webAddress)) {
            System.out.println("Web address is valid: true");
        } else {
            System.out.println("Web address is valid: false");
        }

        sc.close();
    }
}
