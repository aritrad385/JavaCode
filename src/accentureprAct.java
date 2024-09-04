import java.util.*;
public class accentureprAct {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String str=evnodd(n,arr);
        System.out.println(str);
    }
    static String evnodd(int n,int[]arr){
        String s="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                s+="even";
            else
                s+="odd";
        }
        return s;
    }
}
