public class tdarray {
    public static void main(String[]args)
    {
       int A[][]=new int[5][5];
       int  B[][]={{1,2,3},{7,9,6},{6,8,3}};
       for(int i=0;i<B.length;i++){
           for(int j=0;j<B[0].length;j++){
             System.out.print(B[i][j]+" ");
           }
           System.out.println(" ");
       }

    }
}
