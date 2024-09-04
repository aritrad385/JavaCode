public class ZeroSumSubarray {

    static boolean hasZeroSumSubarray(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            int sum = 0;

            // Calculate sum of subarray from i to j
            for (int j = i; j < n; j++) {
                sum += arr[j];

                // If sum is 0, we found a subarray with sum 0
                if (sum == 0) {
                    return true;
                }
            }
        }

        // No subarray with sum 0 found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 3, 1, -4, -2, -2};

        if (hasZeroSumSubarray(arr)) {
            System.out.println("Subarray with sum 0 found");
        } else {
            System.out.println("No subarr ay with sum 0 found");
        }
    }
}
