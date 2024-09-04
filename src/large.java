import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(LargeSmallSum(arr, n));
    }

    public static int LargeSmallSum(int[] arr, int n) {
        if (n <= 3) {
            return 0;
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size() - 2) + odd.get(odd.size() - 2);
    }
}
