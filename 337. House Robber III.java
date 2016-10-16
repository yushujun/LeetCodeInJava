public class Solution {
    public int rob(TreeNode root) {
        if(root == null) return 0;
        int sum1 = root.val,sum2 = 0;
        if(root.left != null)
            sum1 += rob(root.left.right)+rob(root.left.left);
        if(root.right != null)
            sum1 += rob(root.right.left)+rob(root.right.right);
        sum2 = rob(root.left)+rob(root.right);
        return Math.max(sum1,sum2);
    } 
}
time complexity:O(n)
space complexity:O(1)