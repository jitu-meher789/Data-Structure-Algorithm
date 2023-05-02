import java.util.*;

class sumOfArrayEfficient {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int[]arr = new int[n];
    
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int q = scn.nextInt();
        while(q > 0){
            int l = scn.nextInt();
            int r = scn.nextInt();
            int z = scn.nextInt();
            for(int i = l; i <= r; i++){
                arr[i] = arr[i] + z;
            }
            q--;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }
        
}
