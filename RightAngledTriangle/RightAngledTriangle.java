import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter angle 2: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter angle 3: ");
        int angle3 = sc.nextInt();

        if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("Right angled triangle can be formed");
        } else {
            System.out.println("Right angled triangle cannot be formed");
        }

        sc.close();
    }
}
