public boolean isPalindrome(ListNode head) {
    if(head == null) return true;
    ListNode[] stack = new ListNode[100000];
    int top = 0;
    ListNode temp = head;
    while(temp != null){
        stack[top++] = temp;
        temp = temp.next;
    }
    while(top > 0){
        if(stack[--top].val != head.val) return false;
        else head = head.next;
    }
    return true;
}
time complexity:O(n)
space complexity:O(n)

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head,fast = slow;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;
        while(slow != null){
            if(slow.val != head.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
time complexity:O(n)
space complexity:O(1)

recursion:
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode end,mid;
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        boolean isEven = (fast == null);
        if(isEven)
            end = slow;
        else
            end = slow.next;
        mid = slow;
        return find(head);
    }
    public boolean find(ListNode start){
        if(start.next == mid)
            return start.val == end.val;
        boolean state = find(start.next);
        end = end.next;
        return state && start.val == end.val;
    }
}
time complexity:O(n)
space complexity:O(1)
这个递归版本的好处就是不会修改链表本身