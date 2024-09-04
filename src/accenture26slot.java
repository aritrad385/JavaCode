import java.util.*;

public class accenture26slot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Array: " + Arrays.toString(arr));
        int[] result = nextGreaterNum(arr, n);
        System.out.println("Output Array: " + Arrays.toString(result));
    }

    static int[] nextGreaterNum(int[] arr, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int next = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            result[i] = next;
        }
        return result;
    }
}
