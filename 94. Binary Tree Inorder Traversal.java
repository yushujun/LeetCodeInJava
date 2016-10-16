recursive:
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }
    public void inorderTraversal(TreeNode root,List<Integer> list){
        if(root == null) return ;
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
}
time complexity:O(n)
space complexity:O(1)

iterative:
public List<Integer> inorderTraversal(TreeNode root) {
  List<Integer> list = new ArrayList<>();
  if (root == null) return list;
  TreeNode[] stack = new TreeNode[1001];
  int top = 0;
  TreeNode node = root;
  while (top != 0 || node != null) {
    if (node != null) {
      stack[top++] = node;
      node = node.left;
    } else {
      node = stack[--top];
      list.add(node.val);
      node = node.right;
    }
  }
  return list;
}
time complexity:O(n)
space complexity:O(n)