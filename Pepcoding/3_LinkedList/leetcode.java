public class leetcode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // leetcode 876 (middle of the linkedlist)
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // leetcode 19 (19. Remove Nth Node From End of List)
    public ListNode removeNthNode(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;

        ListNode fast = head;
        ListNode slow = head;

        while (n-- > 0)
            fast = fast.next;

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode node = slow.next;
        slow.next = slow.next.next;
        node.next = null;
        return head;
    }
}
