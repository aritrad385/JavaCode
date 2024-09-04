import java.util.*;
public class Maxexpo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(MaxExponent(a,b));
    }
    static int count(int n){
        int exponent=0;
        while(n%2==0&& n>0){
            exponent ++;
            n=n/2;
        }
        return exponent;
    }
    static int MaxExponent(int a,int b){
        int max=0;
        int num=0;
        for(int i=a;i<=b;i++){
            int temp=count(i);
            if(temp>max){
                max=temp;
                num=i;
            }
        }
        return num;
    }
}
