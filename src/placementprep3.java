import java.util.*;
public class placementprep3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        placementprep3 obj=new placementprep3();
        String result=obj.fnc(str);
        System.out.println(result);
    }
    static String fnc(String str){
        int count=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                count++;
        else {
                if (count > 0) {
                    res.append((char) (64 + count));
                    count = 0;
                }
            }
        }
        if(count>0){
            res.append((char)(64+count));
            count=0;
        }
        return res.toString();
    }

}
