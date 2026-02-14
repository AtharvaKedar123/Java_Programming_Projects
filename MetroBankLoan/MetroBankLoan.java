import java.util.Scanner;

public class MetroBankLoan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter loan type (Car/House/Business): ");
        String loanType = sc.next();

        System.out.print("Enter expected loan amount: ");
        double expectedLoan = sc.nextDouble();

        System.out.print("Enter expected number of EMIs: ");
        int expectedEMIs = sc.nextInt();

        // ---------------- VALIDATION ----------------

        if (accountNumber < 1000 || accountNumber > 1999) {
            System.out.println("Invalid account number");
        } 
        else if (balance < 1000) {
            System.out.println("Insufficient account balance");
        } 
        else {

            double eligibleLoan = 0;
            int eligibleEMIs = 0;

            // ----------- LOAN ELIGIBILITY ------------

            if (salary > 25000 && loanType.equalsIgnoreCase("Car")) {
                eligibleLoan = 500000;
                eligibleEMIs = 36;
            } 
            else if (salary > 50000 && loanType.equalsIgnoreCase("House")) {
                eligibleLoan = 6000000;
                eligibleEMIs = 60;
            } 
            else if (salary > 75000 && loanType.equalsIgnoreCase("Business")) {
                eligibleLoan = 7500000;
                eligibleEMIs = 84;
            }

            // ------------- DECISION -----------------

            if (eligibleLoan == 0) {
                System.out.println("The bank does not provide the loan");
            } 
            else if (expectedLoan <= eligibleLoan && expectedEMIs <= eligibleEMIs) {

                System.out.println("Account Number: " + accountNumber);
                System.out.println("Eligible Loan Amount: " + eligibleLoan);
                System.out.println("Requested Loan Amount: " + expectedLoan);
                System.out.println("Eligible EMIs: " + eligibleEMIs);
            } 
            else {
                System.out.println("The bank does not provide the loan");
            }
        }

        sc.close();
    }
}
