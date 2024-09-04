import java.util.*;
 class Accenture00 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x=countless(n,arr);
        System.out.println(x);
    }
    static int countless(int n,int[]arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                count++;
        }
        return  count;
    }
}
