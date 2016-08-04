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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null)
            return resultList;
        TreeNode[] queue = new TreeNode[100000];
        int head = 0,tail = 0,level = 1;
        queue[tail++] = root;
        int parentSize = 1,childSize = 0;
        ArrayList<Integer> newList = new ArrayList<>();
        while(head != tail){
            TreeNode node = queue[head++];
            newList.add(node.val);
            --parentSize;
            if(node.left != null){
                queue[tail++] = node.left;
                ++childSize;
            }
                
            if(node.right != null){
                queue[tail++] = node.right;
                ++childSize;
            }
            if(parentSize == 0){
                parentSize = childSize;
                childSize = 0;
                if(level % 2 == 0){
                    Collections.reverse(newList);
                }
                resultList.add(newList);
                newList = new ArrayList<>();
                level++;
            }
        }
        return resultList;
    }
}
time complexity:O(nlogn)
space complexity:O(n)