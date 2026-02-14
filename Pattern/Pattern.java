class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {      // Controls rows
            for (int j = 1; j <= i; j++) {  // Prints stars
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
