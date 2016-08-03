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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode lchild = lowestCommonAncestor(root.left,p,q);
        TreeNode rchild = lowestCommonAncestor(root.right,p,q);
        return lchild == null ? rchild : rchild == null ? lchild : root;
    }
}
time complexity:O(n)
space complexity:O(1)
不能用root.val == p.val || root == q.val来判断是否找到节点，如果树种出现两个相同值节点，LCA得到的节点是错误的