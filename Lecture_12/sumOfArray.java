import java.util.Scanner;

public class sumOfArray {
    public static int ArraySum(int[]arr,int i,int n){

        if(i == n){
            return 0;
        }
        int sum = arr[i] + ArraySum(arr, i+1, n);
        return sum;
    }

    public static int ArraySum2(int[]arr,int n){

        if(n < 0){
            return 0;
        }
        int sum = arr[n] + ArraySum2(arr,n-1);
        return sum;
    }
    

    public static int ArraySum3(int[]arr,int i, int n){

        if(i == n-1){
            return arr[n-1];
        }
        int sum = arr[i] + ArraySum3(arr,i+1,n);
        return sum;
    }
    

    public static int ArraySum4(int[]arr,int n){

        if(n == 0){
            return arr[0];
        }
        int sum = arr[n] + ArraySum4(arr,n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(ArraySum(arr,0,n));

        System.out.print(ArraySum2(arr,n-1));

        System.out.print(ArraySum3(arr,0,n));

        System.out.print(ArraySum4(arr,n-1));


    }   
}
