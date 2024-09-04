import java.util.*;

public class Mains {
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        int result = OperationsBinaryString(str);
        System.out.println(result);  // Expected output should be the result of operations
    }

    static int OperationsBinaryString(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        char[] c = str.toCharArray();
        int result = getIntFromChar(c[0]);
        for (int i = 1; i < c.length - 1; i++) {
            if (c[i] == 'A') {
                result = result & getIntFromChar(c[i + 1]);
            } else if (c[i] == 'B') {
                result = result | getIntFromChar(c[i + 1]);
            } else if (c[i] == 'C') {
                result = result ^ getIntFromChar(c[i + 1]);
            }
        }
        return result;
    }

    static int getIntFromChar(char c) {
        return c - '0';
    }
}
