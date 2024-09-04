import java.util.*;
public class Placementprep {
    public static void main(String[]args){
        int r;
        int res=0;
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        while (x>0){
            r=x%10;
            res=res+r;
            x=x/10;
        }
       boolean isPrime=true;
        if(res<=1){
            isPrime=false;
        }else {
            for(int i=0;i<=Math.sqrt(res);i++)
            {
                if (res % 2 == 0) {
                    isPrime = false;
                }else {
                    isPrime =true;
                }
            }
           System.out.println( isPrime? "Yes":"No");
        }
    }
}

