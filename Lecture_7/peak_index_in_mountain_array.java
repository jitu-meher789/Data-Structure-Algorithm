// leetcode 852
// find peak index in mountain array
import java.util.*;
class peak_index_in_mountain_array {
    public static int peakIndex(int[]arr, int n){

        int si = 0, ei = n - 1;
        int ans = -1;
        while (si <= ei){
            int mid = (si + ei) / 2;
            if(mid + 1 == n || arr[mid] >= arr[mid + 1]){
                ans = mid;
                ei = mid - 1;
            }else{
                si = mid + 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(peakIndex(arr,n));
        sc.close();

    }
}
