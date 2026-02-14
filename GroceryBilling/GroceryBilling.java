import java.util.Scanner;

public class GroceryBilling {

    public static int calculateFinalAmount(String[] items, int[] itemPrice, String[] purItems, int[] purQty) {
        int finalAmount = 0;

        for (int i = 0; i < purItems.length; i++) {
            for (int j = 0; j < items.length; j++) {
                // Case-insensitive comparison
                if (purItems[i].equalsIgnoreCase(items[j])) {
                    finalAmount += purQty[i] * itemPrice[j];
                    break; // move to next purchased item
                }
            }
        }

        return finalAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Store inventory
        String items[] = { "Butter", "Vinegar", "Oats", "Orange" };
        int itemPrice[] = { 100, 50, 50, 30 };

        // Input size of purchase arrays
        System.out.print("Enter number of purchased items: ");
        int size = Integer.parseInt(sc.nextLine());

        String[] purItems = new String[size];
        int[] purQty = new int[size];

        // Input purchased items
        System.out.println("Enter purchased items:");
        for (int i = 0; i < size; i++) {
            purItems[i] = sc.nextLine();
        }

        // Input quantities
        System.out.println("Enter quantities for each item:");
        for (int i = 0; i < size; i++) {
            purQty[i] = Integer.parseInt(sc.nextLine());
        }

        // Calculate final amount
        int finalAmount = calculateFinalAmount(items, itemPrice, purItems, purQty);

        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}
