import java.util.*;
public class subarraySum_divisibleByk {
	 public static int subarraysDivByK(int[] arr, int k) {
        int count = 0;
        int n = arr.length;  
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum % k == 0)
                    count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        // Your Code Here
		Scanner scn= new Scanner(System.in);

		int t = scn.nextInt();
		while(t > 0){
			int n = scn.nextInt();
			int[]arr = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = scn.nextInt();
			}
			int k = scn.nextInt();

			System.out.print(subarraysDivByK(arr,k));
			t--;
		}
    }
}






























