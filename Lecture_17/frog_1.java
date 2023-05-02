import java.util.*;
public class frog_1 {
    public static int frog_jump(int[]arr , int n){

        if(n <= 0){
            return 0;
        }

        int option_1 = Integer.MAX_VALUE, option_2 = Integer.MAX_VALUE;

        option_1 = Math.abs(arr[n] - arr[n-1]) + frog_jump(arr, n-1);

        if(n - 2 >= 0){
            option_2 = Math.abs(arr[n] - arr[n-2]) + frog_jump(arr, n-2);
        }

        return Math.min(option_1,option_2);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
        int[]arr = new int[n];
        for(int i= 0;i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(frog_jump(arr,n-1));
    }
}
