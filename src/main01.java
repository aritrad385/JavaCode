import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(ProductSmallestPair(arr, n, sum));
    }

    static int ProductSmallestPair(int[] arr, int n, int sum) {
        if (n < 2) {
            return -1;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sum of the two smallest elements
        int sum1 = arr[0] + arr[1];

        // Check if the sum of the smallest pair is less than the given sum
        if (sum1 < sum) {
            return arr[0] * arr[1];
        } else {
            return 0;
        }
    }
}
