import java.util.*;
public class Accenturestringprob {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       String str1=sc.next();
       String str2=sc.next();
         for(int i=0;i<str1.length();i++){
           char ch1=str1.charAt(i);
           boolean found=false;
           for(int j=0;j<str2.length();j++){
               char ch2=str2.charAt(j);
               if(ch1==ch2){
                   found=true;
                   break;
               }
           }
             if(!found){
                 System.out.print(ch1);
             }

         }

    }
}
