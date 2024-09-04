import java.util.*;
public class Accenture_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Upper and Lower Limit");
        int ul = sc.nextInt ();
        int ll = sc.nextInt ();
        for(int i=ul;i<=ll;i++){
            if(i==pallindrome(i))
                System.out.println(i+" ");
        }
    }
    static int pallindrome(int n ){
        int rem=0;
        int div1=n;
        while(div1!=0){
            int r=div1%10;
            rem=(rem*10)+r;
            div1=div1/10;
        }
        return rem;
    }
}
