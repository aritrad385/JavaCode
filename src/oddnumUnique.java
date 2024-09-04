import java.util.Scanner;

public class oddnumUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Elements are:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findUniqueElem(arr);
        System.out.println(result);
        sc.close();
    }

    public static int findUniqueElem(int[] arr) {
        int result = 0;
        // Iterate over every bit position (assuming 32-bit integers)
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            // Count the number of elements with the i-th bit set
            for (int j = 0; j < arr.length; j++) {
                // Check if the i-th bit is set in arr[j]
                if ((arr[j] & (1 << i)) != 0) {
                    sum++;
                }
            }
            // If the count is not a multiple of 3, set the i-th bit in the result
            if (sum % 3 != 0) {
                result =result | (1 << i);
            }
        }
        return result;
    }
}
