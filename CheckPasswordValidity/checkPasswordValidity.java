import java.util.Scanner;

public class checkPasswordValidity {

   
    public static boolean checkPasswordValidity1(String password) {
        
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%&*_])[A-Za-z\\d!@#$%&*_]{8,20}$";
        return password.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (checkPasswordValidity1(password)) {
            System.out.println("Password is valid: true");
        } else {
            System.out.println("Password is valid: false");
        }

        sc.close();
    }
}
