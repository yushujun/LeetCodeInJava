recursive:
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }
    public void preorderTraversal(TreeNode root,List<Integer> list){
      if(root == null) return;
        list.add(root.val);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);
    }
}
time complexity:O(n)
space complexity:O(1)

iterative:
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        TreeNode[] stack = new TreeNode[1001];
        int top = 0;
        stack[top++] = root;
        while(top != 0){
            TreeNode node = stack[--top];
            list.add(node.val);
            if(node.right != null)
                stack[top++] = node.right;
            if(node.left != null)
                stack[top++] = node.left;
        }
        return list;
    }
}
time complexity:O(n)
space complexity:O(n)