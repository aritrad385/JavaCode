import java.util.*;
 class Accenture09 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int []arr=new int [n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int result = notbythree(n, arr);
         System.out.println(result);

     }
     static int notbythree(int n,int []arr){
         int count=0;
         for(int i=0;i<n;i++){
             if (arr[i] % 3 != 0){
                 return i;
             }

         }
         return  -1;
         }

     }

