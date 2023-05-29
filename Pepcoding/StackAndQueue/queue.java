public class queue {
    private int[]arr;
    private int size;
    private int maxSize;
    private int front;
    private int back;


    protected void initialize(int len){
        this.arr = new int[len];
        this.maxSize = len;
        this.size = 0;
        this.front = 0;
        this.back = this.size;
    }
    public queue(){
        initialize(5);
    }
    public queue(int len) {
        initialize(len);
    }




    // to string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0; i < this.size; i++) {
            int idx = (i + front) % this.maxSize;
            sb.append(this.arr[idx]);

            if(i != this.size - 1) {
                sb.append(" ,");
            }
        }

        sb.append("]");
        return sb.toString();
    }




    // exception
    public void queueIsEmptyException() throws Exception{
        if(this.size == 0){
            throw new Exception("queueIsEmptyException-1");
        }
    }
    public void queueIsOverflowException() throws Exception {
        if(this.size == this.maxSize){
            throw new Exception("queueIsOverflowException-1");
        }
    }




    public boolean isEmpty() {
        return this.size == 0;
    }
    public int size() {
        return this.size;
    }

    public int maxSize() {
        return this.maxSize;
    }



    public int peak() throws Exception {
        queueIsEmptyException();
        return this.arr[this.front];
    }



    private void add_(int data) {
        this.arr[this.back] = data;
        this.back = (this.back + 1) % this.maxSize;
        this.size++;
    }
    public void add(int data) throws Exception {
        queueIsOverflowException();
        add_(data);
    }



    private int remove_(){
        int rv = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front + 1) % this.maxSize;
        this.size--;
        return rv;
    }
    public int remove() throws Exception {
        queueIsEmptyException();
        return remove_();

    }
}
