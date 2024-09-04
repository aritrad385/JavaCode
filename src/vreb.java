import java.util.Scanner;

public class vreb {
    static int countDigits(long n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countDigits(n));
        sc.close(); // Changed scanner to sc
    }
}
