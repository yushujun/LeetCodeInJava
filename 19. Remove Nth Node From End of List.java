public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode p1 = dummy,p2 = dummy;
        while(p1.next != null){
            p1 = p1.next;
            count++;
        }
        if(n <= count){
            count = count-n;
            while(count != 0) {
                p2 = p2.next;
                count--;
            }
            p2.next = p2.next.next;
        }
        return dummy.next;
    }
}
该方法是先计算长度n，然后在把头结点移动到n-k-1个节点然后删除
time complexity:O(n)
space complexity:O(1)

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy,slow = dummy;
        while(fast.next != null){
            if(n <= 0) slow = slow.next;
            fast = fast.next;
            n--;
        }
        if(slow.next != null)
            slow.next = slow.next.next;
        return dummy.next;
    }
}
该方法是快慢指针，第一个节点先走k次，然后再删除
time complexity:O(n)
space complexity:O(1)