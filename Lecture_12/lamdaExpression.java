import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class lamdaExpression {
    public static void test1(){
        Integer[]arr = {2,5,1,-1,0,5,3,2,5,-4,2};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list);
    
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
    public static void test2(){
        Integer[]arr = {2,5,1,-1,0,5,3,2,5,-4,2};


        Arrays.sort(arr,(a,b) ->{
            return b - a;
        });

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void test3(){

        String [] strArray = {"bat","apple","batman"};

        Arrays.sort(strArray,(a,b) ->{
            return b - a;
        });

        for(int i = 0; i < strArray.length; i++){
            System.out.print(strArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        test3();
    }
}
