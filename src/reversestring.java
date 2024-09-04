import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n= sc.next();
        String result ="";
        for (int i=n.length()-1;i>=0;i--){
           result=result+n.charAt(i);
        }
        System.out.println(result);
    }
}
