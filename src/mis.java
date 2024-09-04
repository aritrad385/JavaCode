import java.util.*;
class mis{
    public static void main(String[] args) {
        int[]arr={22,23,77,45,66,91};
        int target=495;
        int ans=linierSearch(arr,45);
        System.out.println(ans);
    }
    static int linierSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}