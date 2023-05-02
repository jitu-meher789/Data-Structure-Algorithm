public class quick_sort {
    public static void swap(int[]arr, int si, int ei){
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }
    public static int partition_Over_pivot(int[]arr,int si, int ei, int pidx) {
        swap(arr, pidx, ei);
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
        int p = partition_Over_pivot(arr, si, ei, pidx);

        quick_sort(arr, si, p-1);
        quick_sort(arr, p+1,ei);

    }
     public static void main(String[] args) {
            int[]arr = {9,-13,0,17,2,5,7,18,81,19};
            quick_sort(arr, 0, arr.length-1);

            for(int ele : arr)
                System.out.print(ele + " ");
     }
}
