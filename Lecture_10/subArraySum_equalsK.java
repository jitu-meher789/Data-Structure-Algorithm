import java.util.Scanner;

public class subArraySum_equalsK {
    public static void subArraySum(int[]arr,int x){
    
        int count = 0;
        int n = arr.length;  
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == x)
                    count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        int n = scn.nextInt();
        
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

        subArraySum(arr,x);
        
    }
}
