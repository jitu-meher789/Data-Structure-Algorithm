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




    // leetcode 83 ( remove duplicates from a linked list)
    public ListNode removeDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;    
        }

        ListNode dummy = new ListNode(-101); // dummy node
        ListNode dp = dummy;

        ListNode curr = head;

        while(curr != null) {
            while(curr != null && dp.val == curr.val) {
                ListNode forw =  curr.next;
                curr.next = null; 
                curr = forw;
            }
            dp.next = curr;
            if(curr != null) {
                curr = curr.next;
                dp = dp.next;
            }
        }
        return dummy.next;
    }










    // leetcode 82 (remove duplicates from sorted linkedlist II)
    public ListNode removeDuplicatesII(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode dummy  = new ListNode(-1);
        ListNode itr = dummy;
        itr.next = head;
        ListNode curr = head.next;

        while(curr != null) {
            boolean isLoopRun = false;
            while(curr != null && itr.next.val == curr.val) {
                isLoopRun = true;
                curr = curr.next;
            }

            if(isLoopRun) {
                itr.next = curr;
            }else{
                itr = itr.next;
            }

            if(curr != null){
                curr = curr.next;
            }
        }
        return dummy.next;
    }







    // leetcode 206 (reverse the linkedlist)
    public ListNode reverseLinkedList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode forW = curr.next;

            curr.next = prev;
            prev = curr;

            curr = forW;
        }
        return prev;
    }









    // pepcoding portal questions
    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode forW = curr.next;

            curr.next = prev;
            prev = curr;

            curr = forW;
        }
        return prev;
    }
    public ListNode addTowNumbers(ListNode l1, ListNode l2) {

        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummy = new ListNode(-1);

        ListNode c1 = l1;
        ListNode c2 = l2;
        int carry = 0;
        ListNode prev = dummy;

        while(c1 != null || c2 != null || carry != 0) {
            int sum = carry + (c1 != null ? c1.val : 0) + (c2 != null ? c2.val : 0);

            carry = sum / 10;

            sum = sum % 10;

            prev.next = new ListNode(sum);

            prev = prev.next;

            if(c1 != null)  c1 = c1.next;
            if(c2 != null)  c2 = c2.next;
            
        }

        ListNode head = dummy.next;

        head = reverse(head);

        l1 = reverse(l1);
        l2 = reverse(l2);

        return head;
    }








    // leetcode - 21 ( merge two sorted list )

    public ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {

        ListNode c1 = l1, c2 = l2;
        ListNode dummy = new ListNode(-101);

        ListNode itr = dummy;

        while(c1 != null && c2 != null) {
            if(c1.val <= c2.val) {
                itr.next = c1;
                c1 = c1.next;
            }else{
                itr.next = c2;
                c2 = c2.next;
            }
            itr = itr.next;
        }

        itr.next = c1 != null ? c1 : c2;
        return dummy.next;
    }








    // leetcode - 160  (intersection point of two linkedlists)
    public int LLofLinkedList(ListNode head){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode curr = head;

        while(curr != null){
            curr = curr.next;
            count++;
        }
        return count;
    }
    public ListNode intersectionOFTowLinkedList(ListNode l1, ListNode l2) {

        int lengOfL1 = LLofLinkedList(l1);
        int lengOfL2 = LLofLinkedList(l2);

        ListNode biggerListHead = lengOfL1 > lengOfL2 ? l1 : l2;
        ListNode smallerListHead = lengOfL1 < lengOfL2 ? l1 : l2;

        int diff = Math.abs(lengOfL1 - lengOfL2);

        while(diff-- > 0){
            biggerListHead = biggerListHead.next;
        }

        while(biggerListHead != smallerListHead) {
            biggerListHead = biggerListHead.next;
            smallerListHead = smallerListHead.next;
        }


        return smallerListHead != null ? smallerListHead : null;

    }
}
