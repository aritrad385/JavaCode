public class leetcode1295 {
    public static void main(String[]args){
        int [] nums={12,33,45,66};
        //System.out.println(findNumbers(nums));

        System.out.println(digits(-5679));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //Function to check the number is even or not
    static boolean even(int num){
        int numberOfDigits=digits(num);
        if(numberOfDigits %2==0){
            return true;
        }
        return false;
    }
    //count number of digit ina number
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return -1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;

        }
        return count;
    }
}



