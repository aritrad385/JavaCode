class twosum {

    static void sortBinaryArray(int a[], int n)
    {
        int j = -1;
        for (int i = 0; i < n; i++) {

            // if number is smaller than 1
            // then swap it with j-th number
            if (a[i] < 1) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        int a[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1,
                1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };

        int n = a.length;

        // Function call
        sortBinaryArray(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
