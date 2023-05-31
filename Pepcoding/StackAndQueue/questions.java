import java.util.*;
import java.util.LinkedList;
import java.util.Arrays;
public class questions {



    // leetcode 20
    public static boolean isValid(String s) {
        LinkedList<Character> st = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.addFirst(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.size() == 0)
                    return false;
                else if (ch == ')' && st.getFirst() != '(')
                    return false;
                else if (ch == '}' && st.getFirst() != '{')
                    return false;
                else if (ch == ']' && st.getFirst() != '[')
                    return false;
                else
                    st.removeFirst();
            }
        }
        return st.size() == 0;
    }





    // balanced bracket
    public static boolean duplicateParanthesis(String str) {
		LinkedList<Character> st = new LinkedList<>();

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			boolean isLoopRun = false;
			while(st.size() != 0 && ch == ')' && st.getFirst() != '('){
				isLoopRun = true;
				st.removeFirst();
			}

			if(!isLoopRun && ch == ')') {
				return true;
			}
			else if(isLoopRun){
				st.removeFirst();
			}else{
				st.addFirst(ch);
			}
		}
		return false;
	}

    







    public static int[] getNextGreaterElements(int[]arr) {
        LinkedList<Integer> st = new LinkedList<>();
        int n = arr.length;
        int[]ans  = new int[n];
        Arrays.fill(ans, -1);

        for(int i = 0; i < n; i++) {
            while(st.size() != 0 && arr[st.getFirst()] < arr[i]) 
                ans[st.removeFirst()] = arr[i];
            
            st.push(i);
        }
        return ans;
    }








    // merge intervals
    public static void mergeIntervals(int[][]arr) {
        Arrays.sort(arr, (a,b) -> {
            return a[0] - b[0];
        });

        LinkedList<int[]> st = new LinkedList<>();

        for(int[] a : arr) {
            int minStartTime = a[0];
            int maxEndTime = a[1];

            while(st.size() != 0 && a[0] <= st.getFirst()[1]) {
                minStartTime = st.getFirst()[0];
                maxEndTime = Math.max(maxEndTime, st.getFirst()[1]);
                st.removeFirst();
            }
            st.addFirst(new int[] {minStartTime, maxEndTime});
        }

        while(st.size() != 0) {
            int[]a = st.removeLast();
            System.out.println(a[0] + " " + a[1]);
        }









        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) {
        // int[] arr = {2,5,9,3,1,12,6,8,7};
        // int[] ans = getNextGreaterElements(arr);

        // for(int ele : ans)
        //     System.out.println(ele);
        int[][]arr = {{1,8}, {5,12},  {14,19}, {22,28}, {25,27},  {27,30}};
        int[][]arr2 = {{1,3},{2,6},{8,10},{15,18}};
        mergeIntervals(arr2);
    }
}