import java.util.Arrays;

public class alphabeticalorder {
    public static void main(String[] args) {
         String str="rock";
         char []ch =str.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
    }
}
