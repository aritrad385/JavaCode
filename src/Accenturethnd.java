import java.util.*;

public class Accenturethnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String result = ryme(str1, n, arr);
        System.out.println(result);
    }

    static String ryme(String str1, int n, String[] arr) {
        int max = 0;
        String str3 = "";
        for (int i = 0; i < arr.length; i++) {
            int co = 0;
            String p = arr[i];
            if (str1.equals(p)) {
                continue;
            } else {
                int min = Math.min(str1.length(), p.length());
                for (int j = 0; j < min; j++) {
                    if (str1.charAt(str1.length() - j - 1) == p.charAt(p.length() - j - 1)) {
                        co++;
                    } else {
                        break;
                    }
                }
            }
            if (co > max) {
                max = co;
                str3 = p;
            }
        }
        if (max != 0) {
            return str3;
        } else {
            return "there is no word that matches";
        }
    }
}
