
package adaptors;
import java.util.LinkedList;


class stackUsingQueuePopEfficient {
    LinkedList<Integer> queue = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    int topEle = 0;

    public stackUsingQueuePopEfficient() {
        
    }
    

    //o(n)
    private void transfer(LinkedList<Integer> queue1, LinkedList<Integer> queue2)  {

        while(queue1.size() != 0) {
            queue2.addLast(queue1.removeFirst());    
        }
    }
    public void push(int x) {
        
        transfer(queue,temp);
        queue.addLast(x);
        transfer(temp,queue);
        
    }
  
    // O(1)
    public int pop() {
       return queue.removeFirst();
    }
    
    public int top() {
        return queue.getFirst();
    }
    
    public boolean empty() {
        return queue.size() == 0;
    }   
}
