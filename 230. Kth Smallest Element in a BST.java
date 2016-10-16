public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        kthSamllest(root,list,k);
        return list.get(k-1);
    }
    public void kthSamllest(TreeNode root,List<Integer> list,int k){
        if(root == null) return;
        kthSamllest(root.left,list,k);
        list.add(root.val);
        if(list.size() == k) return ;
        kthSamllest(root.right,list,k);
    }
}
time complexity:O(n)
space complexity:O(k)

public class Solution {
    int cnt = 0;
    public int kthSmallest(TreeNode root, int k) {
       if(root == null) return 0;
       int res = kthSmallest(root.left,k);
       if(cnt == k) return res;
       else if(++cnt == k) return root.val;
       return kthSmallest(root.right,k);
    }
}
time complexity:O(n)
space complexity:O(1)