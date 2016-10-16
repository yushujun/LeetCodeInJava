public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead,oddTail,evenHead,evenTail;
        oddHead = oddTail = new ListNode(-1);
        evenHead = evenTail = new ListNode(-1);
        oddTail.next = evenTail.next = null;
        int index = 1;
        while(head != null){
            ListNode temp = head;
            head = head.next;
            if(index % 2 == 0){
                evenTail.next = temp;
                temp.next = null;
                evenTail = evenTail.next;
            } else {
                oddTail.next = temp;
                temp.next = null;
                oddTail = oddTail.next;
            }
            index++;
        }
        evenHead = evenHead.next;
        oddTail.next = evenHead;
        return oddHead.next;
    }
}
time complexity:O(n)
space complexity:O(1)

public class Solution {
    public ListNode oddEvenList(ListNode head) {
       if(head == null) return head;
       ListNode oddHead = head,evenHead = head.next,evenTail = evenHead;
       while(evenTail != null && evenTail.next != null){
           oddHead.next = evenTail.next;
           oddHead = oddHead.next;
           evenTail.next = evenTail.next.next;
           evenTail = evenTail.next;
       }
       oddHead.next = evenHead;
       return head;
    }
}
time complexity:O(n)
space complexity:O(1)