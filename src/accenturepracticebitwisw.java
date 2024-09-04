import java.io.*;
import java.util.*;

public class accenturepracticebitwisw {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = large(n,arr);
        System.out.println(result);

    }
    static int large(int n,int []arr){
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                count ++;
            }

        }
        return count;

    }


}
