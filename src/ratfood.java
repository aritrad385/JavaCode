public class ratfood {

    static int calculate(int r,int unit,int[]arr,int n){
        if(arr==null || n==0){
            return -1;
        }
        int totalfoodRequire=r*unit;
        int foodweHave=0;
        for(int house=0;house<n;house++){
            foodweHave=foodweHave+arr[house];
            if( foodweHave>=totalfoodRequire){
                return house+1;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int r=7;
        int unit=2;
        int[]arr={2,8,3,5,7,4,1,2};
        int n=arr.length;
        int result=calculate(r,unit,arr,n);
        System.out.println(result);

    }

}
