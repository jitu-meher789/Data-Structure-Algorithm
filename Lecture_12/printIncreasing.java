import java.util.*;

public class printIncreasing {
    //print increasing with one extra value
    public static void Increasing(int a,int b){
        
        if(a >= b)
            return;

        System.out.println(a);
        Increasing(a + 1,b);
    }

    // print increasing without extra value
    public static void Increasing2(int n){
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();

        Increasing(1,b);
    }   
}
