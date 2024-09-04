import java.util.HashMap;

public class largestsubarrar {

    int findSubArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxSize = 0;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxSize = i + 1;
                endIndex = i;
            }

            if (map.containsKey(sum)) {
                if (maxSize < i - map.get(sum)) {
                    maxSize = i - map.get(sum);
                    endIndex = i;
                }
            } else {
                map.put(sum, i);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                arr[i] = 0;
            }
        }

        int startIndex = endIndex - maxSize + 1;
        if (endIndex == -1) {
            System.out.println("No such subarray");
        } else {
            System.out.println(startIndex + " to " + endIndex);
        }

        return maxSize;
    }

    public static void main(String[] args) {
        largestsubarrar sub = new largestsubarrar();
        int arr[] = {1, 0, 0, 1, 0, 1, 1};
        int size = arr.length;

        sub.findSubArray(arr, size);
    }
}
