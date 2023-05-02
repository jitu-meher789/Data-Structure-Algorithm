// 153. Find Minimum in Rotated Sorted Array
// leetcode --->  153
import java.util.*;
class findMinimum_in_rotated_sorted_array {
    public static int findMinimum(int[]arr, int n){

        int si =  0, ei = n - 1;

        int ans = -1;

        while(si <= ei){
            int mid = (si + ei) / 2;
            if(arr[mid] <= arr[n-1]){
                ans = arr[mid];
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int []arr = new int[n];
        for(int  i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(findMinimum(arr,n));
    }
}
