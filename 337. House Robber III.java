public class Solution {
    public int rob(TreeNode root) {
        if(root == null) return 0;
        int leftChildSum = 0,rightChildSum = 0,leftSum = 0,rightSum = 0;
        if(root.left != null){
            leftChildSum = rob(root.left.left)+rob(root.left.right);
        }
        if(root.right != null){
            rightChildSum = rob(root.right.left)+rob(root.right.right);
        }
        leftSum = rob(root.left);
        rightSum = rob(root.right);
        return Math.max(root.val+leftChildSum+rightChildSum,leftSum+rightSum);
    } 
}
time complexity:O(n)
space complexity:O(1)