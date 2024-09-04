import java.util.*;
public class Accentureprimeactual {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int []arr=new int [n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
  }
  static boolean isPrime(int num) {
      if (num <= 1) return false;
      for (int i = 2; i < Math.sqrt(num); i++) {
          if (num % i == 0) {
              return false;
          }
      }
      return true;
  }
      static int primeIndex(int n,int[]arr){
          int sum=0;
          for(int i=2;i<n;i++){
              if(isPrime(i)){
                  sum+=arr[i];
              }
          }
          return sum;
      }

}
