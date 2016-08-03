/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        trans(root);
    }
    public TreeNode trans(TreeNode root){
        if(root.left == null && root.right == null)
            return root;
        TreeNode leftTail = null,rightTail = null;
        if(root.left != null)
            leftTail = trans(root.left);
        if(root.right != null)
            rightTail = trans(root.right);
        if(leftTail != null){
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if(rightTail == null)
            return leftTail;
        return rightTail;
    }
}
time complexity:O(n)
space complexity:O(1)