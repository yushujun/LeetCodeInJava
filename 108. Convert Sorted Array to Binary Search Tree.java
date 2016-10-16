public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0,nums.length-1);
    }
    public TreeNode convert(int[] nums,int start,int end){
        if(start > end) return null;
        int mid = start + ((end-start)>>>1);
        TreeNode head = new TreeNode(nums[mid]);
        head.left = convert(nums,start,mid-1);
        head.right = convert(nums,mid+1,end);
        return head;
    }
}
time compleixty:O(n)
space compleixty:O(1)