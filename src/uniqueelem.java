
import java.util.HashMap;
        import java.util.Scanner;

public class uniqueelem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of shirts
        int N = scanner.nextInt();

        // Create a hash map to store the frequency of each color
        HashMap<Integer, Integer> colorCount = new HashMap<>();

        // Read the colors of each shirt
        for (int i = 0; i < N; i++) {
            int color = scanner.nextInt();

            // Increment the count of the current color
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        // Count the number of unique colors
        int uniqueColors = 0;
        for (int count : colorCount.values()) {
            if (count == 1) {
                uniqueColors++;
            }
        }

        // Print the number of unique colors
        System.out.println(uniqueColors);
    }
}

