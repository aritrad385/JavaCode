import java.util.*;

public class placementprep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // Read the binary string directly as input

        placementprep2 obj = new placementprep2();
        String result = obj.fnc(str);
        System.out.println(result);
    }

    String fnc(String str) {
        int count = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            } else {
                if (count > 0) {
                    res.append((char) (64 + count));
                    count = 0;
                }
            }
        }
        // Append the last sequence if any
        if (count > 0) {
            res.append((char) (64 + count));
        }
        return res.toString();
    }
}
