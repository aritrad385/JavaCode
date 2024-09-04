class prep{
    public static void main(String[] args) {

        int n = 5; // You can adjust the value of n for different sizes

        for (int i = 1; i <= n; i++)
        {
            // Spaces before the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // Spaces before the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
