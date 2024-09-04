import java.util.*;
public class Accentureprepinstaq17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String[] roomStrings = sc.nextLine().split(" ");
        int[] roomNumber = new int[roomStrings.length];
        for (int i = 0; i < roomStrings.length; i++) {
            roomNumber[i] = Integer.parseInt(roomStrings[i]);
        }
        Arrays.sort(roomNumber);
        int groupleader = -1;
        int i = 0;
        while (i < roomNumber.length) {
            if (i == roomNumber.length - 1 || roomNumber[i] != roomNumber[i + 1]) {
                groupleader = roomNumber[i];
                break;
            } else {
                i = i + k;
            }
        }
        System.out.println(groupleader);
    }
}

