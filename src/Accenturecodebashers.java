import java.util.*;

public class Accenturecodebashers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int n = sc.nextInt();
        int result = songs(str1, n);
        System.out.println(result);
    }

    static int songs(String str1, int n) {
        int i = 0, j = 0;
        int maxcount = 0, currentcount = 0;

        // Initial window calculation
        while (j < n) {
            if (str1.charAt(j) == 'a') {
                currentcount++;
            }
            j++;
        }
        maxcount = Math.max(maxcount, currentcount);

         // Sliding window calculation
        while (j < str1.length()) {
            if (str1.charAt(i) == 'a') {
                currentcount--;
            }
            if (str1.charAt(j) == 'a') {
                currentcount++;
            }
            maxcount = Math.max(maxcount, currentcount);
            i++;
            j++;
        }

        return maxcount;
    }
}
