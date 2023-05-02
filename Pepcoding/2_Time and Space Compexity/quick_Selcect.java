import javax.lang.model.util.ElementScanner14;

public class quick_Selcect {
    public static void swap(int[]arr, int si, int ei){
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }
    public static int segregate(int[]arr, int si, int ei, int pidx){
        swap(arr,ei,pidx);

        int p = si - 1, itr = si;

        while(itr <= ei){
            if(arr[itr] <= arr[ei]){
                swap(arr, ++p, itr);
            }
            itr++;
        }
        return p;
    }
    public static void Quick_Select(int[]arr, int si, int ei, int idx){


        int pidx = ei;
        int p = segregate(arr, si, ei, pidx);

        if(p == idx)
            return;
        else if(idx > p)
            Quick_Select(arr, p + 1, ei,idx);
        else 
            Quick_Select(arr, si, p-1, idx);

    }
    public static int Quick_Select(int[]arr, int k){
        int idx = arr.length - k;
        Quick_Select(arr, 0,arr.length-1,idx);

        return arr[idx];
    }
    public static void main(String[] args) {
        int[]arr = {-12,2,7,4,34,23,0,1,-1,-50,16,23,7,4,2,3};
        System.out.println(Quick_Select(arr, 3));
    }
}
