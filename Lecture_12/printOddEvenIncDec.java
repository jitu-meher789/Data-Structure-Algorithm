import java.util.*;
public class printOddEvenIncDec {

    public static void PrintIncreasingDecreasingOddEven(int n){
        
        if(n < 0){
            return;
        }


        if(n % 2 == 0){
            System.out.println("even --> " + n);
        }
        PrintIncreasingDecreasingOddEven(n-1);

        if(n % 2 != 0){
            System.out.println( "odd --> " + n);
        }
    }
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        PrintIncreasingDecreasingOddEven(n);
    }
}
