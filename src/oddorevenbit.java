import java.util.*;
public class oddorevenbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();
        if((n & 1)==1){
            System.out.println("the number is odd");
        }else{
            System.out.println("the number is even");
        }
    }
}
