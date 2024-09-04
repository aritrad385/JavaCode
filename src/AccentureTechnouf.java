import java.util.Scanner;

public class AccentureTechnouf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []arr=s.split(",");
        int max1=0;
        int max2=0;
        String Largestelm="";
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            if(str.length()>max1)
                max1 = str.length();
            if(s.length()>max2){
                max2=s.length();
                Largestelm=str;
            }
        }
        System.out.println(max1);
        System.out.println(Largestelm);
    }
}