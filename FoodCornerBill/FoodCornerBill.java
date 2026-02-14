import java.util.Scanner;

public class FoodCornerBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food type (V/N): ");
        char type = sc.next().toUpperCase().charAt(0);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter distance in kms: ");
        int distance = sc.nextInt();

        // Validation
        if ((type != 'V' && type != 'N') || distance <= 0 || quantity < 1) {
            System.out.println(-1);
        } else {

            int foodCost = 0;

            if (type == 'V') {
                foodCost = 12 * quantity;
            } else {
                foodCost = 15 * quantity;
            }

            int deliveryCharge = 0;

            if (distance <= 3) {
                deliveryCharge = 0;
            } 
            else if (distance <= 6) {
                deliveryCharge = (distance - 3) * 1;
            } 
            else {
                deliveryCharge = (3 * 1) + (distance - 6) * 2;
            }

            int totalBill = foodCost + deliveryCharge;

            System.out.println("Final Bill Amount: $" + totalBill);
        }

        sc.close();
    }
}
