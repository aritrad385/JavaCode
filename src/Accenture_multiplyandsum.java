import java.util.*;
public class Accenture_multiplyandsum {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("enter any no");
       int n=sc.nextInt();
       int sum=0,value=1;
       for(int i=0;i<=10;i++){
           value=n*i;
           System.out.print(value+" ");
           sum=sum+value;
       }
       System.out.println(" \nThe sum is "+sum);
    }
}
