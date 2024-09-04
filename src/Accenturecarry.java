import java.util.*;
public class Accenturecarry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=NumberOfCarries(num1,num2);
        System.out.println(NumberOfCarries(num1,num2));
    }
    static int NumberOfCarries(int num1,int num2){
        int q1=0,q2=0,p=0;
        int count=0;
        while(num1>0 && num2>0){
            q1=num1%10;
            q2=num2%10;
            int sum=p+q1+q2;
            if(sum>9){
                p=1;
                count++;
            }else{
                p=0;
            }
            num1=num1/10;
            num2=num2/10;
        }
        return count;
    }
}
