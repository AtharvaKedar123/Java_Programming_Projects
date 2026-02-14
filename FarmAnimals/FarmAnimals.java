/*count number of head and legs of animals */

import java.util.Scanner;

public class FarmAnimals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of heads: ");
        int heads = sc.nextInt();

        System.out.print("Enter number of legs: ");
        int legs = sc.nextInt();

        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        if ((legs - 2 * heads) % 2 == 0 && rabbits >= 0 && chickens >= 0) {
            System.out.println("Chickens=" + chickens);
            System.out.println("Rabbits=" + rabbits);
        } else {
            System.out.println("The number of chickens and rabbits cannot be found");
        }

        sc.close();
    }
}
