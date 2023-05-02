import java.util.*;
class binary_Search {
    public static void Binary_Search(int[]arr, int n, int key){

        int si = 0, ei = n - 1;

        while(si <= ei){
            int mid = (si + ei) / 2;
            if(arr[mid] == key){
                System.out.println(mid);
                break;
            }else if(arr[mid ]< key){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        Binary_Search(arr,n,key);
    }    
}
