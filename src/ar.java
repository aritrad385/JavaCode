import java.util.Arrays;

public class ar {

    public static void sort012(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        int temp;

        while (mid <= hi) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = arr[hi];
                    arr[hi] = arr[mid];
                    arr[mid] = temp;
                    hi--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);

        System.out.println(Arrays.toString(arr));
    }
}
