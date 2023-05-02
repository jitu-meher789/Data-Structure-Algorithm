import java.util.*;
class freq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int[]freq = new int[9];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0)
            System.out.println("freq of " + i + "--> " + freq[i]);
        }

        scn.close();

    }
}