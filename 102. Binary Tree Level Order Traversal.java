public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null) return resultList;
        TreeNode[] queue = new TreeNode[10000];
        int head = 0, tail = 0,parentNodes = 0,childNodes = 0;
        queue[head++] = root;
        parentNodes++;
        List<Integer> newList = new ArrayList<>();
        while(head != tail){
            TreeNode tempNode = queue[tail++];
            newList.add(tempNode.val);
            parentNodes--;
            if(tempNode.left != null){
                queue[head++] = tempNode.left;
                childNodes++;
            }
            if(tempNode.right != null){
                queue[head++] = tempNode.right;
                childNodes++;
            }
            if(parentNodes == 0){
                parentNodes = childNodes;
                childNodes = 0;
                resultList.add(newList);
                newList = new ArrayList<>();
            }
        }
        return resultList;
    }
}
time complexity:O(n)
space complexity:O(n);