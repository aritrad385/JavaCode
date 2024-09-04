import java.util.*;
public class Accenture23Aug {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sndlar(arr,n);
        System.out.println(x);
    }
    static int sndlar(int []arr,int n){
        if (n < 2) {
            // If there are less than 2 elements, there's no second largest
            return 0;
        }
        int largest = arr[n - 1];

        int sndlargestelm=Integer.MIN_VALUE;;
        for(int i=arr.length-2;i>=0;i--){
           if(arr[i]!=largest)
               sndlargestelm=arr[i];
           break;
        }
        if (sndlargestelm == Integer.MIN_VALUE) {
            return 0;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==sndlargestelm)
                count++;
        }
        return count;
    }

}
