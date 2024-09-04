import java.util.*;
public class flore{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new Number");
        int a=sc.nextInt();
        boolean ans=isPrime(a);
        System.out.println(ans);

    }
    static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        int c=2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        if(c*c>a){
            return true;
        }
        else
            return false;
    }
}
