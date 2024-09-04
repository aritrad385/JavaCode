public class linierds {
    public static void main(String[]args){
         int[] nums={20,34,36,66,32};
         int target=100;
         int ans=linierSearch(nums,target);
         System.out.println(ans);
    }
    static int linierSearch(int[]arr,int target){
        if(arr.length==0){
            return-1;
        }
        //run a loop
        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                return arr[i];
            }
        }
        return -1;
    }
}

