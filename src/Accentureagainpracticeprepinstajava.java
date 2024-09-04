import java.util.*;
public class Accentureagainpracticeprepinstajava {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int result = ratCount(r, unit, arr, n);
        System.out.println(result);
    }
    static int ratCount(int r,int unit,int []arr,int n){
        if(arr==null){
            return -1;
        }
        int res=r*unit;
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            count++;
            if(sum>=res){
                return count;
            }
        }
        return  0;
    }

}
