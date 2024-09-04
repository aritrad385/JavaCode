import java.util.Scanner;

public class unqelm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }

        int uniqueCount = uniqueColorsTwoPointers(C);
        System.out.println(uniqueCount);
    }

    public static int uniqueColorsTwoPointers(int[] C) {
        int i = 0, j = 1;
        while (j < C.length) {
            if (C[i] == C[j]) {
                j++;
            } else {
                i++;
                C[i] = C[j];
                j++;
            }
        }
        return i + 1;
    }
}
