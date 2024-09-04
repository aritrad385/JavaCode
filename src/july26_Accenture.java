import java.util.*;
public class july26_Accenture {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int x=bnry(n);
        System.out.println(x);
    }
    static int bnry(int n){
         int ctr=0;
        int d=1;
        int sum=0;
        while(n>1){
            int r=n%2;
            n=n/2;
           d=d*10+r;
        }
        String str=Integer.toString(d);
        int length=str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                ctr++;
            }
        }
        while(ctr!=0){
             sum= (int) ((int)sum+Math.pow(2,ctr-1));
             ctr--;
        }
        return sum;
    }
}
