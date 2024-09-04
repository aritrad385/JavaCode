import java.util.*;
public class revstring {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        reversee(str);
    }
    static void reversee(String str){
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        System.out.println(res);
    }

}
