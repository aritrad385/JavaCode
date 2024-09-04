import java.util.*;
public class Accenture28aug {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int div=sc.nextInt();
        int quo=sc.nextInt();
        int rem=sc.nextInt();
        int divident=quo*div+rem;
        int index=-1;
        for (int i=0;i<n;i++){
            if(arr[i]==divident){
               index=i;
               break;
            }
        }
        System.out.println(index);
    }
}

