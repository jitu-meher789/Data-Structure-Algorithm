package adaptors;
import java.util.LinkedList;

public class stackUsingJavaLL {
    
    public static class stack {
        private LinkedList<Integer> ll = new LinkedList<>();

        public int size() {
            return this.ll.size();
        }

        public boolean isEmpty() {
            // return this.ll.size() == 0;
            return this.isEmpty();
        }       

        public void add(int data) {
            ll.addFirst(data);
        }

        public int top() {
            return ll.getFirst();
        }

        public int pop() {
            return ll.removeFirst();
        }
    }

    public static void main(String[] args) {
        
    }
}
