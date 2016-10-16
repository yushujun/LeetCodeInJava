recursive:
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root,list);
        return list;
    }
    public void postorderTraversal(TreeNode root,List<Integer> list){
        if(root == null) return;
        postorderTraversal(root.left,list);
        postorderTraversal(root.right,list);
        list.add(root.val);
    }
}
time complexity:O(n)
space complexity:O(1)

iterative:
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        TreeNode[] stack1 = new TreeNode[1001];
        TreeNode[] stack2 = new TreeNode[1001];
        int top1 = 0,top2 = 0;
        stack1[top1++] = root;
        while(top1 != 0){
            TreeNode node = stack1[--top1];
            if(node.left != null)
                stack1[top1++] = node.left;
            if(node.right != null)
                stack1[top1++] = node.right;
            stack2[top2++] = node;
        }
        while(top2 != 0){
            TreeNode node = stack2[--top2];
            list.add(node.val);
        }
        return list;
    }
}
time complexity:O(n)
space complexity:O(n)