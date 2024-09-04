import java.util.*;
public class Accenture26aug {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int n=sc.nextInt();
        noofwords(str,n);
    }
    static void noofwords(String str, int n){
        int ctr=0;
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if(str.charAt(i)==' '){
                ctr++;
            }
            if(ctr==n) {
                break;
            }
        }

    }
}
