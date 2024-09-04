import java.util.*;
public class Accenture21aug2024 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        String b="";
        while(t>0){
            int r=t%2;
            t=t/2;
            b=r+b;
        }
        System.out.println(b);
    }
}
