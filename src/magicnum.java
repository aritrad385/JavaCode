import java.util.*;

class MagicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = magico(n);
        System.out.println(result);
    }

    static int magico(int n) {
        if(n==0)
            return 0;
        int count = 0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            int j=i;
            while (j > 0) {
                if ((j & 1) == 1) {
                    sum += 2;
                } else {
                    sum += 1;
                }
                j = j >> 1;
            }
            if (sum % 2 == 1) {
                count++;
            }

        }
        return count;
    }
}
