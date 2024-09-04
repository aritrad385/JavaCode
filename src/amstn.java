import java.util.*;
public class amstn{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        boolean ans=isAmst(a);
        System.out.println(ans);

    }
    static boolean isAmst(int a){
      int original=a;
      int sum=0;
      while(a>0){
          int rem=a%10;
          a=a/10;
          sum+=rem*rem*rem;
      }
      if(sum==original){
          return true;
      }
      return false;
    }

}