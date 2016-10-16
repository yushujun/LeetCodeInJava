public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return convert(head,null);
    }
    public TreeNode convert(ListNode head,ListNode tail){
        if(head == tail) return null;
        ListNode slow = head,fast = head;
        while(fast.next != tail && fast.next.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode node = new TreeNode(slow.val);
        node.left = convert(head,slow);
        node.right = convert(slow.next,tail);
        return node;
    }
}
time complexity:O(n)
space complexity:O(1)