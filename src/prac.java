import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class prac {

    public static int countTriplets(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the array
        Map<Integer, Integer> valueMap = new HashMap<>();

        for (int num : arr) {
            valueMap.put(num, num);
        }

        int count = 0; // Initialize count of triplets

        // Iterate over each element arr[k] as the potential third element
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((arr[i]+arr[j])==arr[k]){
                         System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};

        int result = countTriplets(arr);
        System.out.println("Count of triplets: " + result);
    }
}
