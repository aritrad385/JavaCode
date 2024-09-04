import java.util.*;
public class Accenture26bulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(bulb(arr,n));
    }
    static int bulb(int arr[],int n ){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j]==1){
                    arr[j]=0;
                }else {
                    arr[j]=1;
                }
            }
            count++;
        }
        return  count;

    }

}




