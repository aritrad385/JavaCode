import java.util.*;
public class Accenture2021replacechar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
       ReplaceCharacter(str,c1,c2);


    }
    static void ReplaceCharacter(String str,char c1,char c2){
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c1){
                res=res+c2;
            } else if (str.charAt(i)==c2) {
                res=res+c1;
            }else{
               res=res+str.charAt(i);

            }

            }
        System.out.println (res);

        }
    }

