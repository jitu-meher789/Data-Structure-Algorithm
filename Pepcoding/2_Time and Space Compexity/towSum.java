import java.util.Arrays;

public class towSum {
    public static void swap(int[]arr, int si, int ei){
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }
    public static int partition_over_pivot(int[]arr, int si, int ei, int pidx){
        swap(arr,ei, pidx);

        int p = si - 1, itr = si;
        while(itr <= ei){
            if(arr[itr] <= arr[ei]){
                swap(arr, ++p, itr);
            }
            itr++;
        }
        return p;

    }
    public static void quick_sort(int[]arr, int si, int ei){
        if(si >= ei)
            return;
        int pidx = ei;
        int p = partition_over_pivot(arr, si, ei, pidx);

        quick_sort(arr, si, p-1);
        quick_sort(arr, p+1, ei);
    }
    public static void Two_Sum(int[]arr, int target){
        int n = arr.length;
        quick_sort(arr, 0,arr.length - 1);
        // Arrays.sort(arr);
        int si = 0, ei = n - 1;
        while(si < ei){
            int sum = arr[si] + arr[ei];
            if(sum == target)
                System.out.println(arr[si++] + " " + arr[ei--]);
            else if(sum < target)
                si++;
            else
                ei--;
        }

    }
    public static void main(String[] args) {
        int[] arr = { -2, -3,4, 7, 5, 8, 15, 3, 2, 9,0, 10, 19 };
        Two_Sum(arr, 7);
    }
}
