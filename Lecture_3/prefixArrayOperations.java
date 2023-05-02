
import java.util.*;
public class prefixArrayOperations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        
        // take input for original array
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        

        // for queries build a prefix aray
        // build a prefix array of one element extra
        int[]pre = new int[n+ 1];
        int q = scn.nextInt();
    
        while(q-- > 0){
            int l = scn.nextInt();
            int r = scn.nextInt();
            int z = scn.nextInt();
            //build the prefix array based on the operations
            pre[l] = pre[l] + z;
            pre[r+1] = pre[r+1] - z;
        }
    
    
        //take the prefix sum 0f the prefix array
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + pre[i];
            pre[i] = sum;
        }
        

        // add the original array
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] + pre[i];
        }


        //print the array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }
}
