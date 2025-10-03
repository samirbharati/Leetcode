class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode prevslow = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prevslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prevslow.next = slow.next;
        slow = null;

        return head;
    }
}
