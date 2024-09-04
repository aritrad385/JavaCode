public class matrixmul {
    public static void main(String[]args){
        int A[][]={{1,2,3},{4,5,6},{4,7,8}};
        int B[][]={{2,3,4},{5,7,3},{4,8,6}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
                System.out.print(C[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
