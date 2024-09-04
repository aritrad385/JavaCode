public class powoftwo {
    public static void main(String[] args) {
        int n=10010;
        int count =0;
        int temp=n;
        while(temp>0){
            if((temp & 1)==1){
                count++;
            }
            temp=temp>>1;
        }


        if(count>1){
            System.out.println(n+ " is not a power of two");
        }else{
            System.out.println(n+ " is a power of two");
        }
    }

}
