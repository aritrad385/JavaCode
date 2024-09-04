//import  java.util.*;
//public class Accenture19findmaxelem {
//    public static void main(String[] args) {
//        int [] arr=new int[100];
//        Scanner sc=new Scanner (System.in);
//        int x = sc.nextInt();
//        for(int i=0;i<x;i++){
//             arr[i] =sc.nextInt();
//        }
//
//        MaxArray(arr,x);
//    }
//    static void MaxArray(int[]arr,int length){
//        for(int i=0;i<length-1;i++){
//            for(int j=1;j<length-i-1;j++){
//                if(arr[j]<arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        int maxValue = arr[0];
//        int maxIndex = 0;
//
//        System.out.println(maxValue);
//        System.out.println(maxIndex);
//    }
//}
import java.util.*;

public class Accenture19findmaxelem {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        MaxArray(arr, x);
    }

    static void MaxArray(int[] arr, int length) {
        // Bubble sort in descending order
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // After sorting, the maximum element is at index 0
        int maxValue = arr[0];
        int maxIndex = 0;

        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
