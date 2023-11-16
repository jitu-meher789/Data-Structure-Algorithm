import java.util.*;
public class TAS001 {
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort01(int[]arr , int n) {
        int itr = 0;
        int sp = -1;
        while(itr < n){
            if(arr[itr] == 0){
                swap(arr, itr,++sp);
            }
            itr++;
        }
        
        for(int ele : arr){
            System.out.println(ele +  " ");
        }
    }






    public static void sort012(int [] arr, int n){

        int p1 = -1, itr = 0, p2 = n-1;

        while(itr <= p2){
            if(arr[itr] == 0){
                swap(arr, itr++, ++p1);
            }else if(arr[itr] == 2){
                swap(arr, itr,p2--);
            }else{
                itr++;
            }
        }

        for(int ele : arr){
            System.out.println(ele +  " ");
        }
    }



    public static void mergeTwo_sortedArray(int[]a1, int[]a2, int n, int m){
        int i = 0,  j = 0, k = 0;
        int len = n + m;
        int[]ans = new int[len];

        while(i < n && j < m){
            if(a1[i] <= a2[j]) {
                ans[k++] = a1[i++];
            }else{
                ans[k++] = a2[j++];
            }
        }

        while(i < n){
            ans[k++] = a1[i++];
        }
        while(j < m) {
            ans[k++] = a2[j++];
        }
        for(int ele : ans)
            System.out.print(ele +  " ");
    }



    public static void bubble_Sort(int[]arr){
        int n = arr.length;

        for(int i =0; i < n - 1; i++){
            for(int j= 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }

        for(int ele : arr)
            System.out.print(ele + " ");
    }


    public static void bubble_Sort_2(int[]arr){
        int n = arr.length;
        for(int i =0; i < n - 1; i++){
        boolean flag= true;
            for(int j= 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag = false;
                }    
            }
            if(flag)
                break;
        }

        for(int ele : arr)
            System.out.print(ele + " ");
    }











    public static void selection_sort(int[]arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[i])
                    swap(arr,i,j);
            }
        }
    }






    public static void insertion_sort(int[]arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                }    
            }
        }
    }









    public static int partition_An_Array(int[]arr, int data){
        int n = arr.length;
        int p = -1, itr  = 0;
        while(itr < n){
            if(arr[itr] <= data){
                swap(arr, ++p,itr);
            }
            itr++;
        }
        return p;
    }







    public static int partition_Over_Pivot(int[]arr, int pivotIdx){
        int n = arr.length;
        swap(arr, pivotIdx, n-1);

        int p = -1, itr = 0, li = n-1;
        while(itr < li){
            if(arr[itr] <= arr[li])
                swap(arr, itr, ++p);
            itr++;
        }
        swap(arr, li, ++p);
        return p;
    }






    public static void main(String[] args) {
        int[]arr = {13,7,3,5,19,9,11,3};
        System.out.println(partition_Over_Pivot(arr,5));   

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}