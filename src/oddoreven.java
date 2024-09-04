public class oddoreven {
    public static void main(String[] args) {
        int[]arr={2,3,4,1,2,1,3,6,4};
        for(int i=0;i<arr.length;i++){
            boolean isUnique=true;
            for (int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(arr[i]);
                break;
            }

        }
    }
}
