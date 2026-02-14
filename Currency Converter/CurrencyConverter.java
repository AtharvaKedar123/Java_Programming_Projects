import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed exchange rates (example rates)
        double usdToInr = 83.0;
        double inrToUsd = 1 / usdToInr;

        double usdToEur = 0.85;
        double eurToUsd = 1 / usdToEur;

        int choice;

        do {
            System.out.println("\n===== Currency Converter =====");
            System.out.println("1. USD to INR");
            System.out.println("2. INR to USD");
            System.out.println("3. USD to EUR");
            System.out.println("4. EUR to USD");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                double result = 0;

                switch (choice) {
                    case 1:
                        result = amount * usdToInr;
                        System.out.println("Converted Amount: ₹" + result);
                        break;

                    case 2:
                        result = amount * inrToUsd;
                        System.out.println("Converted Amount: $" + result);
                        break;

                    case 3:
                        result = amount * usdToEur;
                        System.out.println("Converted Amount: €" + result);
                        break;

                    case 4:
                        result = amount * eurToUsd;
                        System.out.println("Converted Amount: $" + result);
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Thank you for using Currency Converter!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
