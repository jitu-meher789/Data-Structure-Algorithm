import java.util.*;
class freq_shifting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int maximum = Integer.MIN_VALUE;    
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            maximum = Math.max(maximum, arr[i]);
            minimum = Math.min(minimum, arr[i]);
        }

       int[]freq = new int[maximum - minimum + 1];

       for(int i = 0; i < n; i++){
            freq[arr[i] - minimum] = freq[arr[i] - minimum] + 1;
       }

       for(int i = 0; i < maximum - minimum + 1; i++){
            if(freq[i] > 0)
            System.out.println("freq of " + (i + minimum) + "--> " + freq[i]);
       }
        scn.close();
    }
}