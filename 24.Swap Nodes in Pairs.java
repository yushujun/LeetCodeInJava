no-recursion:
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode current = new ListNode(0);
        current.next = head;
        ListNode dummy = current;
        while(dummy.next != null && dummy.next.next != null){
            ListNode temp = dummy.next.next;
            dummy.next.next = temp.next;
            temp.next = dummy.next;
            dummy.next = temp;
            dummy = dummy.next.next;
        }
        return current.next;
    }
}
time complexity:O(n)
space complexity:O(1)

recursion:
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
time complexity:O(n)
space complexity:O(1)