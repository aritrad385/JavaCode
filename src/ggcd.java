

public class ggcd {
    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = { 2, 4, 6, 8, 16 };
        int n = arr.length;
        System.out.println(findGCD(arr, n));
    }
}
