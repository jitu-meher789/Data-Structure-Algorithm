public class client {
    public static void main(String[] args) {

        linkedlist ll = new linkedlist();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        System.out.println(ll.size());
        System.out.println(ll.getAt(2));
        System.out.println(ll.removeLast());
        System.out.println(ll.size());
        System.out.println(ll.getLast());



    }
}
