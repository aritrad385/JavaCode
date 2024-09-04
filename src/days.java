import java.io.*;
import java.util.*;

public class days {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=sc.nextInt();
        int x=Agency(num,a);
        System.out.println(x);

    }
    static int Agency(int num,int a){
        int r=0,sum=0;
        while(num>0){
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        int p=sum * a;
        sum=0;
        while(p>0){
            r=p%10;
            sum=sum+r;
            p=p/10;
        }
        return sum;
    }
}