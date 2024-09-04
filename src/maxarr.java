public class maxarr {
    public static void main(String[]args){
        int[]arr={1,22,34,55,66};
        int target=304;
        int ans=linierSearch(arr,target);
        System.out.println(ans);
    }
    static int linierSearch(int[]arr,int target){
        if(arr.length==0){
           return -1;
        }
        for(int i=0;i<=arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }

}
