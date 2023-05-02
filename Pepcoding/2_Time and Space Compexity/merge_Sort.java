public class merge_Sort {

    public static int[] mergeTwoSortedArrsy(int[]A, int[]B){
        if(A.length == 0 || B.length == 0)
            return A.length == 0 ? B : A;

        int i = 0, j = 0, k = 0;
        int n = A.length, m = B.length;
        int len = n + m;
        int[]ans = new int[len];

        while(i < n && j < m){
            if(A[i] < B[j]){
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
    public static int[] mergeSort(int[]arr, int si, int ei){
        if(si == ei)
            return new int[] {arr[si]};

        int mid = (si + ei) / 2;
        int[]left = mergeSort(arr, si, mid);
        int[]right = mergeSort(arr, mid+ 1, ei);

        return mergeTwoSortedArrsy(left, right);
    }
    public static void main(String[] args) {
        int[]arr = {-12,2,7,4,34,23,0,1,-1,-50,16,23,7,4,2,3};

        int[]ans = mergeSort(arr, 0, arr.length-1);
        
        for(int ele : ans)
            System.out.print(ele + " ");
    }   
}
