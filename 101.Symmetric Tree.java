public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }
    public boolean isSymmetric(TreeNode root1,TreeNode root2){
        if(root1 == null || root2 == null) return root1 == root2;
        else if(root1.val == root2.val){
            return isSymmetric(root1.left,root2.right)&&isSymmetric(root1.right,root2.left);
        }
        return false;
    }

}
time complexity:O(n)