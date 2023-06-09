import java.util.LinkedList;

public class client {
    public static void stackTest() throws Exception {
        stack st = new stack(10);
                for(int i = 0; i < 10; i++) {
            st.push(i * 10);
        }
        System.out.println(st);
        while(st.size() != 0){
            System.out.println(st.pop());
        }

    }
    



    

    public static void queueTest1() throws Exception {
        queue que = new queue(10);
        
        for(int i = 0; i < 10; i++){
            que.add(i * 10);
        }

        while(que.size() != 0) {
            System.out.println(que.remove());
        }
    }







    public static void stackBehaviourUsingLL() {
        LinkedList<Integer> st  = new LinkedList<>();

        for(int i = 0; i <= 10; i++) {
            st.addFirst(i * 10);
        }

        while(st.size() != 0) {
            System.out.println(st.removeFirst());
        }
    }
    public static void dynamicStack () throws Exception {
        dynamicStack st = new dynamicStack(10);

        for(int i = 1; i <= 100; i++) {
            st.push(i * 10);
        }

        System.out.println(st);

        // while(st.size() != 5) {
        //     System.out.println(st.pop());
        // }
    }





    public static void DynamicQueue() throws Exception {
        dynamicQueue que = new dynamicQueue(10);

        for(int i = 1; i <= 100; i++) {
            que.add(i * 10);
        }

        System.out.println(que);
    }




    public static void main(String[] args) throws Exception {
        dynamicStack();
    }
}
