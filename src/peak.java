import java.util.Scanner;

public class peak {

    public static int calculater(int r, int unit, int[] arr, int n) {
        if (arr == null || n == 0) {
            return -1;
        }

        int totalFoodRequired = r * unit;
        int foodTillNow = 0;

        for (int house = 0; house < n; house++) {
            foodTillNow += arr[house];
            if (foodTillNow >= totalFoodRequired) {
                return house + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rats: ");
        int r = sc.nextInt();

        System.out.print("Enter the value of units: ");
        int unit = sc.nextInt();

        System.out.print("Number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("List elements with space separated: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = calculater(r, unit, arr, n);
        System.out.println(result);

        sc.close();
    }
}
