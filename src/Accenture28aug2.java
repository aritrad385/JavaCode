import java.util.*;
public class Accenture28aug2 {
    public static int main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int count=0;
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                count++;
            }
        }
        int mid=(count+1)/2;
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                mid--;
                if(mid==0) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
