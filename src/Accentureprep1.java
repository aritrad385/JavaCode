import java.util.*;
class Accentureprep{
    public static void check(String str) {
        if (str.length() != 19 || str.charAt(4) != '-' || str.charAt(9) != '-' || str.charAt(14) != '-') {
            System.out.println("Invalid");
            return;
        }
        if (str.charAt(0) == '9' || str.charAt(0) == '8' || str.charAt(0) == '6') {
            for (int i = 0; i < 19; i++) {
                if ((i != 4) && (i != 9) && (i != 14)) {
                    if (!(Character.isDigit(str.charAt(i)))) {
                        System.out.println("Invalid");
                        return;
                    }
                }
            }
            System.out.println("valid");
        }
        else
            System.out.println("invalid");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String str=sc.next();
            check(str);
        }
    }
}