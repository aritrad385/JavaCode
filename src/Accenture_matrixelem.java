import java.util.*;
public class Accenture_matrixelem {
    public static void main(String[] args) {
        int []arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n=sc.nextInt();
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        System.out.println("Enter the elements "+n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even Array");
        for(int e:even)
            System.out.println(e+" ");
        System.out.println();
        System.out.println("Sorted odd Array");
        for(int e:odd)
            System.out.println(e+" ");
        System.out.println();
        int evensec=(even.size()-2);
        int oddsec=(odd.size()-2);
        System.out.println("Sum of second Largest element from two array "+(evensec+oddsec));
    }
}
