
import java.util.*;
public class PrefixArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int sum = 0;
        int[]pre = new int[n + 1];
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            pre[i] = sum;
        }

        int q = scn.nextInt();
        while(q > 0){
            int l = scn.nextInt();
            int r = scn.nextInt();
            if(l > 0){
                System.out.println(pre[r]-pre[l-1]);
            }else{
                System.out.println(pre[r]);
            }
            q--;
        }
        scn.close();
    }   
}
