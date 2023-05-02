import java.util.Scanner;

public class printDecreasing {
    public static void PrintDecreasing(int n){
        
        if(n < 0)
            return;

        System.out.print(n + " ");
        PrintDecreasing(n-1);

    }

    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        PrintDecreasing(n);
        
    }
}
