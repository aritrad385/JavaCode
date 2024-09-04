class smlnum {
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = lastPosition(num, target);
        System.out.println("Start: " + ans[0] + ", End: " + ans[1]);
    }

    static int[] lastPosition(int[] num, int target) {
        int[] ans = {-1, -1};
        int start = search(num, target, true);
        int end = search(num, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}