import java.util.Arrays;

public class sc {
    public static void main(String[]args){
        int[][]arr={
                {23,44,66},
                {2,55,78},
                {12,4,89}
        };
       int target=78;
       int[] ans=search(arr,target);
       System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr,int target) {
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
             if(arr[row][col]==target){
               return new int[]{row,col};
             }
            }
        }
        return new int[]{-1,-1};
    }
}
