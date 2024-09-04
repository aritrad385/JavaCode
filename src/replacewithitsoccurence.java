import java.util.Arrays;

public class replacewithitsoccurence {
    public static void main(String[] args) {
        String str="OPENTEXT";
        char chartoreplace='T';
        if(str.indexOf(chartoreplace)==-1){
            System.out.println("Not available");

        }
        char[]arr=str.toCharArray();
        int cnt=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==chartoreplace){
                arr[i]=String.valueOf(cnt).charAt(0);
                cnt++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
