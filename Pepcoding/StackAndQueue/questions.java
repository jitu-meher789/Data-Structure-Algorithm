import java.util.*;
import java.util.LinkedList;
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



    
    public static void main(String[] args) {

    }
}