public class cpy {
    public static void main(String[]args)
    {
        int A[]={5,2,3};
        System.out.println(A.length);
        int B[]=new int[2*A.length];
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }

        /*System.out.println("elements are a[]");
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+",");*/
        A=B;
        B=null;
       /* System.out.println("\n\nelements are a[]");
        for(int i=0;i<A.length;i++)
            System.out.println(B[i]+",");*/
        System.out.println(A.length);

    }



}
