import java.util.*;
public class rockpapersscisssors19julyaccenture {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter A's First move:-");
       String M=sc.next();
       System.out.println("B's move will be"+check(M));
    }
    static String check(String M){
        if(M.equals("rock")){
            return " paper";
        } else if (M.equals("paper")) {
            return "scissors";
        }else{
            return "rock";
        }
    }
}