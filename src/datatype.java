import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataType = sc.nextLine();
        int size = getDataTypeSize(dataType);
        System.out.println(size+" "); // Added space after "Output:"
        sc.close();
    }

    public static int getDataTypeSize(String dataType) {
        // Write your code here
        switch(dataType) {
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            case "Character":
                return 1;
            default:
                return -1;
        }
    }
}
