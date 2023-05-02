import java.util.*;
class linear_keyboard {
    public static Scanner scn  = new Scanner(System.in);

    public static void Linear_Keyboard(){
        String str = scn.nextLine();
        String word = scn.nextLine();

        int[]mapping = new int[256];

        for(int i = 0; i < str.length(); i++){
            mapping[str.charAt(i)] = i+1;
        }

        int ans = 0;
        for(int i = 0; i < word.length() - 1; i++){
            ans =  ans + Math.abs(mapping[word.charAt(i)] - mapping[word.charAt(i + 1)]);
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        // int t = scn.nextInt();

        // while(t > 0){
            String str = scn.nextLine();
            String word = scn.nextLine();
    
            int[]mapping = new int[256];
    
            for(int i = 0; i < str.length(); i++){
                mapping[str.charAt(i)] = i+1;
            }
    
            int ans = 0;
            for(int i = 0; i < word.length() - 1; i++){
                ans =  ans + Math.abs(mapping[word.charAt(i)] - mapping[word.charAt(i + 1)]);
            }
            System.out.println(ans);
        //     t--;
        // }

    }
}
