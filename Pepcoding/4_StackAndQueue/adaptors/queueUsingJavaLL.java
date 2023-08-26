package adaptors;
import java.util.LinkedList;

public class queueUsingJavaLL {
    public static class queue {
        private LinkedList<Integer> ll = new LinkedList<>();

        public int size() {
            return this.ll.size();
        }

        public boolean isEmpty() {
            // return this.ll.size() == 0;
            return this.isEmpty();
        }       

        public void add(int data) {
            ll.addLast(data);
        }

        public int peek() {
            return ll.getFirst();
        }

        public int remove() {
            return ll.removeFirst();
        }
    }
    public static void main(String[]args) {
        
    }

}
