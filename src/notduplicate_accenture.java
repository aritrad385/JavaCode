import java.util.Arrays;

public class notduplicate_accenture {

        public static void main(String[] args) {
            int arr[] = {1 ,2, 3, 6, 5, 4, 4, 2, 5, 3, 6 ,1 ,6 ,5, 3 ,2 ,4 ,1 ,2 ,5, 1 ,4 ,3 ,6 ,8 ,4 ,3 ,1 ,5 ,6 ,2};
            int temp[] = new int[arr.length];
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[j] + " ");

                    }
                }
            }

        }
    }

