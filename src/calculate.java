import java.util.*;
public class calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int result=Calculate(m,n);
        System.out.println(result);
    }

    static int Calculate(int m,int n){
        int sum=0;
        for(int i=m;i<=n;i++){
           if(i%3==0 && i%5==0){
               sum=sum+i;

           }
        }
        return sum;
    }
}
