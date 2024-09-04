import java.util.*;
public class Accenture21aug {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num1=0;
       int num2=1;
       int num3=0;

       if(n==0&&n==1)
         System.out.println(n);
       for(int i=2;i<=n;i++){
           num3=num1+num2;
           num1=num2;
           num2=num3;
       }
        System.out.println(num3);
    }
}
