import java.util.*;
public class Merge_Sort {
    public static int[] mergeTwoSortedArray(int[]A, int []B){
        // if one array out of two becomes empty then return the array which
        // has not empty
        if(A.length == 0 || B.length == 0){
            return A.length == 0 ? B : A;
        }

        
        int i = 0, j = 0, k = 0;
        int n = A.length, m = B.length;
        int len = n + m;
        int[]ans = new int[len];

        while(i < n && j < m){
            if(A[i] <= B[j]){
                ans[k++] = A[i++];
            }else{
                ans[k++] = B[j++];
            }
        }

        while(i < n){
            ans[k++] = A[i++];
        }
        while(j < m){
            ans[k++] = B[j++];
        }
       
        return ans;
    }


    public static int[] mergesort(int[]arr ,int si, int ei){
        if(si >= ei){
            return new int[] {arr[si]};
        }

        int mid = (si + ei) / 2;

        int[]left = mergesort(arr, si, mid);
        int[]right = mergesort(arr, mid+1, ei);

        return mergeTwoSortedArray(left,right);
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
    
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        // for(int ele : arr)
        //     System.out.println(ele);
        arr = mergesort(arr,0,n-1);
    
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");;
        }
    }

}
