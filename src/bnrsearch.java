public class bnrsearch {
    public static void main(String[]args){
        int[]arr={2,3,4,5,8,12,33};
        int target=8;
        int ans=bnrsearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exists
    static int bnrsearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //int middle=(start+end)/2;for very learge number (start+end)/2 will cause problem so,
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
