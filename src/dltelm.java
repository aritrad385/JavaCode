import java.util.Scanner;
class dltelm{
    public static void main(String[]args){
        int n,m,p;
        System.out.println("enter the number of elements in array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int A[]=new int [n];
        int B[]=new int[n-1];
        System.out.println("Enter the elements to be enterd");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt(); //10,20,30,40,50--m=2
        }
        System.out.println("Enter the index value to be deleted");
        m=sc.nextInt();
        for(int i=0;i<A.length;i++){
            if(i<m){
                A[i]=B[i];
            }
            else if(i==m)
                continue;

            else{
                B[i-1]=A[i];
            }
        }
        System.out.println("Elements are");
        for(int i=0;i<n-1;i++){
            System.out.println(B[i]);
        }
    }

}