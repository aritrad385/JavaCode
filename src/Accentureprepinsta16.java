import java.util.*;
public class Accentureprepinsta16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(",");
        int n = inputArr.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArr[i].trim());
        }
        int p=secondlarge(arr,n);
        System.out.println(p);
    }
        static int secondlarge(int arr[], int n){
            if (n < 2) {
                // Not enough elements to find the second largest
                throw new IllegalArgumentException("Array must have at least two elements.");
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            return arr[1];
    }
}
