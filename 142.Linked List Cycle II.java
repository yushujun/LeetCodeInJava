/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)) break;
            set.add(head);
            head = head.next;
        }
        if(head == null) return null;
        return head;
    }
}
time complexity:O(n)
space complexity:O(n)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode tmp = head;
                while(slow != tmp){
                    slow = slow.next;
                    tmp = tmp.next;
                }
                return slow;
            }
        }
        return null;
    }
}
time complexity:O(n)
