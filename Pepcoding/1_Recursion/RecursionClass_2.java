import java.util.*;
import java.util.Scanner;
public class RecursionClass_2 {
    /*public static int recursionTree(int n){
        if(n <= 1){
            System.out.println("Base " + n);
            return n + 1;
        }

        int count = 0;
        
        System.out.println("Pre: " + n);
        count += recursionTree(n - 1);

        System.out.println("In: " + n);
        count += recursionTree(n - 2);

        System.out.println("Post: " + n);

        return count + 3;
    }*/

    public static int recursionTree2(int n){
        if(n <= 1){
            System.out.println("Base " + n);
            return n + 1;
        }

        int count = 0;
        
        System.out.println("Pre: " + n);
        count += recursionTree2(n - 1);

        System.out.println("In1: " + n);
        count += recursionTree2(n - 2);

        System.out.println("In2: " + n);
        count += recursionTree2(n - 3);

        System.out.println("Post: " + n);

        return count + 3;
    }

    public static void printArrayIncreasingly(int[]arr, int idx){
        if(idx == arr.length)
            return;

        System.out.print(arr[idx] + " ");
        printArrayIncreasingly(arr, idx+1);
    }
    public static void printArrayDecreasingly(int[]arr, int n){
        if(n < 0)
            return;
        
        System.out.print(arr[n] + " ");
        printArrayDecreasingly(arr, n-1);
    }

    public static int Getmaximum(int[]arr,int idx){
        if(idx == arr.length)
            return -(int)1e9;
        
       
        int recMax = Getmaximum(arr, idx + 1);
        return Math.max(arr[idx],recMax);


    }


    public static int Getminimum(int[]arr,int idx){
        if(idx == arr.length)
            return (int)1e9;
        
        int recMin = Getminimum(arr, idx + 1);
        return Math.min(arr[idx],recMin);
    }
    public static boolean find(int[]arr,int idx,int t){
        if(idx == arr.length){
            return false;
        }

        if(arr[idx] == t)
            return true;
        
        return find(arr, idx + 1, t);
    }

    public static boolean find2(int[]arr,int idx,int t){
        if(idx == arr.length){
            return false;
        }
        boolean recAns = find(arr, idx + 1, t);
        if(recAns)
           return true;

        return arr[idx] == t;
    }

    public static int firstIdx(int[]arr,int idx, int t){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == t){
            return idx;
        }
        return firstIdx(arr, idx + 1, t);
    }

    public static int lastIdx(int[]arr,int idx, int t){
        if(idx == arr.length){
            return -1;
        }
        int recAns = lastIdx(arr, idx + 1, t);
        if(recAns != -1)
            return recAns;
        
        return arr[idx]==t ? idx : -1;
        
    }
    public static int[] AllIndices(int[]arr, int idx, int data, int count){
        if(idx == arr.length){
            return new int[count];
        }

        if(arr[idx] == data){
            count++;
        }
        int[] recAns = AllIndices(arr, idx + 1, data, count);
        if(arr[idx] == data){
            recAns[count-1] = idx;
        }
        return recAns;
    }
    public static void main(String[] args) {
    
        int[]arr = {57,3,6,2,98,43,2,2,2,2,2,12,34,2};
        System.out.println(Getmaximum(arr,0));
        System.out.println(Getminimum(arr,0));
        System.out.println(find(arr, 0, 2));
        System.out.println(firstIdx(arr, 0, 2));
        System.out.println(lastIdx(arr, arr.length-1, 2));

        int[]ans = AllIndices(arr,0,2,0);
        for(int ele : ans)
            System.out.print(ele + " ");
    }
}
