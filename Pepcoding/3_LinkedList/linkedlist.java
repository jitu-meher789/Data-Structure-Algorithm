public class linkedlist {
    private class Node {
        int data = 0;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    // size of the linked list
    public int size() {
        return this.size;
    }

    // check linkedList is empty ?
    public boolean isEmpty() {
        return this.size == 0;
    }

    // display the linkedlist
    @Override
    public String toString(){
        Node curr = this.head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while(curr != null) {
            sb.append(curr.data);
            if(curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }

    

    
    //=============== get section =================//
    // get first
    private Node getFirstNode() {
        return this.head;
    }

    public int getFirst() {
        if (this.size == 0) {
            return -1;
        }
        return getFirstNode().data;
    }

    // get last
    private Node getLastNode() {
        return this.tail;
    }

    public int getLast() {
        if (this.size == 0) {
            return -1;
        }
        return getLastNode().data;
    }

    // get at
    private Node getNodeAt(int idx) {
        Node curr = this.head;

        while (idx-- > 0) {
            curr = curr.next;
        }
        return curr;
    }

    public int getAt(int idx) {
        if (idx < 0 || idx >= this.size) {
            return -1;
        }
        return getNodeAt(idx).data;
    }






    






    // ===================== add section =====================//
      // add first
      public void addFirstNode(Node node) {
        if (this.size == 0) {
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        addFirstNode(node);
    }



    // add last
    public void addLastNode(Node node) {
        if (this.size == 0) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        addLastNode(node);
    }




    // add at index
    private void addNodeAt(Node node, int idx) {
        if (idx == 0) {
            addFirstNode(node);
        } else if (idx == this.size - 1) {
            addLastNode(node);
        } else {
            Node prevNode = getNodeAt(idx - 1);
            Node forwNode = prevNode.next;

            prevNode.next = node;
            node.next = forwNode;
            this.size++;
        }
    }
    public void addAt(int data, int idx) {
        if (idx < 0 || idx > this.size) {
            return;
        }

        Node node = new Node(data);
        addNodeAt(node, idx);
    }













// =================== remove section =================//
    // remove first node
    public Node removeFirstNode() {

        Node node = this.head;

        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
            node.next = null;
        }
        this.size--;
        return node;
    }
    public int removeFirst() {
        if (this.size == 0) {
            return -1;
        }
        Node node = removeFirstNode();
        return node.data;
    }


    // remove last node
    private Node removeLastNode() {
        Node node = this.tail;

        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            Node secondLast = getNodeAt(this.size - 2);
            secondLast.next = this.tail;
            tail = secondLast;
        }
        this.size--;
        return node;
    }
    public int removeLast() {
        if (this.size == 0) {
            return -1;
        }

        return removeLastNode().data;
    }



    // remove node At
    private Node removeNodeAt(int idx) {
        if (idx == 0)
            return removeFirstNode();
        else if (idx == this.size - 1)
            return removeLastNode();
        else {
            Node prevNode = getNodeAt(idx - 1);
            Node node = prevNode.next;
            Node forwNode = node.next;

            node.next = null;
            prevNode.next = forwNode;
            this.size--;

            return node;
        }

    }
    public int removeAt(int idx) {
        if (idx < 0 || idx >= this.size)
            return -1;

        return removeNodeAt(idx).data;
    }









    // segregate odd eve in likedlist
    public void oddEven() {
        if(this.size == 0 || this.size == 1){
            return;
        }

        Node odd = new Node(-1); // dummy node
        Node op = odd;

        Node even = new Node(-1); // dummy node
        Node ep = even;

        Node curr = this.head;


        while(curr != null){
            if(curr.data % 2 == 0){
                ep.next = curr;
                ep = ep.next;
            }else{
                op.next = curr;
                op = op.next;
            }
            curr = curr.next;

            op.next = even.next;
            ep.next = null;

            this.head = odd.next;

            if(even.next != null){
                this.tail = ep;
            }else{
                this.tail = op;
            }
        }
    }
}
