public class leetcode {
    
public static boolean isBalanced(String str) {
    int countR = 0;
    int countL = 0;

    int i = 0;
    while(i < str.length()){
        if(str.charAt(i) == 'R'){
            countR++;
        }
        if(str.charAt(i) == 'L'){
            countL++;
        }
    }
    if(countR == countL){
        return true;
    }else{
        return false;
    }
}
    public static int balancedStringSplit(String s) {
        int count = 0;
        int i = 0;
        int len = s.length();
        while(i < len-1){
           int j = i+1;
           while(j < len){
               if(isBalanced(s.substring(i,j+1))){
                   count++;
                   i = j;
                //    break;
               }else{
                   j++;
               }
           }
           i++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
}
