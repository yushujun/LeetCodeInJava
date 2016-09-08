public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0),temp = dummy;
        dummy.next = head;
        while(head != null){
            if(head.val == val) {
                temp.next = temp.next.next;
                head = temp.next;
            } else {
                head = head.next;
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}
time complexity:O(n)
space complexity:O(1)