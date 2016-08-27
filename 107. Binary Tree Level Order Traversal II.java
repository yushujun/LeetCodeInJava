public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
     List<List<Integer>> resultList = new ArrayList<>();
     if(root == null) return resultList;
     int parentNodes = 1,childNodes = 0;
     TreeNode[] queue = new TreeNode[10001];
     int head = 0,tail = 0;
     queue[tail++] = root;
     ArrayList<Integer> newList = new ArrayList<>();
     while(head != tail){
         TreeNode node = queue[head++];
         newList.add(node.val);
         parentNodes--;
         if(node.left != null){
             queue[tail++] = node.left;
             childNodes++;
         }
         if(node.right != null){
             queue[tail++] = node.right;
             childNodes++;
         }
         if(parentNodes == 0){
             parentNodes = childNodes;
             childNodes = 0;
             resultList.add(newList);
             newList = new ArrayList<>();
         }
     }
     Collections.reverse(resultList);
     return resultList;
    }
}

time complexity: O(n)
space complexity:O(n)