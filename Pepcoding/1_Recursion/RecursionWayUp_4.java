import java.time.Period;
import java.util.*;

import javax.crypto.KeyAgreement;
public class RecursionWayUp_4 {
    public static int subsequence(String ques,String ans){

        if(ques.length() == 0){
            System.err.println(ans);
            return 1;
        }

        // upar chalte hue ans ko develop karte hue chalenge
        // and jab length 0 hoga ans ko print karenge and return;
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        int count = 0;

        count += subsequence(roq, ans);
        count += subsequence(roq, ans + ch);
        return count;
    }








    public static int subsequence_1(String ques,String ans,ArrayList<String> res){
        if(ques.length() == 0){
            res.add(ans);
            return 1;
        }
        // upar chalte hue ans ko develop karte hue chalenge
        // and jab length 0 hoga ans ko print karenge and return;
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        int count = 0;

        count += subsequence_1(roq, ans, res);
        count += subsequence_1(roq, ans + ch, res);
        return count;
    }






    public static String[] nokiaKeyPad = {".;", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static int keypad(String str,String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return 1;
        }

        char ch = str.charAt(0);
        String word = nokiaKeyPad[ch - '0'];
        int count = 0;

        for(int i = 0; i < word.length(); i++){
           count += keypad(str.substring(1), ans + word.charAt(i));
        }
        return count;
    }








    public static int getStairPaths(int n, String ans){
        if(n <= 0){
            if(n == 0){
                System.out.println(ans);
            }
            return 1;
        }
        int count = 0;
        for(int i = 1; i <= 3 && n - i >= 0; i++){
            count += getStairPaths(n-i, ans + i);
        }
        return count;
    }







    public static int boardPathOnArray(int n, int[]move,String ans){
        
        if(n == 0){
            System.out.println(ans);
            return 1;
        }
    
        int count = 0;
        for(int jump : move){
            if(n - jump >= 0)
              count += boardPathOnArray(n - jump, move, ans + jump);
        }
        return count;
    }
    public static int boardPath(int[] arr, int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump : arr) {
            if (n - jump >= 0)
                count += boardPath(arr, n - jump, ans + jump);
        }

        return count;
    }







    public static int mazePath(int sr,int er, int sc,int ec,String ans){
        if(sr == er && sc == ec){
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        if(sc + 1 <= ec){
            count += mazePath(sr, er, sc+1, ec,ans+"h");
        }
        
        if(sr + 1 <= er && sc + 1 <= ec){
            count += mazePath(sr + 1, er, sc+1, ec,ans+"d");
        }

        if(sr+1 <= er){
            count += mazePath(sr+1, er, sc, ec,ans+"v");
        }
        return count;
    
    }








    
    public static int mazePath_HDV(int sr,int er, int sc,int ec,String ans){
        if(sr == er && sc == ec){
            System.out.println(ans);
            return 1;
        }
        
        int count = 0;
        if(sc + 1 <= ec){
            count += mazePath_HDV(sr, er, sc+1, ec,ans+"h");
        }
        
        if(sr + 1 <= er && sc + 1 <= ec){
            count += mazePath_HDV(sr + 1, er, sc+1, ec,ans+"d");
        }

        if(sr+1 <= er){
            count += mazePath_HDV(sr+1, er, sc, ec,ans+"v");
        }
        return count;
    }









    public static int mazePath_with_jumps(int sr,int er, int sc,int ec,String ans){
        if(sr == er && sc == ec){
            System.out.println(ans);
            return 1;
        }
        
        int count = 0;
        for(int jump = 1; sc + jump <= ec; jump++){
            count += mazePath_with_jumps(sr, er, sc+jump, ec, ans+"h"+jump);
        }

        for(int jump = 1; sc + jump <= ec && sr + jump <= er; jump++){
            count += mazePath_with_jumps(sr+jump, er, sc+jump, ec, ans+"d"+jump);
        }

        for(int jump = 1; sr + jump <= er; jump++){
            count += mazePath_with_jumps(sr+jump, er, sc, ec, ans+"v"+jump);
        }
        return count;
    }






    public static int print_permuatation(String str,String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return 1;
        }
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i + 1);

            count += print_permuatation(ros,ans + ch);
        }
        return count;
    }

    public static int print_permuatation_duplicate(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        char prev = '$';
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != prev){
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                count += print_permuatation(ros,ans + ch);
            }
            prev= str.charAt(i);
        }
        return count;
    }
    public static void print_permuatation_duplicate(String str){
        StringBuilder sb = new StringBuilder();
        int freq[] = new int[26];

        for(int i = 0; i < str.length(); i++){
            freq[(str.charAt(i)) - 'a']++;
        }

        for(int i= 0; i < 26; i++){
            for(int j = 0; j < freq[i]; j++){
                sb.append((char)(i + 'a'));
            }
        }
        System.out.println(print_permuatation_duplicate(sb.toString(),""));
    }









    public static int decodeWays(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        char ch = str.charAt(0);
        if(ch == '0'){
            return 0;
        }
        count += decodeWays(str.substring(1), ans + (char)('a' + ch - '1'));

        if(str.length() > 1){
            int num = (ch - '0') * 10 + (str.charAt(1) - '0');
            if(num  <= 26){
                count += decodeWays(str.substring(2), ans + (char)('a' + num - 1));
            }
        }
        return count;
    }








    //leetcode 46
    public static void permute(int[]nums,int count, List<List<Integer>> res, List<Integer> ans){
        if(count == nums.length){
            List<Integer> base = new ArrayList<>(ans);
            res.add(base);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= -10 && nums[i] <= 10){
                int val = nums[i];
                nums[i] = -11;
                ans.add(val);
                permute(nums,count+1,res,ans);
                ans.remove(ans.size() - 1);
                nums[i] = val;
            }
        }
    }
    public static List<List<Integer>> permute(int[]nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        permute(nums,0,res,ans);
        return res;
    }
    public static void main(String[] args) {
        // System.out.println(subsequence("abc",""));
        // keypad("79", "");
        // System.out.println(getStairPaths(5, ""));
        // int[]arr = {2,5,3,1};
        // System.out.println(boardPathOnArray(10,arr,""));
        // System.out.println(boardPath(arr,10,""));

        // System.out.println(mazePath(0, 2, 0, 2,""));
        // System.out.println(mazePath_with_jumps(0,2,0,2,""));
        // System.out.println(print_permuatation("abc",""));
        print_permuatation_duplicate("abab");
        // System.out.println(decodeWays("112043",""));
        // int nums[] = {1,2,3};
        // System.out.println(permute(nums));

    }
}
