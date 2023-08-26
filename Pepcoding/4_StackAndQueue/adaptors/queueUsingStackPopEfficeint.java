package adaptors;

import java.util.LinkedList;

class queueUsingStackPopEfficeint {

    LinkedList<Integer> st = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    int peekEle = 0;

    public queueUsingStackPopEfficeint() {

    }



    private void transfer(LinkedList<Integer> st1, LinkedList<Integer> st2) {
        while (st1.size() != 0) {
            st2.addFirst(st1.removeFirst());
        }
    }
    // o(n)
    public void push(int x) {
       transfer(st,temp);
       st.addFirst(x);
       transfer(temp,st);
    }


    
    
    // o(1)
    public int pop() {
        return st.removeFirst();   
    }

    public int peek() {
        return st.getFirst();
    }

    public boolean empty() {
        return st.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */