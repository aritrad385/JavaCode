public class Accenture20 {


    public static int countInversions(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }


    private static int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int inversions = 0;
        inversions += mergeSort(nums, left, mid);
        inversions += mergeSort(nums, mid + 1, right);
        inversions += merge(nums, left, mid, right);

        return inversions;
    }


    private static int merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        int inversions = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
                inversions += (mid - i + 1); // Count inversions
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (i = left; i <= right; i++) {
            nums[i] = temp[i - left];
        }

        return inversions;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums1 = {8, 4, 2, 1};
        System.out.println("Number of inversions: " + countInversions(nums1)); // Output: 6

        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Number of inversions: " + countInversions(nums2)); // Output: 0
    }
}
