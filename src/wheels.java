import java.util.*;
public class wheels {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int v=sc.nextInt();
      int w=sc.nextInt();
      int x=0;
      if(w<=2||w%2!=0||w<v){
          System.out.println("INVALID INPUT");
      }
      else{
          x=(4*v-w)/2;
          System.out.println("Two Wheeler="+x+"Four Wheeler="+(v-x));
      }
    }
}
