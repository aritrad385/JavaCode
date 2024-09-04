import java.util.*;
public class nextrun {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        maxInArray (arr, arr.length);
    }
    static void maxInArray(int arr[],int length){
        int maxelem=arr[0],index=0;
        for(int i=0;i<length;i++){
            if(arr[i]>maxelem){
                maxelem=arr[i];
                index=i;
            }

        }
        System.out.println(maxelem);
        System.out.println(index);
    }
}
