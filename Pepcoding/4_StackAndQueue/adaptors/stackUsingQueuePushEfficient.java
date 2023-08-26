package adaptors;
import java.util.LinkedList;


class stackUsingQueuePushEfficient {
    LinkedList<Integer> queue = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    int topEle = 0;

    public stackUsingQueuePushEfficient() {
        
    }
    

    //o(1)
    public void push(int x) {
        topEle = x;
        queue.addLast(x);
    }
  


    // O(n)
    public int pop() {
        while(queue.size() > 1) 
            temp.addLast(queue.removeFirst());

        int rEle = queue.removeFirst();
        while(temp.size() != 0){
            this.push(temp.removeFirst());
        }
        return rEle;
    }
    
    public int top() {
        return topEle;
    }
    
    public boolean empty() {
        return queue.size() == 0;
    }   
}
