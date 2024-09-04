import java.lang.reflect.Array;
import java.util.*;
public class AccenturePracticeq {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=ProductSmallestPair(sum,arr,n);
        System.out.println(x);

    }
    static int ProductSmallestPair(int sum,int[]arr,int n){
        if(n==0||n<2)
            return -1;
        //Arrays.sort(arr);
        int temp,check,ans;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        check=arr[0]+arr[1];
        if(sum>check)
            return arr[0]*arr[1];
        else
            return 0;
    }
}
