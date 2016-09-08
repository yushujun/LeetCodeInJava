public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        int len1=0,len2=0;
        ListNode temp1 = headA,temp2 = headB;
        while(temp1.next!=null) {len1++;temp1=temp1.next;}
        while(temp2.next!=null) {len2++;temp2=temp2.next;}
        int diff = Math.abs(len1-len2);
        if(len1 > len2) 
            while(diff!=0){
                headA = headA.next;
                diff--;
            }
        else if(len1 < len2)
            while(diff!=0){
                headB= headB.next;
                diff--;
            }
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
time complexity:O(n)
space complexity:O(1)

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1 = headA,cur2 = headB;
        while(cur1 != cur2){
            cur1 = cur1!=null?cur1.next:headB;
            cur2 = cur2!=null?cur2.next:headA;
        }
        return cur1;
    }
}
time complexity:O(n)
space complexity:O(1)
这个方法本质和第一个是一样的，但是它用两个指针可以往返的走巧妙的做出来了
假设headA长为m，headB长为n，那么他们的距离始终为|m-n|，则我们使两个指针
走完自己的链表后再走对方的链表则每个指针都走了m+n次,当长链表指针走完返回到
短链表指针头结点时，他们都是在m-n的链表长度上，所以可以挨个比较，最后返回
第一个相加结点或者是null结点，方法真的很聪明