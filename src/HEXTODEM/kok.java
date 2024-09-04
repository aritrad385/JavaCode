package HEXTODEM;

import java.lang.reflect.Array;
import java.util.*;
public class kok {
    public static void main(String[]args){
        int[] arr={1,23,44,56,77};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
