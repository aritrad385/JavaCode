class Main {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++)   //row
        {
            for (j = 5; j > 1; j--)//space(column)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (i = 4; i >= 1; i--)   //row
        {
            for (j = 5; j > 1; j--)//space(column)
            {
                System.out.print(" ");
            }
            for (k = 1; k <=2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}