import java.util.*;
public class i {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        int x=magicx( n,str);
        System.out.println(x);
    }
    static int magicx(int n,String str){
        int i=0;
        int j=0;
        int currentcount=0;
        int maxcount=0;
        while(j<n){
            if(str.charAt(i)=='a'){
                currentcount++;
            }
            j++;
        }
        maxcount=Math.max(currentcount,maxcount);
        //sliding window
        while (j<str.length()){
            if(str.charAt(i)=='a'){
                currentcount--;
            }
            if(str.charAt(j)=='a'){
                currentcount--;
            }
            maxcount=Math.max(currentcount,maxcount);
            i++;
            j++;
        }
        return maxcount;
    }
}
