public class combi {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        twoNumbers(arr, target);
    }

    static void twoNumbers(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println( + arr[i] + ", " + arr[j] );
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found");
        }
    }
}
