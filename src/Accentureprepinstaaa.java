import java.util.*;
public class Accentureprepinstaaa{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(OperationBinaryString(str));
    }
    static int OperationBinaryString(String str ){
        if(str==null)
            return -1;
        int res=str.charAt(0)-'0';
       for(int i=0;i<str.length();i++){
           char prev=str.charAt(i);
           if(prev=='A'){
               res=res& str.charAt(i)-'0';
           }
           else if(prev=='B'){
               res=res| str.charAt(i)-'0';
           }
           else {
               res=res^str.charAt(i)-'0';
           }
           i++;
       }
       return  res;

    }
}
