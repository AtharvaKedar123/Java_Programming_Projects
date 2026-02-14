public class Prime_Factors {
    public static void main(String[] args) {
        int n = 60;  // Hardcoded test value

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 1)
            System.out.print(n);
    }
}
