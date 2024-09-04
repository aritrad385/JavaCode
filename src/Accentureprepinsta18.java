import java.util.*;
public class Accentureprepinsta18 {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       ArrayList<Integer> list=new ArrayList<Integer>(n);
       for(int i=0;i<n;i++){
           list.add(sc.nextInt());
       }
       for(int i=0;i<n;i++){
           if(list.get(i)%7==0||list.get(i)%7==1){
               System.out.println("SEcond");
           }else{
               System.out.println("First");
           }
       }
    }
}

