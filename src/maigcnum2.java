import java.util.*;
public class maigcnum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
    static int magicx(int n){
        if(n==0)
            return  0;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            int j=i;
            while(j>0){
                if((j&1)==1) {
                    sum += 2;
                }
                else {
                    sum += 1;
                }
            }
            j=j>>1;
            if(sum%2==1){
                count++;
            }
        }
        return count;

    }

}
