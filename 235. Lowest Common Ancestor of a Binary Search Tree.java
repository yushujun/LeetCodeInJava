recursion:
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        return left!=null&&right!=null ? root : left!=null ? left : right;
    }
}
time complexity:O(n)
space complexity:O(1)

no-recursion:
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode[] stack = new TreeNode[1001];
        int top = 0;
        if(root == null || p == null || q == null) return null;
        stack[top++] = root;
        TreeNode max,min;
        if(p.val > q.val){
            max = p;
            min = q;
        } else {
            max = q;
            min = p;
        }
        while(top != 0){
            TreeNode node = stack[--top];
            if(node == null) continue;
            if(node.val < max.val && node.val > min.val || node.val == max.val || node.val == min.val)
                return node;
            stack[top++] = node.right;
            stack[top++] = node.left;
        }
       return null;
    }
}
time complexity:O(n)
space complexity:O(n)