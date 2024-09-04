import java.util.HashSet;
import java.util.Scanner;

public class juspay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        HashSet<Integer> uniqueEmails = new HashSet<>();


        int duplicatesCount = 0;


        for (int i = 0; i < n; i++) {
            int rollNumber = sc.nextInt();


            if (uniqueEmails.contains(rollNumber)) {

                duplicatesCount++;
            } else {

                uniqueEmails.add(rollNumber);
            }
        }


        System.out.println(duplicatesCount);


        sc.close();
    }
}
