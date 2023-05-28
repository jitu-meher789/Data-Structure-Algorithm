package adaptors;

import java.util.LinkedList;

class queueUsingStackPushEfficient {

    LinkedList<Integer> st = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    int peekEle = 0;

    public queueUsingStackPushEfficient() {

    }

    // o(1)
    public void push(int x) {
        if (st.size() == 0) {
            peekEle = x;
        }
        st.addFirst(x);
    }

    private void transfer(LinkedList<Integer> st1, LinkedList<Integer> st2) {

        while (st1.size() != 0) {
            st2.addFirst(st1.removeFirst());
        }
    }
    // o(n)
    public int pop() {
        transfer(st, temp);
        int rEle = temp.removeFirst();

        while (temp.size() != 0) {
            this.push(temp.removeFirst());
        }
        return rEle;
    }

    public int peek() {
        return peekEle;
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