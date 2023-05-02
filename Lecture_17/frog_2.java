import java.util.*;
public class frog_2 {
    public static int frog_jump(int[]arr, int n,int k){

        if(n <= 0){
            return 0;
        }
        int ans = Integer.MAX_VALUE;

        for(int i= 1; i <= k; i++){
            if(n - i < 0)
                break;
            int value = frog_jump(arr, n-i, k);
            ans = Math.min(ans,Math.abs(arr[n] - arr[n-i]) + value);
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
        int k = scn.nextInt();

        int[]arr = new int[n];
        for(int i= 0;i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(frog_jump(arr,n-1,k));

    }
}
// n = 10 
// k = 4
// arr = 40 10 20 70 80 10 20 70 80 60