// find peak element
// leetcod 162

import java.util.*;
public class peak_element {
    public static int Peak_Element(int[]arr, int n){
        int si = 0, ei = n - 1;

        int ans = 0;
        while(si <= ei){
            int mid = (si + ei) / 2;
            if(arr[mid] >= arr[mid+1]){
                ans = mid;
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
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println( Peak_Element(arr,n));
    }
}
